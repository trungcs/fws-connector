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

import org.mule.api.annotations.Configurable;
import org.mule.api.annotations.Module;
import org.mule.api.annotations.Processor;
import org.mule.api.annotations.param.Default;
import org.mule.api.annotations.param.Optional;
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

import javax.annotation.PostConstruct;
import javax.xml.rpc.ServiceException;

import org.apache.commons.lang.Validate;

/**
 * Mule Module Facade for Amazon <a
 * href="http://aws.amazon.com/fws/">FulfillmentWebService</a> <h1 id="functionality">
 * Amazon Fulfillment Web Service Functionality</h1>
 * <p>
 * With Amazon FWS, merchants can directly integrate with the FBA system, allowing
 * them to automatically process shipments to Amazon and then out to customers. This
 * functionality is contained in three key APIs: the inbound service, the outbound
 * service, and the inventory service.
 * </p>
 * <h2>Inbound Service</h2>
 * <p>
 * The inbound service allows merchants to create and send inbound shipments of
 * inventory to Amazon&#8217;s fulfillment centers.
 * </p>
 * <ul>
 * <li><strong>Create shipments of inventory to Amazon fulfillment centers</strong><br>
 * Our tools make it easy for merchants to ship inventory to Amazon with everything
 * from label creation to packing slips. Merchants in the U.S. can also take
 * advantage of Amazon&#8217;s discounted UPS shipping rates.<br>
 * <br>
 * </li>
 * </ul>
 * <h2>Outbound Service</h2>
 * <p>
 * The outbound service allows merchants to use Amazon&#8217;s fulfillment processing
 * for orders sold on the merchant&#8217;s website or other non-Amazon channels.
 * </p>
 * <ul>
 * <li><strong>Submit fulfillment order/shipment requests</strong><br>
 * By integrating the outbound service API into merchant software, customer orders
 * are processed in real time, informing Amazon what to ship and where to ship it.</li>
 * </ul>
 * <ul>
 * <li><strong>Track and manage shipment requests</strong><br>
 * After orders leave our fulfillment centers, merchants can track shipments and keep
 * their customers aware of arrival times.</li>
 * </ul>
 * <h2>Inventory Service</h2>
 * <p>
 * The inventory service allows merchants to stay up to date on the status of
 * inventory in Amazon’s fulfillment centers.
 * </p>
 * <ul>
 * <li><strong>Check Inventory Status</strong><br>
 * Merchants can discover when inventory items change status and get the current
 * availability status to keep product listing information up to date.</li>
 * </ul>
 * 
 * @author flbulgarelli
 */
@Module(name = "fws", schemaVersion = "2.0")
public class FWSCloudConnector 
{
    /**The FWSClient. You may change it for mocking purposes*/
    @Optional
    @Configurable
    private FWSClient<RuntimeException> client;
    /**The Amazon AWS account public key*/
    @Configurable
    private String accessKey;
    /**The Amazon AWS account private key*/
    @Configurable
    private String secretKey;

    /**
     * Removes items from a pre-existing shipment specified by the ShipmentId. 
     * 
     * This operation removes the items
     * specified in each MerchantSKU parameter from the shipment in their entirety, no matter the quantity.
     * If the MerchantSKU is not currently a part of the shipment, then that particular line item is ignored, but others are still processed.
     * 
     * {@sample.xml ../../../doc/mule-module-fws.xml.sample fws:delete-inbound-shipment-items}
     * 
     * @param merchantSku the msku of the items to delete
     * @param shipmentId the id of the shipment 
     */
    @Processor
    public void deleteInboundShipmentItems( String merchantSku,  String shipmentId)
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
     * {@sample.xml ../../../doc/mule-module-fws.xml.sample fws:get-fulfillment-identifier}
     * 
     * @param asin the mandatory Aamzon's identifier
     * @param itemCondition the mandatory item's condition
     * @param merchantSku the mandatory merchant's sku
     * @return a FulfillmentIdentier
     */
    @Processor
    public FulfillmentItem getFulfillmentIdentifier(String asin,
                                                    ItemCondition itemCondition,
                                                    String merchantSku)
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
     * {@sample.xml ../../../doc/mule-module-fws.xml.sample fws:get-fulfillment-identifier-for-msku}
     * 
     * @param merchantSku the merchant's sku
     * @return the FulfillmentItem 
     */
    @Processor
    public FulfillmentItem getFulfillmentIdentifierForMsku(String merchantSku)
    {
        return client.getFulfillmentIdentifierForMsku(merchantSku);
    }
 
