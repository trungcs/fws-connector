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
import org.mule.module.fws.api.internal.FulfillmentItem;
import org.mule.module.fws.api.internal.FulfillmentPreview;
import org.mule.module.fws.api.internal.GetFulfillmentOrderResult;
import org.mule.module.fws.api.internal.InboundShipmentData;
import org.mule.module.fws.api.internal.MerchantSKUSupply;
import org.mule.module.fws.api.internal.ShipmentPreview;
import org.mule.tools.cloudconnect.annotations.Parameter;

import java.rmi.RemoteException;
import java.util.Date;
import java.util.List;

public interface FWSClient<ExceptionType extends Throwable>
{
    void deleteInboundShipmentItems(String merchantSku, String shipmentId) throws ExceptionType;

    List<FulfillmentItem> getFulfillmentIdentifier(String asin,
                                                   ItemCondition itemCondition,
                                                   String merchantSku) throws ExceptionType;

    List<FulfillmentItem> getFulfillmentIdentifierForMsku(String merchantSku) throws ExceptionType;

    List<FulfillmentItem> getFulfillmentItemByFnsku(String fulfillmentNetworkSku) throws ExceptionType;

    List<FulfillmentItem> getFulfillmentItemByMsku(String merchantSku) throws ExceptionType;

    InboundShipmentData getInboundShipment(String shipmentId) throws ExceptionType;

    List<ShipmentPreview> getInboundShipmentPreview(String merchantSku, Address address) throws ExceptionType;

    String getInboundServiceStatus() throws ExceptionType;

    Iterable<?> listFulfillmentItems(boolean includeInactive) throws ExceptionType;

    Iterable<?> listInboundShipmentItems(String shipmentId) throws ExceptionType;

    Iterable<?> listInboundShipments(ShipmentStatus shipmentStatus, Date createdAfter) throws ExceptionType;

    void putInboundShipment(String shipmentId,
                            String shipmentName,
                            String destinationFulfillmentCenter,
                            String shipFromAddress) throws ExceptionType;

    void putInboundShipmentItems(String shipmentId, String merchantSku, int quantity) throws ExceptionType;

    void setInboundShipmentStatus(String shipmentId, ShipmentStatus shipmentStatus) throws ExceptionType;

    void cancelFulfillmentOrder(String orderId) throws ExceptionType;

    void createFulfillmentOrder(String orderId) throws ExceptionType;

    GetFulfillmentOrderResult getFulfillmentOrder(String orderId) throws ExceptionType;

    List<FulfillmentPreview> getFulfillmentPreview(Address address,
                                                   String merchantSku,
                                                   String shippingSpeedCategories,
                                                   int quantity,
                                                   String orderItemId) throws ExceptionType;

    String getOutboundServiceStatus() throws ExceptionType;

    void listFulfillmentOrders() throws ExceptionType;

    List<MerchantSKUSupply> getInventorySupply(String merchantSku, String responseGroup) throws ExceptionType;

    String getInventoryServiceStatus() throws ExceptionType;

    void listUpdatedInventorySupply(Date startDateTime, String responseGroup) throws ExceptionType;
}
