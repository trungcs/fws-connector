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

import org.mule.api.lifecycle.Initialisable;
import org.mule.api.lifecycle.InitialisationException;
import org.mule.module.fws.api.Address;
import org.mule.module.fws.api.AxisFWSClient;
import org.mule.module.fws.api.FWSClient;
import org.mule.module.fws.api.FWSClientAdaptor;
import org.mule.module.fws.api.ItemCondition;
import org.mule.module.fws.api.LabelPreference;
import org.mule.module.fws.api.PortProvider;
import org.mule.module.fws.api.ShipmentStatus;
import org.mule.tools.cloudconnect.annotations.Connector;
import org.mule.tools.cloudconnect.annotations.Operation;
import org.mule.tools.cloudconnect.annotations.Parameter;
import org.mule.tools.cloudconnect.annotations.Property;

import com.amazonaws.fba_inbound.doc._2007_05_10.AmazonFWSInboundLocator;
import com.amazonaws.fba_inbound.doc._2007_05_10.AmazonFWSInboundPortType;
import com.amazonaws.fba_inbound.doc._2007_05_10.FulfillmentItem;
import com.amazonaws.fba_inbound.doc._2007_05_10.InboundShipmentData;
import com.amazonaws.fba_inbound.doc._2007_05_10.InboundShipmentItem;
import com.amazonaws.fba_inbound.doc._2007_05_10.MerchantSKUQuantityItem;
import com.amazonaws.fba_inbound.doc._2007_05_10.ShipmentPreview;
import com.amazonaws.fba_inventory.doc._2009_07_31.AmazonFBAInventoryLocator;
import com.amazonaws.fba_inventory.doc._2009_07_31.AmazonFBAInventoryPortType;
import com.amazonaws.fba_inventory.doc._2009_07_31.MerchantSKUSupply;
import com.amazonaws.fba_outbound.doc._2007_08_02.AmazonFBAOutboundLocator;
import com.amazonaws.fba_outbound.doc._2007_08_02.AmazonFBAOutboundPortType;
import com.amazonaws.fba_outbound.doc._2007_08_02.CreateFulfillmentOrderItem;
import com.amazonaws.fba_outbound.doc._2007_08_02.FulfillmentOrder;
import com.amazonaws.fba_outbound.doc._2007_08_02.FulfillmentPreview;
import com.amazonaws.fba_outbound.doc._2007_08_02.GetFulfillmentOrderResult;
import com.amazonaws.fba_outbound.doc._2007_08_02.GetFulfillmentPreviewItem;

import java.util.Collections;
import java.util.Date;
import java.util.List;

import javax.xml.rpc.ServiceException;

import org.apache.commons.lang.Validate;

/**
 * 
 * @author flbulgarelli
 */
@Connector(namespacePrefix = "fws")
public class FWSCloudConnector implements Initialisable
{
    @Property(optional = true)
    private FWSClient<RuntimeException> client;
    @Property
    private String accessKey;
    @Property
    private String secretKey;

    /**
     * Removes items from a pre-existing shipment specified by the ShipmentId. 
     * 
     * This operation removes the items
     * specified in each MerchantSKU parameter from the shipment in their entirety, no matter the quantity.
     * If the MerchantSKU is not currently a part of the shipment, then that particular line item is ignored, but others are still processed.
     * 
     * {@code <delete-inbound-shipment-items merchantSku="#[header:merchantSku]" shipmentId="#[header:shipmentId]" />}
     * 
     * @param merchantSku
     * @param shipmentId
     */
    @Operation
    public void deleteInboundShipmentItems(@Parameter String merchantSku, @Parameter String shipmentId)
    {
        client.deleteInboundShipmentItems(merchantSku, shipmentId);
    }
    
