/**
 * Mule FWS Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

/**
 * This file was automatically generated by the Mule Cloud Connector Development Kit
 */

package org.mule.module.fws;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.eq;
import static org.mockito.Matchers.isNull;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.reset;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;
import static org.mule.module.fws.api.Arrays.asArray;

import org.mule.module.fws.api.AxisFWSClient;
import org.mule.module.fws.api.FwsException;
import org.mule.module.fws.api.ItemCondition;
import org.mule.module.fws.api.LabelPreference;
import org.mule.module.fws.api.PortProvider;
import org.mule.module.fws.api.ShipmentStatus;

import com.amazonaws.fba_inbound.doc._2007_05_10.AmazonFWSInboundPortType;
import com.amazonaws.fba_inbound.doc._2007_05_10.FulfillmentItem;
import com.amazonaws.fba_inbound.doc._2007_05_10.GetFulfillmentIdentifierForMSKUResult;
import com.amazonaws.fba_inbound.doc._2007_05_10.GetFulfillmentIdentifierResult;
import com.amazonaws.fba_inbound.doc._2007_05_10.GetFulfillmentItemByFNSKUResult;
import com.amazonaws.fba_inbound.doc._2007_05_10.GetFulfillmentItemByMSKUResult;
import com.amazonaws.fba_inbound.doc._2007_05_10.GetInboundShipmentDataResult;
import com.amazonaws.fba_inbound.doc._2007_05_10.GetServiceStatusResult;
import com.amazonaws.fba_inbound.doc._2007_05_10.InboundShipmentData;
import com.amazonaws.fba_inbound.doc._2007_05_10.LabelPrepPreference;
import com.amazonaws.fba_inbound.doc._2007_05_10.MerchantItem;
import com.amazonaws.fba_inbound.doc._2007_05_10.holders.GetFulfillmentIdentifierForMSKUResultHolder;
import com.amazonaws.fba_inbound.doc._2007_05_10.holders.GetFulfillmentIdentifierResultHolder;
import com.amazonaws.fba_inbound.doc._2007_05_10.holders.GetFulfillmentItemByFNSKUResultHolder;
import com.amazonaws.fba_inbound.doc._2007_05_10.holders.GetFulfillmentItemByMSKUResultHolder;
import com.amazonaws.fba_inbound.doc._2007_05_10.holders.GetInboundShipmentDataResultHolder;
import com.amazonaws.fba_inventory.doc._2009_07_31.AmazonFBAInventoryPortType;
import com.amazonaws.fba_inventory.doc._2009_07_31.GetInventorySupplyResult;
import com.amazonaws.fba_inventory.doc._2009_07_31.MerchantSKUSupply;
import com.amazonaws.fba_inventory.doc._2009_07_31.holders.GetInventorySupplyResultHolder;
import com.amazonaws.fba_outbound.doc._2007_08_02.AmazonFBAOutboundPortType;
import com.amazonaws.fba_outbound.doc._2007_08_02.Currency;
import com.amazonaws.fba_outbound.doc._2007_08_02.FulfillmentPreview;
import com.amazonaws.fba_outbound.doc._2007_08_02.GetFulfillmentOrderResult;
import com.amazonaws.fba_outbound.doc._2007_08_02.GetFulfillmentPreviewItem;
import com.amazonaws.fba_outbound.doc._2007_08_02.GetFulfillmentPreviewResult;
import com.amazonaws.fba_outbound.doc._2007_08_02.holders.GetFulfillmentOrderResultHolder;
import com.amazonaws.fba_outbound.doc._2007_08_02.holders.GetFulfillmentPreviewResultHolder;
import com.amazonaws.fba_outbound.doc._2007_08_02.holders.GetServiceStatusResultHolder;
import com.amazonaws.fba_outbound.doc._2007_08_02.holders.ResponseMetadataHolder;

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

