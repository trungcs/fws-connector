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
 * ShipmentPreview.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazonaws.fba_inbound.doc._2007_05_10;


/**
 * A collection of items to be sent to a specific
 *                             Amazon Fulfillment Center.
 */
public class ShipmentPreview  implements java.io.Serializable {
    private java.lang.String shipmentId;

    private java.lang.String destinationFulfillmentCenter;

    private com.amazonaws.fba_inbound.doc._2007_05_10.Address shipToAddress;

    private com.amazonaws.fba_inbound.doc._2007_05_10.LabelPrepType labelPrepType;

    private com.amazonaws.fba_inbound.doc._2007_05_10.MerchantSKUQuantityItem[] merchantSKUQuantityItem;

    public ShipmentPreview() {
    }

    public ShipmentPreview(
           java.lang.String shipmentId,
           java.lang.String destinationFulfillmentCenter,
           com.amazonaws.fba_inbound.doc._2007_05_10.Address shipToAddress,
           com.amazonaws.fba_inbound.doc._2007_05_10.LabelPrepType labelPrepType,
           com.amazonaws.fba_inbound.doc._2007_05_10.MerchantSKUQuantityItem[] merchantSKUQuantityItem) {
           this.shipmentId = shipmentId;
           this.destinationFulfillmentCenter = destinationFulfillmentCenter;
           this.shipToAddress = shipToAddress;
           this.labelPrepType = labelPrepType;
           this.merchantSKUQuantityItem = merchantSKUQuantityItem;
    }


    /**
     * Gets the shipmentId value for this ShipmentPreview.
     * 
     * @return shipmentId
     */
    public java.lang.String getShipmentId() {
        return shipmentId;
    }


    /**
     * Sets the shipmentId value for this ShipmentPreview.
     * 
     * @param shipmentId
     */
    public void setShipmentId(java.lang.String shipmentId) {
        this.shipmentId = shipmentId;
    }


    /**
     * Gets the destinationFulfillmentCenter value for this ShipmentPreview.
     * 
     * @return destinationFulfillmentCenter
     */
    public java.lang.String getDestinationFulfillmentCenter() {
        return destinationFulfillmentCenter;
    }


    /**
     * Sets the destinationFulfillmentCenter value for this ShipmentPreview.
     * 
     * @param destinationFulfillmentCenter
     */
    public void setDestinationFulfillmentCenter(java.lang.String destinationFulfillmentCenter) {
        this.destinationFulfillmentCenter = destinationFulfillmentCenter;
    }


    /**
     * Gets the shipToAddress value for this ShipmentPreview.
     * 
     * @return shipToAddress
     */
    public com.amazonaws.fba_inbound.doc._2007_05_10.Address getShipToAddress() {
        return shipToAddress;
    }


    /**
     * Sets the shipToAddress value for this ShipmentPreview.
     * 
     * @param shipToAddress
     */
    public void setShipToAddress(com.amazonaws.fba_inbound.doc._2007_05_10.Address shipToAddress) {
        this.shipToAddress = shipToAddress;
    }


    /**
     * Gets the labelPrepType value for this ShipmentPreview.
     * 
     * @return labelPrepType
     */
    public com.amazonaws.fba_inbound.doc._2007_05_10.LabelPrepType getLabelPrepType() {
        return labelPrepType;
    }


    /**
     * Sets the labelPrepType value for this ShipmentPreview.
     * 
     * @param labelPrepType
     */
    public void setLabelPrepType(com.amazonaws.fba_inbound.doc._2007_05_10.LabelPrepType labelPrepType) {
        this.labelPrepType = labelPrepType;
    }


    /**
     * Gets the merchantSKUQuantityItem value for this ShipmentPreview.
     * 
     * @return merchantSKUQuantityItem
     */
    public com.amazonaws.fba_inbound.doc._2007_05_10.MerchantSKUQuantityItem[] getMerchantSKUQuantityItem() {
        return merchantSKUQuantityItem;
    }


    /**
     * Sets the merchantSKUQuantityItem value for this ShipmentPreview.
     * 
     * @param merchantSKUQuantityItem
     */
    public void setMerchantSKUQuantityItem(com.amazonaws.fba_inbound.doc._2007_05_10.MerchantSKUQuantityItem[] merchantSKUQuantityItem) {
        this.merchantSKUQuantityItem = merchantSKUQuantityItem;
    }

    public com.amazonaws.fba_inbound.doc._2007_05_10.MerchantSKUQuantityItem getMerchantSKUQuantityItem(int i) {
        return this.merchantSKUQuantityItem[i];
    }

    public void setMerchantSKUQuantityItem(int i, com.amazonaws.fba_inbound.doc._2007_05_10.MerchantSKUQuantityItem _value) {
        this.merchantSKUQuantityItem[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ShipmentPreview)) return false;
        ShipmentPreview other = (ShipmentPreview) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.shipmentId==null && other.getShipmentId()==null) || 
             (this.shipmentId!=null &&
              this.shipmentId.equals(other.getShipmentId()))) &&
            ((this.destinationFulfillmentCenter==null && other.getDestinationFulfillmentCenter()==null) || 
             (this.destinationFulfillmentCenter!=null &&
              this.destinationFulfillmentCenter.equals(other.getDestinationFulfillmentCenter()))) &&
            ((this.shipToAddress==null && other.getShipToAddress()==null) || 
             (this.shipToAddress!=null &&
              this.shipToAddress.equals(other.getShipToAddress()))) &&
            ((this.labelPrepType==null && other.getLabelPrepType()==null) || 
             (this.labelPrepType!=null &&
              this.labelPrepType.equals(other.getLabelPrepType()))) &&
            ((this.merchantSKUQuantityItem==null && other.getMerchantSKUQuantityItem()==null) || 
             (this.merchantSKUQuantityItem!=null &&
              java.util.Arrays.equals(this.merchantSKUQuantityItem, other.getMerchantSKUQuantityItem())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getShipmentId() != null) {
            _hashCode += getShipmentId().hashCode();
        }
        if (getDestinationFulfillmentCenter() != null) {
            _hashCode += getDestinationFulfillmentCenter().hashCode();
        }
        if (getShipToAddress() != null) {
            _hashCode += getShipToAddress().hashCode();
        }
        if (getLabelPrepType() != null) {
            _hashCode += getLabelPrepType().hashCode();
        }
        if (getMerchantSKUQuantityItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMerchantSKUQuantityItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMerchantSKUQuantityItem(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShipmentPreview.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ShipmentPreview"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ShipmentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationFulfillmentCenter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "DestinationFulfillmentCenter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipToAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ShipToAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "Address"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("labelPrepType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "LabelPrepType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "LabelPrepType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantSKUQuantityItem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "MerchantSKUQuantityItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "MerchantSKUQuantityItem"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
