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
 * AmazonFWSInboundPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazonaws.fba_inbound.doc._2007_05_10;

public interface AmazonFWSInboundPortType extends java.rmi.Remote {

    /**
     * Gets a brief status message from the service.
     */
    public void getServiceStatus(com.amazonaws.fba_inbound.doc._2007_05_10.holders.GetServiceStatusResultHolder getServiceStatusResult, com.amazonaws.fba_inbound.doc._2007_05_10.holders.ResponseMetadataHolder responseMetadata) throws java.rmi.RemoteException;

    /**
     * Gets the Fulfillment Network SKU (FNSKU) for each supplied
     *                     Merchant Item, creating it if needed. This operation
     * is
     *                     idempotent in that it can be called multiple times
     * without
     *                     any adverse effects. This operation is necessary
     * to register 
     *                     items for Amazon fulfillment in order to send
     * them to Amazon, 
     *                     but does NOT do the work of marking any offer
     * for this item 
     *                     as Amazon-fulfilled. Providing more than 250 Merchant
     * Items 
     *                     will result in an error. 
     *                     
     *                     NOTE: Use this operation over GetFulfillmentIdentifierForMSKU
     * 
     *                     if an offer does NOT already exist for the MerchantSKU.
     */
    public void getFulfillmentIdentifier(com.amazonaws.fba_inbound.doc._2007_05_10.MerchantItem[] merchantItem, com.amazonaws.fba_inbound.doc._2007_05_10.holders.GetFulfillmentIdentifierResultHolder getFulfillmentIdentifierResult, com.amazonaws.fba_inbound.doc._2007_05_10.holders.ResponseMetadataHolder responseMetadata) throws java.rmi.RemoteException;

    /**
     * Gets the Fulfillment Network SKU (FNSKU) for each supplied
     *                     Merchant Item, creating it if needed. This operation
     * is
     *                     idempotent in that it can be called multiple times
     * without
     *                     any adverse effects. This operation is necessary
     * to register 
     *                     items for Amazon fulfillment in order to send
     * them to Amazon, 
     *                     but does NOT do the work of marking any offer
     * for this item 
     *                     as Amazon-fulfilled. Providing more than 250 Merchant
     * Items 
     *                     will result in an error. 
     *                     
     *                     NOTE: Use this operation over GetFulfillmentIdentifier
     * if 
     *                     an offer already exists for the SKU.
     */
    public void getFulfillmentIdentifierForMSKU(java.lang.String[] merchantSKU, com.amazonaws.fba_inbound.doc._2007_05_10.holders.GetFulfillmentIdentifierForMSKUResultHolder getFulfillmentIdentifierForMSKUResult, com.amazonaws.fba_inbound.doc._2007_05_10.holders.ResponseMetadataHolder responseMetadata) throws java.rmi.RemoteException;

    /**
     * Gets the first set of fulfillment items registered to a 
     *                     merchant and returns a NextToken which can be
     * used to 
     *                     iterate through the remaining fulfillment items
     * (via the
     *                     'ListAllFulfillmentItemsByNextToken operation).
     * The
     *                     service will return between 1 and 'MaxCount' number
     * of
     *                     items.  Please check the value of 'HasNext' to
     * determine
     *                     whether there were some items which were not returned.
     * If 
     *                     'IncludeInactive' is set to true, it will return
     * both 
     *                     active and inactive mappings (this parameter defaults
     * to 
     *                     false).  Inactive mappings can be used to track
     * inventory in 
     *                     Amazon's fulfillment centers although they can't
     * be fulfilled.
     */
    public void listAllFulfillmentItems(java.lang.Boolean includeInactive, java.lang.Integer maxCount, com.amazonaws.fba_inbound.doc._2007_05_10.holders.ListAllFulfillmentItemsResultHolder listAllFulfillmentItemsResult, com.amazonaws.fba_inbound.doc._2007_05_10.holders.ResponseMetadataHolder responseMetadata) throws java.rmi.RemoteException;

