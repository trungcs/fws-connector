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
import org.mule.module.fws.api.internal.AmazonFBAInventoryLocator;
import org.mule.module.fws.api.internal.AmazonFBAInventoryPortType;
import org.mule.module.fws.api.internal.AmazonFBAOutboundLocator;
import org.mule.module.fws.api.internal.AmazonFBAOutboundPortType;
import org.mule.module.fws.api.internal.AmazonFWSInboundLocator;
import org.mule.module.fws.api.internal.AmazonFWSInboundPortType;
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

import javax.xml.rpc.ServiceException;

import org.apache.commons.lang.Validate;

public class AxisFWSClient implements FWSClient<RemoteException>
{
    private static final int PAGE_SIZE = 100;
    private final PortProvider<AmazonFWSInboundPortType> inboundPortProvider;
    private final PortProvider<AmazonFBAOutboundPortType> outboundPortProvider;
    private final PortProvider<AmazonFBAInventoryPortType> inventoryPortProvider;

    public AxisFWSClient(String accessKey, String secretKey)
    {
        Validate.notNull(accessKey);
        Validate.notNull(secretKey);
        this.inboundPortProvider = new PortProvider<AmazonFWSInboundPortType>(accessKey, secretKey)
        {
            @Override
            protected AmazonFWSInboundPortType newPort() throws ServiceException
            {
                return new AmazonFWSInboundLocator().getAmazonFWSInboundPort();
            }
        };
        this.outboundPortProvider = new PortProvider<AmazonFBAOutboundPortType>(accessKey, secretKey)
        {
            @Override
            protected AmazonFBAOutboundPortType newPort() throws ServiceException
            {
                return new AmazonFBAOutboundLocator().getAmazonFBAOutboundPort();
            }
        };
        this.inventoryPortProvider = new PortProvider<AmazonFBAInventoryPortType>(accessKey, secretKey)
        {
            @Override
            protected AmazonFBAInventoryPortType newPort() throws ServiceException
            {
                return new AmazonFBAInventoryLocator().getAmazonFBAInventoryPort();
            }
        };
    }

    public void cancelFulfillmentOrder(String orderId)
    {
        // TODO
    }

    public void createFulfillmentOrder(String orderId)
    {
        // TODO Auto-generated method stub

    }

    public void deleteInboundShipmentItems(String merchantSku, String shipmentId)
    {
        // TODO Auto-generated method stub

    }

    public List<FulfillmentItem> getFulfillmentIdentifier(String asin,
                                                          ItemCondition itemCondition,
                                                          String merchantSku) throws RemoteException
    {
        GetFulfillmentIdentifierResultHolder result = new GetFulfillmentIdentifierResultHolder();
        inboundPortProvider.getPort(result).getFulfillmentIdentifier(
            new MerchantItem[]{new MerchantItem(asin, itemCondition.toFwsItemCondition(), merchantSku)},
            result, new ResponseMetadataHolder());
        return Arrays.asList(result.value.getFulfillmentItem());
    }

    public List<FulfillmentItem> getFulfillmentIdentifierForMsku(String merchantSku) throws RemoteException
    {
        GetFulfillmentIdentifierForMSKUResultHolder result = new GetFulfillmentIdentifierForMSKUResultHolder();
        inboundPortProvider.getPort(result).getFulfillmentIdentifierForMSKU(//
            new String[]{merchantSku}, result, new ResponseMetadataHolder());
        return Arrays.asList(result.value.getFulfillmentItem());
    }

    public List<FulfillmentItem> getFulfillmentItemByFnsku(String fulfillmentNetworkSku)
        throws RemoteException
    {
        GetFulfillmentItemByFNSKUResultHolder result = new GetFulfillmentItemByFNSKUResultHolder();
        inboundPortProvider.getPort(result).getFulfillmentItemByFNSKU(new String[]{fulfillmentNetworkSku},
            result, new ResponseMetadataHolder());
        return Arrays.asList(result.value.getFulfillmentItem());
    }

    public List<FulfillmentItem> getFulfillmentItemByMsku(String merchantSku) throws RemoteException
    {
        GetFulfillmentItemByMSKUResultHolder result = new GetFulfillmentItemByMSKUResultHolder();
        inboundPortProvider.getPort(result).getFulfillmentItemByMSKU(//
            new String[]{merchantSku}, result, new ResponseMetadataHolder());
        return Arrays.asList(result.value.getFulfillmentItem());
    }

