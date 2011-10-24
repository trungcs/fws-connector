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
 * AmazonFBAInventoryLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazonaws.fba_inventory.doc._2009_07_31;

public class AmazonFBAInventoryLocator extends org.apache.axis.client.Service implements com.amazonaws.fba_inventory.doc._2009_07_31.AmazonFBAInventory {

/**
 * Amazon Web Service used to retrieve inventory and fulfillability
 * data
 *       based on merchant-owned inventory in Amazon's fulfillment network.
 */

    public AmazonFBAInventoryLocator() {
    }


    public AmazonFBAInventoryLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AmazonFBAInventoryLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AmazonFBAInventoryPort
    private java.lang.String AmazonFBAInventoryPort_address = "https://fba-inventory.amazonaws.com";

    public java.lang.String getAmazonFBAInventoryPortAddress() {
        return AmazonFBAInventoryPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AmazonFBAInventoryPortWSDDServiceName = "AmazonFBAInventoryPort";

    public java.lang.String getAmazonFBAInventoryPortWSDDServiceName() {
        return AmazonFBAInventoryPortWSDDServiceName;
    }

    public void setAmazonFBAInventoryPortWSDDServiceName(java.lang.String name) {
        AmazonFBAInventoryPortWSDDServiceName = name;
    }

    public com.amazonaws.fba_inventory.doc._2009_07_31.AmazonFBAInventoryPortType getAmazonFBAInventoryPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AmazonFBAInventoryPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAmazonFBAInventoryPort(endpoint);
    }

    public com.amazonaws.fba_inventory.doc._2009_07_31.AmazonFBAInventoryPortType getAmazonFBAInventoryPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.amazonaws.fba_inventory.doc._2009_07_31.AmazonFBAInventoryBindingStub _stub = new com.amazonaws.fba_inventory.doc._2009_07_31.AmazonFBAInventoryBindingStub(portAddress, this);
            _stub.setPortName(getAmazonFBAInventoryPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAmazonFBAInventoryPortEndpointAddress(java.lang.String address) {
        AmazonFBAInventoryPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.amazonaws.fba_inventory.doc._2009_07_31.AmazonFBAInventoryPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.amazonaws.fba_inventory.doc._2009_07_31.AmazonFBAInventoryBindingStub _stub = new com.amazonaws.fba_inventory.doc._2009_07_31.AmazonFBAInventoryBindingStub(new java.net.URL(AmazonFBAInventoryPort_address), this);
                _stub.setPortName(getAmazonFBAInventoryPortWSDDServiceName());
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
        if ("AmazonFBAInventoryPort".equals(inputPortName)) {
            return getAmazonFBAInventoryPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://fba-inventory.amazonaws.com/doc/2009-07-31/", "AmazonFBAInventory");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://fba-inventory.amazonaws.com/doc/2009-07-31/", "AmazonFBAInventoryPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AmazonFBAInventoryPort".equals(portName)) {
            setAmazonFBAInventoryPortEndpointAddress(address);
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
