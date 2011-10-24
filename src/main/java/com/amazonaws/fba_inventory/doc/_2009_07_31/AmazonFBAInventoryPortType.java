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
 * AmazonFBAInventoryPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazonaws.fba_inventory.doc._2009_07_31;

public interface AmazonFBAInventoryPortType extends java.rmi.Remote {

    /**
     * Gets a brief status message from the service.
     */
    public void getServiceStatus(com.amazonaws.fba_inventory.doc._2009_07_31.holders.GetServiceStatusResultHolder getServiceStatusResult, com.amazonaws.fba_inventory.doc._2009_07_31.holders.ResponseMetadataHolder responseMetadata) throws java.rmi.RemoteException;

    /**
     * Get information about the supply of merchant-owned inventory
     * in
     *         Amazon's fulfillment network. "Supply" is inventory that is
     * available
     *         for fulfilling (a.k.a. Multi-Channel Fulfillment) orders.
     * In general
     *         this includes all sellable inventory that has been received
     * by Amazon,
     *         that is not reserved for existing orders or for internal FC
     * processes,
     *         and also inventory expected to be received from inbound shipments.
     */
    public void getInventorySupply(java.lang.String[] merchantSKU, java.lang.String responseGroup, com.amazonaws.fba_inventory.doc._2009_07_31.holders.GetInventorySupplyResultHolder getInventorySupplyResult, com.amazonaws.fba_inventory.doc._2009_07_31.holders.ResponseMetadataHolder responseMetadata) throws java.rmi.RemoteException;

    /**
     * Get information about the supply of merchant-owned inventory
     * in
     *         Amazon's fulfillment network, for inventory items that may
     * have had
     *         recent changes in inventory levels. The type of inventory
     * data returned
     *         by this operation is the same as that returned by GetInventorySupply.
     * This operation provides the most efficient mechanism for clients to
     * maintain local copies of inventory supply data.
     *         
     *         This operation is used with ListUpdatedInventorySupplyByNextToken
     * to paginate over the resultset. Begin pagination by invoking the
     *         ListUpdatedInventorySupply operation, and retrieve the first
     * set of
     *         results. If the HasNext flag indicates more results are available,
     * continuing iteratively requesting further pages results by invoking
     * the
     *         ListUpdatedInventorySupplyByNextToken operation (each time
     * passing in the
     *         NextToken value from the previous result), until the returned
     * HasNext
     *         flag is false, indicating no further results are available.
     */
    public void listUpdatedInventorySupply(int numberOfResultsRequested, java.lang.String queryStartDateTime, java.lang.String responseGroup, com.amazonaws.fba_inventory.doc._2009_07_31.holders.ListUpdatedInventorySupplyResultHolder listUpdatedInventorySupplyResult, com.amazonaws.fba_inventory.doc._2009_07_31.holders.ResponseMetadataHolder responseMetadata) throws java.rmi.RemoteException;

    /**
     * Continues pagination over a resultset of inventory data for
     * inventory
     *         items that may have had recent changes in inventory levels.
     * 
     *         This operation is used in conjunction with ListUpdatedInventorySupply.
     * Please refer to documentation for that operation for further details.
     */
    public void listUpdatedInventorySupplyByNextToken(java.lang.String nextToken, com.amazonaws.fba_inventory.doc._2009_07_31.holders.ListUpdatedInventorySupplyByNextTokenResultHolder listUpdatedInventorySupplyByNextTokenResult, com.amazonaws.fba_inventory.doc._2009_07_31.holders.ResponseMetadataHolder responseMetadata) throws java.rmi.RemoteException;
}