    public GetFulfillmentOrderResult getFulfillmentOrder(String orderId) throws RemoteException
    {
        GetFulfillmentOrderResultHolder result = new GetFulfillmentOrderResultHolder();
        outboundPortProvider.getPort(result).getFulfillmentOrder(orderId, result, new ResponseMetadataHolder());
        return result.value;
    }

    public List<FulfillmentPreview> getFulfillmentPreview(Address address,
                                                          String merchantSku,
                                                          String shippingSpeedCategories,
                                                          int quantity,
                                                          String orderItemId) throws RemoteException
    {
        GetFulfillmentPreviewResultHolder result = new GetFulfillmentPreviewResultHolder();
        outboundPortProvider.getPort(result)
            .getFulfillmentPreview(
                address, //
                new GetFulfillmentPreviewItem[]{new GetFulfillmentPreviewItem(merchantSku, quantity,
                    orderItemId)}, // 
                new String[]{shippingSpeedCategories}, // 
                result, //
                new ResponseMetadataHolder());
        return Arrays.asList(result.value.getFulfillmentPreviews());
    }

    public String getInboundServiceStatus() throws RemoteException
    {
        GetServiceStatusResultHolder result = new GetServiceStatusResultHolder();
        inboundPortProvider.getPort(result).getServiceStatus(result, new ResponseMetadataHolder());
        return result.value.getStatus();
    }

    public InboundShipmentData getInboundShipment(String shipmentId) throws RemoteException
    {
        GetInboundShipmentDataResultHolder result = new GetInboundShipmentDataResultHolder();
        inboundPortProvider.getPort(result).getInboundShipmentData(shipmentId, result,
            new ResponseMetadataHolder());
        return result.value.getShipmentData();
    }

    public List<ShipmentPreview> getInboundShipmentPreview(String merchantSku, Address address)
        throws RemoteException
    {
        GetInboundShipmentPreviewResultHolder result = new GetInboundShipmentPreviewResultHolder();
        inboundPortProvider.getPort(result).getInboundShipmentPreview(address, null, /* TODO */
        null /* TODO */, result, new ResponseMetadataHolder());
        return Arrays.asList(result.value.getShipmentPreview());
    }

    public String getInventoryServiceStatus() throws RemoteException
    {
        GetServiceStatusResultHolder result = new GetServiceStatusResultHolder();
        inventoryPortProvider.getPort(result).getServiceStatus(result, new ResponseMetadataHolder());
        return result.value.getStatus();
    }

    public List<MerchantSKUSupply> getInventorySupply(String merchantSku, String responseGroup)
        throws RemoteException
    {
        GetInventorySupplyResultHolder result = new GetInventorySupplyResultHolder();
        inventoryPortProvider.getPort(result).getInventorySupply(new String[]{merchantSku}, responseGroup,
            result, new ResponseMetadataHolder());
        return Arrays.asList(result.value.getMerchantSKUSupply());
    }

    public String getOutboundServiceStatus() throws RemoteException
    {
        GetServiceStatusResultHolder result = new GetServiceStatusResultHolder();
        inboundPortProvider.getPort(result).getServiceStatus(result, new ResponseMetadataHolder());
        return result.value.getStatus();
    }