    /**
     * Gets the Fulfillment Network SKU (FNSKU) for the supplied merchant item - creating it if needed.
     * 
     * This operation is  idempotent in that it can be called multiple times without any adverse effects. This operation is required whenever you need to register items
     * for Amazon fulfillment that require labeling and when you need to get the identifier prior to creating an offer. This operation is necessary to register items for Amazon
     * fulfillment in order to send them to Amazon, but does not do the work of marking any offer for this item as Amazon fulfilled.
     * A response does not imply that the item has an offer for which it can be fulfilled; only that the Amazon Fulfillment Network can track it. An inactive item can have a
     * quantity in the fulfillment center, but will never be fulfilled.
     * Use this operation instead of getFulfillmentIdentifierForMSKU if an offer does not already exist for the MerchantSKU.
     * 
     * {@code <get-fulfillment-identifier
     *      asin="#[variable:asin]"
     *      itemCondition="#[variable:itemCondition]"
     *      merchantSku="#[variable:merchantSku]" />}
     * @param asin the mandatory Aamzon's identifier
     * @param itemCondition the mandatory item's condition
     * @param merchantSku the mandatory merchant's sku
     * @return 
     */
    @Operation
    public FulfillmentItem getFulfillmentIdentifier(@Parameter String asin,
                                                          @Parameter ItemCondition itemCondition,
                                                          @Parameter String merchantSku)
    {
        return client.getFulfillmentIdentifier(asin, itemCondition, merchantSku);
    }
    
    /**
     * Gets the Fulfillment Network SKU (FNSKU) for the supplied merchant item - creating it if needed. 
     * 
     * This operation is idempotent in that you can call it multiple times without any adverse effects. 
     * This operation is required whenever you need to register items for Amazon fulfillment that require
     * labeling. This operation is necessary to register items for Amazon fulfillment in order to send them to Amazon, but doesn't mark any offer for this item as 
     * Amazon fulfilled.
     * A response does not imply that the item has an offer for which it can be fulfilled; only that the Amazon Fulfillment Network can track it. An inactive item can have a
     * quantity in the fulfillment center, but will never be fulfilled.
     * Use this operation instead of GetFulfillmentIdentifier if an offer already exists for the SKU.
     * 
     * {@code <get-fulfillment-identifier-for-msku merchantSku="#[map-payload:merchantSku]"/>}
     * @param merchantSku the merchant's sku
     * @return 
     */
    @Operation
    public FulfillmentItem getFulfillmentIdentifierForMsku(@Parameter String merchantSku)
    {
        return client.getFulfillmentIdentifierForMsku(merchantSku);
    }
 
    /**
     * Gets fulfillment item data for the provided Fulfillment Network SKU (FNSKU). Throws an FWSException if the fnsku is invalid.
     *  
     * A response does not imply that the item has an offer for which it can be fulfilled; only that the Amazon Fulfillment Network
     * can track it. An inactive item can have a quantity in the fulfillment center, but will never be fulfilled. 
     *
     * {@code <get-fulfillment-item-by-fnsku fulfillmentNetworkSku="#[payload]" />}
     * 
     * @param fulfillmentNetworkSku the mandatory fulfillment network sku - aka nsku, aka fnsku
     * @return a FulfillmentItem
     */
    @Operation
    public FulfillmentItem getFulfillmentItemByFnsku(@Parameter String fulfillmentNetworkSku)
    {
        return client.getFulfillmentItemByFnsku(fulfillmentNetworkSku);
    }

    /**
     * Gets fulfillment item data for the provided Merchant SKU. Throws an FWSException if the msku is invalid.
     * 
     * A response does not imply that the item has an offer for which it can be fulfilled; 
     * only that the Amazon Fulfillment Network can track it. An inactive item can have a quantity in the fulfillment center, but will never be fulfille
     * 
     * {@code <get-fulfillment-item-by-msku merchantSku="#[map-payload:merchantSku]"/>}
     * @param merchantSku the mandatory merchant's sku
     * @return a FulfillmentItem
     */
    @Operation
    public FulfillmentItem getFulfillmentItemByMsku(@Parameter String merchantSku)
    {
        return client.getFulfillmentItemByMsku(merchantSku);
    }
 
    /**
     * Gets inbound shipment data without the item details for a given ShipmentId.
     * {@code <get-inbound-shipment-data shipmentId="#[header:ShipmentId]"/>}
     * 
     * @param shipmentId the mandatory shipment id
     * @return an InboundShipmentData
     */
    @Operation
    public InboundShipmentData getInboundShipment(@Parameter String shipmentId)
    {
        return client.getInboundShipment(shipmentId);
    }
 
