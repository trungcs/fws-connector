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
 * FulfillmentItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazonaws.fba_inbound.doc._2007_05_10;


/**
 * Properties and identifiers for an item that could be
 *                             fulfilled by Amazon.  This does NOT imply
 * that the item has a 
 *                             offer for which it can be fulfilled, only
 * that it can be 
 *                             tracked by the Amazon Fulfillment Network.
 * An inactive item may
 *                             have quantity in the fulfillment center,
 * but will never be fulfilled.
 */
public class FulfillmentItem  implements java.io.Serializable {
    private java.lang.String ASIN;

    private com.amazonaws.fba_inbound.doc._2007_05_10.ItemCondition condition;

    private java.lang.String merchantSKU;

    private java.lang.String fulfillmentNetworkSKU;

    private boolean isActive;

    public FulfillmentItem() {
    }

    public FulfillmentItem(
           java.lang.String ASIN,
           com.amazonaws.fba_inbound.doc._2007_05_10.ItemCondition condition,
           java.lang.String merchantSKU,
           java.lang.String fulfillmentNetworkSKU,
           boolean isActive) {
           this.ASIN = ASIN;
           this.condition = condition;
           this.merchantSKU = merchantSKU;
           this.fulfillmentNetworkSKU = fulfillmentNetworkSKU;
           this.isActive = isActive;
    }


    /**
     * Gets the ASIN value for this FulfillmentItem.
     * 
     * @return ASIN
     */
    public java.lang.String getASIN() {
        return ASIN;
    }


    /**
     * Sets the ASIN value for this FulfillmentItem.
     * 
     * @param ASIN
     */
    public void setASIN(java.lang.String ASIN) {
        this.ASIN = ASIN;
    }


    /**
     * Gets the condition value for this FulfillmentItem.
     * 
     * @return condition
     */
    public com.amazonaws.fba_inbound.doc._2007_05_10.ItemCondition getCondition() {
        return condition;
    }


    /**
     * Sets the condition value for this FulfillmentItem.
     * 
     * @param condition
     */
    public void setCondition(com.amazonaws.fba_inbound.doc._2007_05_10.ItemCondition condition) {
        this.condition = condition;
    }


    /**
     * Gets the merchantSKU value for this FulfillmentItem.
     * 
     * @return merchantSKU
     */
    public java.lang.String getMerchantSKU() {
        return merchantSKU;
    }


    /**
     * Sets the merchantSKU value for this FulfillmentItem.
     * 
     * @param merchantSKU
     */
    public void setMerchantSKU(java.lang.String merchantSKU) {
        this.merchantSKU = merchantSKU;
    }


    /**
     * Gets the fulfillmentNetworkSKU value for this FulfillmentItem.
     * 
     * @return fulfillmentNetworkSKU
     */
    public java.lang.String getFulfillmentNetworkSKU() {
        return fulfillmentNetworkSKU;
    }


    /**
     * Sets the fulfillmentNetworkSKU value for this FulfillmentItem.
     * 
     * @param fulfillmentNetworkSKU
     */
    public void setFulfillmentNetworkSKU(java.lang.String fulfillmentNetworkSKU) {
        this.fulfillmentNetworkSKU = fulfillmentNetworkSKU;
    }


    /**
     * Gets the isActive value for this FulfillmentItem.
     * 
     * @return isActive
     */
    public boolean isIsActive() {
        return isActive;
    }


    /**
     * Sets the isActive value for this FulfillmentItem.
     * 
     * @param isActive
     */
    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FulfillmentItem)) return false;
        FulfillmentItem other = (FulfillmentItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ASIN==null && other.getASIN()==null) || 
             (this.ASIN!=null &&
              this.ASIN.equals(other.getASIN()))) &&
            ((this.condition==null && other.getCondition()==null) || 
             (this.condition!=null &&
              this.condition.equals(other.getCondition()))) &&
            ((this.merchantSKU==null && other.getMerchantSKU()==null) || 
             (this.merchantSKU!=null &&
              this.merchantSKU.equals(other.getMerchantSKU()))) &&
            ((this.fulfillmentNetworkSKU==null && other.getFulfillmentNetworkSKU()==null) || 
             (this.fulfillmentNetworkSKU!=null &&
              this.fulfillmentNetworkSKU.equals(other.getFulfillmentNetworkSKU()))) &&
            this.isActive == other.isIsActive();
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
        if (getASIN() != null) {
            _hashCode += getASIN().hashCode();
        }
        if (getCondition() != null) {
            _hashCode += getCondition().hashCode();
        }
        if (getMerchantSKU() != null) {
            _hashCode += getMerchantSKU().hashCode();
        }
        if (getFulfillmentNetworkSKU() != null) {
            _hashCode += getFulfillmentNetworkSKU().hashCode();
        }
        _hashCode += (isIsActive() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FulfillmentItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "FulfillmentItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ASIN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ASIN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("condition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "Condition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ItemCondition"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantSKU");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "MerchantSKU"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fulfillmentNetworkSKU");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "FulfillmentNetworkSKU"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isActive");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "IsActive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
