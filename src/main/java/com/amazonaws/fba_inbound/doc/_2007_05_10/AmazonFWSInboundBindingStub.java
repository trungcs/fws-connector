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
 * AmazonFWSInboundBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazonaws.fba_inbound.doc._2007_05_10;

public class AmazonFWSInboundBindingStub extends org.apache.axis.client.Stub implements com.amazonaws.fba_inbound.doc._2007_05_10.AmazonFWSInboundPortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[18];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetServiceStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "GetServiceStatusResult"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", ">GetServiceStatusResult"), com.amazonaws.fba_inbound.doc._2007_05_10.GetServiceStatusResult.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ResponseMetadata"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", ">ResponseMetadata"), com.amazonaws.fba_inbound.doc._2007_05_10.ResponseMetadata.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetFulfillmentIdentifier");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "MerchantItem"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "MerchantItem"), com.amazonaws.fba_inbound.doc._2007_05_10.MerchantItem[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "GetFulfillmentIdentifierResult"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", ">GetFulfillmentIdentifierResult"), com.amazonaws.fba_inbound.doc._2007_05_10.GetFulfillmentIdentifierResult.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ResponseMetadata"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", ">ResponseMetadata"), com.amazonaws.fba_inbound.doc._2007_05_10.ResponseMetadata.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetFulfillmentIdentifierForMSKU");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "MerchantSKU"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "GetFulfillmentIdentifierForMSKUResult"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", ">GetFulfillmentIdentifierForMSKUResult"), com.amazonaws.fba_inbound.doc._2007_05_10.GetFulfillmentIdentifierForMSKUResult.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ResponseMetadata"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", ">ResponseMetadata"), com.amazonaws.fba_inbound.doc._2007_05_10.ResponseMetadata.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ListAllFulfillmentItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "IncludeInactive"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), java.lang.Boolean.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "MaxCount"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ListAllFulfillmentItemsResult"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", ">ListAllFulfillmentItemsResult"), com.amazonaws.fba_inbound.doc._2007_05_10.ListAllFulfillmentItemsResult.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ResponseMetadata"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", ">ResponseMetadata"), com.amazonaws.fba_inbound.doc._2007_05_10.ResponseMetadata.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ListAllFulfillmentItemsByNextToken");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "NextToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ListAllFulfillmentItemsByNextTokenResult"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", ">ListAllFulfillmentItemsByNextTokenResult"), com.amazonaws.fba_inbound.doc._2007_05_10.ListAllFulfillmentItemsByNextTokenResult.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ResponseMetadata"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", ">ResponseMetadata"), com.amazonaws.fba_inbound.doc._2007_05_10.ResponseMetadata.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetFulfillmentItemByMSKU");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "MerchantSKU"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "GetFulfillmentItemByMSKUResult"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", ">GetFulfillmentItemByMSKUResult"), com.amazonaws.fba_inbound.doc._2007_05_10.GetFulfillmentItemByMSKUResult.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ResponseMetadata"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", ">ResponseMetadata"), com.amazonaws.fba_inbound.doc._2007_05_10.ResponseMetadata.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetFulfillmentItemByFNSKU");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "FulfillmentNetworkSKU"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "GetFulfillmentItemByFNSKUResult"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", ">GetFulfillmentItemByFNSKUResult"), com.amazonaws.fba_inbound.doc._2007_05_10.GetFulfillmentItemByFNSKUResult.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ResponseMetadata"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", ">ResponseMetadata"), com.amazonaws.fba_inbound.doc._2007_05_10.ResponseMetadata.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetInboundShipmentPreview");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ShipFromAddress"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "Address"), com.amazonaws.fba_inbound.doc._2007_05_10.Address.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "MerchantSKUQuantityItem"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "MerchantSKUQuantityItem"), com.amazonaws.fba_inbound.doc._2007_05_10.MerchantSKUQuantityItem[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "LabelPrepPreference"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "LabelPrepPreference"), com.amazonaws.fba_inbound.doc._2007_05_10.LabelPrepPreference.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "GetInboundShipmentPreviewResult"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", ">GetInboundShipmentPreviewResult"), com.amazonaws.fba_inbound.doc._2007_05_10.GetInboundShipmentPreviewResult.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ResponseMetadata"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", ">ResponseMetadata"), com.amazonaws.fba_inbound.doc._2007_05_10.ResponseMetadata.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PutInboundShipment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ShipmentId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ShipmentName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "DestinationFulfillmentCenter"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ShipFromAddress"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "Address"), com.amazonaws.fba_inbound.doc._2007_05_10.Address.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "LabelPrepPreference"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "LabelPrepPreference"), com.amazonaws.fba_inbound.doc._2007_05_10.LabelPrepPreference.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "MerchantSKUQuantityItem"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "MerchantSKUQuantityItem"), com.amazonaws.fba_inbound.doc._2007_05_10.MerchantSKUQuantityItem[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", ">ResponseMetadata"));
        oper.setReturnClass(com.amazonaws.fba_inbound.doc._2007_05_10.ResponseMetadata.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ResponseMetadata"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PutInboundShipmentItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ShipmentId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "MerchantSKUQuantityItem"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "MerchantSKUQuantityItem"), com.amazonaws.fba_inbound.doc._2007_05_10.MerchantSKUQuantityItem[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", ">ResponseMetadata"));
        oper.setReturnClass(com.amazonaws.fba_inbound.doc._2007_05_10.ResponseMetadata.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ResponseMetadata"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteInboundShipmentItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ShipmentId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "MerchantSKU"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", ">ResponseMetadata"));
        oper.setReturnClass(com.amazonaws.fba_inbound.doc._2007_05_10.ResponseMetadata.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ResponseMetadata"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ListInboundShipments");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ShipmentStatus"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ShipmentStatus"), com.amazonaws.fba_inbound.doc._2007_05_10.ShipmentStatus[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "CreatedBefore"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "CreatedAfter"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "MaxCount"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ListInboundShipmentsResult"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", ">ListInboundShipmentsResult"), com.amazonaws.fba_inbound.doc._2007_05_10.ListInboundShipmentsResult.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ResponseMetadata"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", ">ResponseMetadata"), com.amazonaws.fba_inbound.doc._2007_05_10.ResponseMetadata.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ListInboundShipmentsByNextToken");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "NextToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ListInboundShipmentsByNextTokenResult"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", ">ListInboundShipmentsByNextTokenResult"), com.amazonaws.fba_inbound.doc._2007_05_10.ListInboundShipmentsByNextTokenResult.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ResponseMetadata"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", ">ResponseMetadata"), com.amazonaws.fba_inbound.doc._2007_05_10.ResponseMetadata.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetInboundShipmentData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ShipmentId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "GetInboundShipmentDataResult"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", ">GetInboundShipmentDataResult"), com.amazonaws.fba_inbound.doc._2007_05_10.GetInboundShipmentDataResult.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ResponseMetadata"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", ">ResponseMetadata"), com.amazonaws.fba_inbound.doc._2007_05_10.ResponseMetadata.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PutInboundShipmentData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ShipmentId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ShipmentName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "DestinationFulfillmentCenter"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ShipFromAddress"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "Address"), com.amazonaws.fba_inbound.doc._2007_05_10.Address.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "LabelPrepPreference"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "LabelPrepPreference"), com.amazonaws.fba_inbound.doc._2007_05_10.LabelPrepPreference.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", ">ResponseMetadata"));
        oper.setReturnClass(com.amazonaws.fba_inbound.doc._2007_05_10.ResponseMetadata.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ResponseMetadata"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ListInboundShipmentItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ShipmentId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "MaxCount"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ListInboundShipmentItemsResult"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", ">ListInboundShipmentItemsResult"), com.amazonaws.fba_inbound.doc._2007_05_10.ListInboundShipmentItemsResult.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ResponseMetadata"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", ">ResponseMetadata"), com.amazonaws.fba_inbound.doc._2007_05_10.ResponseMetadata.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ListInboundShipmentItemsByNextToken");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "NextToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ListInboundShipmentItemsByNextTokenResult"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", ">ListInboundShipmentItemsByNextTokenResult"), com.amazonaws.fba_inbound.doc._2007_05_10.ListInboundShipmentItemsByNextTokenResult.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ResponseMetadata"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", ">ResponseMetadata"), com.amazonaws.fba_inbound.doc._2007_05_10.ResponseMetadata.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SetInboundShipmentStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ShipmentId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ShipmentStatus"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ShipmentStatus"), com.amazonaws.fba_inbound.doc._2007_05_10.ShipmentStatus.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", ">ResponseMetadata"));
        oper.setReturnClass(com.amazonaws.fba_inbound.doc._2007_05_10.ResponseMetadata.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ResponseMetadata"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

    }

    public AmazonFWSInboundBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public AmazonFWSInboundBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public AmazonFWSInboundBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", ">GetFulfillmentIdentifierForMSKUResult");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.fba_inbound.doc._2007_05_10.GetFulfillmentIdentifierForMSKUResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", ">GetFulfillmentIdentifierResult");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.fba_inbound.doc._2007_05_10.GetFulfillmentIdentifierResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", ">GetFulfillmentItemByFNSKUResult");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.fba_inbound.doc._2007_05_10.GetFulfillmentItemByFNSKUResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", ">GetFulfillmentItemByMSKUResult");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.fba_inbound.doc._2007_05_10.GetFulfillmentItemByMSKUResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", ">GetInboundShipmentDataResult");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.fba_inbound.doc._2007_05_10.GetInboundShipmentDataResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", ">GetInboundShipmentPreviewResult");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.fba_inbound.doc._2007_05_10.GetInboundShipmentPreviewResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", ">GetServiceStatusResult");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.fba_inbound.doc._2007_05_10.GetServiceStatusResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", ">ListAllFulfillmentItemsByNextTokenResult");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.fba_inbound.doc._2007_05_10.ListAllFulfillmentItemsByNextTokenResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", ">ListAllFulfillmentItemsResult");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.fba_inbound.doc._2007_05_10.ListAllFulfillmentItemsResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", ">ListInboundShipmentItemsByNextTokenResult");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.fba_inbound.doc._2007_05_10.ListInboundShipmentItemsByNextTokenResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", ">ListInboundShipmentItemsResult");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.fba_inbound.doc._2007_05_10.ListInboundShipmentItemsResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", ">ListInboundShipmentsByNextTokenResult");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.fba_inbound.doc._2007_05_10.ListInboundShipmentsByNextTokenResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", ">ListInboundShipmentsResult");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.fba_inbound.doc._2007_05_10.ListInboundShipmentsResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", ">ResponseMetadata");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.fba_inbound.doc._2007_05_10.ResponseMetadata.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "Address");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.fba_inbound.doc._2007_05_10.Address.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "FulfillmentItem");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.fba_inbound.doc._2007_05_10.FulfillmentItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "InboundShipmentData");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.fba_inbound.doc._2007_05_10.InboundShipmentData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "InboundShipmentItem");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.fba_inbound.doc._2007_05_10.InboundShipmentItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ItemCondition");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.fba_inbound.doc._2007_05_10.ItemCondition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "LabelPrepPreference");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.fba_inbound.doc._2007_05_10.LabelPrepPreference.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "LabelPrepType");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.fba_inbound.doc._2007_05_10.LabelPrepType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "MerchantItem");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.fba_inbound.doc._2007_05_10.MerchantItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "MerchantSKUQuantityItem");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.fba_inbound.doc._2007_05_10.MerchantSKUQuantityItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ShipmentPreview");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.fba_inbound.doc._2007_05_10.ShipmentPreview.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ShipmentStatus");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.fba_inbound.doc._2007_05_10.ShipmentStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

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

    public void getServiceStatus(com.amazonaws.fba_inbound.doc._2007_05_10.holders.GetServiceStatusResultHolder getServiceStatusResult, com.amazonaws.fba_inbound.doc._2007_05_10.holders.ResponseMetadataHolder responseMetadata) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "GetServiceStatus"));

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
                getServiceStatusResult.value = (com.amazonaws.fba_inbound.doc._2007_05_10.GetServiceStatusResult) _output.get(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "GetServiceStatusResult"));
            } catch (java.lang.Exception _exception) {
                getServiceStatusResult.value = (com.amazonaws.fba_inbound.doc._2007_05_10.GetServiceStatusResult) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "GetServiceStatusResult")), com.amazonaws.fba_inbound.doc._2007_05_10.GetServiceStatusResult.class);
            }
            try {
                responseMetadata.value = (com.amazonaws.fba_inbound.doc._2007_05_10.ResponseMetadata) _output.get(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ResponseMetadata"));
            } catch (java.lang.Exception _exception) {
                responseMetadata.value = (com.amazonaws.fba_inbound.doc._2007_05_10.ResponseMetadata) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ResponseMetadata")), com.amazonaws.fba_inbound.doc._2007_05_10.ResponseMetadata.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getFulfillmentIdentifier(com.amazonaws.fba_inbound.doc._2007_05_10.MerchantItem[] merchantItem, com.amazonaws.fba_inbound.doc._2007_05_10.holders.GetFulfillmentIdentifierResultHolder getFulfillmentIdentifierResult, com.amazonaws.fba_inbound.doc._2007_05_10.holders.ResponseMetadataHolder responseMetadata) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetFulfillmentIdentifier");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "GetFulfillmentIdentifier"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {merchantItem});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                getFulfillmentIdentifierResult.value = (com.amazonaws.fba_inbound.doc._2007_05_10.GetFulfillmentIdentifierResult) _output.get(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "GetFulfillmentIdentifierResult"));
            } catch (java.lang.Exception _exception) {
                getFulfillmentIdentifierResult.value = (com.amazonaws.fba_inbound.doc._2007_05_10.GetFulfillmentIdentifierResult) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "GetFulfillmentIdentifierResult")), com.amazonaws.fba_inbound.doc._2007_05_10.GetFulfillmentIdentifierResult.class);
            }
            try {
                responseMetadata.value = (com.amazonaws.fba_inbound.doc._2007_05_10.ResponseMetadata) _output.get(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ResponseMetadata"));
            } catch (java.lang.Exception _exception) {
                responseMetadata.value = (com.amazonaws.fba_inbound.doc._2007_05_10.ResponseMetadata) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ResponseMetadata")), com.amazonaws.fba_inbound.doc._2007_05_10.ResponseMetadata.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getFulfillmentIdentifierForMSKU(java.lang.String[] merchantSKU, com.amazonaws.fba_inbound.doc._2007_05_10.holders.GetFulfillmentIdentifierForMSKUResultHolder getFulfillmentIdentifierForMSKUResult, com.amazonaws.fba_inbound.doc._2007_05_10.holders.ResponseMetadataHolder responseMetadata) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetFulfillmentIdentifierForMSKU");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "GetFulfillmentIdentifierForMSKU"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {merchantSKU});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                getFulfillmentIdentifierForMSKUResult.value = (com.amazonaws.fba_inbound.doc._2007_05_10.GetFulfillmentIdentifierForMSKUResult) _output.get(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "GetFulfillmentIdentifierForMSKUResult"));
            } catch (java.lang.Exception _exception) {
                getFulfillmentIdentifierForMSKUResult.value = (com.amazonaws.fba_inbound.doc._2007_05_10.GetFulfillmentIdentifierForMSKUResult) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "GetFulfillmentIdentifierForMSKUResult")), com.amazonaws.fba_inbound.doc._2007_05_10.GetFulfillmentIdentifierForMSKUResult.class);
            }
            try {
                responseMetadata.value = (com.amazonaws.fba_inbound.doc._2007_05_10.ResponseMetadata) _output.get(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ResponseMetadata"));
            } catch (java.lang.Exception _exception) {
                responseMetadata.value = (com.amazonaws.fba_inbound.doc._2007_05_10.ResponseMetadata) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ResponseMetadata")), com.amazonaws.fba_inbound.doc._2007_05_10.ResponseMetadata.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void listAllFulfillmentItems(java.lang.Boolean includeInactive, java.lang.Integer maxCount, com.amazonaws.fba_inbound.doc._2007_05_10.holders.ListAllFulfillmentItemsResultHolder listAllFulfillmentItemsResult, com.amazonaws.fba_inbound.doc._2007_05_10.holders.ResponseMetadataHolder responseMetadata) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ListAllFulfillmentItems");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ListAllFulfillmentItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {includeInactive, maxCount});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                listAllFulfillmentItemsResult.value = (com.amazonaws.fba_inbound.doc._2007_05_10.ListAllFulfillmentItemsResult) _output.get(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ListAllFulfillmentItemsResult"));
            } catch (java.lang.Exception _exception) {
                listAllFulfillmentItemsResult.value = (com.amazonaws.fba_inbound.doc._2007_05_10.ListAllFulfillmentItemsResult) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ListAllFulfillmentItemsResult")), com.amazonaws.fba_inbound.doc._2007_05_10.ListAllFulfillmentItemsResult.class);
            }
            try {
                responseMetadata.value = (com.amazonaws.fba_inbound.doc._2007_05_10.ResponseMetadata) _output.get(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ResponseMetadata"));
            } catch (java.lang.Exception _exception) {
                responseMetadata.value = (com.amazonaws.fba_inbound.doc._2007_05_10.ResponseMetadata) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ResponseMetadata")), com.amazonaws.fba_inbound.doc._2007_05_10.ResponseMetadata.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void listAllFulfillmentItemsByNextToken(java.lang.String nextToken, com.amazonaws.fba_inbound.doc._2007_05_10.holders.ListAllFulfillmentItemsByNextTokenResultHolder listAllFulfillmentItemsByNextTokenResult, com.amazonaws.fba_inbound.doc._2007_05_10.holders.ResponseMetadataHolder responseMetadata) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ListAllFulfillmentItemsByNextToken");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ListAllFulfillmentItemsByNextToken"));

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
                listAllFulfillmentItemsByNextTokenResult.value = (com.amazonaws.fba_inbound.doc._2007_05_10.ListAllFulfillmentItemsByNextTokenResult) _output.get(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ListAllFulfillmentItemsByNextTokenResult"));
            } catch (java.lang.Exception _exception) {
                listAllFulfillmentItemsByNextTokenResult.value = (com.amazonaws.fba_inbound.doc._2007_05_10.ListAllFulfillmentItemsByNextTokenResult) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ListAllFulfillmentItemsByNextTokenResult")), com.amazonaws.fba_inbound.doc._2007_05_10.ListAllFulfillmentItemsByNextTokenResult.class);
            }
            try {
                responseMetadata.value = (com.amazonaws.fba_inbound.doc._2007_05_10.ResponseMetadata) _output.get(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ResponseMetadata"));
            } catch (java.lang.Exception _exception) {
                responseMetadata.value = (com.amazonaws.fba_inbound.doc._2007_05_10.ResponseMetadata) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ResponseMetadata")), com.amazonaws.fba_inbound.doc._2007_05_10.ResponseMetadata.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getFulfillmentItemByMSKU(java.lang.String[] merchantSKU, com.amazonaws.fba_inbound.doc._2007_05_10.holders.GetFulfillmentItemByMSKUResultHolder getFulfillmentItemByMSKUResult, com.amazonaws.fba_inbound.doc._2007_05_10.holders.ResponseMetadataHolder responseMetadata) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetFulfillmentItemByMSKU");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "GetFulfillmentItemByMSKU"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {merchantSKU});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                getFulfillmentItemByMSKUResult.value = (com.amazonaws.fba_inbound.doc._2007_05_10.GetFulfillmentItemByMSKUResult) _output.get(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "GetFulfillmentItemByMSKUResult"));
            } catch (java.lang.Exception _exception) {
                getFulfillmentItemByMSKUResult.value = (com.amazonaws.fba_inbound.doc._2007_05_10.GetFulfillmentItemByMSKUResult) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "GetFulfillmentItemByMSKUResult")), com.amazonaws.fba_inbound.doc._2007_05_10.GetFulfillmentItemByMSKUResult.class);
            }
            try {
                responseMetadata.value = (com.amazonaws.fba_inbound.doc._2007_05_10.ResponseMetadata) _output.get(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ResponseMetadata"));
            } catch (java.lang.Exception _exception) {
                responseMetadata.value = (com.amazonaws.fba_inbound.doc._2007_05_10.ResponseMetadata) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ResponseMetadata")), com.amazonaws.fba_inbound.doc._2007_05_10.ResponseMetadata.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getFulfillmentItemByFNSKU(java.lang.String[] fulfillmentNetworkSKU, com.amazonaws.fba_inbound.doc._2007_05_10.holders.GetFulfillmentItemByFNSKUResultHolder getFulfillmentItemByFNSKUResult, com.amazonaws.fba_inbound.doc._2007_05_10.holders.ResponseMetadataHolder responseMetadata) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetFulfillmentItemByFNSKU");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "GetFulfillmentItemByFNSKU"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fulfillmentNetworkSKU});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                getFulfillmentItemByFNSKUResult.value = (com.amazonaws.fba_inbound.doc._2007_05_10.GetFulfillmentItemByFNSKUResult) _output.get(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "GetFulfillmentItemByFNSKUResult"));
            } catch (java.lang.Exception _exception) {
                getFulfillmentItemByFNSKUResult.value = (com.amazonaws.fba_inbound.doc._2007_05_10.GetFulfillmentItemByFNSKUResult) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "GetFulfillmentItemByFNSKUResult")), com.amazonaws.fba_inbound.doc._2007_05_10.GetFulfillmentItemByFNSKUResult.class);
            }
            try {
                responseMetadata.value = (com.amazonaws.fba_inbound.doc._2007_05_10.ResponseMetadata) _output.get(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ResponseMetadata"));
            } catch (java.lang.Exception _exception) {
                responseMetadata.value = (com.amazonaws.fba_inbound.doc._2007_05_10.ResponseMetadata) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ResponseMetadata")), com.amazonaws.fba_inbound.doc._2007_05_10.ResponseMetadata.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getInboundShipmentPreview(com.amazonaws.fba_inbound.doc._2007_05_10.Address shipFromAddress, com.amazonaws.fba_inbound.doc._2007_05_10.MerchantSKUQuantityItem[] merchantSKUQuantityItem, com.amazonaws.fba_inbound.doc._2007_05_10.LabelPrepPreference labelPrepPreference, com.amazonaws.fba_inbound.doc._2007_05_10.holders.GetInboundShipmentPreviewResultHolder getInboundShipmentPreviewResult, com.amazonaws.fba_inbound.doc._2007_05_10.holders.ResponseMetadataHolder responseMetadata) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetInboundShipmentPreview");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "GetInboundShipmentPreview"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {shipFromAddress, merchantSKUQuantityItem, labelPrepPreference});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                getInboundShipmentPreviewResult.value = (com.amazonaws.fba_inbound.doc._2007_05_10.GetInboundShipmentPreviewResult) _output.get(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "GetInboundShipmentPreviewResult"));
            } catch (java.lang.Exception _exception) {
                getInboundShipmentPreviewResult.value = (com.amazonaws.fba_inbound.doc._2007_05_10.GetInboundShipmentPreviewResult) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "GetInboundShipmentPreviewResult")), com.amazonaws.fba_inbound.doc._2007_05_10.GetInboundShipmentPreviewResult.class);
            }
            try {
                responseMetadata.value = (com.amazonaws.fba_inbound.doc._2007_05_10.ResponseMetadata) _output.get(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ResponseMetadata"));
            } catch (java.lang.Exception _exception) {
                responseMetadata.value = (com.amazonaws.fba_inbound.doc._2007_05_10.ResponseMetadata) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ResponseMetadata")), com.amazonaws.fba_inbound.doc._2007_05_10.ResponseMetadata.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amazonaws.fba_inbound.doc._2007_05_10.ResponseMetadata putInboundShipment(java.lang.String shipmentId, java.lang.String shipmentName, java.lang.String destinationFulfillmentCenter, com.amazonaws.fba_inbound.doc._2007_05_10.Address shipFromAddress, com.amazonaws.fba_inbound.doc._2007_05_10.LabelPrepPreference labelPrepPreference, com.amazonaws.fba_inbound.doc._2007_05_10.MerchantSKUQuantityItem[] merchantSKUQuantityItem) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("PutInboundShipment");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "PutInboundShipment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {shipmentId, shipmentName, destinationFulfillmentCenter, shipFromAddress, labelPrepPreference, merchantSKUQuantityItem});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amazonaws.fba_inbound.doc._2007_05_10.ResponseMetadata) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amazonaws.fba_inbound.doc._2007_05_10.ResponseMetadata) org.apache.axis.utils.JavaUtils.convert(_resp, com.amazonaws.fba_inbound.doc._2007_05_10.ResponseMetadata.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amazonaws.fba_inbound.doc._2007_05_10.ResponseMetadata putInboundShipmentItems(java.lang.String shipmentId, com.amazonaws.fba_inbound.doc._2007_05_10.MerchantSKUQuantityItem[] merchantSKUQuantityItem) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("PutInboundShipmentItems");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "PutInboundShipmentItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {shipmentId, merchantSKUQuantityItem});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amazonaws.fba_inbound.doc._2007_05_10.ResponseMetadata) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amazonaws.fba_inbound.doc._2007_05_10.ResponseMetadata) org.apache.axis.utils.JavaUtils.convert(_resp, com.amazonaws.fba_inbound.doc._2007_05_10.ResponseMetadata.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amazonaws.fba_inbound.doc._2007_05_10.ResponseMetadata deleteInboundShipmentItems(java.lang.String shipmentId, java.lang.String[] merchantSKU) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("DeleteInboundShipmentItems");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "DeleteInboundShipmentItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {shipmentId, merchantSKU});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amazonaws.fba_inbound.doc._2007_05_10.ResponseMetadata) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amazonaws.fba_inbound.doc._2007_05_10.ResponseMetadata) org.apache.axis.utils.JavaUtils.convert(_resp, com.amazonaws.fba_inbound.doc._2007_05_10.ResponseMetadata.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void listInboundShipments(com.amazonaws.fba_inbound.doc._2007_05_10.ShipmentStatus[] shipmentStatus, java.util.Calendar createdBefore, java.util.Calendar createdAfter, java.lang.Integer maxCount, com.amazonaws.fba_inbound.doc._2007_05_10.holders.ListInboundShipmentsResultHolder listInboundShipmentsResult, com.amazonaws.fba_inbound.doc._2007_05_10.holders.ResponseMetadataHolder responseMetadata) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ListInboundShipments");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ListInboundShipments"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {shipmentStatus, createdBefore, createdAfter, maxCount});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                listInboundShipmentsResult.value = (com.amazonaws.fba_inbound.doc._2007_05_10.ListInboundShipmentsResult) _output.get(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ListInboundShipmentsResult"));
            } catch (java.lang.Exception _exception) {
                listInboundShipmentsResult.value = (com.amazonaws.fba_inbound.doc._2007_05_10.ListInboundShipmentsResult) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ListInboundShipmentsResult")), com.amazonaws.fba_inbound.doc._2007_05_10.ListInboundShipmentsResult.class);
            }
            try {
                responseMetadata.value = (com.amazonaws.fba_inbound.doc._2007_05_10.ResponseMetadata) _output.get(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ResponseMetadata"));
            } catch (java.lang.Exception _exception) {
                responseMetadata.value = (com.amazonaws.fba_inbound.doc._2007_05_10.ResponseMetadata) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ResponseMetadata")), com.amazonaws.fba_inbound.doc._2007_05_10.ResponseMetadata.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void listInboundShipmentsByNextToken(java.lang.String nextToken, com.amazonaws.fba_inbound.doc._2007_05_10.holders.ListInboundShipmentsByNextTokenResultHolder listInboundShipmentsByNextTokenResult, com.amazonaws.fba_inbound.doc._2007_05_10.holders.ResponseMetadataHolder responseMetadata) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ListInboundShipmentsByNextToken");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ListInboundShipmentsByNextToken"));

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
                listInboundShipmentsByNextTokenResult.value = (com.amazonaws.fba_inbound.doc._2007_05_10.ListInboundShipmentsByNextTokenResult) _output.get(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ListInboundShipmentsByNextTokenResult"));
            } catch (java.lang.Exception _exception) {
                listInboundShipmentsByNextTokenResult.value = (com.amazonaws.fba_inbound.doc._2007_05_10.ListInboundShipmentsByNextTokenResult) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ListInboundShipmentsByNextTokenResult")), com.amazonaws.fba_inbound.doc._2007_05_10.ListInboundShipmentsByNextTokenResult.class);
            }
            try {
                responseMetadata.value = (com.amazonaws.fba_inbound.doc._2007_05_10.ResponseMetadata) _output.get(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ResponseMetadata"));
            } catch (java.lang.Exception _exception) {
                responseMetadata.value = (com.amazonaws.fba_inbound.doc._2007_05_10.ResponseMetadata) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ResponseMetadata")), com.amazonaws.fba_inbound.doc._2007_05_10.ResponseMetadata.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getInboundShipmentData(java.lang.String shipmentId, com.amazonaws.fba_inbound.doc._2007_05_10.holders.GetInboundShipmentDataResultHolder getInboundShipmentDataResult, com.amazonaws.fba_inbound.doc._2007_05_10.holders.ResponseMetadataHolder responseMetadata) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetInboundShipmentData");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "GetInboundShipmentData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {shipmentId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                getInboundShipmentDataResult.value = (com.amazonaws.fba_inbound.doc._2007_05_10.GetInboundShipmentDataResult) _output.get(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "GetInboundShipmentDataResult"));
            } catch (java.lang.Exception _exception) {
                getInboundShipmentDataResult.value = (com.amazonaws.fba_inbound.doc._2007_05_10.GetInboundShipmentDataResult) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "GetInboundShipmentDataResult")), com.amazonaws.fba_inbound.doc._2007_05_10.GetInboundShipmentDataResult.class);
            }
            try {
                responseMetadata.value = (com.amazonaws.fba_inbound.doc._2007_05_10.ResponseMetadata) _output.get(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ResponseMetadata"));
            } catch (java.lang.Exception _exception) {
                responseMetadata.value = (com.amazonaws.fba_inbound.doc._2007_05_10.ResponseMetadata) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ResponseMetadata")), com.amazonaws.fba_inbound.doc._2007_05_10.ResponseMetadata.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amazonaws.fba_inbound.doc._2007_05_10.ResponseMetadata putInboundShipmentData(java.lang.String shipmentId, java.lang.String shipmentName, java.lang.String destinationFulfillmentCenter, com.amazonaws.fba_inbound.doc._2007_05_10.Address shipFromAddress, com.amazonaws.fba_inbound.doc._2007_05_10.LabelPrepPreference labelPrepPreference) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("PutInboundShipmentData");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "PutInboundShipmentData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {shipmentId, shipmentName, destinationFulfillmentCenter, shipFromAddress, labelPrepPreference});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amazonaws.fba_inbound.doc._2007_05_10.ResponseMetadata) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amazonaws.fba_inbound.doc._2007_05_10.ResponseMetadata) org.apache.axis.utils.JavaUtils.convert(_resp, com.amazonaws.fba_inbound.doc._2007_05_10.ResponseMetadata.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void listInboundShipmentItems(java.lang.String shipmentId, java.lang.Integer maxCount, com.amazonaws.fba_inbound.doc._2007_05_10.holders.ListInboundShipmentItemsResultHolder listInboundShipmentItemsResult, com.amazonaws.fba_inbound.doc._2007_05_10.holders.ResponseMetadataHolder responseMetadata) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ListInboundShipmentItems");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ListInboundShipmentItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {shipmentId, maxCount});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                listInboundShipmentItemsResult.value = (com.amazonaws.fba_inbound.doc._2007_05_10.ListInboundShipmentItemsResult) _output.get(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ListInboundShipmentItemsResult"));
            } catch (java.lang.Exception _exception) {
                listInboundShipmentItemsResult.value = (com.amazonaws.fba_inbound.doc._2007_05_10.ListInboundShipmentItemsResult) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ListInboundShipmentItemsResult")), com.amazonaws.fba_inbound.doc._2007_05_10.ListInboundShipmentItemsResult.class);
            }
            try {
                responseMetadata.value = (com.amazonaws.fba_inbound.doc._2007_05_10.ResponseMetadata) _output.get(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ResponseMetadata"));
            } catch (java.lang.Exception _exception) {
                responseMetadata.value = (com.amazonaws.fba_inbound.doc._2007_05_10.ResponseMetadata) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ResponseMetadata")), com.amazonaws.fba_inbound.doc._2007_05_10.ResponseMetadata.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void listInboundShipmentItemsByNextToken(java.lang.String nextToken, com.amazonaws.fba_inbound.doc._2007_05_10.holders.ListInboundShipmentItemsByNextTokenResultHolder listInboundShipmentItemsByNextTokenResult, com.amazonaws.fba_inbound.doc._2007_05_10.holders.ResponseMetadataHolder responseMetadata) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ListInboundShipmentItemsByNextToken");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ListInboundShipmentItemsByNextToken"));

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
                listInboundShipmentItemsByNextTokenResult.value = (com.amazonaws.fba_inbound.doc._2007_05_10.ListInboundShipmentItemsByNextTokenResult) _output.get(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ListInboundShipmentItemsByNextTokenResult"));
            } catch (java.lang.Exception _exception) {
                listInboundShipmentItemsByNextTokenResult.value = (com.amazonaws.fba_inbound.doc._2007_05_10.ListInboundShipmentItemsByNextTokenResult) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ListInboundShipmentItemsByNextTokenResult")), com.amazonaws.fba_inbound.doc._2007_05_10.ListInboundShipmentItemsByNextTokenResult.class);
            }
            try {
                responseMetadata.value = (com.amazonaws.fba_inbound.doc._2007_05_10.ResponseMetadata) _output.get(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ResponseMetadata"));
            } catch (java.lang.Exception _exception) {
                responseMetadata.value = (com.amazonaws.fba_inbound.doc._2007_05_10.ResponseMetadata) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ResponseMetadata")), com.amazonaws.fba_inbound.doc._2007_05_10.ResponseMetadata.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amazonaws.fba_inbound.doc._2007_05_10.ResponseMetadata setInboundShipmentStatus(java.lang.String shipmentId, com.amazonaws.fba_inbound.doc._2007_05_10.ShipmentStatus shipmentStatus) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("SetInboundShipmentStatus");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "SetInboundShipmentStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {shipmentId, shipmentStatus});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amazonaws.fba_inbound.doc._2007_05_10.ResponseMetadata) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amazonaws.fba_inbound.doc._2007_05_10.ResponseMetadata) org.apache.axis.utils.JavaUtils.convert(_resp, com.amazonaws.fba_inbound.doc._2007_05_10.ResponseMetadata.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