    /**
     * Gets the information needed to create a set of shipments for a given set of items and the ship from address. 
     * 
     * You might need to create multiple shipments for various reasons, but the most common reason is when there are sortable and non-sortable items. 
     * In this case, there is one shipment for each of the shipment sets returned.
     *
     * {@code <get-inbound-shipment-preview  items="#[variable:items]"  address="#[address]" labelPreference="MERCHANT_LABEL" />}
     * @param items the mandatory items list of MerchantSkuItems to preview. At least one item is required
     * @param address the mandatory destination address
     * @param labelPreference the optional label preference
     * @return the list of previews 
     */
    @Operation
    @SuppressWarnings("unchecked")
    public List<ShipmentPreview> getInboundShipmentPreview(@Parameter Object items,
                                                           @Parameter Address address,
                                                           @Parameter(optional = true) LabelPreference labelPreference)
    {
        return client.getInboundShipmentPreview((List<MerchantSKUQuantityItem>) items, address, labelPreference);
    }
 
    /**
     * Answers a brief status message from the service
     * 
     * {@code <get-inbound-service-status/>}
     * @return the status message
     */
    @Operation
    public String getInboundServiceStatus()
    {
        return client.getInboundServiceStatus();
    }
    
    /**
     * Lazily lists fulfillment items registered.
     * 
     * If IncludeInactive is set to True, the operation returns both active (available for fulfillment) and inactive (not available for fulfillment) mappings. This parameter defaults to False. You can use inactive mappings to track inventory in Amazon's fulfillment centers; however, inactive items can't be fulfilled.
     * {@code <list-fulfillment-items includeInactive="true"/>}
     * 
     * @param includeInactive optional. Whether non available items for fulfillment should be listed   
     * @return a FulfillmentItem iterable
     */
    @Operation
    public Iterable<FulfillmentItem> listFulfillmentItems(@Parameter(optional = true, defaultValue = "false") boolean includeInactive)
    {
        return client.listFulfillmentItems(includeInactive);
    }

    /**
     * Lazily retrieved the all the inbound shipment items for the given shipmentId. 
     * 
     * {@code <list-inbound-shipment-items shipmentId="#[header:shipmentId]"/>}
     * 
     * @param shipmentId the mandatory shipment's id
     * @return a InboundShipmentItem items iterable
     */
    @Operation
    public Iterable<InboundShipmentItem> listInboundShipmentItems(@Parameter String shipmentId)
    {
        return client.listInboundShipmentItems(shipmentId);
    }
 
    /**
     * Lazily lists the inbound shipments a merchant has created, according to the specified query parameters. 
     * 
     * {@code <list-inbound-shipments shipmentStatus="CANCELED" createdAfter="#[varaible:creationDate]" />}
     * 
     * @param shipmentStatus the mandatory status of listed items
     * @param createdAfter optional. The min creation date of listed shipment
     * @param createdBefore optional. The max creation date of listed shipments
     * @return a shipment data iterable
     */
    @Operation
    public Iterable<InboundShipmentData> listInboundShipments(@Parameter ShipmentStatus shipmentStatus,
                                                              @Parameter(optional = true) Date createdAfter,
                                                              @Parameter(optional = true) Date createdBefore)
    {
        return client.listInboundShipments(shipmentStatus, createdAfter, createdBefore);
    }

    /**
     * Adds or replaces the merchant's inbound shipment header information
     * for the given ShipmentId.
     * 
     * {@code <put-inbound-shipment 
     *    labelPreference="MERCHANT_LABEL"
     *    shipmentId="#[variable:shipmentId]" shipmentName="#[variable:shipmentName]"
     *    destinationFulfillmentCenter="#[variable:destinationFulfillmentCenter]"
     *    shipFromAddress="#[variable:shipFromAddress]" />}
     * 
     * @param shipmentId the mandatory shipment's id
     * @param shipmentName the mandatory shipment name
     * @param destinationFulfillmentCenter the mandatory Amazon's fulfillment center where the 
     *      client's products are stored
     * @param shipFromAddress 
     * @param labelPreference  the optional label preference
     */
    @Operation
    public void putInboundShipmentData(@Parameter String shipmentId,
                                       @Parameter String shipmentName,
                                       @Parameter String destinationFulfillmentCenter,
                                       @Parameter Address shipFromAddress,
                                       @Parameter(optional = true) LabelPreference labelPreference)
    {
        client.putInboundShipmentData(shipmentId, shipmentName, destinationFulfillmentCenter, shipFromAddress, labelPreference);
    }
    
