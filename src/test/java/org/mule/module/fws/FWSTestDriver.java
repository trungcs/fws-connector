/**
 * Mule FWS Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.module.fws;

import static org.junit.Assert.*;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.mule.api.lifecycle.InitialisationException;
import org.mule.module.fws.api.ShipmentStatus;
import org.mule.module.fws.api.internal.Address;
import org.mule.module.fws.api.internal.AmazonFWSInbound;
import org.mule.module.fws.api.internal.FulfillmentItem;
import org.mule.module.fws.api.internal.GetFulfillmentOrderResult;
import org.mule.module.fws.api.internal.MerchantSKUQuantityItem;
import org.mule.module.fws.api.internal.ShipmentPreview;

import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class FWSTestDriver
{
    private FWSCloudConnector connector;
    private static final String TEST_MSKU = "my-test-sku-01";
    @SuppressWarnings("serial")
    private static final Address TEST_ADDRESS = new Address()
    {
        {
            setLine1("605 5th Ave SE");
            setCity("Seattle");
            setCountryCode("US");
            setName("My Ship From Address");
            setPostalCode("98101");
            setStateOrProvinceCode("WA");
        }
    };

    @Before
    public void setup() throws InitialisationException
    {
        connector = new FWSCloudConnector();
        connector.setAccessKey("0QY05JR56ZA8E56XPG82");
        connector.setSecretKey("foobaz");
        connector.initialise();
    }

    // Status

    @Test
    public void getInboundStatus() throws Exception
    {
        String status = connector.getInboundServiceStatus();
        assertStatusOk(status);
    }

    @Test
    public void getOutboundStatus() throws Exception
    {
        assertStatusOk(connector.getOutboundServiceStatus());
    }

    @Test
    public void getInventoryStatus() throws Exception
    {
        assertStatusOk(connector.getInventoryServiceStatus());
    }

    // Inbound

    @Test
    public void getFnsku() throws Exception
    {
        List<FulfillmentItem> items = connector.getFulfillmentIdentifierForMsku(TEST_MSKU);
        assertFalse(items.isEmpty());
    }

    /**
     * Tests a flow of getting a preview and putting items, as explained in 
     * http://docs.amazonwebservices.com/fws/1.1/GettingStartedGuide/createShip.html
     */
    @Test
    public void getPreviewAndPutItems() throws Exception
    {
        List<ShipmentPreview> preview = connector.getInboundShipmentPreview(TEST_MSKU, 1, TEST_ADDRESS, null);
        assertEquals(preview.size(), 1); // FIXME should not be a list
        ShipmentPreview shipmentGroup = preview.get(0);
        assertFalse(connector.listInboundShipments(ShipmentStatus.WORKING, null, null).iterator().hasNext());
        try
        {
            connector.putInboundShipment(shipmentGroup.getShipmentId(), "A shippment",
                shipmentGroup.getDestinationFulfillmentCenter(), TEST_ADDRESS, null);
            connector.putInboundShipmentItems(shipmentGroup.getShipmentId(), Collections.singletonMap(
                TEST_MSKU, 1), null);

            assertTrue(connector.listInboundShipmentItems(shipmentGroup.getShipmentId()).iterator().hasNext());
            assertTrue(connector.listInboundShipments(ShipmentStatus.WORKING, null, null).iterator().hasNext());
        }
        finally
        {
            connector.setInboundShipmentStatus(shipmentGroup.getShipmentId(), ShipmentStatus.CANCELLED);
        }
    }

    @Test
    public void listFulfillmentItemsNoItems()
    {
        assertFalse(connector.listFulfillmentItems(true).iterator().hasNext());
    }

    @Test
    public void listInboundShipmentsNoShipments()
    {
        assertFalse(connector.listInboundShipments(ShipmentStatus.SHIPPED, new Date(), new Date())
            .iterator()
            .hasNext());
    }
    
    //outbound
    
    @Test
    public void testOrderNoInventory() throws Exception
    {   
        GetFulfillmentOrderResult result = connector.createFulfillmentOrder("TEST_ORDER1");
        //FIXME should fail
        assertNotNull(result);
    }
    
    @Test
    public void listOrdersNoOrder()
    {
        assertFalse(connector.listFulfillmentOrders(new Date()).iterator().hasNext());
    }

    //    
    // @Test
    // public void createAndCancelFulfillmentOrder()
    // {
    // connector.cancelFulfillmentOrder(orderId);
    // connector.createFulfillmentOrder(orderId);
    // }

    // public void deleteInboundShipmentItems(String merchantSku, String shipmentId)
    // {
    // connector.deleteInboundShipmentItems(merchantSku, shipmentId);
    // }
    //
    // public void getFulfillmentIdentifier(String asin, String itemCondition, String
    // merchantSku)
    // {
    // connector.getFulfillmentIdentifier(asin, itemCondition, merchantSku);
    // }
    //
    //
    // public void getFulfillmentItemByFnsku(String fulfillmentNetworkSku)
    // {
    // connector.getFulfillmentItemByFnsku(fulfillmentNetworkSku);
    // }
    //
    // public void getFulfillmentItemByMsku(String merchantSku)
    // {
    // connector.getFulfillmentItemByMsku(merchantSku);
    // }
    //
    // public void getFulfillmentOrder(String orderId)
    // {
    // connector.getFulfillmentOrder(orderId);
    // }
    //
    // public void getFulfillmentPreview(String merchantSku,
    // ShippingSpeedCategories shippingSpeedCategories,
    // int quantity,
    // String orderItemId)
    // {
    // connector.getFulfillmentPreview(merchantSku, shippingSpeedCategories,
    // quantity, orderItemId);
    // }
    //
    // public void getInboundShipment(String shipmentId)
    // {
    // connector.getInboundShipment(shipmentId);
    // }
    //
    // public void getInboundShipmentPreview(String merchantSku, String address)
    // {
    // connector.getInboundShipmentPreview(merchantSku, address);
    // }
    //
    // public void getInventorySupply(Date startDateTime, ResponseGroup
    // responseGroup)
    // {
    // connector.getInventorySupply(startDateTime, responseGroup);
    // }
    //
    //    
    // public Iterable<?> listInboundShipmentItems(String shipmentId)
    // {
    // return connector.listInboundShipmentItems(shipmentId);
    // }
    //
    //
    // @Test
    // public void putInboundShipmentAndItems()
    // {
    // connector.putInboundShipment(shipmentId, shipmentName,
    // destinationFulfillmentCenter, shipFromAddress);
    // connector.putInboundShipmentItems(shipmentId, merchantSku, quantity);
    // }

    private void assertStatusOk(String status)
    {
        assertNotNull(status);
        assertTrue(status.contains("OK"));
    }

}