    /**
     * Gets fulfillment item data for the provided Fulfillment Network SKU (FNSKU). Throws an FWSException if the fnsku is invalid.
     *  
     * A response does not imply that the item has an offer for which it can be fulfilled; only that the Amazon Fulfillment Network
     * can track it. An inactive item can have a quantity in the fulfillment center, but will never be fulfilled. 
     *
     * {@sample.xml ../../../doc/mule-module-fws.xml.sample fws:get-fulfillment-item-by-fnsku}
     * 
     * @param fulfillmentNetworkSku the mandatory fulfillment network sku - aka nsku, aka fnsku
     * @return a FulfillmentItem
     */
    @Processor
    public FulfillmentItem getFulfillmentItemByFnsku(String fulfillmentNetworkSku)
    {
        return client.getFulfillmentItemByFnsku(fulfillmentNetworkSku);
    }

    /**
     * Gets fulfillment item data for the provided Merchant SKU. Throws an FWSException if the msku is invalid.
     * 
     * A response does not imply that the item has an offer for which it can be fulfilled; 
     * only that the Amazon Fulfillment Network can track it. An inactive item can have a quantity in the fulfillment center, but will never be fulfille
     * 
     * {@sample.xml ../../../doc/mule-module-fws.xml.sample fws:get-fulfillment-item-by-msku}
     * @param merchantSku the mandatory merchant's sku
     * @return a FulfillmentItem
     */
    @Processor
    public FulfillmentItem getFulfillmentItemByMsku(String merchantSku)
    {
        return client.getFulfillmentItemByMsku(merchantSku);
    }
 
    /**
     * Gets inbound shipment data without the item details for a given ShipmentId.
     * {@sample.xml ../../../doc/mule-module-fws.xml.sample fws:get-inbound-shipment-data}
     * 
     * @param shipmentId the mandatory shipment id
     * @return an InboundShipmentData
     */
    @Processor
    public InboundShipmentData getInboundShipment(String shipmentId)
    {
        return client.getInboundShipment(shipmentId);
    }
 
    /**
     * Gets the information needed to create a set of shipments for a given set of items and the ship from address. 
     * 
     * You might need to create multiple shipments for various reasons, but the most common reason is when there are sortable and non-sortable items. 
     * In this case, there is one shipment for each of the shipment sets returned.
     *
     * {@sample.xml ../../../doc/mule-module-fws.xml.sample fws:get-inbound-shipment-preview}
     * @param items the mandatory items list of MerchantSkuItems to preview. At least one item is required
     * @param address the mandatory destination address
     * @param labelPreference the optional label preference
     * @return the list of previews 
     */
    @Processor
    public List<ShipmentPreview> getInboundShipmentPreview( List<MerchantSKUQuantityItem> items,
                                                            Address address,
                                                            @Optional LabelPreference labelPreference)
    {
        return client.getInboundShipmentPreview(items, address, labelPreference);
    }
 
    /**
     * Answers a brief status message from the service
     * 
     * {@sample.xml ../../../doc/mule-module-fws.xml.sample fws:get-inbound-service-status}
     * @return the status message
     */
    @Processor
    public String getInboundServiceStatus()
    {
        return client.getInboundServiceStatus();
    }
    
    /**
     * Lazily lists fulfillment items registered.
     * 
     * If IncludeInactive is set to True, the operation returns both active (available for fulfillment) and inactive (not available for fulfillment) mappings. This parameter defaults to False. You can use inactive mappings to track inventory in Amazon's fulfillment centers; however, inactive items can't be fulfilled.
     * {@sample.xml ../../../doc/mule-module-fws.xml.sample fws:list-fulfillment-items}
     * 
     * @param includeInactive optional. Whether non available items for fulfillment should be listed   
     * @return a FulfillmentItem iterable
     */
    @Processor
    public Iterable<FulfillmentItem> listFulfillmentItems(@Optional @Default("false") boolean includeInactive)
    {
        return client.listFulfillmentItems(includeInactive);
    }

    /**
     * Lazily retrieved the all the inbound shipment items for the given shipmentId. 
     * 
     * {@sample.xml ../../../doc/mule-module-fws.xml.sample fws:list-inbound-shipment-items}
     * 
     * @param shipmentId the mandatory shipment's id
     * @return a InboundShipmentItem items iterable
     */
    @Processor
    public Iterable<InboundShipmentItem> listInboundShipmentItems( String shipmentId)
    {
        return client.listInboundShipmentItems(shipmentId);
    }
 