    /**
     * Adds or replaces inbound shipment for a given shipmentId. If the shipment does not
     * exist, one will be created. Note, the merchant should call
     * SetInboundShipmentStatus with a status of 'Shipped' when the shipment is
     * picked up, or set the status to 'Cancelled' if the shipment is abandoned. The
     * intial status of a shipment will be set to 'Working'. Once a shipment's status
     * has been set to 'Shipped', the merchant may make no further changes except to
     * update the status to 'Cancelled'. Any items not received at the time a
     * shipment is 'Cancelled' will be sidelined if they arrive at the fulfillment
     * center.  
     * 
     * NOTE: If you are experiencing time-outs due to too many items in the shipment, calling this operation with a subset of
     * the items should work. You may add more items to the shipment by calling putInboundShipmentItems. 
     * 
     * {@code <put-inbound-shipment 
     *    labelPreference="MERCHANT_LABEL"
     *    items="#[variable:items]"
     *    shipmentId="#[variable:shipmentId]" shipmentName="#[variable:shipmentName]"
     *    destinationFulfillmentCenter="#[variable:destinationFulfillmentCenter]"
     *    shipFromAddress="#[variable:shipFromAddress]" />}
     *      
     * @param shipmentId the mandatory shipment's id
     * @param shipmentName
     * @param destinationFulfillmentCenter the mandatory Amazon's fulfillment center where the 
     *      client's products are stored
     * @param shipFromAddress  
     * @param labelPreference  the optional label preference
     * @param itemQuantities a mandatory list of MerchantSKUQuantityItem objects, with the amount of item for each merchant sku. 
     *              At least one item must be passed
     */
    @Operation
    @SuppressWarnings("unchecked")
    public void putInboundShipment(@Parameter String shipmentId,
                                   @Parameter String shipmentName,
                                   @Parameter String destinationFulfillmentCenter,
                                   @Parameter Address shipFromAddress,
                                   @Parameter(optional = true) LabelPreference labelPreference,
                                   @Parameter Object itemQuantities)
    {
        client.putInboundShipment(shipmentId, shipmentName, destinationFulfillmentCenter, shipFromAddress,
            labelPreference, (List<MerchantSKUQuantityItem>) itemQuantities);
    }
    
    
    /**
     * Adds line items to a pre-existing shipment that the ShipmentId specifies. 
     * 
     * If the MerchantSKU is already in the shipment, then that particular line item is replaced. 
     * Call PutInboundShipment to create a new shipment. 
     * This call returns an exception if you attempt to add line items to a shipment that is in a status other than Working.
     * 
     * {@code <put-inbound-shipment-items
     *      shipmentId="#[variable:shipmentId]">
     *          <itemQuantities>
     *              <itemQuantity key="#[variable:aMerchantSku]" value="#[variable:quantity]"/>
     *          </itemQuantities>
     *        </put-inbound-shipment-items>}
     * @param shipmentId the mandatory shipment's id
     * @param itemQuantities a mandatory list of MerchantSKUQuantityItem objects, with the amount of item for each merchant sku. 
     *              At least one item must be passed
     */
    @SuppressWarnings("unchecked")
    @Operation 
    public void putInboundShipmentItems(@Parameter String shipmentId, @Parameter Object itemQuantities)
    {
        client.putInboundShipmentItems(shipmentId, (List<MerchantSKUQuantityItem>) itemQuantities);
    }
 
    /**
     * Sets the inbound shipment status to the specified ShipmentStatus.
     * Once a shipment's status has been set to Shipped, you cannot make any further changes except to update the status to Cancelled. Any item not received at the time a shipment is cancelled is put into problem receive at the fulfillment center.
     * 
     * This operation returns a RequestId upon success, otherwise an explicit error is returned.
     * {@code <set-inbound-shipment-status
     *      shipmentId="#[variable:shipmentId]"
     *      shipmentStatus="SHIPPED"/>}
     * @param shipmentId the mandatory shipment's id
     * @param shipmentStatus the mandatory new status for the given shipment
     */
    @Operation
    public void setInboundShipmentStatus(@Parameter String shipmentId, @Parameter  ShipmentStatus shipmentStatus)
    {
        client.setInboundShipmentStatus(shipmentId, shipmentStatus);
    }
 