    /**
     * Gets the next set of fulfillment items registered to a 
     *                     merchant and returns a NextToken which can be
     * used to
     *                     iterate through the remaining fulfillment items.
     * The
     *                     service will return between 1 and 'MaxCount' number
     * of
     *                     items.  Please check the value of 'HasNext' to
     * determine
     *                     whether there were some items which were not returned.
     */
    public void listAllFulfillmentItemsByNextToken(java.lang.String nextToken, com.amazonaws.fba_inbound.doc._2007_05_10.holders.ListAllFulfillmentItemsByNextTokenResultHolder listAllFulfillmentItemsByNextTokenResult, com.amazonaws.fba_inbound.doc._2007_05_10.holders.ResponseMetadataHolder responseMetadata) throws java.rmi.RemoteException;

    /**
     * Gets fulfillment item data for the provided Merchant SKUs.
     * If 
     *                     any of the provided MSKUs are invalid (e.g. does
     * not have an 
     *                     assigned Fulfillment Network SKU) they will be
     * ignored and only 
     *                     the valid SKUs will be returned.  NOTE: Providing
     * more than
     *                     2,000 MSKUs will result in an error.
     */
    public void getFulfillmentItemByMSKU(java.lang.String[] merchantSKU, com.amazonaws.fba_inbound.doc._2007_05_10.holders.GetFulfillmentItemByMSKUResultHolder getFulfillmentItemByMSKUResult, com.amazonaws.fba_inbound.doc._2007_05_10.holders.ResponseMetadataHolder responseMetadata) throws java.rmi.RemoteException;

    /**
     * Gets fulfillment item data for the provided Fulfillment
     *                     Network SKUs.  If any of the provided FNSKUs are
     * invalid
     *                     they will be ignored and only the valid SKUs will
     * be returned.
     *                     NOTE: Providing more than 2,000 FNSKUs will result
     * in an error.
     */
    public void getFulfillmentItemByFNSKU(java.lang.String[] fulfillmentNetworkSKU, com.amazonaws.fba_inbound.doc._2007_05_10.holders.GetFulfillmentItemByFNSKUResultHolder getFulfillmentItemByFNSKUResult, com.amazonaws.fba_inbound.doc._2007_05_10.holders.ResponseMetadataHolder responseMetadata) throws java.rmi.RemoteException;

    /**
     * Returns the information needed to create a set of shipments
     * for the given collection of items and source address.  When 
     *                     all the items are not all in the same category
     * (e.g. some 
     *                     sortable, some non-sortable) it may be necessary
     * to create 
     *                     multiple shipments (one for each of the shipment
     * groups
     *                     returned).
     */
    public void getInboundShipmentPreview(com.amazonaws.fba_inbound.doc._2007_05_10.Address shipFromAddress, com.amazonaws.fba_inbound.doc._2007_05_10.MerchantSKUQuantityItem[] merchantSKUQuantityItem, com.amazonaws.fba_inbound.doc._2007_05_10.LabelPrepPreference labelPrepPreference, com.amazonaws.fba_inbound.doc._2007_05_10.holders.GetInboundShipmentPreviewResultHolder getInboundShipmentPreviewResult, com.amazonaws.fba_inbound.doc._2007_05_10.holders.ResponseMetadataHolder responseMetadata) throws java.rmi.RemoteException;

    /**
     * Creates or replaces information about a shipment. If the 
     *                     shipment already exists, the information about
     * the shipment 
     *                     (and its associated items) will be replaced (for
     * the provided 
     *                     ShipmentId).  If the shipment does not exist,
     * one will be 
     *                     created.
     *                     
     *                     Note, the merchant should call SetInboundShipmentStatus
     * with a 
     *                     status of 'Shipped' when the shipment is picked
     * up, or set the status 
     *                     to 'Cancelled' if the shipment is abandoned. The
     * intial status
     *                     of a shipment will be set to 'Working'. Once a
     * shipment's status 
     *                     has been set to 'Shipped', the merchant may make
     * no further changes 
     *                     except to update the status to 'Cancelled'.  Any
     * items not received 
     *                     at the time a shipment is 'Cancelled' will be
     * sidelined if they 
     *                     arrive at the fulfillment center.
     * 
     *                     This operation will simply return a requestId
     * upon success,
     *                     otherwise an explicit error will be returned.
     * 
     *                     NOTE: If you are experiencing time-outs due to
     * too many
     *                     items in the shipment, calling this operation
     * with a subset
     *                     of the items should work.  You may add more items
     * to the
     *                     shipment by calling PutInboundShipmentItems.
     */
    public com.amazonaws.fba_inbound.doc._2007_05_10.ResponseMetadata putInboundShipment(java.lang.String shipmentId, java.lang.String shipmentName, java.lang.String destinationFulfillmentCenter, com.amazonaws.fba_inbound.doc._2007_05_10.Address shipFromAddress, com.amazonaws.fba_inbound.doc._2007_05_10.LabelPrepPreference labelPrepPreference, com.amazonaws.fba_inbound.doc._2007_05_10.MerchantSKUQuantityItem[] merchantSKUQuantityItem) throws java.rmi.RemoteException;

