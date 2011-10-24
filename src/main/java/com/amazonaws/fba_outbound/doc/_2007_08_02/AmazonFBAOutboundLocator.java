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
 * AmazonFBAOutboundLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazonaws.fba_outbound.doc._2007_08_02;

public class AmazonFBAOutboundLocator extends org.apache.axis.client.Service implements com.amazonaws.fba_outbound.doc._2007_08_02.AmazonFBAOutbound {

/**
 * Amazon Web Service used to create and manage outbound shipments
 * from
 *       the Amazon Fulfillment Network.
 */

    public AmazonFBAOutboundLocator() {
    }


    public AmazonFBAOutboundLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AmazonFBAOutboundLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AmazonFBAOutboundPort
    private java.lang.String AmazonFBAOutboundPort_address = "https://fba-outbound.amazonaws.com";

    public java.lang.String getAmazonFBAOutboundPortAddress() {
        return AmazonFBAOutboundPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AmazonFBAOutboundPortWSDDServiceName = "AmazonFBAOutboundPort";

    public java.lang.String getAmazonFBAOutboundPortWSDDServiceName() {
        return AmazonFBAOutboundPortWSDDServiceName;
    }

    public void setAmazonFBAOutboundPortWSDDServiceName(java.lang.String name) {
        AmazonFBAOutboundPortWSDDServiceName = name;
    }

    public com.amazonaws.fba_outbound.doc._2007_08_02.AmazonFBAOutboundPortType getAmazonFBAOutboundPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AmazonFBAOutboundPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAmazonFBAOutboundPort(endpoint);
    }

    public com.amazonaws.fba_outbound.doc._2007_08_02.AmazonFBAOutboundPortType getAmazonFBAOutboundPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.amazonaws.fba_outbound.doc._2007_08_02.AmazonFBAOutboundBindingStub _stub = new com.amazonaws.fba_outbound.doc._2007_08_02.AmazonFBAOutboundBindingStub(portAddress, this);
            _stub.setPortName(getAmazonFBAOutboundPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAmazonFBAOutboundPortEndpointAddress(java.lang.String address) {
        AmazonFBAOutboundPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.amazonaws.fba_outbound.doc._2007_08_02.AmazonFBAOutboundPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.amazonaws.fba_outbound.doc._2007_08_02.AmazonFBAOutboundBindingStub _stub = new com.amazonaws.fba_outbound.doc._2007_08_02.AmazonFBAOutboundBindingStub(new java.net.URL(AmazonFBAOutboundPort_address), this);
                _stub.setPortName(getAmazonFBAOutboundPortWSDDServiceName());
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
        if ("AmazonFBAOutboundPort".equals(inputPortName)) {
            return getAmazonFBAOutboundPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "AmazonFBAOutbound");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "AmazonFBAOutboundPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AmazonFBAOutboundPort".equals(portName)) {
            setAmazonFBAOutboundPortEndpointAddress(address);
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
