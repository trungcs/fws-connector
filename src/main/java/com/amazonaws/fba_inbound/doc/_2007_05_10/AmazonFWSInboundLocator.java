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
 * AmazonFWSInboundLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazonaws.fba_inbound.doc._2007_05_10;

public class AmazonFWSInboundLocator extends org.apache.axis.client.Service implements com.amazonaws.fba_inbound.doc._2007_05_10.AmazonFWSInbound {

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

    public AmazonFWSInboundLocator() {
    }


    public AmazonFWSInboundLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AmazonFWSInboundLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AmazonFWSInboundPort
    private java.lang.String AmazonFWSInboundPort_address = "https://fba-inbound.amazonaws.com";

    public java.lang.String getAmazonFWSInboundPortAddress() {
        return AmazonFWSInboundPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AmazonFWSInboundPortWSDDServiceName = "AmazonFWSInboundPort";

    public java.lang.String getAmazonFWSInboundPortWSDDServiceName() {
        return AmazonFWSInboundPortWSDDServiceName;
    }

    public void setAmazonFWSInboundPortWSDDServiceName(java.lang.String name) {
        AmazonFWSInboundPortWSDDServiceName = name;
    }

    public com.amazonaws.fba_inbound.doc._2007_05_10.AmazonFWSInboundPortType getAmazonFWSInboundPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AmazonFWSInboundPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAmazonFWSInboundPort(endpoint);
    }

    public com.amazonaws.fba_inbound.doc._2007_05_10.AmazonFWSInboundPortType getAmazonFWSInboundPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.amazonaws.fba_inbound.doc._2007_05_10.AmazonFWSInboundBindingStub _stub = new com.amazonaws.fba_inbound.doc._2007_05_10.AmazonFWSInboundBindingStub(portAddress, this);
            _stub.setPortName(getAmazonFWSInboundPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAmazonFWSInboundPortEndpointAddress(java.lang.String address) {
        AmazonFWSInboundPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.amazonaws.fba_inbound.doc._2007_05_10.AmazonFWSInboundPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.amazonaws.fba_inbound.doc._2007_05_10.AmazonFWSInboundBindingStub _stub = new com.amazonaws.fba_inbound.doc._2007_05_10.AmazonFWSInboundBindingStub(new java.net.URL(AmazonFWSInboundPort_address), this);
                _stub.setPortName(getAmazonFWSInboundPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("AmazonFWSInboundPort".equals(inputPortName)) {
            return getAmazonFWSInboundPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "AmazonFWSInbound");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "AmazonFWSInboundPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AmazonFWSInboundPort".equals(portName)) {
            setAmazonFWSInboundPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
