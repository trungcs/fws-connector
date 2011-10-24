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
 * AmazonFBAOutboundPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazonaws.fba_outbound.doc._2007_08_02;

public interface AmazonFBAOutboundPortType extends java.rmi.Remote {

    /**
     * Gets a brief status message from the service.
     */
    public void getServiceStatus(com.amazonaws.fba_outbound.doc._2007_08_02.holders.GetServiceStatusResultHolder getServiceStatusResult, com.amazonaws.fba_outbound.doc._2007_08_02.holders.ResponseMetadataHolder responseMetadata) throws java.rmi.RemoteException;

    /**
     * Request for Amazon to send items from the merchant's inventory
     * to a
     *          destination address.
     */
    public com.amazonaws.fba_outbound.doc._2007_08_02.ResponseMetadata createFulfillmentOrder(java.lang.String merchantFulfillmentOrderId, java.lang.String displayableOrderId, java.lang.String displayableOrderDateTime, java.lang.String displayableOrderComment, java.lang.String shippingSpeedCategory, com.amazonaws.fba_outbound.doc._2007_08_02.Address destinationAddress, java.lang.String fulfillmentPolicy, java.lang.String fulfillmentMethod, java.lang.String[] notificationEmailList, com.amazonaws.fba_outbound.doc._2007_08_02.CreateFulfillmentOrderItem[] item) throws java.rmi.RemoteException;

    /**
     * Request for Amazon to no longer attempt to fulfill an existing
     * fulfillment order. Amazon will attempt to stop fulfillment of all
     *         items that haven't already shipped, but cannot guarantee success.
     * 	    Note: Items that have already shipped cannot be cancelled.
     */
    public com.amazonaws.fba_outbound.doc._2007_08_02.ResponseMetadata cancelFulfillmentOrder(java.lang.String merchantFulfillmentOrderId) throws java.rmi.RemoteException;

    /**
     * Get detailed information about a FulfillmentOrder.  This includes
     * the
     *         original fulfillment order request, the status of the order
     * and its
     *         items in Amazon's fulfillment network, and the shipments that
     * have been
     *         generated to fulfill the order.
     */
    public void getFulfillmentOrder(java.lang.String merchantFulfillmentOrderId, com.amazonaws.fba_outbound.doc._2007_08_02.holders.GetFulfillmentOrderResultHolder getFulfillmentOrderResult, com.amazonaws.fba_outbound.doc._2007_08_02.holders.ResponseMetadataHolder responseMetadata) throws java.rmi.RemoteException;

    /**
     * Gets the first set of fulfillment orders that are currently
     * being
     *         fulfilled or that were being fulfilled at some time in the
     * past
     *         (as specified by the query parameters). Also returns a NextToken
     * which can be used iterate through the remaining fulfillment orders
     * (via the ListAllFulfillmentOrdersByNextToken operation).
     * 
     *         The service will return between 0 and 'MaxCount' fulfillment
     * orders.
     *         Please check the value of 'HasNext' to determine whether there
     * may be
     *         additional fulfillment orders to list.
     * 
     *         If the QueryStartDateTime is set, the results will include
     * all orders
     *         currently being fulfilled, and all orders that were being
     * fulfilled
     *         since that date and time. If it is not set, it defaults to
     * 72 hours
     *         prior to "now".
     */
    public void listAllFulfillmentOrders(int numberOfResultsRequested, java.lang.String queryStartDateTime, java.lang.String[] fulfillmentMethod, com.amazonaws.fba_outbound.doc._2007_08_02.holders.ListAllFulfillmentOrdersResultHolder listAllFulfillmentOrdersResult, com.amazonaws.fba_outbound.doc._2007_08_02.holders.ResponseMetadataHolder responseMetadata) throws java.rmi.RemoteException;

    /**
     * Gets the next set of fulfillment orders that are currently
     * being
     *         being fulfilled or that were being fulfilled at some time
     * in the
     *         past.
     * 
     *         The service will return between 0 and 'MaxCount' fulfillment
     * orders.
     *         Please check the value of 'HasNext' to determine whether there
     * may be
     *         additional fulfillment orders to list.
     */
    public void listAllFulfillmentOrdersByNextToken(java.lang.String nextToken, com.amazonaws.fba_outbound.doc._2007_08_02.holders.ListAllFulfillmentOrdersByNextTokenResultHolder listAllFulfillmentOrdersByNextTokenResult, com.amazonaws.fba_outbound.doc._2007_08_02.holders.ResponseMetadataHolder responseMetadata) throws java.rmi.RemoteException;

    /**
     * Get estimated shipping dates and fees for all 
     *         available shipping speed given a set of merchant SKUs and
     * quantities      
     * 
     *         If "ShippingSpeedCategories" are inputed, only previews for
     * those options will be returned. 
     *         
     *         If "ShippingSpeedCategories" are not inputed, then previews
     * for all available options 
     *         are returned.
     * 
     *         The service will return the fulfillment estimates for a set
     * of merchant 
     *         SKUs and quantities.
     */
    public void getFulfillmentPreview(com.amazonaws.fba_outbound.doc._2007_08_02.Address address, com.amazonaws.fba_outbound.doc._2007_08_02.GetFulfillmentPreviewItem[] items, java.lang.String[] shippingSpeedCategories, com.amazonaws.fba_outbound.doc._2007_08_02.holders.GetFulfillmentPreviewResultHolder getFulfillmentPreviewResult, com.amazonaws.fba_outbound.doc._2007_08_02.holders.ResponseMetadataHolder responseMetadata) throws java.rmi.RemoteException;
}
