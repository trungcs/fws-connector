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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.mule.api.lifecycle.InitialisationException;
import org.mule.module.fws.api.ShipmentStatus;
import org.mule.module.fws.api.internal.Address;
import org.mule.module.fws.api.internal.CreateFulfillmentOrderItem;
import org.mule.module.fws.api.internal.Currency;
import org.mule.module.fws.api.internal.FulfillmentItem;
import org.mule.module.fws.api.internal.GetFulfillmentOrderResult;
import org.mule.module.fws.api.internal.MerchantSKUQuantityItem;
import org.mule.module.fws.api.internal.ShipmentPreview;

import java.math.BigDecimal;
import java.util.Arrays;
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
            connector.putInboundShipmentItems(shipmentGroup.getShipmentId(), Collections.singletonList(new MerchantSKUQuantityItem(TEST_MSKU, 1)));
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
        String nsku = connector.getFulfillmentIdentifierForMsku(TEST_MSKU).get(0).getFulfillmentNetworkSKU();
        GetFulfillmentOrderResult result = connector.createFulfillmentOrder("TEST_ORDER1", null,
            TEST_ADDRESS, null, null, "QUICK", "AN order", new Date(), null,
            Arrays.asList(new CreateFulfillmentOrderItem(TEST_MSKU, "1", 1, "", "An item", "", nsku,
                new Currency("USD", BigDecimal.valueOf(100)))));
        // FIXME should fail
        assertNotNull(result);
    }
    
    @Test
    public void listOrdersNoOrder()
    {
        assertFalse(connector.listFulfillmentOrders(new Date()).iterator().hasNext());
    }

    private void assertStatusOk(String status)
    {
        assertNotNull(status);
        assertTrue(status.contains("OK"));
    }

}
