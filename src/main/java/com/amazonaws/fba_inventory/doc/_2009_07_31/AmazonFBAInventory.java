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
 * AmazonFBAInventory.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazonaws.fba_inventory.doc._2009_07_31;

public interface AmazonFBAInventory extends javax.xml.rpc.Service {

/**
 * Amazon Web Service used to retrieve inventory and fulfillability
 * data
 *       based on merchant-owned inventory in Amazon's fulfillment network.
 */
    public java.lang.String getAmazonFBAInventoryPortAddress();

    public com.amazonaws.fba_inventory.doc._2009_07_31.AmazonFBAInventoryPortType getAmazonFBAInventoryPort() throws javax.xml.rpc.ServiceException;

    public com.amazonaws.fba_inventory.doc._2009_07_31.AmazonFBAInventoryPortType getAmazonFBAInventoryPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
