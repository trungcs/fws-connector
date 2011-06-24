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

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.mule.api.lifecycle.InitialisationException;

import org.junit.Before;
import org.junit.Test;
public class FWSTestDriver
{
    private FWSCloudConnector connector;

    @Before
    public void setup() throws InitialisationException
    {
        connector = new FWSCloudConnector();
        connector.setAccessKey("0QY05JR56ZA8E56XPG82");
        connector.setSecretKey("foobaz");
        connector.initialise();
    }
    
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
    
//    @Test
//    public void listFulfillmentOrders()
//    {
//        assertNotNull(connector.listFulfillmentOrders());
//    }
    
    @Test
    public void listFulfillmentItems()
    {
        Iterable<?> fulfillmentItems = connector.listFulfillmentItems(true);
        assertNotNull(fulfillmentItems);
        assertTrue(fulfillmentItems.iterator().hasNext());
    }

//    @Test
//    public void listInboundShipments()
//    {
//        assertNotNull(connector.listInboundShipments(ShipmentStatus.SHIPPED, new Date()));
//    }
//
//    @Test
//    public void listUpdatedInventorySupply()
//    {
//        connector.listUpdatedInventorySupply(new Date(), ResponseGroup.FOO);
//    }
//    
//    @Test
//    public void createAndCancelFulfillmentOrder()
//    {
//        connector.cancelFulfillmentOrder(orderId);
//        connector.createFulfillmentOrder(orderId);
//    }


//    public void deleteInboundShipmentItems(String merchantSku, String shipmentId)
//    {
//        connector.deleteInboundShipmentItems(merchantSku, shipmentId);
//    }
//
//    public void getFulfillmentIdentifier(String asin, String itemCondition, String merchantSku)
//    {
//        connector.getFulfillmentIdentifier(asin, itemCondition, merchantSku);
//    }
//
//    public void getFulfillmentIdentifierForMsku(String merchantSku)
//    {
//        connector.getFulfillmentIdentifierForMsku(merchantSku);
//    }
//
//    public void getFulfillmentItemByFnsku(String fulfillmentNetworkSku)
//    {
//        connector.getFulfillmentItemByFnsku(fulfillmentNetworkSku);
//    }
//
//    public void getFulfillmentItemByMsku(String merchantSku)
//    {
//        connector.getFulfillmentItemByMsku(merchantSku);
//    }
//
//    public void getFulfillmentOrder(String orderId)
//    {
//        connector.getFulfillmentOrder(orderId);
//    }
//
//    public void getFulfillmentPreview(String merchantSku,
//                                      ShippingSpeedCategories shippingSpeedCategories,
//                                      int quantity,
//                                      String orderItemId)
//    {
//        connector.getFulfillmentPreview(merchantSku, shippingSpeedCategories, quantity, orderItemId);
//    }
//
//    public void getInboundShipment(String shipmentId)
//    {
//        connector.getInboundShipment(shipmentId);
//    }
//
//    public void getInboundShipmentPreview(String merchantSku, String address)
//    {
//        connector.getInboundShipmentPreview(merchantSku, address);
//    }
//
//    public void getInventorySupply(Date startDateTime, ResponseGroup responseGroup)
//    {
//        connector.getInventorySupply(startDateTime, responseGroup);
//    }
//
//    
//    public Iterable<?> listInboundShipmentItems(String shipmentId)
//    {
//        return connector.listInboundShipmentItems(shipmentId);
//    }
//
//
//    @Test
//    public void putInboundShipmentAndItems()
//    {
//        connector.putInboundShipment(shipmentId, shipmentName, destinationFulfillmentCenter, shipFromAddress);
//        connector.putInboundShipmentItems(shipmentId, merchantSku, quantity);
//    }

    private void assertStatusOk(String status)
    {
        assertNotNull(status);
        assertTrue(status.contains("OK"));
    }
    

}
