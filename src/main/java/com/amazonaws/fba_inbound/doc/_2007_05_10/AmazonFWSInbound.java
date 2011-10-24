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
 * AmazonFWSInbound.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazonaws.fba_inbound.doc._2007_05_10;

public interface AmazonFWSInbound extends javax.xml.rpc.Service {

/**
 * Fulfillment By Amazon (FBA) Web Service used to set up inbound
 * shipments
 *                 to Amazon and to view inventory in the Amazon Fulfillment
 * Network. 
 * 
 *                 Release Notes: https://fba-inbound.amazonaws.com/doc/2007-05-10/ReleaseNotes.html
 * 
 *                 Important: EU and JP merchants should change the service
 * address to
 *                 https://fba-inbound-eu.amazonaws.com and https://fba-inbound-jp.amazonaws.com,
 * respectively.
 */
    public java.lang.String getAmazonFWSInboundPortAddress();

    public com.amazonaws.fba_inbound.doc._2007_05_10.AmazonFWSInboundPortType getAmazonFWSInboundPort() throws javax.xml.rpc.ServiceException;

    public com.amazonaws.fba_inbound.doc._2007_05_10.AmazonFWSInboundPortType getAmazonFWSInboundPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
