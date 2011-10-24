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

import static org.mule.module.fws.api.Arrays.asArray;

import com.amazonaws.fba_inbound.doc._2007_05_10.AmazonFWSInboundPortType;
import com.amazonaws.fba_inbound.doc._2007_05_10.FulfillmentItem;
import com.amazonaws.fba_inbound.doc._2007_05_10.InboundShipmentData;
import com.amazonaws.fba_inbound.doc._2007_05_10.InboundShipmentItem;
import com.amazonaws.fba_inbound.doc._2007_05_10.ListAllFulfillmentItemsByNextTokenResult;
import com.amazonaws.fba_inbound.doc._2007_05_10.ListAllFulfillmentItemsResult;
import com.amazonaws.fba_inbound.doc._2007_05_10.ListInboundShipmentItemsByNextTokenResult;
import com.amazonaws.fba_inbound.doc._2007_05_10.ListInboundShipmentItemsResult;
import com.amazonaws.fba_inbound.doc._2007_05_10.ListInboundShipmentsByNextTokenResult;
import com.amazonaws.fba_inbound.doc._2007_05_10.ListInboundShipmentsResult;
import com.amazonaws.fba_inbound.doc._2007_05_10.MerchantItem;
import com.amazonaws.fba_inbound.doc._2007_05_10.MerchantSKUQuantityItem;
import com.amazonaws.fba_inbound.doc._2007_05_10.ShipmentPreview;
import com.amazonaws.fba_inbound.doc._2007_05_10.holders.GetFulfillmentIdentifierForMSKUResultHolder;
import com.amazonaws.fba_inbound.doc._2007_05_10.holders.GetFulfillmentIdentifierResultHolder;
import com.amazonaws.fba_inbound.doc._2007_05_10.holders.GetFulfillmentItemByFNSKUResultHolder;
import com.amazonaws.fba_inbound.doc._2007_05_10.holders.GetFulfillmentItemByMSKUResultHolder;
import com.amazonaws.fba_inbound.doc._2007_05_10.holders.GetInboundShipmentDataResultHolder;
import com.amazonaws.fba_inbound.doc._2007_05_10.holders.GetInboundShipmentPreviewResultHolder;
import com.amazonaws.fba_inbound.doc._2007_05_10.holders.ListAllFulfillmentItemsByNextTokenResultHolder;
import com.amazonaws.fba_inbound.doc._2007_05_10.holders.ListAllFulfillmentItemsResultHolder;
import com.amazonaws.fba_inbound.doc._2007_05_10.holders.ListInboundShipmentItemsByNextTokenResultHolder;
import com.amazonaws.fba_inbound.doc._2007_05_10.holders.ListInboundShipmentItemsResultHolder;
import com.amazonaws.fba_inbound.doc._2007_05_10.holders.ListInboundShipmentsByNextTokenResultHolder;
import com.amazonaws.fba_inbound.doc._2007_05_10.holders.ListInboundShipmentsResultHolder;
import com.amazonaws.fba_inbound.doc._2007_05_10.holders.ResponseMetadataHolder;
import com.amazonaws.fba_inventory.doc._2009_07_31.AmazonFBAInventoryPortType;
import com.amazonaws.fba_inventory.doc._2009_07_31.ListUpdatedInventorySupplyByNextTokenResult;
import com.amazonaws.fba_inventory.doc._2009_07_31.ListUpdatedInventorySupplyResult;
import com.amazonaws.fba_inventory.doc._2009_07_31.MerchantSKUSupply;
import com.amazonaws.fba_inventory.doc._2009_07_31.holders.GetInventorySupplyResultHolder;
import com.amazonaws.fba_inventory.doc._2009_07_31.holders.ListUpdatedInventorySupplyByNextTokenResultHolder;
import com.amazonaws.fba_inventory.doc._2009_07_31.holders.ListUpdatedInventorySupplyResultHolder;
import com.amazonaws.fba_outbound.doc._2007_08_02.AmazonFBAOutboundPortType;
import com.amazonaws.fba_outbound.doc._2007_08_02.CreateFulfillmentOrderItem;
import com.amazonaws.fba_outbound.doc._2007_08_02.FulfillmentOrder;
import com.amazonaws.fba_outbound.doc._2007_08_02.FulfillmentPreview;
import com.amazonaws.fba_outbound.doc._2007_08_02.GetFulfillmentOrderResult;
import com.amazonaws.fba_outbound.doc._2007_08_02.GetFulfillmentPreviewItem;
import com.amazonaws.fba_outbound.doc._2007_08_02.ListAllFulfillmentOrdersResult;
import com.amazonaws.fba_outbound.doc._2007_08_02.holders.GetFulfillmentOrderResultHolder;
import com.amazonaws.fba_outbound.doc._2007_08_02.holders.GetFulfillmentPreviewResultHolder;
import com.amazonaws.fba_outbound.doc._2007_08_02.holders.GetServiceStatusResultHolder;
import com.amazonaws.fba_outbound.doc._2007_08_02.holders.ListAllFulfillmentOrdersByNextTokenResultHolder;
import com.amazonaws.fba_outbound.doc._2007_08_02.holders.ListAllFulfillmentOrdersResultHolder;