    /**
     * Adds line items to the pre-existing shipment specified by the
     * 
     *                     ShipmentId. If the MerchantSKU is already in the
     * shipment, then 
     *                     that particular line item will be replaced. Call
     * PutInboundShipment to create the shipment to be worked on.
     *                     
     *                     This call will return an exception when attempting
     * to add line 
     *                     items to a shipment that is in a status of 'Receiving'
     * or later.
     */
    public com.amazonaws.fba_inbound.doc._2007_05_10.ResponseMetadata putInboundShipmentItems(java.lang.String shipmentId, com.amazonaws.fba_inbound.doc._2007_05_10.MerchantSKUQuantityItem[] merchantSKUQuantityItem) throws java.rmi.RemoteException;

    /**
     * Removes line items from the pre-existing shipment specified
     * by the 
     *                     ShipmentId. If the MerchantSKU is not currently
     * a part of the 
     *                     shipment, then that particular line item will
     * be ignored and all 
     *                     others will still be processed. Call PutInboundShipment
     * to create 
     *                     the shipment to be worked on.
     *                     
     *                     This call will return an exception when attempting
     * to remove line 
     *                     items from a shipment that is in a status of 'Receiving'
     * or later.
     */
    public com.amazonaws.fba_inbound.doc._2007_05_10.ResponseMetadata deleteInboundShipmentItems(java.lang.String shipmentId, java.lang.String[] merchantSKU) throws java.rmi.RemoteException;

    /**
     * Get the first set of inbound shipments created by a merchant
     * 
     *                     according to the specified query parameters. 
     * A NextToken is also
     *                     returned to further iterate through the merchant's
     * remaining
     *                     shipments.  The service will return between 1
     * and 'MaxCount' number 
     *                     of items.  Please check the value of 'HasNext'
     * to determine
     *                     whether there were some items which were not returned.
     * If 
     *                     ShipmentStatus is not set, then all shipments
     * for a merchant will 
     *                     be returned, otherwise only shipments in the specified
     * status will 
     *                     be returned.  If CreatedBefore is set, only shipments
     * which were 
     *                     created before the specified date will be returned
     * (if left 
     *                     unspecified, it defaults to "now").  If CreatedAfter
     * is set, only 
     *                     shipments which were created after the specified
     * date will be 
     *                     returned (if left unspecified, it defaults to
     * the epoch).
     * 
     *                     NOTE: The CreatedBefore and CreatedAfter functionality
     * is not
     *                     currently implemented and defaults to the values
     * mentioned above.
     */
    public void listInboundShipments(com.amazonaws.fba_inbound.doc._2007_05_10.ShipmentStatus[] shipmentStatus, java.util.Calendar createdBefore, java.util.Calendar createdAfter, java.lang.Integer maxCount, com.amazonaws.fba_inbound.doc._2007_05_10.holders.ListInboundShipmentsResultHolder listInboundShipmentsResult, com.amazonaws.fba_inbound.doc._2007_05_10.holders.ResponseMetadataHolder responseMetadata) throws java.rmi.RemoteException;

    /**
     * Gets the next set of inbound shipments created by a
     *                     merchant and returns the next NextToken which
     * can be used to
     *                     iterate through the remaining inbound shipments.
     * The
     *                     service will return between 1 and 'MaxCount' number
     * of
     *                     items.  Please check the value of 'HasNext' to
     * determine
     *                     whether there were some items which were not returned.
     */
    public void listInboundShipmentsByNextToken(java.lang.String nextToken, com.amazonaws.fba_inbound.doc._2007_05_10.holders.ListInboundShipmentsByNextTokenResultHolder listInboundShipmentsByNextTokenResult, com.amazonaws.fba_inbound.doc._2007_05_10.holders.ResponseMetadataHolder responseMetadata) throws java.rmi.RemoteException;