public class FWSUnitTest
{
    private static final String STATUS_MESSAGE = "OK";
    private static final String ASIN = "ASIN";
    private static final String SHIP_ID = "SHIP_ID";
    private static final String NSKU = "NSKU";
    private static final String MSKU = "MSKU";
    private FWSCloudConnector connector;
    private static final String ORDER_ID = "ORDER_ID";
    private static final String ORDER_ITEM_ID = "ORDER_ITEM_ID";
    private AmazonFBAInventoryPortType inventory = mock(AmazonFBAInventoryPortType.class);
    private AmazonFBAOutboundPortType out = mock(AmazonFBAOutboundPortType.class);
    private AmazonFWSInboundPortType in = mock(AmazonFWSInboundPortType.class);

    @Before
    @SuppressWarnings("unchecked")
    public void setup() throws RemoteException
    {
        connector = new FWSCloudConnector();
        PortProvider<AmazonFWSInboundPortType> inboundProvider = mock(PortProvider.class);
        PortProvider<AmazonFBAOutboundPortType> outboundProvider = mock(PortProvider.class);
        PortProvider<AmazonFBAInventoryPortType> inventoryProvider = mock(PortProvider.class);

        connector.setClient(new AxisFWSClient(inboundProvider, outboundProvider, inventoryProvider));

        when(inboundProvider.getPort(anyString())).thenReturn(in);
        when(outboundProvider.getPort(anyString())).thenReturn(out);
        when(inventoryProvider.getPort(anyString())).thenReturn(inventory);
    }

    @After
    public void verifyNoMoreInteraction()
    {
        verifyNoMoreInteractions(in, out, inventory);
    }

    @Test
    public void cancelFulfillmentOrder() throws RemoteException
    {
        connector.cancelFulfillmentOrder(ORDER_ID);
        verify(out).cancelFulfillmentOrder(eq(ORDER_ID));
    }

    @SuppressWarnings({"unchecked", "serial" })
    @Ignore
    @Test
    public void createFulfillmentOrder() throws RemoteException
    {
        connector.createFulfillmentOrder(ORDER_ID, null, new HashMap<String, Object>(), null, null, "QUICK", "An order",
            new GregorianCalendar(2011, Calendar.JUNE, 28, 15, 0, 0).getTime(), null,
            Arrays.<Map<String, Object>> asList(new HashMap<String, Object>() { {
                put("merchantSKU", MSKU);
                put("merchantFulfillmentOrderItemId", "1");
                put("quantity", 1);
                put("giftMessage", "");
                put("displayableComment", "An item");
                put("fulfillmentNetworkSKU", NSKU);
                put("perUnitDeclaredValue", new Currency());
            } }));
        verify(out).createFulfillmentOrder(eq(ORDER_ID), eq(ORDER_ID), eq("2011-06-28T15:00Z"),
            eq("An order"), null, eq(new com.amazonaws.fba_outbound.doc._2007_08_02.Address()), eq("QUICK"),
            null, null, null);
    }
    
    @Test
    public void deleteInboundShipmentItems() throws RemoteException
    {
        connector.deleteInboundShipmentItems(MSKU, SHIP_ID);
        verify(in).deleteInboundShipmentItems(eq(SHIP_ID), eq(new String[]{MSKU}));
    }

    @Test
    public void getFulfillmentIdentifier() throws RemoteException
    {
        doAnswer(new UpdateHolderAnswer<GetFulfillmentIdentifierResultHolder>(1)
        {
            @Override
            void updateHolder(GetFulfillmentIdentifierResultHolder h)
            {
                h.value = new GetFulfillmentIdentifierResult(asArray(new FulfillmentItem()));
            }
        }).when(in).getFulfillmentIdentifier( //
            eq(asArray(new MerchantItem(ASIN,
                com.amazonaws.fba_inbound.doc._2007_05_10.ItemCondition.NewItem, MSKU))), //
            any(GetFulfillmentIdentifierResultHolder.class), //
            anyInboundMetadata());
        connector.getFulfillmentIdentifier(ASIN, ItemCondition.NEW_ITEM, MSKU);
        reset(in);
    }

    @Test
    public void getFulfillmentIdentifierForMsku() throws RemoteException
    {
        getFulfillmentIdForMsku(asArray(new FulfillmentItem()));
    }

    @Test(expected = FwsException.class)
    public void getFulfillmentIdentifierForMskuInvallidId() throws RemoteException
    {
        try
        {
            getFulfillmentIdForMsku(new FulfillmentItem[0]);
        }
        finally
        {
            reset(in);
        }
    }