    /**
     * Lazily lists the inbound shipments a merchant has created, according to the specified query parameters. 
     * 
     * {@sample.xml ../../../doc/mule-module-fws.xml.sample fws:list-inbound-shipments}
     * 
     * @param shipmentStatus the mandatory status of listed items
     * @param createdAfter optional. The min creation date of listed shipment
     * @param createdBefore optional. The max creation date of listed shipments
     * @return a shipment data iterable
     */
    @Processor
    public Iterable<InboundShipmentData> listInboundShipments( ShipmentStatus shipmentStatus,
                                                              @Optional Date createdAfter,
                                                              @Optional Date createdBefore)
    {
        return client.listInboundShipments(shipmentStatus, createdAfter, createdBefore);
    }

    /**
     * Adds or replaces the merchant's inbound shipment header information
     * for the given ShipmentId.
     * 
     * {@sample.xml ../../../doc/mule-module-fws.xml.sample fws:put-inbound-shipment}
     * 
     * @param shipmentId the mandatory shipment's id
     * @param shipmentName the mandatory shipment name
     * @param destinationFulfillmentCenter the mandatory Amazon's fulfillment center where the 
     *      client's products are stored
     * @param shipFromAddress the mandatory  source address of the shipment to amazon's centers
     * @param labelPreference  the optional label preference
     */
    @Processor
    public void putInboundShipmentData( String shipmentId,
                                        String shipmentName,
                                        String destinationFulfillmentCenter,
                                        Address shipFromAddress,
                                       @Optional LabelPreference labelPreference)
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
     * {@sample.xml ../../../doc/mule-module-fws.xml.sample fws:put-inbound-shipment}
     *      
     * @param shipmentId the mandatory shipment's id
     * @param shipmentName the mandatory shipment name
     * @param destinationFulfillmentCenter the mandatory Amazon's fulfillment center where the 
     *      client's products are stored
     * @param shipFromAddress the mandatory source address of the shipment to amazon's centers  
     * @param labelPreference  the optional label preference
     * @param itemQuantities a mandatory list of MerchantSKUQuantityItem objects, with the amount of item for each merchant sku. 
     *              At least one item must be passed
     */
    @Processor
    public void putInboundShipment(String shipmentId,
                                   String shipmentName,
                                   String destinationFulfillmentCenter,
                                   Address shipFromAddress,
                                   @Optional LabelPreference labelPreference,
                                   List<MerchantSKUQuantityItem> itemQuantities)
    {
        client.putInboundShipment(shipmentId, shipmentName, destinationFulfillmentCenter, shipFromAddress,
            labelPreference, itemQuantities);
    }
    
    
    /**
     * Adds line items to a pre-existing shipment that the ShipmentId specifies. 
     * 
     * If the MerchantSKU is already in the shipment, then that particular line item is replaced. 
     * Call PutInboundShipment to create a new shipment. 
     * This call returns an exception if you attempt to add line items to a shipment that is in a status other than Working.
     * 
     * {@sample.xml ../../../doc/mule-module-fws.xml.sample fws:put-inbound-shipment-items}
     * @param shipmentId the mandatory shipment's id
     * @param itemQuantities a mandatory list of MerchantSKUQuantityItem objects, with the amount of item for each merchant sku. 
     *              At least one item must be passed
     */
    @Processor 
    public void putInboundShipmentItems( String shipmentId,  List<MerchantSKUQuantityItem> itemQuantities)
    {
        client.putInboundShipmentItems(shipmentId,  itemQuantities);
    }
 
    /**
     * Sets the inbound shipment status to the specified ShipmentStatus.
     * Once a shipment's status has been set to Shipped, you cannot make any further changes except to update the status to Cancelled. Any item not received at the time a shipment is cancelled is put into problem receive at the fulfillment center.
     * 
     * This operation returns a RequestId upon success, otherwise an explicit error is returned.
     * {@sample.xml ../../../doc/mule-module-fws.xml.sample fws:set-inbound-shipment-status}
     * @param shipmentId the mandatory shipment's id
     * @param shipmentStatus the mandatory new status for the given shipment
     */
    @Processor
    public void setInboundShipmentStatus( String shipmentId,   ShipmentStatus shipmentStatus)
    {
        client.setInboundShipmentStatus(shipmentId, shipmentStatus);
    }
 
    /**
     * Requests Amazon not to fulfill an existing fulfillment order. This is just a hint, already shipped 
     * orders may not be canceled.
     * 
     * {@sample.xml ../../../doc/mule-module-fws.xml.sample fws:cancel-fulfillment-order}
     * @param orderId the mandatory order's id
     */
    @Processor
    public void cancelFulfillmentOrder( String orderId)
    {
        client.cancelFulfillmentOrder(orderId);
    }

