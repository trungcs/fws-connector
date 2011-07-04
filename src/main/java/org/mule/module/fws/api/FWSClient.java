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
import org.mule.module.fws.api.internal.CreateFulfillmentOrderItem;
import org.mule.module.fws.api.internal.FulfillmentItem;
import org.mule.module.fws.api.internal.FulfillmentOrder;
import org.mule.module.fws.api.internal.FulfillmentPreview;
import org.mule.module.fws.api.internal.GetFulfillmentOrderResult;
import org.mule.module.fws.api.internal.InboundShipmentData;
import org.mule.module.fws.api.internal.InboundShipmentItem;
import org.mule.module.fws.api.internal.MerchantSKUQuantityItem;
import org.mule.module.fws.api.internal.MerchantSKUSupply;
import org.mule.module.fws.api.internal.ShipmentPreview;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;

public interface FWSClient<ExceptionType extends Throwable>
{
    void deleteInboundShipmentItems(String merchantSku, String shipmentId) throws ExceptionType;

    FulfillmentItem getFulfillmentIdentifier(@NotNull String asin,
                                                   @NotNull ItemCondition itemCondition,
                                                   @NotNull String merchantSku) throws ExceptionType;

    FulfillmentItem getFulfillmentIdentifierForMsku(@NotNull String merchantSku) throws ExceptionType;

    FulfillmentItem getFulfillmentItemByFnsku(String fulfillmentNetworkSku) throws ExceptionType;

    FulfillmentItem getFulfillmentItemByMsku(@NotNull String merchantSku) throws ExceptionType;

    InboundShipmentData getInboundShipment(@NotNull String shipmentId) throws ExceptionType;

    List<ShipmentPreview> getInboundShipmentPreview(@NotNull String merchantSku,
                                                    int quantity,
                                                    @NotNull Address address,
                                                    LabelPreference labelPreference) throws ExceptionType;

    String getInboundServiceStatus() throws ExceptionType;

    Iterable<FulfillmentItem> listFulfillmentItems(boolean includeInactive) throws ExceptionType;

    Iterable<InboundShipmentItem> listInboundShipmentItems(@NotNull String shipmentId) throws ExceptionType;

    Iterable<InboundShipmentData> listInboundShipments(@NotNull ShipmentStatus shipmentStatus,
                                                       Date createdAfter,
                                                       Date createdBefore) throws ExceptionType;

    void putInboundShipment(String shipmentId,
                            String shipmentName,
                            String destinationFulfillmentCenter,
                            Address shipFromAddress,
                            org.mule.module.fws.api.LabelPreference labelPreference) throws ExceptionType;

    void putInboundShipmentItems(String shipmentId, List<MerchantSKUQuantityItem> itemQuantities) throws ExceptionType;

    void setInboundShipmentStatus(@NotNull String shipmentId, @NotNull ShipmentStatus shipmentStatus) throws ExceptionType;

    void cancelFulfillmentOrder(@NotNull String orderId) throws ExceptionType;

    GetFulfillmentOrderResult createFulfillmentOrder(@NotNull String orderId,
                                                     @NotNull String displayableOrderId,
                                                     @NotNull Address destinationAddress,
                                                     String fulfillmentPolicy,
                                                     String fulfillmentMethod,
                                                     @NotNull String shippingSpeedCategory,
                                                     @NotNull String displayableOrderComment,
                                                     @NotNull Date displayableOrderDate,
                                                     @NotNull List<String> emails,
                                                     @NotNull List<CreateFulfillmentOrderItem> items)
        throws ExceptionType;

    GetFulfillmentOrderResult getFulfillmentOrder(@NotNull String orderId) throws ExceptionType;

    List<FulfillmentPreview> getFulfillmentPreview(@NotNull Address address,
                                                   @NotNull String merchantSku,
                                                   int quantity,
                                                   String shippingSpeedCategories,
                                                   @NotNull String orderItemId) throws ExceptionType;

    String getOutboundServiceStatus() throws ExceptionType;

    Iterable<FulfillmentOrder> listFulfillmentOrders(Date startDate) throws ExceptionType;

    MerchantSKUSupply getInventorySupply(@NotNull String merchantSku, String responseGroup) throws ExceptionType;

    String getInventoryServiceStatus() throws ExceptionType;

    Iterable<MerchantSKUSupply> listUpdatedInventorySupply(Date startDateTime, String responseGroup)
        throws ExceptionType;
}