import java.rmi.RemoteException;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.xml.rpc.holders.Holder;

import org.apache.commons.lang.Validate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AxisFWSClient implements FWSClient<RemoteException>
{
    private Logger logger = LoggerFactory.getLogger(AxisFWSClient.class);
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
        Validate.notEmpty(orderId);
        getPort(outboundPortProvider, "CancelFulfillmentOrder").cancelFulfillmentOrder(orderId);
    }

    public void createFulfillmentOrder(String orderId,
                                       String displayableOrderId,
                                       Address destinationAddress,
                                       String fulfillmentPolicy,
                                       String fulfillmentMethod,
                                       String shippingSpeedCategory,
                                       String displayableOrderComment,
                                       Date displayableOrderDate,
                                       List<String> emails,
                                       List<CreateFulfillmentOrderItem> items) throws RemoteException
    {
        Validate.notNull(orderId);
        Validate.notNull(displayableOrderId);
        Validate.notNull(destinationAddress);
        Validate.notNull(shippingSpeedCategory);
        Validate.notNull(displayableOrderComment);
        Validate.notNull(displayableOrderDate);
        Validate.notNull(emails);
        Validate.notNull(items);
        validateNotEmptyItemsList(items);
        getPort(outboundPortProvider, "CreateFulfillmentOrder").createFulfillmentOrder(orderId,
            displayableOrderId, FwsDates.format(displayableOrderDate), displayableOrderComment,
            shippingSpeedCategory, destinationAddress.toOutboundAddress(), fulfillmentPolicy,
            fulfillmentMethod, emails.toArray(new String[emails.size()]),
            items.toArray(new CreateFulfillmentOrderItem[items.size()]));
    }

    public void deleteInboundShipmentItems(String merchantSku, String shipmentId) throws RemoteException
    {
        getPort(inboundPortProvider, "DeleteInboundShipmentItems").deleteInboundShipmentItems(shipmentId,
            asArray(merchantSku));
    }

    public FulfillmentItem getFulfillmentIdentifier(String asin,
                                                    ItemCondition itemCondition,
                                                    String merchantSku) throws RemoteException
    {
        Validate.notEmpty(asin);
        Validate.notNull(itemCondition);
        Validate.notEmpty(merchantSku);
        GetFulfillmentIdentifierResultHolder result = new GetFulfillmentIdentifierResultHolder();
        getPort(inboundPortProvider, result).getFulfillmentIdentifier(
            asArray(new MerchantItem(asin, itemCondition.toFwsItemCondition(), merchantSku)), result,
            newInboundMetadata());
        return getSingleItem(merchantSku, result.value.getFulfillmentItem());
    }

    public FulfillmentItem getFulfillmentIdentifierForMsku(@NotNull String merchantSku)
        throws RemoteException
    {
        Validate.notEmpty(merchantSku);
        GetFulfillmentIdentifierForMSKUResultHolder result = new GetFulfillmentIdentifierForMSKUResultHolder();
        getPort(inboundPortProvider, result).getFulfillmentIdentifierForMSKU(//
            asArray(merchantSku), result, newInboundMetadata());
        return getSingleItem(merchantSku, result.value.getFulfillmentItem());
    }

    public FulfillmentItem getFulfillmentItemByFnsku(String fulfillmentNetworkSku) throws RemoteException
    {
        Validate.notEmpty(fulfillmentNetworkSku);
        GetFulfillmentItemByFNSKUResultHolder result = new GetFulfillmentItemByFNSKUResultHolder();
        getPort(inboundPortProvider, result).getFulfillmentItemByFNSKU(asArray(fulfillmentNetworkSku),
            result, newInboundMetadata());
        return getSingleItem(fulfillmentNetworkSku, result.value.getFulfillmentItem());
    }

    public FulfillmentItem getFulfillmentItemByMsku(String merchantSku) throws RemoteException
    {
        Validate.notEmpty(merchantSku);
        GetFulfillmentItemByMSKUResultHolder result = new GetFulfillmentItemByMSKUResultHolder();
        getPort(inboundPortProvider, result).getFulfillmentItemByMSKU(//
            asArray(merchantSku), result, newInboundMetadata());
        return getSingleItem(merchantSku, result.value.getFulfillmentItem());
    }

    public GetFulfillmentOrderResult getFulfillmentOrder(String orderId) throws RemoteException
    {
        Validate.notEmpty(orderId);
        GetFulfillmentOrderResultHolder result = new GetFulfillmentOrderResultHolder();
        getPort(outboundPortProvider, result).getFulfillmentOrder(orderId, result, newOutboundMetadata());
        return result.value;
    }

    public List<FulfillmentPreview> getFulfillmentPreview(Address address,
                                                          List<GetFulfillmentPreviewItem> items,
                                                          String shippingSpeedCategories,
                                                          String orderItemId) throws RemoteException
    {
        Validate.notNull(address);
        validateNotEmptyItemsList(items);
        Validate.notNull(orderItemId);
        GetFulfillmentPreviewResultHolder result = new GetFulfillmentPreviewResultHolder();
        getPort(outboundPortProvider, result).getFulfillmentPreview(address.toOutboundAddress(), //
            items.toArray(new GetFulfillmentPreviewItem[items.size()]), // 
            shippingSpeedCategories == null ? null : asArray(shippingSpeedCategories), // 
            result, //
            newOutboundMetadata());
        return Arrays.asList(result.value.getFulfillmentPreviews());
    }

    public String getInboundServiceStatus() throws RemoteException
    {
        com.amazonaws.fba_inbound.doc._2007_05_10.holders.GetServiceStatusResultHolder result = new com.amazonaws.fba_inbound.doc._2007_05_10.holders.GetServiceStatusResultHolder();
        getPort(inboundPortProvider, result).getServiceStatus(result, newInboundMetadata());
        return result.value.getStatus();
    }

    public InboundShipmentData getInboundShipment(String shipmentId) throws RemoteException
    {
        Validate.notEmpty(shipmentId);
        GetInboundShipmentDataResultHolder result = new GetInboundShipmentDataResultHolder();
        getPort(inboundPortProvider, result).getInboundShipmentData(shipmentId, result, newInboundMetadata());
        return result.value.getShipmentData();
    }

    public List<ShipmentPreview> getInboundShipmentPreview(List<MerchantSKUQuantityItem> items,
                                                           Address address,
                                                           LabelPreference labelPreference)
        throws RemoteException
    {
        validateNotEmptyItemsList(items);
        Validate.notNull(address);
        GetInboundShipmentPreviewResultHolder result = new GetInboundShipmentPreviewResultHolder();
        getPort(inboundPortProvider, result).getInboundShipmentPreview(address.toInboundAddress(),
            items.toArray(new MerchantSKUQuantityItem[items.size()]),
            LabelPreference.toFwsLabelPrepPreference(labelPreference), result, newInboundMetadata());
        return Arrays.asList(result.value.getShipmentPreview());
    }

    public String getInventoryServiceStatus() throws RemoteException
    {
        com.amazonaws.fba_inventory.doc._2009_07_31.holders.GetServiceStatusResultHolder result = new com.amazonaws.fba_inventory.doc._2009_07_31.holders.GetServiceStatusResultHolder();
        getPort(inventoryPortProvider, result).getServiceStatus(result, newInventoryMetadata());
        return result.value.getStatus();
    }

    public MerchantSKUSupply getInventorySupply(String merchantSku, String responseGroup)
        throws RemoteException
    {
        Validate.notEmpty(merchantSku);
        GetInventorySupplyResultHolder result = new GetInventorySupplyResultHolder();
        getPort(inventoryPortProvider, result).getInventorySupply(asArray(merchantSku), responseGroup,
            result, newInventoryMetadata());
        final MerchantSKUSupply[] supply = result.value.getMerchantSKUSupply();
        if (supply.length != 1)
        {
            throw new RemoteException("There is no available inventory for the given sku " + merchantSku);
        }
        return supply[0];
    }

    public String getOutboundServiceStatus() throws RemoteException
    {
        GetServiceStatusResultHolder result = new GetServiceStatusResultHolder();
        getPort(outboundPortProvider, result).getServiceStatus(result, newOutboundMetadata());
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
                    result, newInboundMetadata());
                return result.value;
            }
        
            @Override
            protected ListAllFulfillmentItemsByNextTokenResult nextFwsPage(ListAllFulfillmentItemsResult currentPage)
                throws RemoteException
            {
                ListAllFulfillmentItemsByNextTokenResultHolder result = new ListAllFulfillmentItemsByNextTokenResultHolder();
                getPort(inboundPortProvider, result).listAllFulfillmentItemsByNextToken(
                    currentPage.getNextToken(), result, newInboundMetadata());
                return result.value;
            }
        
            @Override
            protected FulfillmentItem[] pageArray(ListAllFulfillmentItemsResult page)
            {
                return page.getFulfillmentItem();
            }
        
        };
    }

    public Iterable<FulfillmentOrder> listFulfillmentOrders(final Date startDate,
                                                            final List<String> fulfillmentMethod)
    {
        return new FwsPaginatedIterable<FulfillmentOrder, ListAllFulfillmentOrdersResult>()
        {
        
            @Override
            protected ListAllFulfillmentOrdersResult firstFwsPage() throws RemoteException
            {
                ListAllFulfillmentOrdersResultHolder result = new ListAllFulfillmentOrdersResultHolder();
                getPort(outboundPortProvider, result).listAllFulfillmentOrders(PAGE_SIZE,
                    FwsDates.format(startDate),
                    fulfillmentMethod.toArray(new String[fulfillmentMethod.size()]), result,
                    newOutboundMetadata());
                return result.value;
            }
        
            @Override
            protected ListAllFulfillmentOrdersByNextTokenResultHolder nextFwsPage(ListAllFulfillmentOrdersResult currentPage)
                throws RemoteException
            {
                ListAllFulfillmentOrdersByNextTokenResultHolder result = new ListAllFulfillmentOrdersByNextTokenResultHolder();
                getPort(outboundPortProvider, result).listAllFulfillmentOrdersByNextToken(
                    currentPage.getNextToken(), result, newOutboundMetadata());
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
        Validate.notEmpty(shipmentId);
        return new FwsPaginatedIterable<InboundShipmentItem, ListInboundShipmentItemsResult>()
        {
        
            @Override
            protected ListInboundShipmentItemsResult firstFwsPage() throws RemoteException
            {
                ListInboundShipmentItemsResultHolder result = new ListInboundShipmentItemsResultHolder();
                getPort(inboundPortProvider, result).listInboundShipmentItems(shipmentId, PAGE_SIZE, result,
                    newInboundMetadata());
                return result.value;
            }
        
            @Override
            protected ListInboundShipmentItemsByNextTokenResult nextFwsPage(ListInboundShipmentItemsResult currentPage)
                throws RemoteException
            {
                ListInboundShipmentItemsByNextTokenResultHolder result = new ListInboundShipmentItemsByNextTokenResultHolder();
                getPort(inboundPortProvider, result).listInboundShipmentItemsByNextToken(
                    currentPage.getNextToken(), result, newInboundMetadata());
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
                    asArray(shipmentStatus.toFwsShipmentStatus()), FwsDates.toCalendar(createdBefore),
                    FwsDates.toCalendar(createdAfter), PAGE_SIZE, result, newInboundMetadata());
                return result.value;
            }
        
            @Override
            protected ListInboundShipmentsByNextTokenResult nextFwsPage(ListInboundShipmentsResult currentPage)
                throws RemoteException
            {
                ListInboundShipmentsByNextTokenResultHolder result = new ListInboundShipmentsByNextTokenResultHolder();
                getPort(inboundPortProvider, result).listInboundShipmentsByNextToken(
                    currentPage.getNextToken(), result, newInboundMetadata());
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
        Validate.notNull(startDate);
        return new FwsPaginatedIterable<MerchantSKUSupply, ListUpdatedInventorySupplyResult>()
        {
            @Override
            protected ListUpdatedInventorySupplyResult firstFwsPage() throws RemoteException
            {
                ListUpdatedInventorySupplyResultHolder result = new ListUpdatedInventorySupplyResultHolder();
                getPort(inventoryPortProvider, result).listUpdatedInventorySupply(PAGE_SIZE,
                    FwsDates.format(startDate), responseGroup, result, newInventoryMetadata());
                return result.value;
            }
        
            @Override
            protected ListUpdatedInventorySupplyByNextTokenResult nextFwsPage(ListUpdatedInventorySupplyResult currentPage)
                throws RemoteException
            {
                ListUpdatedInventorySupplyByNextTokenResultHolder result = new ListUpdatedInventorySupplyByNextTokenResultHolder();
                getPort(inventoryPortProvider, result).listUpdatedInventorySupplyByNextToken(
                    currentPage.getNextToken(), result, newInventoryMetadata());
                return result.value;
            }
        
            @Override
            protected MerchantSKUSupply[] pageArray(ListUpdatedInventorySupplyResult page)
            {
                return page.getMerchantSKUSupply();
            }
        };
    }

    public void putInboundShipmentData(String shipmentId,
                                       String shipmentName,
                                       String destinationFulfillmentCenter,
                                       Address shipFromAddress,
                                       LabelPreference labelPreference) throws RemoteException
    {
        getPort(inboundPortProvider, "PutInboundShipment")//
        .putInboundShipmentData(shipmentId, shipmentName, destinationFulfillmentCenter,
            shipFromAddress.toInboundAddress(), LabelPreference.toFwsLabelPrepPreference(labelPreference));
    }

    public void putInboundShipment(String shipmentId,
                                   String shipmentName,
                                   String destinationFulfillmentCenter,
                                   Address shipFromAddress,
                                   LabelPreference labelPreference,
                                   List<MerchantSKUQuantityItem> itemQuantities) throws RemoteException
    {
        validateNotEmptyItemsList(itemQuantities);
        Validate.notEmpty(shipmentId);
        Validate.notEmpty(destinationFulfillmentCenter);
        Validate.notNull(shipmentName);
        getPort(inboundPortProvider, "PutInboundShipment")//
        .putInboundShipment(shipmentId, shipmentName, destinationFulfillmentCenter,
            shipFromAddress.toInboundAddress(), LabelPreference.toFwsLabelPrepPreference(labelPreference),
            itemQuantities.toArray(new MerchantSKUQuantityItem[itemQuantities.size()]));
    }

    public void putInboundShipmentItems(String shipmentId, List<MerchantSKUQuantityItem> itemQuantities)
        throws RemoteException
    {
        Validate.notEmpty(shipmentId);
        validateNotEmptyItemsList(itemQuantities);
        getPort(inboundPortProvider, "PutInboundShipmentItems").putInboundShipmentItems(shipmentId,
            itemQuantities.toArray(new MerchantSKUQuantityItem[itemQuantities.size()]));
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

    private FulfillmentItem getSingleItem(String sku, final FulfillmentItem[] fulfillmentItem)
        throws RemoteException
    {
        if (fulfillmentItem.length != 1)
        {
            throw new RemoteException("The sku " + sku + " is invalid");
        }
        return fulfillmentItem[0];
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
            return action.getClass().getSimpleName().replace("ResultHolder", "");
        }
        throw new AssertionError();
    }

    private ResponseMetadataHolder newInboundMetadata()
    {
        return new ResponseMetadataHolder();
    }

    private com.amazonaws.fba_outbound.doc._2007_08_02.holders.ResponseMetadataHolder newOutboundMetadata()
    {
        return new com.amazonaws.fba_outbound.doc._2007_08_02.holders.ResponseMetadataHolder();
    }

    private com.amazonaws.fba_inventory.doc._2009_07_31.holders.ResponseMetadataHolder newInventoryMetadata()
    {
        return new com.amazonaws.fba_inventory.doc._2009_07_31.holders.ResponseMetadataHolder();
    }

    private void validateNotEmptyItemsList(List<?> items)
    {
        Validate.notEmpty(items, "At least an item must be passed");
    }

}