    public Iterable<?> listFulfillmentItems(final boolean includeInactive) throws RemoteException
    {
        return new FwsPaginatedIterable<FulfillmentItem, ListAllFulfillmentItemsResult>()
        {
            @Override
            protected ListAllFulfillmentItemsResult firstFwsPage() throws RemoteException 
            {
                ListAllFulfillmentItemsResultHolder result = new ListAllFulfillmentItemsResultHolder();
                inboundPortProvider.getPort(result).listAllFulfillmentItems(includeInactive, PAGE_SIZE, result,
                    new ResponseMetadataHolder());
                return result.value;
            }

            @Override
            protected ListAllFulfillmentItemsByNextTokenResult nextFwsPage(ListAllFulfillmentItemsResult currentPage) throws RemoteException
            {
                ListAllFulfillmentItemsByNextTokenResultHolder result = new ListAllFulfillmentItemsByNextTokenResultHolder();
                inboundPortProvider.getPort(result).listAllFulfillmentItemsByNextToken(
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
                outboundPortProvider.getPort(result).listAllFulfillmentOrders(PAGE_SIZE,
                    FwsDates.format(startDate), new String[]{}, result, new ResponseMetadataHolder());
                return result.value;
            }

            @Override
            protected ListAllFulfillmentOrdersByNextTokenResultHolder nextFwsPage(ListAllFulfillmentOrdersResult currentPage)
                throws RemoteException
            {
                ListAllFulfillmentOrdersByNextTokenResultHolder result = new ListAllFulfillmentOrdersByNextTokenResultHolder();
                outboundPortProvider.getPort(result).listAllFulfillmentOrdersByNextToken(
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
                inboundPortProvider.getPort(result).listInboundShipmentItems(shipmentId, PAGE_SIZE, result, new ResponseMetadataHolder());
                return result.value;
            }

            @Override
            protected ListInboundShipmentItemsByNextTokenResult nextFwsPage(ListInboundShipmentItemsResult currentPage)
                throws RemoteException
            {
                ListInboundShipmentItemsByNextTokenResultHolder result = new ListInboundShipmentItemsByNextTokenResultHolder();
                inboundPortProvider.getPort(result).listInboundShipmentItemsByNextToken(
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

    public Iterable<InboundShipmentData> listInboundShipments(final org.mule.module.fws.api.ShipmentStatus shipmentStatus, final Date createdAfter, final Date createdBefore)
    {
        return new FwsPaginatedIterable<InboundShipmentData, ListInboundShipmentsResult>()
        {
            @Override
            protected ListInboundShipmentsResult firstFwsPage() throws RemoteException
            {
                ListInboundShipmentsResultHolder result = new ListInboundShipmentsResultHolder();
                inboundPortProvider.getPort(result).listInboundShipments(
                    new ShipmentStatus[]{shipmentStatus.toFwsShipmentStatus()},
                    FwsDates.toCalendar(createdBefore), FwsDates.toCalendar(createdAfter), PAGE_SIZE, result,
                    new ResponseMetadataHolder());
                return result.value;
            }

            @Override
            protected ListInboundShipmentsByNextTokenResult nextFwsPage(ListInboundShipmentsResult currentPage)
                throws RemoteException
            {
                ListInboundShipmentsByNextTokenResultHolder result = new ListInboundShipmentsByNextTokenResultHolder();
                inboundPortProvider.getPort(result).listInboundShipmentsByNextToken(currentPage.getNextToken(), result, new ResponseMetadataHolder());
                return result.value;
            }

            @Override
            protected InboundShipmentData[] pageArray(ListInboundShipmentsResult page)
            {
                return page.getShipmentData();
            }
        };

    }
    

    public Iterable<MerchantSKUSupply> listUpdatedInventorySupply(final Date startDate, final String responseGroup)
    {
      return  new FwsPaginatedIterable<MerchantSKUSupply, ListUpdatedInventorySupplyResult>()
        {
            @Override
            protected ListUpdatedInventorySupplyResult firstFwsPage() throws RemoteException
            {
                ListUpdatedInventorySupplyResultHolder result = new ListUpdatedInventorySupplyResultHolder();
                inventoryPortProvider.getPort(result).listUpdatedInventorySupply(PAGE_SIZE, FwsDates.format(startDate), responseGroup, result, new ResponseMetadataHolder());
                return result.value;
            }

            @Override
            protected ListUpdatedInventorySupplyByNextTokenResult nextFwsPage(ListUpdatedInventorySupplyResult currentPage)
                throws RemoteException
            {
                ListUpdatedInventorySupplyByNextTokenResultHolder result = new ListUpdatedInventorySupplyByNextTokenResultHolder();
                inventoryPortProvider.getPort(result).listUpdatedInventorySupplyByNextToken(currentPage.getNextToken(), result, new ResponseMetadataHolder());
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
                                   String shipFromAddress)
    {
        // TODO
    }

    public void putInboundShipmentItems(String shipmentId, String merchantSku, int quantity)
        throws RemoteException
    {
        inboundPortProvider.getPort("PutInboundShipmentItems").putInboundShipmentItems(shipmentId,
            new MerchantSKUQuantityItem[]{new MerchantSKUQuantityItem(merchantSku, quantity)});
    }

    public void setInboundShipmentStatus(String shipmentId, org.mule.module.fws.api.ShipmentStatus shipmentStatus)
        throws RemoteException
    {
        inboundPortProvider.getPort("SetInboundShipmentStatus").setInboundShipmentStatus(shipmentId,
            shipmentStatus.toFwsShipmentStatus());
    }
}
