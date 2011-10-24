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
 * AmazonFBAOutboundBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazonaws.fba_outbound.doc._2007_08_02;

public class AmazonFBAOutboundBindingStub extends org.apache.axis.client.Stub implements com.amazonaws.fba_outbound.doc._2007_08_02.AmazonFBAOutboundPortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[7];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetServiceStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "GetServiceStatusResult"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", ">GetServiceStatusResult"), com.amazonaws.fba_outbound.doc._2007_08_02.GetServiceStatusResult.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "ResponseMetadata"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", ">ResponseMetadata"), com.amazonaws.fba_outbound.doc._2007_08_02.ResponseMetadata.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateFulfillmentOrder");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "MerchantFulfillmentOrderId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "DisplayableOrderId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "DisplayableOrderDateTime"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "DisplayableOrderComment"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "ShippingSpeedCategory"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "DestinationAddress"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "Address"), com.amazonaws.fba_outbound.doc._2007_08_02.Address.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "FulfillmentPolicy"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "FulfillmentMethod"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "NotificationEmailList"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "Item"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "CreateFulfillmentOrderItem"), com.amazonaws.fba_outbound.doc._2007_08_02.CreateFulfillmentOrderItem[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", ">ResponseMetadata"));
        oper.setReturnClass(com.amazonaws.fba_outbound.doc._2007_08_02.ResponseMetadata.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "ResponseMetadata"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CancelFulfillmentOrder");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "MerchantFulfillmentOrderId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", ">ResponseMetadata"));
        oper.setReturnClass(com.amazonaws.fba_outbound.doc._2007_08_02.ResponseMetadata.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "ResponseMetadata"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetFulfillmentOrder");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "MerchantFulfillmentOrderId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "GetFulfillmentOrderResult"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", ">GetFulfillmentOrderResult"), com.amazonaws.fba_outbound.doc._2007_08_02.GetFulfillmentOrderResult.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "ResponseMetadata"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", ">ResponseMetadata"), com.amazonaws.fba_outbound.doc._2007_08_02.ResponseMetadata.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ListAllFulfillmentOrders");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "NumberOfResultsRequested"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "QueryStartDateTime"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "FulfillmentMethod"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "ListAllFulfillmentOrdersResult"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", ">ListAllFulfillmentOrdersResult"), com.amazonaws.fba_outbound.doc._2007_08_02.ListAllFulfillmentOrdersResult.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "ResponseMetadata"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", ">ResponseMetadata"), com.amazonaws.fba_outbound.doc._2007_08_02.ResponseMetadata.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ListAllFulfillmentOrdersByNextToken");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "NextToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "ListAllFulfillmentOrdersByNextTokenResult"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", ">ListAllFulfillmentOrdersByNextTokenResult"), com.amazonaws.fba_outbound.doc._2007_08_02.ListAllFulfillmentOrdersByNextTokenResult.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "ResponseMetadata"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", ">ResponseMetadata"), com.amazonaws.fba_outbound.doc._2007_08_02.ResponseMetadata.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetFulfillmentPreview");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "Address"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "Address"), com.amazonaws.fba_outbound.doc._2007_08_02.Address.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "Items"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "GetFulfillmentPreviewItem"), com.amazonaws.fba_outbound.doc._2007_08_02.GetFulfillmentPreviewItem[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "ShippingSpeedCategories"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "GetFulfillmentPreviewResult"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", ">GetFulfillmentPreviewResult"), com.amazonaws.fba_outbound.doc._2007_08_02.GetFulfillmentPreviewResult.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "ResponseMetadata"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", ">ResponseMetadata"), com.amazonaws.fba_outbound.doc._2007_08_02.ResponseMetadata.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

    }

    public AmazonFBAOutboundBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public AmazonFBAOutboundBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public AmazonFBAOutboundBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", ">GetFulfillmentOrderResult");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.fba_outbound.doc._2007_08_02.GetFulfillmentOrderResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", ">GetFulfillmentPreviewResult");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.fba_outbound.doc._2007_08_02.GetFulfillmentPreviewResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", ">GetServiceStatusResult");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.fba_outbound.doc._2007_08_02.GetServiceStatusResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", ">ListAllFulfillmentOrdersByNextTokenResult");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.fba_outbound.doc._2007_08_02.ListAllFulfillmentOrdersByNextTokenResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", ">ListAllFulfillmentOrdersResult");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.fba_outbound.doc._2007_08_02.ListAllFulfillmentOrdersResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", ">ResponseMetadata");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.fba_outbound.doc._2007_08_02.ResponseMetadata.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "Address");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.fba_outbound.doc._2007_08_02.Address.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "CreateFulfillmentOrderItem");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.fba_outbound.doc._2007_08_02.CreateFulfillmentOrderItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "Currency");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.fba_outbound.doc._2007_08_02.Currency.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "Fee");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.fba_outbound.doc._2007_08_02.Fee.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "FulfillmentOrder");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.fba_outbound.doc._2007_08_02.FulfillmentOrder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "FulfillmentOrderItem");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.fba_outbound.doc._2007_08_02.FulfillmentOrderItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "FulfillmentOrderStatus");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.fba_outbound.doc._2007_08_02.FulfillmentOrderStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "FulfillmentPreview");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.fba_outbound.doc._2007_08_02.FulfillmentPreview.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "FulfillmentPreviewItem");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.fba_outbound.doc._2007_08_02.FulfillmentPreviewItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "FulfillmentPreviewShipment");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.fba_outbound.doc._2007_08_02.FulfillmentPreviewShipment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "FulfillmentShipment");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.fba_outbound.doc._2007_08_02.FulfillmentShipment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "FulfillmentShipmentItem");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.fba_outbound.doc._2007_08_02.FulfillmentShipmentItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "FulfillmentShipmentPackage");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.fba_outbound.doc._2007_08_02.FulfillmentShipmentPackage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "FulfillmentShipmentStatus");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.fba_outbound.doc._2007_08_02.FulfillmentShipmentStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "GetFulfillmentPreviewItem");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.fba_outbound.doc._2007_08_02.GetFulfillmentPreviewItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "UnfulfillablePreviewItem");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.fba_outbound.doc._2007_08_02.UnfulfillablePreviewItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "Weight");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.fba_outbound.doc._2007_08_02.Weight.class;
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

    public void getServiceStatus(com.amazonaws.fba_outbound.doc._2007_08_02.holders.GetServiceStatusResultHolder getServiceStatusResult, com.amazonaws.fba_outbound.doc._2007_08_02.holders.ResponseMetadataHolder responseMetadata) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "GetServiceStatus"));

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
                getServiceStatusResult.value = (com.amazonaws.fba_outbound.doc._2007_08_02.GetServiceStatusResult) _output.get(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "GetServiceStatusResult"));
            } catch (java.lang.Exception _exception) {
                getServiceStatusResult.value = (com.amazonaws.fba_outbound.doc._2007_08_02.GetServiceStatusResult) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "GetServiceStatusResult")), com.amazonaws.fba_outbound.doc._2007_08_02.GetServiceStatusResult.class);
            }
            try {
                responseMetadata.value = (com.amazonaws.fba_outbound.doc._2007_08_02.ResponseMetadata) _output.get(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "ResponseMetadata"));
            } catch (java.lang.Exception _exception) {
                responseMetadata.value = (com.amazonaws.fba_outbound.doc._2007_08_02.ResponseMetadata) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "ResponseMetadata")), com.amazonaws.fba_outbound.doc._2007_08_02.ResponseMetadata.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amazonaws.fba_outbound.doc._2007_08_02.ResponseMetadata createFulfillmentOrder(java.lang.String merchantFulfillmentOrderId, java.lang.String displayableOrderId, java.lang.String displayableOrderDateTime, java.lang.String displayableOrderComment, java.lang.String shippingSpeedCategory, com.amazonaws.fba_outbound.doc._2007_08_02.Address destinationAddress, java.lang.String fulfillmentPolicy, java.lang.String fulfillmentMethod, java.lang.String[] notificationEmailList, com.amazonaws.fba_outbound.doc._2007_08_02.CreateFulfillmentOrderItem[] item) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("CreateFulfillmentOrder");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "CreateFulfillmentOrder"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {merchantFulfillmentOrderId, displayableOrderId, displayableOrderDateTime, displayableOrderComment, shippingSpeedCategory, destinationAddress, fulfillmentPolicy, fulfillmentMethod, notificationEmailList, item});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amazonaws.fba_outbound.doc._2007_08_02.ResponseMetadata) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amazonaws.fba_outbound.doc._2007_08_02.ResponseMetadata) org.apache.axis.utils.JavaUtils.convert(_resp, com.amazonaws.fba_outbound.doc._2007_08_02.ResponseMetadata.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amazonaws.fba_outbound.doc._2007_08_02.ResponseMetadata cancelFulfillmentOrder(java.lang.String merchantFulfillmentOrderId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("CancelFulfillmentOrder");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "CancelFulfillmentOrder"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {merchantFulfillmentOrderId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amazonaws.fba_outbound.doc._2007_08_02.ResponseMetadata) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amazonaws.fba_outbound.doc._2007_08_02.ResponseMetadata) org.apache.axis.utils.JavaUtils.convert(_resp, com.amazonaws.fba_outbound.doc._2007_08_02.ResponseMetadata.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getFulfillmentOrder(java.lang.String merchantFulfillmentOrderId, com.amazonaws.fba_outbound.doc._2007_08_02.holders.GetFulfillmentOrderResultHolder getFulfillmentOrderResult, com.amazonaws.fba_outbound.doc._2007_08_02.holders.ResponseMetadataHolder responseMetadata) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetFulfillmentOrder");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "GetFulfillmentOrder"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {merchantFulfillmentOrderId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                getFulfillmentOrderResult.value = (com.amazonaws.fba_outbound.doc._2007_08_02.GetFulfillmentOrderResult) _output.get(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "GetFulfillmentOrderResult"));
            } catch (java.lang.Exception _exception) {
                getFulfillmentOrderResult.value = (com.amazonaws.fba_outbound.doc._2007_08_02.GetFulfillmentOrderResult) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "GetFulfillmentOrderResult")), com.amazonaws.fba_outbound.doc._2007_08_02.GetFulfillmentOrderResult.class);
            }
            try {
                responseMetadata.value = (com.amazonaws.fba_outbound.doc._2007_08_02.ResponseMetadata) _output.get(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "ResponseMetadata"));
            } catch (java.lang.Exception _exception) {
                responseMetadata.value = (com.amazonaws.fba_outbound.doc._2007_08_02.ResponseMetadata) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "ResponseMetadata")), com.amazonaws.fba_outbound.doc._2007_08_02.ResponseMetadata.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void listAllFulfillmentOrders(int numberOfResultsRequested, java.lang.String queryStartDateTime, java.lang.String[] fulfillmentMethod, com.amazonaws.fba_outbound.doc._2007_08_02.holders.ListAllFulfillmentOrdersResultHolder listAllFulfillmentOrdersResult, com.amazonaws.fba_outbound.doc._2007_08_02.holders.ResponseMetadataHolder responseMetadata) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ListAllFulfillmentOrders");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "ListAllFulfillmentOrders"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(numberOfResultsRequested), queryStartDateTime, fulfillmentMethod});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                listAllFulfillmentOrdersResult.value = (com.amazonaws.fba_outbound.doc._2007_08_02.ListAllFulfillmentOrdersResult) _output.get(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "ListAllFulfillmentOrdersResult"));
            } catch (java.lang.Exception _exception) {
                listAllFulfillmentOrdersResult.value = (com.amazonaws.fba_outbound.doc._2007_08_02.ListAllFulfillmentOrdersResult) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "ListAllFulfillmentOrdersResult")), com.amazonaws.fba_outbound.doc._2007_08_02.ListAllFulfillmentOrdersResult.class);
            }
            try {
                responseMetadata.value = (com.amazonaws.fba_outbound.doc._2007_08_02.ResponseMetadata) _output.get(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "ResponseMetadata"));
            } catch (java.lang.Exception _exception) {
                responseMetadata.value = (com.amazonaws.fba_outbound.doc._2007_08_02.ResponseMetadata) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "ResponseMetadata")), com.amazonaws.fba_outbound.doc._2007_08_02.ResponseMetadata.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void listAllFulfillmentOrdersByNextToken(java.lang.String nextToken, com.amazonaws.fba_outbound.doc._2007_08_02.holders.ListAllFulfillmentOrdersByNextTokenResultHolder listAllFulfillmentOrdersByNextTokenResult, com.amazonaws.fba_outbound.doc._2007_08_02.holders.ResponseMetadataHolder responseMetadata) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ListAllFulfillmentOrdersByNextToken");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "ListAllFulfillmentOrdersByNextToken"));

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
                listAllFulfillmentOrdersByNextTokenResult.value = (com.amazonaws.fba_outbound.doc._2007_08_02.ListAllFulfillmentOrdersByNextTokenResult) _output.get(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "ListAllFulfillmentOrdersByNextTokenResult"));
            } catch (java.lang.Exception _exception) {
                listAllFulfillmentOrdersByNextTokenResult.value = (com.amazonaws.fba_outbound.doc._2007_08_02.ListAllFulfillmentOrdersByNextTokenResult) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "ListAllFulfillmentOrdersByNextTokenResult")), com.amazonaws.fba_outbound.doc._2007_08_02.ListAllFulfillmentOrdersByNextTokenResult.class);
            }
            try {
                responseMetadata.value = (com.amazonaws.fba_outbound.doc._2007_08_02.ResponseMetadata) _output.get(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "ResponseMetadata"));
            } catch (java.lang.Exception _exception) {
                responseMetadata.value = (com.amazonaws.fba_outbound.doc._2007_08_02.ResponseMetadata) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "ResponseMetadata")), com.amazonaws.fba_outbound.doc._2007_08_02.ResponseMetadata.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getFulfillmentPreview(com.amazonaws.fba_outbound.doc._2007_08_02.Address address, com.amazonaws.fba_outbound.doc._2007_08_02.GetFulfillmentPreviewItem[] items, java.lang.String[] shippingSpeedCategories, com.amazonaws.fba_outbound.doc._2007_08_02.holders.GetFulfillmentPreviewResultHolder getFulfillmentPreviewResult, com.amazonaws.fba_outbound.doc._2007_08_02.holders.ResponseMetadataHolder responseMetadata) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetFulfillmentPreview");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "GetFulfillmentPreview"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {address, items, shippingSpeedCategories});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                getFulfillmentPreviewResult.value = (com.amazonaws.fba_outbound.doc._2007_08_02.GetFulfillmentPreviewResult) _output.get(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "GetFulfillmentPreviewResult"));
            } catch (java.lang.Exception _exception) {
                getFulfillmentPreviewResult.value = (com.amazonaws.fba_outbound.doc._2007_08_02.GetFulfillmentPreviewResult) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "GetFulfillmentPreviewResult")), com.amazonaws.fba_outbound.doc._2007_08_02.GetFulfillmentPreviewResult.class);
            }
            try {
                responseMetadata.value = (com.amazonaws.fba_outbound.doc._2007_08_02.ResponseMetadata) _output.get(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "ResponseMetadata"));
            } catch (java.lang.Exception _exception) {
                responseMetadata.value = (com.amazonaws.fba_outbound.doc._2007_08_02.ResponseMetadata) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "ResponseMetadata")), com.amazonaws.fba_outbound.doc._2007_08_02.ResponseMetadata.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