    /**
     * Requests Amazon not to fulfill an existing fulfillment order. This is just a hint, already shipped 
     * orders may not be canceled.
     * 
     * {@code <cancel-fulfillment-order orderId="#[header:orderId]"/>}
     * @param orderId the mandatory order's id
     */
    @Operation
    public void cancelFulfillmentOrder(@Parameter String orderId)
    {
        client.cancelFulfillmentOrder(orderId);
    }

    /**
     * Generates a request for Amazon to ship items from the merchant's inventory to a destination address.
     * 
     * {@code <create-fulfillment-order 
     *           destinationAddress="#[map-payload:destinationAddress]" orderId="#[map-payload:orderId]"
     *           displayableOrderComment="#[map-payload:comment]"
     *           displayableOrderDate="[map-payload:orderDate]" items="#[map-payload:items]"
     *           shippingSpeedCategory="#[map-payload:shippingSpeed]" /> }
     * @param orderId the mandatory fulfillment order id
     * @param displayableOrderId the order id displayed in the fulfillment. If not specified, the orderId is used.
     * @param destinationAddress the mandatory destination address of the fulfillment 
     * @param fulfillmentPolicy the optional fulfillment policy
     * @param fulfillmentMethod the optional fulfillment method
     * @param shippingSpeedCategory  the mandatory shipping speed category 
     * @param displayableOrderComment the mandatory comment that will be displayed in the order
     * @param displayableOrderDate the mandatory order date displayed in the fulfillment
     * @param emails an optional list of email strings
     * @param items a mandatory list of CreateFulfillmentOrderItem. At least one item must be specified
     */
    @Operation
    @SuppressWarnings("unchecked")
    public void createFulfillmentOrder(@Parameter String orderId,
                                                            @Parameter(optional = true) String displayableOrderId,
                                                            @Parameter Address destinationAddress,
                                                            @Parameter(optional = true) String fulfillmentPolicy,
                                                            @Parameter(optional = true) String fulfillmentMethod,
                                                            @Parameter String shippingSpeedCategory,
                                                            @Parameter String displayableOrderComment,
                                                            @Parameter Date displayableOrderDate,
                                                            @Parameter(optional = true) Object emails,
                                                            @Parameter Object items)
    {
        client.createFulfillmentOrder(
            orderId, // 
            coalesce(displayableOrderId, orderId), // 
            destinationAddress, // 
            fulfillmentPolicy, // 
            fulfillmentMethod, // 
            shippingSpeedCategory, // 
            displayableOrderComment, //
            displayableOrderDate, // 
            coalesce((List<String>) emails, Collections.<String> emptyList()),
            (List<CreateFulfillmentOrderItem>) items);
    }
    
    private static <T> T coalesce(T o1, T o2)
    {
        return o1 != null ? o1 : o2;
    }

    /**
     * Gets the original fulfillment order request, the status of
     * both the order and its items in the Amazon Fulfillment Network, 
     * and the shipments that have been generated to fulfill the order.
     * 
     * {@code <insert-element orderId="#[map-payload:orderId]"/> }
     * @param orderId the mandatory order id of the fulfillment
     * @return a GetFulfillmentOrderResult
     */
    @Operation
    public GetFulfillmentOrderResult getFulfillmentOrder(@Parameter String orderId)
    {
        return client.getFulfillmentOrder(orderId);
    }

    /**
     * Answers estimated shipping dates and fees for a given set of merchant SKUs and quantities.
     * 
     * {@code <get-fulfillment-preview
     *     address="#[variable:address]" 
     *     items="#[variable:items]" 
     *     shippingSpeedCategories="Standard"
     *     orderItemId="X123698" /> }
     * @param address the mandatory destination address
     * @param items the mandatory items list of GetFulfillmentPreviewItem to preview. At least one item is required 
     * @param shippingSpeedCategories the optional shipping categories
     * @param orderItemId the mandatory order item id
     * @return  a list of fulfillment previews
     */
    @SuppressWarnings("unchecked")
    @Operation
    public List<FulfillmentPreview> getFulfillmentPreview(@Parameter Address address,
                                                          @Parameter Object items,
                                                          @Parameter(optional = true) String shippingSpeedCategories,
                                                          @Parameter String orderItemId)
    {
        return client.getFulfillmentPreview(address, (List<GetFulfillmentPreviewItem>) items,
            shippingSpeedCategories, orderItemId);
    }

