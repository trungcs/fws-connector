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
import org.mule.module.fws.api.internal.FulfillmentPreview;
import org.mule.module.fws.api.internal.GetFulfillmentOrderResult;
import org.mule.module.fws.api.internal.GetFulfillmentPreviewItem;
import org.mule.module.fws.api.internal.InboundShipmentData;
import org.mule.module.fws.api.internal.MerchantItem;
import org.mule.module.fws.api.internal.MerchantSKUQuantityItem;
import org.mule.module.fws.api.internal.MerchantSKUSupply;
import org.mule.module.fws.api.internal.ShipmentPreview;
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
import org.mule.module.fws.api.internal.holders.ResponseMetadataHolder;

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.xml.rpc.ServiceException;

import org.apache.commons.lang.Validate;

public class AxisFWSClient implements FWSClient<RemoteException>
{
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

    public Iterable<?> listFulfillmentItems(boolean includeInactive)
    {
        // TODO Auto-generated method stub
        return null;
    }

    public void listFulfillmentOrders()
    {
        // TODO Auto-generated method stub

    }

    public Iterable<?> listInboundShipmentItems(String shipmentId)
    {
        // TODO Auto-generated method stub
        return null;
    }

    public Iterable<?> listInboundShipments(ShipmentStatus shipmentStatus, Date createdAfter)
    {
        // TODO Auto-generated method stub
        return null;

    }

    public void listUpdatedInventorySupply(Date startDateTime, String responseGroup)
    {
        // TODO
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

    public void setInboundShipmentStatus(String shipmentId, ShipmentStatus shipmentStatus)
        throws RemoteException
    {
        inboundPortProvider.getPort("SetInboundShipmentStatus").setInboundShipmentStatus(shipmentId,
            shipmentStatus.toFwsShipmentStatus());
    }

}
