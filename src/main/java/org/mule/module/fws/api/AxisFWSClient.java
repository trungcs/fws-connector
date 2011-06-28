/**
 * Mule FWS Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.module.fws.api;

import org.mule.module.fws.api.internal.Address;
import org.mule.module.fws.api.internal.AmazonFBAInventoryPortType;
import org.mule.module.fws.api.internal.AmazonFBAOutboundPortType;
import org.mule.module.fws.api.internal.AmazonFWSInboundPortType;
import org.mule.module.fws.api.internal.CreateFulfillmentOrderItem;
import org.mule.module.fws.api.internal.FulfillmentItem;
import org.mule.module.fws.api.internal.FulfillmentOrder;
import org.mule.module.fws.api.internal.FulfillmentPreview;
import org.mule.module.fws.api.internal.GetFulfillmentOrderResult;
import org.mule.module.fws.api.internal.GetFulfillmentPreviewItem;
import org.mule.module.fws.api.internal.InboundShipmentData;
import org.mule.module.fws.api.internal.InboundShipmentItem;
import org.mule.module.fws.api.internal.ListAllFulfillmentItemsByNextTokenResult;
import org.mule.module.fws.api.internal.ListAllFulfillmentItemsResult;
import org.mule.module.fws.api.internal.ListAllFulfillmentOrdersResult;
import org.mule.module.fws.api.internal.ListInboundShipmentItemsByNextTokenResult;
import org.mule.module.fws.api.internal.ListInboundShipmentItemsResult;
import org.mule.module.fws.api.internal.ListInboundShipmentsByNextTokenResult;
import org.mule.module.fws.api.internal.ListInboundShipmentsResult;
import org.mule.module.fws.api.internal.ListUpdatedInventorySupplyByNextTokenResult;
import org.mule.module.fws.api.internal.ListUpdatedInventorySupplyResult;
import org.mule.module.fws.api.internal.MerchantItem;
import org.mule.module.fws.api.internal.MerchantSKUQuantityItem;
import org.mule.module.fws.api.internal.MerchantSKUSupply;
import org.mule.module.fws.api.internal.ShipmentPreview;
import org.mule.module.fws.api.internal.ShipmentStatus;
import org.mule.module.fws.api.internal.holders.GetFulfillmentIdentifierForMSKUResultHolder;
import org.mule.module.fws.api.internal.holders.GetFulfillmentIdentifierResultHolder;
import org.mule.module.fws.api.internal.holders.GetFulfillmentItemByFNSKUResultHolder;
import org.mule.module.fws.api.internal.holders.GetFulfillmentItemByMSKUResultHolder;
import org.mule.module.fws.api.internal.holders.GetFulfillmentOrderResultHolder;
import org.mule.module.fws.api.internal.holders.GetFulfillmentPreviewResultHolder;
import org.mule.module.fws.api.internal.holders.GetInboundShipmentDataResultHolder;
import org.mule.module.fws.api.internal.holders.GetInboundShipmentPreviewResultHolder;
import org.mule.module.fws.api.internal.holders.GetInventorySupplyResultHolder;
import org.mule.module.fws.api.internal.holders.GetServiceStatusResultHolder;
import org.mule.module.fws.api.internal.holders.ListAllFulfillmentItemsByNextTokenResultHolder;
import org.mule.module.fws.api.internal.holders.ListAllFulfillmentItemsResultHolder;
import org.mule.module.fws.api.internal.holders.ListAllFulfillmentOrdersByNextTokenResultHolder;
import org.mule.module.fws.api.internal.holders.ListAllFulfillmentOrdersResultHolder;
import org.mule.module.fws.api.internal.holders.ListInboundShipmentItemsByNextTokenResultHolder;
import org.mule.module.fws.api.internal.holders.ListInboundShipmentItemsResultHolder;
import org.mule.module.fws.api.internal.holders.ListInboundShipmentsByNextTokenResultHolder;
import org.mule.module.fws.api.internal.holders.ListInboundShipmentsResultHolder;
import org.mule.module.fws.api.internal.holders.ListUpdatedInventorySupplyByNextTokenResultHolder;
import org.mule.module.fws.api.internal.holders.ListUpdatedInventorySupplyResultHolder;
import org.mule.module.fws.api.internal.holders.ResponseMetadataHolder;

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.xml.rpc.holders.Holder;

import org.apache.commons.lang.Validate;
import static org.mule.module.fws.api.Arrays.*; 

public class AxisFWSClient implements FWSClient<RemoteException>
{
    private static final int PAGE_SIZE = 100;
    private final PortProvider<AmazonFWSInboundPortType> inboundPortProvider;
    private final PortProvider<AmazonFBAOutboundPortType> outboundPortProvider;
    private final PortProvider<AmazonFBAInventoryPortType> inventoryPortProvider;

    public AxisFWSClient(PortProvider<AmazonFWSInboundPortType> inboundPortProvider,
                         PortProvider<AmazonFBAOutboundPortType> outboundPortProvider,
                         PortProvider<AmazonFBAInventoryPortType> inventoryPortProvider)
    {
        Validate.notNull(inboundPortProvider);
        Validate.notNull(outboundPortProvider);
        Validate.notNull(inventoryPortProvider);
        this.inboundPortProvider = inboundPortProvider;
        this.outboundPortProvider = outboundPortProvider;
        this.inventoryPortProvider = inventoryPortProvider;
    }

    public void cancelFulfillmentOrder(String orderId) throws RemoteException
    {
        getPort(outboundPortProvider, "CancelFulfillmentOrder").cancelFulfillmentOrder(orderId);
    }
    
    public GetFulfillmentOrderResult createFulfillmentOrder(String orderId,
                                                            String displayableOrderId,
                                                            Address destinationAddress,
                                                            String fulfillmentPolicy,
                                                            String fulfillmentMethod,
                                                            String shippingSpeedCategory,
                                                            String displayableOrderComment,
                                                            Date displayableOrderDate,
                                                            List<String> emails,
                                                            List<CreateFulfillmentOrderItem> items)
        throws RemoteException
    {
        Validate.notNull(orderId);
        Validate.notNull(displayableOrderId);
        Validate.notNull(destinationAddress);
        Validate.notNull(shippingSpeedCategory);
        Validate.notNull(displayableOrderComment);
        Validate.notNull(displayableOrderDate);
        Validate.notNull(emails);
        Validate.notNull(items);
        Validate.isTrue(!items.isEmpty(), "At least an item must be passed");
        GetFulfillmentOrderResultHolder result = new GetFulfillmentOrderResultHolder();
        getPort(outboundPortProvider, result).createFulfillmentOrder(orderId, displayableOrderId,
            FwsDates.format(displayableOrderDate), displayableOrderComment, shippingSpeedCategory,
            destinationAddress, fulfillmentPolicy, fulfillmentMethod,
            emails.toArray(new String[emails.size()]),
            items.toArray(new CreateFulfillmentOrderItem[items.size()]));
        return result.value;
    }

    public void deleteInboundShipmentItems(String merchantSku, String shipmentId) throws RemoteException
    {
        getPort(inboundPortProvider, "DeleteInboundShipmentItems").deleteInboundShipmentItems(shipmentId,
            asArray(merchantSku));
    }

    public List<FulfillmentItem> getFulfillmentIdentifier(String asin,
                                                          ItemCondition itemCondition,
                                                          String merchantSku) throws RemoteException
    {
        GetFulfillmentIdentifierResultHolder result = new GetFulfillmentIdentifierResultHolder();
        getPort(inboundPortProvider, result).getFulfillmentIdentifier(
            asArray(new MerchantItem(asin, itemCondition.toFwsItemCondition(), merchantSku)),
            result, new ResponseMetadataHolder());
        return Arrays.asList(result.value.getFulfillmentItem());
    }

    public List<FulfillmentItem> getFulfillmentIdentifierForMsku(String merchantSku) throws RemoteException
    {
        GetFulfillmentIdentifierForMSKUResultHolder result = new GetFulfillmentIdentifierForMSKUResultHolder();
        getPort(inboundPortProvider, result).getFulfillmentIdentifierForMSKU(//
            asArray(merchantSku), result, new ResponseMetadataHolder());
        return Arrays.asList(result.value.getFulfillmentItem());
    }

    public List<FulfillmentItem> getFulfillmentItemByFnsku(String fulfillmentNetworkSku)
        throws RemoteException
    {
        GetFulfillmentItemByFNSKUResultHolder result = new GetFulfillmentItemByFNSKUResultHolder();
        getPort(inboundPortProvider, result).getFulfillmentItemByFNSKU(asArray(fulfillmentNetworkSku),
            result, new ResponseMetadataHolder());
        return Arrays.asList(result.value.getFulfillmentItem());
    }

    public List<FulfillmentItem> getFulfillmentItemByMsku(String merchantSku) throws RemoteException
    {
        GetFulfillmentItemByMSKUResultHolder result = new GetFulfillmentItemByMSKUResultHolder();
        getPort(inboundPortProvider, result).getFulfillmentItemByMSKU(//
            asArray(merchantSku), result, new ResponseMetadataHolder());
        return Arrays.asList(result.value.getFulfillmentItem());
    }

    public GetFulfillmentOrderResult getFulfillmentOrder(String orderId) throws RemoteException
    {
        GetFulfillmentOrderResultHolder result = new GetFulfillmentOrderResultHolder();
        getPort(outboundPortProvider, result).getFulfillmentOrder(orderId, result,
            new ResponseMetadataHolder());
        return result.value;
    }

    public List<FulfillmentPreview> getFulfillmentPreview(Address address,
                                                          String merchantSku,
                                                          int quantity,
                                                          String shippingSpeedCategories,
                                                          String orderItemId) throws RemoteException
    {
        Validate.notNull(address);
        Validate.notNull(merchantSku);
        Validate.notNull(orderItemId);
        GetFulfillmentPreviewResultHolder result = new GetFulfillmentPreviewResultHolder();
        getPort(outboundPortProvider, result).getFulfillmentPreview(
            address, //
            asArray(new GetFulfillmentPreviewItem(merchantSku, quantity, orderItemId)), // 
            shippingSpeedCategories == null ? null : asArray(shippingSpeedCategories), // 
            result, //
            new ResponseMetadataHolder());
        return Arrays.asList(result.value.getFulfillmentPreviews());
    }

    public String getInboundServiceStatus() throws RemoteException
    {
        GetServiceStatusResultHolder result = new GetServiceStatusResultHolder();
        getPort(inboundPortProvider, result).getServiceStatus(result, new ResponseMetadataHolder());
        return result.value.getStatus();
    }

    public InboundShipmentData getInboundShipment(String shipmentId) throws RemoteException
    {
        GetInboundShipmentDataResultHolder result = new GetInboundShipmentDataResultHolder();
        getPort(inboundPortProvider, result).getInboundShipmentData(shipmentId, result,
            new ResponseMetadataHolder());
        return result.value.getShipmentData();
    }

    public List<ShipmentPreview> getInboundShipmentPreview(String merchantSku,
                                                           int quantity,
                                                           Address address,
                                                           LabelPreference labelPreference)
        throws RemoteException
    {
        Validate.notNull(merchantSku);
        Validate.notNull(address);
        GetInboundShipmentPreviewResultHolder result = new GetInboundShipmentPreviewResultHolder();
        getPort(inboundPortProvider, result).getInboundShipmentPreview(address,
            asArray(new MerchantSKUQuantityItem(merchantSku, quantity)),
            LabelPreference.toFwsLabelPrepPreference(labelPreference), result, new ResponseMetadataHolder());
        return Arrays.asList(result.value.getShipmentPreview());
    }

    public String getInventoryServiceStatus() throws RemoteException
    {
        GetServiceStatusResultHolder result = new GetServiceStatusResultHolder();
        getPort(inventoryPortProvider, result).getServiceStatus(result, new ResponseMetadataHolder());
        return result.value.getStatus();
    }

    public List<MerchantSKUSupply> getInventorySupply(String merchantSku, String responseGroup)
        throws RemoteException
    {
        GetInventorySupplyResultHolder result = new GetInventorySupplyResultHolder();
        getPort(inventoryPortProvider, result).getInventorySupply(asArray(merchantSku), responseGroup,
            result, new ResponseMetadataHolder());
        return Arrays.asList(result.value.getMerchantSKUSupply());
    }

    public String getOutboundServiceStatus() throws RemoteException
    {
        GetServiceStatusResultHolder result = new GetServiceStatusResultHolder();
        getPort(outboundPortProvider, result).getServiceStatus(result, new ResponseMetadataHolder());
        return result.value.getStatus();
    }

    public Iterable<FulfillmentItem> listFulfillmentItems(final boolean includeInactive)
        throws RemoteException
    {
        return new FwsPaginatedIterable<FulfillmentItem, ListAllFulfillmentItemsResult>()
        {
            @Override
            protected ListAllFulfillmentItemsResult firstFwsPage() throws RemoteException
            {
                ListAllFulfillmentItemsResultHolder result = new ListAllFulfillmentItemsResultHolder();
                getPort(inboundPortProvider, result).listAllFulfillmentItems(includeInactive, PAGE_SIZE,
                    result, new ResponseMetadataHolder());
                return result.value;
            }

            @Override
            protected ListAllFulfillmentItemsByNextTokenResult nextFwsPage(ListAllFulfillmentItemsResult currentPage)
                throws RemoteException
            {
                ListAllFulfillmentItemsByNextTokenResultHolder result = new ListAllFulfillmentItemsByNextTokenResultHolder();
                getPort(inboundPortProvider, result).listAllFulfillmentItemsByNextToken(
                    currentPage.getNextToken(), result, new ResponseMetadataHolder());
                return result.value;
            }

            @Override
            protected FulfillmentItem[] pageArray(ListAllFulfillmentItemsResult page)
            {
                return page.getFulfillmentItem();
            }

        };
    }

    public Iterable<FulfillmentOrder> listFulfillmentOrders(final Date startDate)
    {
        return new FwsPaginatedIterable<FulfillmentOrder, ListAllFulfillmentOrdersResult>()
        {

            @Override
            protected ListAllFulfillmentOrdersResult firstFwsPage() throws RemoteException
            {
                ListAllFulfillmentOrdersResultHolder result = new ListAllFulfillmentOrdersResultHolder();
                getPort(outboundPortProvider, result).listAllFulfillmentOrders(PAGE_SIZE,
                    FwsDates.format(startDate), new String[0], result, new ResponseMetadataHolder());
                return result.value;
            }

            @Override
            protected ListAllFulfillmentOrdersByNextTokenResultHolder nextFwsPage(ListAllFulfillmentOrdersResult currentPage)
                throws RemoteException
            {
                ListAllFulfillmentOrdersByNextTokenResultHolder result = new ListAllFulfillmentOrdersByNextTokenResultHolder();
                getPort(outboundPortProvider, result).listAllFulfillmentOrdersByNextToken(
                    currentPage.getNextToken(), result, new ResponseMetadataHolder());
                return result;
            }

            @Override
            protected FulfillmentOrder[] pageArray(ListAllFulfillmentOrdersResult page)
            {
                return page.getFulfillmentOrder();
            }
        };
    }

    public Iterable<InboundShipmentItem> listInboundShipmentItems(final String shipmentId)
    {
        return new FwsPaginatedIterable<InboundShipmentItem, ListInboundShipmentItemsResult>()
        {

            @Override
            protected ListInboundShipmentItemsResult firstFwsPage() throws RemoteException
            {
                ListInboundShipmentItemsResultHolder result = new ListInboundShipmentItemsResultHolder();
                getPort(inboundPortProvider, result).listInboundShipmentItems(shipmentId, PAGE_SIZE, result,
                    new ResponseMetadataHolder());
                return result.value;
            }

            @Override
            protected ListInboundShipmentItemsByNextTokenResult nextFwsPage(ListInboundShipmentItemsResult currentPage)
                throws RemoteException
            {
                ListInboundShipmentItemsByNextTokenResultHolder result = new ListInboundShipmentItemsByNextTokenResultHolder();
                getPort(inboundPortProvider, result).listInboundShipmentItemsByNextToken(
                    currentPage.getNextToken(), result, new ResponseMetadataHolder());
                return result.value;
            }

            @Override
            protected InboundShipmentItem[] pageArray(ListInboundShipmentItemsResult page)
            {
                return page.getShipmentItem();
            }
        };
    }

    public Iterable<InboundShipmentData> listInboundShipments(final org.mule.module.fws.api.ShipmentStatus shipmentStatus,
                                                              final Date createdAfter,
                                                              final Date createdBefore)
    {
        Validate.notNull(shipmentStatus);
        return new FwsPaginatedIterable<InboundShipmentData, ListInboundShipmentsResult>()
        {
            @Override
            protected ListInboundShipmentsResult firstFwsPage() throws RemoteException
            {
                ListInboundShipmentsResultHolder result = new ListInboundShipmentsResultHolder();
                getPort(inboundPortProvider, result).listInboundShipments(
                    asArray(shipmentStatus.toFwsShipmentStatus()),
                    FwsDates.toCalendar(createdBefore), FwsDates.toCalendar(createdAfter), PAGE_SIZE, result,
                    new ResponseMetadataHolder());
                return result.value;
            }

            @Override
            protected ListInboundShipmentsByNextTokenResult nextFwsPage(ListInboundShipmentsResult currentPage)
                throws RemoteException
            {
                ListInboundShipmentsByNextTokenResultHolder result = new ListInboundShipmentsByNextTokenResultHolder();
                getPort(inboundPortProvider, result).listInboundShipmentsByNextToken(
                    currentPage.getNextToken(), result, new ResponseMetadataHolder());
                return result.value;
            }

            @Override
            protected InboundShipmentData[] pageArray(ListInboundShipmentsResult page)
            {
                return page.getShipmentData();
            }
        };

    }

    public Iterable<MerchantSKUSupply> listUpdatedInventorySupply(final Date startDate,
                                                                  final String responseGroup)
    {
        return new FwsPaginatedIterable<MerchantSKUSupply, ListUpdatedInventorySupplyResult>()
        {
            @Override
            protected ListUpdatedInventorySupplyResult firstFwsPage() throws RemoteException
            {
                ListUpdatedInventorySupplyResultHolder result = new ListUpdatedInventorySupplyResultHolder();
                getPort(inventoryPortProvider, result).listUpdatedInventorySupply(PAGE_SIZE,
                    FwsDates.format(startDate), responseGroup, result, new ResponseMetadataHolder());
                return result.value;
            }

            @Override
            protected ListUpdatedInventorySupplyByNextTokenResult nextFwsPage(ListUpdatedInventorySupplyResult currentPage)
                throws RemoteException
            {
                ListUpdatedInventorySupplyByNextTokenResultHolder result = new ListUpdatedInventorySupplyByNextTokenResultHolder();
                getPort(inventoryPortProvider, result).listUpdatedInventorySupplyByNextToken(
                    currentPage.getNextToken(), result, new ResponseMetadataHolder());
                return result.value;
            }

            @Override
            protected MerchantSKUSupply[] pageArray(ListUpdatedInventorySupplyResult page)
            {
                return page.getMerchantSKUSupply();
            }
        };
    }

    public void putInboundShipment(String shipmentId,
                                   String shipmentName,
                                   String destinationFulfillmentCenter,
                                   Address shipFromAddress,
                                   org.mule.module.fws.api.LabelPreference labelPreference)
        throws RemoteException
    {
        getPort(inboundPortProvider, "PutInboundShipment")//
        .putInboundShipmentData(shipmentId, shipmentName, destinationFulfillmentCenter, shipFromAddress,
            labelPreference.toFwsLabelPrepPreference());
    }

    public void putInboundShipmentItems(String shipmentId, Map<String, Integer> itemQuantities)
        throws RemoteException
    {
        getPort(inboundPortProvider, "PutInboundShipmentItems").putInboundShipmentItems(shipmentId,
            toQuantityItems(itemQuantities));
    }

    public void setInboundShipmentStatus(String shipmentId,
                                         org.mule.module.fws.api.ShipmentStatus shipmentStatus)
        throws RemoteException
    {
        Validate.notNull(shipmentId);
        Validate.notNull(shipmentStatus);
        getPort(inboundPortProvider, "SetInboundShipmentStatus").setInboundShipmentStatus(shipmentId,
            shipmentStatus.toFwsShipmentStatus());
    }

    public static MerchantSKUQuantityItem[] toQuantityItems(Map<String, Integer> map)
    {
        MerchantSKUQuantityItem[] items = new MerchantSKUQuantityItem[map.size()];
        int i = 0;
        for (Map.Entry<String, Integer> e : map.entrySet())
        {
            items[i++] = new MerchantSKUQuantityItem(e.getKey(), e.getValue());
        }
        return items;
    }

    private <T> T getPort(PortProvider<T> provider, Object action) throws RemoteException
    {
        return provider.getPort(getActionName(action));
    }

    private <T> T getPort(PortProvider<T> provider, String action) throws RemoteException
    {
        return provider.getPort(action);
    }

    private String getActionName(Object action) throws RemoteException
    {
        if (action instanceof Holder)
        {
            return action.getClass().getName().replace("ResultHolder", "");
        }
        throw new AssertionError();
    }

}