    /**
     * Generates a request for Amazon to ship items from the merchant's inventory to a destination address.
     * 
     * {@sample.xml ../../../doc/mule-module-fws.xml.sample fws:create-fulfillment-order}
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
    @Processor
    public void createFulfillmentOrder( String orderId,
                                                            @Optional String displayableOrderId,
                                                             Address destinationAddress,
                                                            @Optional String fulfillmentPolicy,
                                                            @Optional String fulfillmentMethod,
                                                             String shippingSpeedCategory,
                                                             String displayableOrderComment,
                                                             Date displayableOrderDate,
                                                            @Optional List<String> emails,
                                                            List<CreateFulfillmentOrderItem> items)
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
            coalesce(emails, Collections.<String> emptyList()),
            items);
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
     * {@sample.xml ../../../doc/mule-module-fws.xml.sample fws:insert-element}
     * @param orderId the mandatory order id of the fulfillment
     * @return a GetFulfillmentOrderResult
     */
    @Processor
    public GetFulfillmentOrderResult getFulfillmentOrder( String orderId)
    {
        return client.getFulfillmentOrder(orderId);
    }

    /**
     * Answers estimated shipping dates and fees for a given set of merchant SKUs and quantities.
     * 
     * {@sample.xml ../../../doc/mule-module-fws.xml.sample fws:get-fulfillment-preview}
     * 
     * @param address the mandatory destination address
     * @param items the mandatory items list of GetFulfillmentPreviewItem to preview. At least one item is required 
     * @param shippingSpeedCategories the optional shipping categories
     * @param orderItemId the mandatory order item id
     * @return  a list of fulfillment previews
     */
    @Processor
    public List<FulfillmentPreview> getFulfillmentPreview(Address address,
                                                          List<GetFulfillmentPreviewItem> items,
                                                          @Optional String shippingSpeedCategories,
                                                          String orderItemId)
    {
        return client.getFulfillmentPreview(address,  items,
            shippingSpeedCategories, orderItemId);
    }

    /**
     * Answers a brief status message from the service
     * 
     * {@sample.xml ../../../doc/mule-module-fws.xml.sample fws:get-outbound-service-status}
     * @return the status message
     */
    @Processor
    public String getOutboundServiceStatus()
    {
        return client.getOutboundServiceStatus();
    }


    /**
     * Lazily lists all the fulfillment orders
     * 
     * {@sample.xml ../../../doc/mule-module-fws.xml.sample fws:list-fulfillment-orders} 
     * @param startDate the start date of the query 
     * @param fulfillmentMethods optional list of FWS fulfillment method strings
     * @return the orders iterable 
     */
    @Processor
    public Iterable<FulfillmentOrder> listFulfillmentOrders(@Optional Date startDate,
                                                            @Optional List<String> fulfillmentMethods)
    {
        return client.listFulfillmentOrders(startDate, coalesce(fulfillmentMethods,
            Collections.<String> emptyList()));
    }
     
     /**
      *  Gets information about the supply of merchant-owned inventory in Amazon's fulfillment network. 
      *  
      *  Throws a FWSException if inventory is unsellable or  
      *  is already bound to a customer order or 
      *  bound to internal fulfillment center processing (for example, labeling).
      *  
      *  {@sample.xml ../../../doc/mule-module-fws.xml.sample fws:get-inventory-supply}
      * @param merchantSku the mandatory merchant's sku
      * @param responseGroup the optional response group
     *  @return a merchant sku supply iterable
      */
    @Processor 
    public MerchantSKUSupply getInventorySupply( String merchantSku,
                                                @Optional String responseGroup)
    {
        return client.getInventorySupply(merchantSku, responseGroup);
    }
    
    /**
     * Answers a brief status message from the service
     * 
     * {@sample.xml ../../../doc/mule-module-fws.xml.sample fws:get-inventory-service-status}
     * @return the status message 
     */
    @Processor
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
     * {@sample.xml ../../../doc/mule-module-fws.xml.sample fws:list-updated-inventory-supply}
     * 
     * @param startDateTime the mandatory start date  
     * @param responseGroup a response group string
     * @return a MerchantSKUSupply iterable
     */
    @Processor
    public Iterable<MerchantSKUSupply> listUpdatedInventorySupply( Date startDateTime,
                                                                  @Optional String responseGroup)
    {
        return client.listUpdatedInventorySupply(startDateTime, responseGroup);
    }

    @PostConstruct
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