    /**
     * Answers a brief status message from the service
     * 
     * {@code <get-outbound-service-status/>}
     * @return the status message
     */
    @Operation
    public String getOutboundServiceStatus()
    {
        return client.getOutboundServiceStatus();
    }


    /**
     * Lazily lists all the fulfillment orders
     * 
     * {@code <list-fulfillment-orders/> } 
     * @param startDate the start date of the query 
     * @param fulfillmentMethod optional
     * @return the orders iterable 
     */
    @SuppressWarnings("unchecked")
    @Operation
    public Iterable<FulfillmentOrder> listFulfillmentOrders(@Parameter(optional = true) Date startDate,
                                                            @Parameter(optional = true) Object fulfillmentMethod)
    {
        return client.listFulfillmentOrders(startDate, coalesce((List<String>) fulfillmentMethod,
            Collections.<String> emptyList()));
    }
     
     /**
      *  Gets information about the supply of merchant-owned inventory in Amazon's fulfillment network. 
      *  
      *  Throws a FWSException if inventory is unsellable or  
      *  is already bound to a customer order or 
      *  bound to internal fulfillment center processing (for example, labeling).
      *  
      *  {@code <get-inventory-supply 
      *     merchantSku="#[header:merchantSku]" 
      *     responseGroup="DETAILED"/> }
      * @param merchantSku the mandatory merchant's sku
      * @param responseGroup the optional response group
     *  @return a merchant sku supply iterable
      */
    @Operation 
    public MerchantSKUSupply getInventorySupply(@Parameter String merchantSku,
                                                @Parameter(optional = true) String responseGroup)
    {
        return client.getInventorySupply(merchantSku, responseGroup);
    }
    
    /**
     * Answers a brief status message from the service
     * 
     * {@code <get-inventory-service-status/>}
     * @return the status message 
     */
    @Operation
    public String getInventoryServiceStatus()
    {
        return client.getInventoryServiceStatus();
    }

    /**
     * Lazily retrieves all the information about the supply of merchant-owned inventory in Amazon's fulfillment network, for
     * inventory items that may have had recent changes in inventory levels. The type of inventory data
     * returned by this operation is the same as that returned by getInventorySupply.
     * This operation provides the most efficient mechanism for clients to maintain local copies of inventory supply data.
     * 
     * {@code <list-updated-inventory-supply 
     *      startDateTime="#[header:querystartDateTime]" 
     *      responseGroup="DETAILED" /> }
     * 
     * @param startDateTime
     * @param responseGroup
     * @return a MerchantSKUSupply iterable
     */
    @Operation
    public Iterable<MerchantSKUSupply> listUpdatedInventorySupply(@Parameter Date startDateTime,
                                                                  @Parameter(optional = true) String responseGroup)
    {
        return client.listUpdatedInventorySupply(startDateTime, responseGroup);
    }

    public void initialise() throws InitialisationException
    {
        if (client == null)
        {
            Validate.notNull(accessKey);
            Validate.notNull(secretKey);
            setClient(new AxisFWSClient(new PortProvider<AmazonFWSInboundPortType>(accessKey, secretKey)
            {
                @Override
                protected AmazonFWSInboundPortType newPort() throws ServiceException
                {
                    return new AmazonFWSInboundLocator().getAmazonFWSInboundPort();
                }
            }, new PortProvider<AmazonFBAOutboundPortType>(accessKey, secretKey)
            {
                @Override
                protected AmazonFBAOutboundPortType newPort() throws ServiceException
                {
                    return new AmazonFBAOutboundLocator().getAmazonFBAOutboundPort();
                }
            }, new PortProvider<AmazonFBAInventoryPortType>(accessKey, secretKey)
            {
                @Override
                protected AmazonFBAInventoryPortType newPort() throws ServiceException
                {
                    return new AmazonFBAInventoryLocator().getAmazonFBAInventoryPort();
                }
            }));
        }
    }

    public FWSClient<RuntimeException> getClient()
    {
        return client;
    }

    public void setClient(FWSClient<?> client)
    {
        this.client = FWSClientAdaptor.adapt(client);
    }

    public String getAccessKey()
    {
        return accessKey;
    }

    public void setAccessKey(String accessKey)
    {
        this.accessKey = accessKey;
    }

    public String getSecretKey()
    {
        return secretKey;
    }

    public void setSecretKey(String secretKey)
    {
        this.secretKey = secretKey;
    }
    
    
}
