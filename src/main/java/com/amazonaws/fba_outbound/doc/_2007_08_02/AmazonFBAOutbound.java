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
 * AmazonFBAOutbound.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazonaws.fba_outbound.doc._2007_08_02;

public interface AmazonFBAOutbound extends javax.xml.rpc.Service {

/**
 * Amazon Web Service used to create and manage outbound shipments
 * from
 *       the Amazon Fulfillment Network.
 */
    public java.lang.String getAmazonFBAOutboundPortAddress();

    public com.amazonaws.fba_outbound.doc._2007_08_02.AmazonFBAOutboundPortType getAmazonFBAOutboundPort() throws javax.xml.rpc.ServiceException;

    public com.amazonaws.fba_outbound.doc._2007_08_02.AmazonFBAOutboundPortType getAmazonFBAOutboundPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