    private void getFulfillmentIdForMsku(final FulfillmentItem[] fulfillmentItem) throws RemoteException
    {
        doAnswer(new UpdateHolderAnswer<GetFulfillmentIdentifierForMSKUResultHolder>(1)
        {
            @Override
            void updateHolder(GetFulfillmentIdentifierForMSKUResultHolder h)
            {
                h.value = new GetFulfillmentIdentifierForMSKUResult(fulfillmentItem);
            }
        }).when(in).getFulfillmentIdentifierForMSKU(eq(asArray(MSKU)),
            any(GetFulfillmentIdentifierForMSKUResultHolder.class), anyInboundMetadata());
        connector.getFulfillmentIdentifierForMsku(MSKU);
        reset(in);
    }

    @Test
    public void getFulfillmentItemByFnsku() throws RemoteException
    {
        getFulfillmentByFnsku(asArray(new FulfillmentItem()));
    }

    
    @Test(expected = FwsException.class)
    public void getFulfillmentItemByFnskuInvallidId() throws RemoteException
    {
        try
        {
            getFulfillmentByFnsku(new FulfillmentItem[0]);
        }
        finally
        {
            reset(in);
        }
    }

    private void getFulfillmentByFnsku(final FulfillmentItem[] result) throws RemoteException
    {
        doAnswer(new UpdateHolderAnswer<GetFulfillmentItemByFNSKUResultHolder>(1)
        {
            @Override
            void updateHolder(GetFulfillmentItemByFNSKUResultHolder h)
            {
                h.value = new GetFulfillmentItemByFNSKUResult(result);
            }
        }).when(in).getFulfillmentItemByFNSKU(eq(asArray(NSKU)),
            any(GetFulfillmentItemByFNSKUResultHolder.class), anyInboundMetadata());
        connector.getFulfillmentItemByFnsku(NSKU);
        reset(in);
    }

    @Test
    public void getFulfillmentItemByMsku() throws RemoteException
    {
        doAnswer(new UpdateHolderAnswer<GetFulfillmentItemByMSKUResultHolder>(1)
        {
            @Override
            void updateHolder(GetFulfillmentItemByMSKUResultHolder h)
            {
                final FulfillmentItem[] returnedItems = asArray(new FulfillmentItem());
                h.value = new GetFulfillmentItemByMSKUResult(returnedItems);
            }
        }).when(in).getFulfillmentItemByMSKU(eq(new String[]{MSKU}),
            any(GetFulfillmentItemByMSKUResultHolder.class), anyInboundMetadata());
        connector.getFulfillmentItemByMsku(MSKU);
        reset(in);
    }

    @Test
    public void getFulfillmentOrder() throws RemoteException
    {
        final GetFulfillmentOrderResult result = new GetFulfillmentOrderResult();
        doAnswer(new UpdateHolderAnswer<GetFulfillmentOrderResultHolder>(1)
        {
            @Override
            void updateHolder(GetFulfillmentOrderResultHolder h)
            {
                h.value = result;
            }
        }).when(out).getFulfillmentOrder(eq(ORDER_ID), any(GetFulfillmentOrderResultHolder.class),
            anyOutboundMetadata());
        assertSame(result, connector.getFulfillmentOrder(ORDER_ID));
        reset(out);
    }

    @Test
    public void getFulfillmentPreviewWithCategories() throws RemoteException
    {
        doAnswer(updatePreview()).when(out).getFulfillmentPreview(
            any(com.amazonaws.fba_outbound.doc._2007_08_02.Address.class),
            eq(asArray(new GetFulfillmentPreviewItem(MSKU, 10, ORDER_ITEM_ID))), //
            (String[]) isNull(), //
            any(GetFulfillmentPreviewResultHolder.class), // 
            anyOutboundMetadata());
        connector.getFulfillmentPreview(new HashMap<String, Object>(), //
            Arrays.asList(new GetFulfillmentPreviewItem(MSKU, 10, ORDER_ITEM_ID)), null, ORDER_ITEM_ID);
        reset(out);
    }

