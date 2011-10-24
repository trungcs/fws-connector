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
 * FulfillmentShipmentItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazonaws.fba_outbound.doc._2007_08_02;


/**
 * Represents an item included in a shipment.  
 * 
 *             MerchantFulfillmentOrderItemId should be used to relate
 * the shipped
 *             item to the ordered item.
 */
public class FulfillmentShipmentItem  implements java.io.Serializable {
    private java.lang.String merchantSKU;

    private java.lang.String merchantFulfillmentOrderItemId;

    private int quantity;

    private java.lang.Integer packageNumber;

    public FulfillmentShipmentItem() {
    }

    public FulfillmentShipmentItem(
           java.lang.String merchantSKU,
           java.lang.String merchantFulfillmentOrderItemId,
           int quantity,
           java.lang.Integer packageNumber) {
           this.merchantSKU = merchantSKU;
           this.merchantFulfillmentOrderItemId = merchantFulfillmentOrderItemId;
           this.quantity = quantity;
           this.packageNumber = packageNumber;
    }


    /**
     * Gets the merchantSKU value for this FulfillmentShipmentItem.
     * 
     * @return merchantSKU
     */
    public java.lang.String getMerchantSKU() {
        return merchantSKU;
    }


    /**
     * Sets the merchantSKU value for this FulfillmentShipmentItem.
     * 
     * @param merchantSKU
     */
    public void setMerchantSKU(java.lang.String merchantSKU) {
        this.merchantSKU = merchantSKU;
    }


    /**
     * Gets the merchantFulfillmentOrderItemId value for this FulfillmentShipmentItem.
     * 
     * @return merchantFulfillmentOrderItemId
     */
    public java.lang.String getMerchantFulfillmentOrderItemId() {
        return merchantFulfillmentOrderItemId;
    }


    /**
     * Sets the merchantFulfillmentOrderItemId value for this FulfillmentShipmentItem.
     * 
     * @param merchantFulfillmentOrderItemId
     */
    public void setMerchantFulfillmentOrderItemId(java.lang.String merchantFulfillmentOrderItemId) {
        this.merchantFulfillmentOrderItemId = merchantFulfillmentOrderItemId;
    }


    /**
     * Gets the quantity value for this FulfillmentShipmentItem.
     * 
     * @return quantity
     */
    public int getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this FulfillmentShipmentItem.
     * 
     * @param quantity
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the packageNumber value for this FulfillmentShipmentItem.
     * 
     * @return packageNumber
     */
    public java.lang.Integer getPackageNumber() {
        return packageNumber;
    }


    /**
     * Sets the packageNumber value for this FulfillmentShipmentItem.
     * 
     * @param packageNumber
     */
    public void setPackageNumber(java.lang.Integer packageNumber) {
        this.packageNumber = packageNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FulfillmentShipmentItem)) return false;
        FulfillmentShipmentItem other = (FulfillmentShipmentItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.merchantSKU==null && other.getMerchantSKU()==null) || 
             (this.merchantSKU!=null &&
              this.merchantSKU.equals(other.getMerchantSKU()))) &&
            ((this.merchantFulfillmentOrderItemId==null && other.getMerchantFulfillmentOrderItemId()==null) || 
             (this.merchantFulfillmentOrderItemId!=null &&
              this.merchantFulfillmentOrderItemId.equals(other.getMerchantFulfillmentOrderItemId()))) &&
            this.quantity == other.getQuantity() &&
            ((this.packageNumber==null && other.getPackageNumber()==null) || 
             (this.packageNumber!=null &&
              this.packageNumber.equals(other.getPackageNumber())));
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
        if (getMerchantSKU() != null) {
            _hashCode += getMerchantSKU().hashCode();
        }
        if (getMerchantFulfillmentOrderItemId() != null) {
            _hashCode += getMerchantFulfillmentOrderItemId().hashCode();
        }
        _hashCode += getQuantity();
        if (getPackageNumber() != null) {
            _hashCode += getPackageNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FulfillmentShipmentItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "FulfillmentShipmentItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantSKU");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "MerchantSKU"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantFulfillmentOrderItemId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "MerchantFulfillmentOrderItemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "Quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "PackageNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
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
