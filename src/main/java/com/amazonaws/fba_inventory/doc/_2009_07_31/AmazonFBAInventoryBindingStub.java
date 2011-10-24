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
 * AmazonFBAInventoryBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazonaws.fba_inventory.doc._2009_07_31;

public class AmazonFBAInventoryBindingStub extends org.apache.axis.client.Stub implements com.amazonaws.fba_inventory.doc._2009_07_31.AmazonFBAInventoryPortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[4];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetServiceStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-inventory.amazonaws.com/doc/2009-07-31/", "GetServiceStatusResult"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://fba-inventory.amazonaws.com/doc/2009-07-31/", ">GetServiceStatusResult"), com.amazonaws.fba_inventory.doc._2009_07_31.GetServiceStatusResult.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-inventory.amazonaws.com/doc/2009-07-31/", "ResponseMetadata"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://fba-inventory.amazonaws.com/doc/2009-07-31/", ">ResponseMetadata"), com.amazonaws.fba_inventory.doc._2009_07_31.ResponseMetadata.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetInventorySupply");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-inventory.amazonaws.com/doc/2009-07-31/", "MerchantSKU"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-inventory.amazonaws.com/doc/2009-07-31/", "ResponseGroup"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-inventory.amazonaws.com/doc/2009-07-31/", "GetInventorySupplyResult"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://fba-inventory.amazonaws.com/doc/2009-07-31/", ">GetInventorySupplyResult"), com.amazonaws.fba_inventory.doc._2009_07_31.GetInventorySupplyResult.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-inventory.amazonaws.com/doc/2009-07-31/", "ResponseMetadata"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://fba-inventory.amazonaws.com/doc/2009-07-31/", ">ResponseMetadata"), com.amazonaws.fba_inventory.doc._2009_07_31.ResponseMetadata.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ListUpdatedInventorySupply");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-inventory.amazonaws.com/doc/2009-07-31/", "NumberOfResultsRequested"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-inventory.amazonaws.com/doc/2009-07-31/", "QueryStartDateTime"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-inventory.amazonaws.com/doc/2009-07-31/", "ResponseGroup"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-inventory.amazonaws.com/doc/2009-07-31/", "ListUpdatedInventorySupplyResult"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://fba-inventory.amazonaws.com/doc/2009-07-31/", ">ListUpdatedInventorySupplyResult"), com.amazonaws.fba_inventory.doc._2009_07_31.ListUpdatedInventorySupplyResult.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-inventory.amazonaws.com/doc/2009-07-31/", "ResponseMetadata"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://fba-inventory.amazonaws.com/doc/2009-07-31/", ">ResponseMetadata"), com.amazonaws.fba_inventory.doc._2009_07_31.ResponseMetadata.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ListUpdatedInventorySupplyByNextToken");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-inventory.amazonaws.com/doc/2009-07-31/", "NextToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-inventory.amazonaws.com/doc/2009-07-31/", "ListUpdatedInventorySupplyByNextTokenResult"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://fba-inventory.amazonaws.com/doc/2009-07-31/", ">ListUpdatedInventorySupplyByNextTokenResult"), com.amazonaws.fba_inventory.doc._2009_07_31.ListUpdatedInventorySupplyByNextTokenResult.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-inventory.amazonaws.com/doc/2009-07-31/", "ResponseMetadata"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://fba-inventory.amazonaws.com/doc/2009-07-31/", ">ResponseMetadata"), com.amazonaws.fba_inventory.doc._2009_07_31.ResponseMetadata.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

    }

    public AmazonFBAInventoryBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public AmazonFBAInventoryBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public AmazonFBAInventoryBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.1");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://fba-inventory.amazonaws.com/doc/2009-07-31/", ">GetInventorySupplyResult");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.fba_inventory.doc._2009_07_31.GetInventorySupplyResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fba-inventory.amazonaws.com/doc/2009-07-31/", ">GetServiceStatusResult");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.fba_inventory.doc._2009_07_31.GetServiceStatusResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fba-inventory.amazonaws.com/doc/2009-07-31/", ">ListUpdatedInventorySupplyByNextTokenResult");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.fba_inventory.doc._2009_07_31.ListUpdatedInventorySupplyByNextTokenResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fba-inventory.amazonaws.com/doc/2009-07-31/", ">ListUpdatedInventorySupplyResult");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.fba_inventory.doc._2009_07_31.ListUpdatedInventorySupplyResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fba-inventory.amazonaws.com/doc/2009-07-31/", ">ResponseMetadata");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.fba_inventory.doc._2009_07_31.ResponseMetadata.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fba-inventory.amazonaws.com/doc/2009-07-31/", "MerchantSKUSupply");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.fba_inventory.doc._2009_07_31.MerchantSKUSupply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fba-inventory.amazonaws.com/doc/2009-07-31/", "SupplyDetail");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.fba_inventory.doc._2009_07_31.SupplyDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fba-inventory.amazonaws.com/doc/2009-07-31/", "Timepoint");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.fba_inventory.doc._2009_07_31.Timepoint.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public void getServiceStatus(com.amazonaws.fba_inventory.doc._2009_07_31.holders.GetServiceStatusResultHolder getServiceStatusResult, com.amazonaws.fba_inventory.doc._2009_07_31.holders.ResponseMetadataHolder responseMetadata) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetServiceStatus");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://fba-inventory.amazonaws.com/doc/2009-07-31/", "GetServiceStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                getServiceStatusResult.value = (com.amazonaws.fba_inventory.doc._2009_07_31.GetServiceStatusResult) _output.get(new javax.xml.namespace.QName("http://fba-inventory.amazonaws.com/doc/2009-07-31/", "GetServiceStatusResult"));
            } catch (java.lang.Exception _exception) {
                getServiceStatusResult.value = (com.amazonaws.fba_inventory.doc._2009_07_31.GetServiceStatusResult) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://fba-inventory.amazonaws.com/doc/2009-07-31/", "GetServiceStatusResult")), com.amazonaws.fba_inventory.doc._2009_07_31.GetServiceStatusResult.class);
            }
            try {
                responseMetadata.value = (com.amazonaws.fba_inventory.doc._2009_07_31.ResponseMetadata) _output.get(new javax.xml.namespace.QName("http://fba-inventory.amazonaws.com/doc/2009-07-31/", "ResponseMetadata"));
            } catch (java.lang.Exception _exception) {
                responseMetadata.value = (com.amazonaws.fba_inventory.doc._2009_07_31.ResponseMetadata) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://fba-inventory.amazonaws.com/doc/2009-07-31/", "ResponseMetadata")), com.amazonaws.fba_inventory.doc._2009_07_31.ResponseMetadata.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getInventorySupply(java.lang.String[] merchantSKU, java.lang.String responseGroup, com.amazonaws.fba_inventory.doc._2009_07_31.holders.GetInventorySupplyResultHolder getInventorySupplyResult, com.amazonaws.fba_inventory.doc._2009_07_31.holders.ResponseMetadataHolder responseMetadata) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetInventorySupply");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://fba-inventory.amazonaws.com/doc/2009-07-31/", "GetInventorySupply"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {merchantSKU, responseGroup});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                getInventorySupplyResult.value = (com.amazonaws.fba_inventory.doc._2009_07_31.GetInventorySupplyResult) _output.get(new javax.xml.namespace.QName("http://fba-inventory.amazonaws.com/doc/2009-07-31/", "GetInventorySupplyResult"));
            } catch (java.lang.Exception _exception) {
                getInventorySupplyResult.value = (com.amazonaws.fba_inventory.doc._2009_07_31.GetInventorySupplyResult) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://fba-inventory.amazonaws.com/doc/2009-07-31/", "GetInventorySupplyResult")), com.amazonaws.fba_inventory.doc._2009_07_31.GetInventorySupplyResult.class);
            }
            try {
                responseMetadata.value = (com.amazonaws.fba_inventory.doc._2009_07_31.ResponseMetadata) _output.get(new javax.xml.namespace.QName("http://fba-inventory.amazonaws.com/doc/2009-07-31/", "ResponseMetadata"));
            } catch (java.lang.Exception _exception) {
                responseMetadata.value = (com.amazonaws.fba_inventory.doc._2009_07_31.ResponseMetadata) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://fba-inventory.amazonaws.com/doc/2009-07-31/", "ResponseMetadata")), com.amazonaws.fba_inventory.doc._2009_07_31.ResponseMetadata.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void listUpdatedInventorySupply(int numberOfResultsRequested, java.lang.String queryStartDateTime, java.lang.String responseGroup, com.amazonaws.fba_inventory.doc._2009_07_31.holders.ListUpdatedInventorySupplyResultHolder listUpdatedInventorySupplyResult, com.amazonaws.fba_inventory.doc._2009_07_31.holders.ResponseMetadataHolder responseMetadata) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ListUpdatedInventorySupply");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://fba-inventory.amazonaws.com/doc/2009-07-31/", "ListUpdatedInventorySupply"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(numberOfResultsRequested), queryStartDateTime, responseGroup});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                listUpdatedInventorySupplyResult.value = (com.amazonaws.fba_inventory.doc._2009_07_31.ListUpdatedInventorySupplyResult) _output.get(new javax.xml.namespace.QName("http://fba-inventory.amazonaws.com/doc/2009-07-31/", "ListUpdatedInventorySupplyResult"));
            } catch (java.lang.Exception _exception) {
                listUpdatedInventorySupplyResult.value = (com.amazonaws.fba_inventory.doc._2009_07_31.ListUpdatedInventorySupplyResult) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://fba-inventory.amazonaws.com/doc/2009-07-31/", "ListUpdatedInventorySupplyResult")), com.amazonaws.fba_inventory.doc._2009_07_31.ListUpdatedInventorySupplyResult.class);
            }
            try {
                responseMetadata.value = (com.amazonaws.fba_inventory.doc._2009_07_31.ResponseMetadata) _output.get(new javax.xml.namespace.QName("http://fba-inventory.amazonaws.com/doc/2009-07-31/", "ResponseMetadata"));
            } catch (java.lang.Exception _exception) {
                responseMetadata.value = (com.amazonaws.fba_inventory.doc._2009_07_31.ResponseMetadata) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://fba-inventory.amazonaws.com/doc/2009-07-31/", "ResponseMetadata")), com.amazonaws.fba_inventory.doc._2009_07_31.ResponseMetadata.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void listUpdatedInventorySupplyByNextToken(java.lang.String nextToken, com.amazonaws.fba_inventory.doc._2009_07_31.holders.ListUpdatedInventorySupplyByNextTokenResultHolder listUpdatedInventorySupplyByNextTokenResult, com.amazonaws.fba_inventory.doc._2009_07_31.holders.ResponseMetadataHolder responseMetadata) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ListUpdatedInventorySupplyByNextToken");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://fba-inventory.amazonaws.com/doc/2009-07-31/", "ListUpdatedInventorySupplyByNextToken"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {nextToken});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                listUpdatedInventorySupplyByNextTokenResult.value = (com.amazonaws.fba_inventory.doc._2009_07_31.ListUpdatedInventorySupplyByNextTokenResult) _output.get(new javax.xml.namespace.QName("http://fba-inventory.amazonaws.com/doc/2009-07-31/", "ListUpdatedInventorySupplyByNextTokenResult"));
            } catch (java.lang.Exception _exception) {
                listUpdatedInventorySupplyByNextTokenResult.value = (com.amazonaws.fba_inventory.doc._2009_07_31.ListUpdatedInventorySupplyByNextTokenResult) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://fba-inventory.amazonaws.com/doc/2009-07-31/", "ListUpdatedInventorySupplyByNextTokenResult")), com.amazonaws.fba_inventory.doc._2009_07_31.ListUpdatedInventorySupplyByNextTokenResult.class);
            }
            try {
                responseMetadata.value = (com.amazonaws.fba_inventory.doc._2009_07_31.ResponseMetadata) _output.get(new javax.xml.namespace.QName("http://fba-inventory.amazonaws.com/doc/2009-07-31/", "ResponseMetadata"));
            } catch (java.lang.Exception _exception) {
                responseMetadata.value = (com.amazonaws.fba_inventory.doc._2009_07_31.ResponseMetadata) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://fba-inventory.amazonaws.com/doc/2009-07-31/", "ResponseMetadata")), com.amazonaws.fba_inventory.doc._2009_07_31.ResponseMetadata.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