    /**
     * Gets the merchant's inbound shipment header information for
     * the 
     *                     given ShipmentId.
     */
    public void getInboundShipmentData(java.lang.String shipmentId, com.amazonaws.fba_inbound.doc._2007_05_10.holders.GetInboundShipmentDataResultHolder getInboundShipmentDataResult, com.amazonaws.fba_inbound.doc._2007_05_10.holders.ResponseMetadataHolder responseMetadata) throws java.rmi.RemoteException;

    /**
     * Adds or replaces the merchant's inbound shipment header information
     * for the 
     *                     given ShipmentId.
     */
    public com.amazonaws.fba_inbound.doc._2007_05_10.ResponseMetadata putInboundShipmentData(java.lang.String shipmentId, java.lang.String shipmentName, java.lang.String destinationFulfillmentCenter, com.amazonaws.fba_inbound.doc._2007_05_10.Address shipFromAddress, com.amazonaws.fba_inbound.doc._2007_05_10.LabelPrepPreference labelPrepPreference) throws java.rmi.RemoteException;

    /**
     * Gets the first set of inbound shipment items for the given
     * 
     *                     ShipmentId. A NextToken is also returned to further
     * iterate
     *                     through the merchant's remaining inbound shipment
     * items.
     *                     The service will return between 1 and 'MaxCount'
     * number of
     *                     shipment items.  Please check the value of 'HasNext'
     * to
     *                     determine whether there are some items which were
     * not
     *                     returned. To get the next set of inbound shipment
     * items, you
     *                     must call ListInboundShipmentItemsByNextToken
     * and pass in
     *                     the 'NextToken' this call returned.
     */
    public void listInboundShipmentItems(java.lang.String shipmentId, java.lang.Integer maxCount, com.amazonaws.fba_inbound.doc._2007_05_10.holders.ListInboundShipmentItemsResultHolder listInboundShipmentItemsResult, com.amazonaws.fba_inbound.doc._2007_05_10.holders.ResponseMetadataHolder responseMetadata) throws java.rmi.RemoteException;

    /**
     * Gets the next set of inbound shipment items and returns the
     * 
     *                     NextToken which can be used to iterate through
     * the remaining 
     *                     inbound shipment items. The service will return
     * between 1 and 
     *                     'MaxCount' number of shipment items.  Please check
     * the value 
     *                     of 'HasNext' to determine whether there are some
     * items which 
     *                     were not returned. You must first call 
     *                     ListInboundShipmentItems to get a 'NextToken'.
     */
    public void listInboundShipmentItemsByNextToken(java.lang.String nextToken, com.amazonaws.fba_inbound.doc._2007_05_10.holders.ListInboundShipmentItemsByNextTokenResultHolder listInboundShipmentItemsByNextTokenResult, com.amazonaws.fba_inbound.doc._2007_05_10.holders.ResponseMetadataHolder responseMetadata) throws java.rmi.RemoteException;

    /**
     * Sets the inbound shipment status to the specified ShipmentStatus.
     * 
     *                     Valid statuses are 'Shipped' (the shipment has
     * left the merchant) 
     *                     or 'Cancelled'.
     * 
     *                     Once a shipment's status has been set to 'Shipped',
     * the merchant 
     *                     may make no further changes except to update the
     * status to 
     *                     'Cancelled'.  Any items not received at the time
     * a shipment is 
     *                     'Cancelled' will be put into problem receive at
     * the
     *                     fulfillment center.
     * 
     *                     This operation will simply return a requestId
     * upon success,
     *                     otherwise an explicit error will be returned.
     */
    public com.amazonaws.fba_inbound.doc._2007_05_10.ResponseMetadata setInboundShipmentStatus(java.lang.String shipmentId, com.amazonaws.fba_inbound.doc._2007_05_10.ShipmentStatus shipmentStatus) throws java.rmi.RemoteException;
}
