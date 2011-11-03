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

import com.amazonaws.fba_inbound.doc._2007_05_10.FulfillmentItem;
import com.amazonaws.fba_inbound.doc._2007_05_10.InboundShipmentItem;
import com.amazonaws.fba_inbound.doc._2007_05_10.MerchantSKUQuantityItem;
import com.amazonaws.fba_inbound.doc._2007_05_10.ShipmentPreview;

import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.time.DateUtils;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("serial")
public class FWSTestDriver
{
    private static final String TEST_ORDER_ID = "TEST_ORDER1";
    private FWSCloudConnector connector;
    private static final String TEST_MSKU = "my-test-sku-01";
    private static final Map<String, Object> TEST_ADDRESS = new HashMap<String, Object>()
    {
        {
            put("addressLine1", "605 5th Ave SE");
            put("city", "Seattle");
            put("countryCode", "US");
            put("name", "My Ship From Address");
            put("postalCode", "98101");
            put("stateOrProvinceCode", "WA");
        }
    };

    @Before
    public void setup() throws InitialisationException
    {
        connector = new FWSCloudConnector();
        connector.setAccessKey(System.getenv("accessKey"));
        connector.setSecretKey(System.getenv("secretKey"));
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
        assertNotNull(connector.getFulfillmentIdentifierForMsku(TEST_MSKU));
    }
    
    /**
     * Tests a flow of getting a preview and putting items, as explained in
     * http://docs.amazonwebservices.com/fws/1.1/GettingStartedGuide/createShip.html
     * 
     * This tests assumes that there are no working items
     */
    @Test
    public void getPreviewAndPutItems() throws Exception
    {
        assertEquals(0, size(connector.listInboundShipments(ShipmentStatus.WORKING, null, null)));
        List<ShipmentPreview> preview = connector.getInboundShipmentPreview(
            Arrays.asList(new MerchantSKUQuantityItem(TEST_MSKU, 1)), TEST_ADDRESS, null);
        assertEquals(preview.size(), 1);
        ShipmentPreview shipmentGroup = preview.get(0);
        try
        {
            connector.putInboundShipment(shipmentGroup.getShipmentId(), "A shippment",
                shipmentGroup.getDestinationFulfillmentCenter(), TEST_ADDRESS, null,
                Arrays.asList(shipmentGroup.getMerchantSKUQuantityItem()));
            assertEquals(1, size(connector.listInboundShipmentItems(shipmentGroup.getShipmentId())));
            assertEquals(1, size(connector.listInboundShipments(ShipmentStatus.WORKING, null, null)));
            
            connector.putInboundShipmentItems(shipmentGroup.getShipmentId(),
                Arrays.asList(new MerchantSKUQuantityItem(TEST_MSKU, 4)));
            
            //The original item quantity was replaced
            Iterator<InboundShipmentItem> iter = connector.listInboundShipmentItems(shipmentGroup.getShipmentId()).iterator();
            assertTrue(iter.hasNext());
            assertEquals(4, iter.next().getQuantityShipped());
            assertFalse(iter.hasNext());
        }
        finally
        {
            connector.setInboundShipmentStatus(shipmentGroup.getShipmentId(), ShipmentStatus.CANCELLED);
        }
    }

    /**
     * Tests the {@link FWSCloudConnector#listFulfillmentItems(boolean)}.
     * This whole test case assumes there is only one item created (an IPod). 
     * 
     * @see  <a href="http://docs.amazonwebservices.com/AWSFWS/1.0/GettingStartedGuide/">FWS GettingStarted</a>
     */
    @Test
    public void listFulfillmentItemsNoItems()
    {
        Iterator<FulfillmentItem> fulfillmentItems = connector.listFulfillmentItems(true).iterator();
        assertTrue(fulfillmentItems.hasNext());
        assertEquals(TEST_MSKU, fulfillmentItems.next().getMerchantSKU());
        assertFalse(fulfillmentItems.hasNext());
    }

    @Test
    public void listInboundShipmentsNoShipments()
    {
        assertFalse(connector.listInboundShipments(ShipmentStatus.SHIPPED, null, null).iterator().hasNext());
    }

    // outbound

    @Test
    public void listOrdersNoOrder()
    {
        assertFalse(connector.listFulfillmentOrders(new Date(), null).iterator().hasNext());
    }

    // Inventory

    @Test
    public void listUpdatedSupllyNoInventory()
    {
        assertFalse(connector.listUpdatedInventorySupply(DateUtils.addDays(new Date(), -10), null)
            .iterator()
            .hasNext());
    }

    private void assertStatusOk(String status)
    {
        assertNotNull(status);
        assertTrue(status.matches(".*service (available|responding).*"));
    }

    private int size(Iterable<?> iterable)
    {
        int i = 0;
        for (@SuppressWarnings("unused") Object o : iterable)
        {
            i++;
        }
        return i;
    }
} 