    @Test
    public void getFulfillmentPreviewWithoutCategories() throws RemoteException
    {
        doAnswer(updatePreview()).when(out).getFulfillmentPreview(
            any(com.amazonaws.fba_outbound.doc._2007_08_02.Address.class),
            eq(asArray(new GetFulfillmentPreviewItem(MSKU, 10, ORDER_ITEM_ID))),//
            eq(asArray("CAT-1")), //
            any(GetFulfillmentPreviewResultHolder.class), //
            anyOutboundMetadata());
        connector.getFulfillmentPreview(new HashMap<String, Object>(), Arrays.asList(new GetFulfillmentPreviewItem(MSKU, 10,
            ORDER_ITEM_ID)), "CAT-1", ORDER_ITEM_ID);
        reset(out);
    }

    @Test
    public void getInboundServiceStatus() throws RemoteException
    {
        doAnswer(updateInboundStatus()).when(in).getServiceStatus(
            any(com.amazonaws.fba_inbound.doc._2007_05_10.holders.GetServiceStatusResultHolder.class),
            anyInboundMetadata());
        assertEquals(STATUS_MESSAGE, connector.getInboundServiceStatus());
        reset(in);
    }

    @Test
    public void getInventoryServiceStatus() throws RemoteException
    {
        doAnswer(updateInventoryStatus()).when(inventory).getServiceStatus(
            any(com.amazonaws.fba_inventory.doc._2009_07_31.holders.GetServiceStatusResultHolder.class),
            anyInventoryMetadata());
        assertEquals(STATUS_MESSAGE, connector.getInventoryServiceStatus());
        reset(inventory);
    }

    @Test
    public void getOutboundServiceStatus() throws RemoteException
    {
        doAnswer(updateOutboundStatus()).when(out).getServiceStatus(any(GetServiceStatusResultHolder.class),
            anyOutboundMetadata());
        assertEquals(STATUS_MESSAGE, connector.getOutboundServiceStatus());
        reset(out);
    }

    @Test
    public void getInboundShipment() throws RemoteException
    {
        final InboundShipmentData shipmentData = new InboundShipmentData();
        doAnswer(new UpdateHolderAnswer<GetInboundShipmentDataResultHolder>(1)
        {
            @Override
            void updateHolder(GetInboundShipmentDataResultHolder h)
            {
                h.value = new GetInboundShipmentDataResult(shipmentData);
            }
        }).when(in).getInboundShipmentData(eq(SHIP_ID), any(GetInboundShipmentDataResultHolder.class),
            anyInboundMetadata());
        assertSame(shipmentData, connector.getInboundShipment(SHIP_ID));
        reset(in);
    }

    @Test
    public void getInventorySupplyWithoutGroup() throws RemoteException
    {
        doAnswer(new UpdateHolderAnswer<GetInventorySupplyResultHolder>(2)
        {
            @Override
            void updateHolder(GetInventorySupplyResultHolder h)
            {
                h.value = new GetInventorySupplyResult(asArray(new MerchantSKUSupply()));
            }
        }).when(inventory).getInventorySupply(eq(asArray(MSKU)), (String) isNull(),
            any(GetInventorySupplyResultHolder.class), anyInventoryMetadata());
        connector.getInventorySupply(MSKU, null);
        reset(inventory);
    }

    @Test
    public void listFulfillmentItems()
    {
        assertNotNull(connector.listFulfillmentItems(false));
    }

    @Test
    public void listFulfillmentOrdersWithoutDate()
    {
        assertNotNull(connector.listFulfillmentOrders(null, null));
    }

    @Test
    public void listFulfillmentOrdersWithDate()
    {
        assertNotNull(connector.listFulfillmentOrders(new Date(), null));
    }

    @Test
    public void listInboundShipmentItems()
    {
        assertNotNull(connector.listInboundShipmentItems(SHIP_ID));
    }

    @Test
    public void listInboundShipmentsWithoutBeforeDate()
    {
        assertNotNull(connector.listInboundShipments(ShipmentStatus.ERROR, new Date(), null));
    }

    @Test
    public void listInboundShipmentsWithAfterDate()
    {
        assertNotNull(connector.listInboundShipments(ShipmentStatus.ERROR, null, new Date()));
    }

