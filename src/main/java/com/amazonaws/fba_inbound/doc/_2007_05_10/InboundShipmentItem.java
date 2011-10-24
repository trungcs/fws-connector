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
 * InboundShipmentItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazonaws.fba_inbound.doc._2007_05_10;


/**
 * Information about an item in a shipment.
 */
public class InboundShipmentItem  implements java.io.Serializable {
    private int quantityShipped;

    private int quantityReceived;

    private java.lang.String fulfillmentNetworkSKU;

    private java.lang.String merchantSKU;

    public InboundShipmentItem() {
    }

    public InboundShipmentItem(
           int quantityShipped,
           int quantityReceived,
           java.lang.String fulfillmentNetworkSKU,
           java.lang.String merchantSKU) {
           this.quantityShipped = quantityShipped;
           this.quantityReceived = quantityReceived;
           this.fulfillmentNetworkSKU = fulfillmentNetworkSKU;
           this.merchantSKU = merchantSKU;
    }


    /**
     * Gets the quantityShipped value for this InboundShipmentItem.
     * 
     * @return quantityShipped
     */
    public int getQuantityShipped() {
        return quantityShipped;
    }


    /**
     * Sets the quantityShipped value for this InboundShipmentItem.
     * 
     * @param quantityShipped
     */
    public void setQuantityShipped(int quantityShipped) {
        this.quantityShipped = quantityShipped;
    }


    /**
     * Gets the quantityReceived value for this InboundShipmentItem.
     * 
     * @return quantityReceived
     */
    public int getQuantityReceived() {
        return quantityReceived;
    }


    /**
     * Sets the quantityReceived value for this InboundShipmentItem.
     * 
     * @param quantityReceived
     */
    public void setQuantityReceived(int quantityReceived) {
        this.quantityReceived = quantityReceived;
    }


    /**
     * Gets the fulfillmentNetworkSKU value for this InboundShipmentItem.
     * 
     * @return fulfillmentNetworkSKU
     */
    public java.lang.String getFulfillmentNetworkSKU() {
        return fulfillmentNetworkSKU;
    }


    /**
     * Sets the fulfillmentNetworkSKU value for this InboundShipmentItem.
     * 
     * @param fulfillmentNetworkSKU
     */
    public void setFulfillmentNetworkSKU(java.lang.String fulfillmentNetworkSKU) {
        this.fulfillmentNetworkSKU = fulfillmentNetworkSKU;
    }


    /**
     * Gets the merchantSKU value for this InboundShipmentItem.
     * 
     * @return merchantSKU
     */
    public java.lang.String getMerchantSKU() {
        return merchantSKU;
    }


    /**
     * Sets the merchantSKU value for this InboundShipmentItem.
     * 
     * @param merchantSKU
     */
    public void setMerchantSKU(java.lang.String merchantSKU) {
        this.merchantSKU = merchantSKU;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InboundShipmentItem)) return false;
        InboundShipmentItem other = (InboundShipmentItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.quantityShipped == other.getQuantityShipped() &&
            this.quantityReceived == other.getQuantityReceived() &&
            ((this.fulfillmentNetworkSKU==null && other.getFulfillmentNetworkSKU()==null) || 
             (this.fulfillmentNetworkSKU!=null &&
              this.fulfillmentNetworkSKU.equals(other.getFulfillmentNetworkSKU()))) &&
            ((this.merchantSKU==null && other.getMerchantSKU()==null) || 
             (this.merchantSKU!=null &&
              this.merchantSKU.equals(other.getMerchantSKU())));
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
        _hashCode += getQuantityShipped();
        _hashCode += getQuantityReceived();
        if (getFulfillmentNetworkSKU() != null) {
            _hashCode += getFulfillmentNetworkSKU().hashCode();
        }
        if (getMerchantSKU() != null) {
            _hashCode += getMerchantSKU().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InboundShipmentItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "InboundShipmentItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityShipped");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "QuantityShipped"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityReceived");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "QuantityReceived"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fulfillmentNetworkSKU");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "FulfillmentNetworkSKU"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantSKU");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "MerchantSKU"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
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