    @Test
    public void listUpdatedInventorySupplyWithoutGroup()
    {
        assertNotNull(connector.listUpdatedInventorySupply(new Date(), null));
    }

    @Test
    public void listUpdatedInventorySupplyWithGroup()
    {
        assertNotNull(connector.listUpdatedInventorySupply(new Date(), ""));
    }

    @Test
    public void putInboundShipment() throws RemoteException
    {
        connector.putInboundShipmentData(SHIP_ID, "A shipment", "a center", new HashMap<String, Object>(),
            LabelPreference.AMAZON_LABEL_ONLY);
        verify(in).putInboundShipmentData(eq(SHIP_ID), eq("A shipment"), eq("a center"),
            any(com.amazonaws.fba_inbound.doc._2007_05_10.Address.class),
            eq(LabelPrepPreference.AMAZON_LABEL_ONLY));
    }

    @Test
    public void setInboundShipmentStatus() throws RemoteException
    {
        connector.setInboundShipmentStatus(SHIP_ID, ShipmentStatus.DELIVERED);
        verify(in).setInboundShipmentStatus(SHIP_ID,
            com.amazonaws.fba_inbound.doc._2007_05_10.ShipmentStatus.Delivered);
    }

    abstract class UpdateHolderAnswer<HolderType> implements Answer<Void>
    {
        private final int holderArgPosition;

        UpdateHolderAnswer(int holderArgPosition)
        {
            this.holderArgPosition = holderArgPosition;
        }

        @SuppressWarnings("unchecked")
        public final Void answer(InvocationOnMock invocation) throws Throwable
        {
            updateHolder(((HolderType) invocation.getArguments()[holderArgPosition]));
            return null;
        }

        abstract void updateHolder(HolderType h);
    }

    private Answer<Void> updateInventoryStatus()
    {
        return new UpdateHolderAnswer<com.amazonaws.fba_inventory.doc._2009_07_31.holders.GetServiceStatusResultHolder>(0)
        {
            @Override
            void updateHolder(com.amazonaws.fba_inventory.doc._2009_07_31.holders.GetServiceStatusResultHolder h)
            {
                h.value = new com.amazonaws.fba_inventory.doc._2009_07_31.GetServiceStatusResult(STATUS_MESSAGE);
            }
        };
    }
    
    private Answer<Void> updateInboundStatus()
    {
        return new UpdateHolderAnswer<com.amazonaws.fba_inbound.doc._2007_05_10.holders.GetServiceStatusResultHolder>(0)
        {
            @Override
            void updateHolder(com.amazonaws.fba_inbound.doc._2007_05_10.holders.GetServiceStatusResultHolder h)
            {
                h.value = new GetServiceStatusResult(STATUS_MESSAGE);
            }
        };
    }
    
    private Answer<Void> updateOutboundStatus()
    {
        return new UpdateHolderAnswer<GetServiceStatusResultHolder>(0)
        {
            @Override
            void updateHolder(GetServiceStatusResultHolder h)
            {
                h.value = new com.amazonaws.fba_outbound.doc._2007_08_02.GetServiceStatusResult(STATUS_MESSAGE);
            }
        };
    }

    private UpdateHolderAnswer<GetFulfillmentPreviewResultHolder> updatePreview()
    {
        return new UpdateHolderAnswer<GetFulfillmentPreviewResultHolder>(3)
        {
            @Override
            void updateHolder(GetFulfillmentPreviewResultHolder h)
            {
                h.value = new GetFulfillmentPreviewResult(new FulfillmentPreview[0]);
            }
        };
    }

    private com.amazonaws.fba_inbound.doc._2007_05_10.holders.ResponseMetadataHolder anyInboundMetadata()
    {
        return any(com.amazonaws.fba_inbound.doc._2007_05_10.holders.ResponseMetadataHolder.class);
    }
    

    private com.amazonaws.fba_inventory.doc._2009_07_31.holders.ResponseMetadataHolder anyInventoryMetadata()
    {
        return any(com.amazonaws.fba_inventory.doc._2009_07_31.holders.ResponseMetadataHolder.class);
    }

    private ResponseMetadataHolder anyOutboundMetadata()
    {
        return any(ResponseMetadataHolder.class);
    }

}
