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
 * FulfillmentPreviewItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazonaws.fba_outbound.doc._2007_08_02;


/**
 * The field "estimatedShippingWeight" refers to the item-level
 *             estimated shipping weight.  This is per item, not the
 * total
 *             for the quantity given.
 * 
 *             The field "ShippingWeightCalculationMethod" provides the
 * method used 
 *             to calculate shipping weight. It can use one of two methods:
 * *Package 
 *             *Dimensional
 */
public class FulfillmentPreviewItem  implements java.io.Serializable {
    private java.lang.String merchantSKU;

    private int quantity;

    private java.lang.String merchantFulfillmentOrderItemId;

    private com.amazonaws.fba_outbound.doc._2007_08_02.Weight estimatedShippingWeight;

    private java.lang.String shippingWeightCalculationMethod;

    public FulfillmentPreviewItem() {
    }

    public FulfillmentPreviewItem(
           java.lang.String merchantSKU,
           int quantity,
           java.lang.String merchantFulfillmentOrderItemId,
           com.amazonaws.fba_outbound.doc._2007_08_02.Weight estimatedShippingWeight,
           java.lang.String shippingWeightCalculationMethod) {
           this.merchantSKU = merchantSKU;
           this.quantity = quantity;
           this.merchantFulfillmentOrderItemId = merchantFulfillmentOrderItemId;
           this.estimatedShippingWeight = estimatedShippingWeight;
           this.shippingWeightCalculationMethod = shippingWeightCalculationMethod;
    }


    /**
     * Gets the merchantSKU value for this FulfillmentPreviewItem.
     * 
     * @return merchantSKU
     */
    public java.lang.String getMerchantSKU() {
        return merchantSKU;
    }


    /**
     * Sets the merchantSKU value for this FulfillmentPreviewItem.
     * 
     * @param merchantSKU
     */
    public void setMerchantSKU(java.lang.String merchantSKU) {
        this.merchantSKU = merchantSKU;
    }


    /**
     * Gets the quantity value for this FulfillmentPreviewItem.
     * 
     * @return quantity
     */
    public int getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this FulfillmentPreviewItem.
     * 
     * @param quantity
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the merchantFulfillmentOrderItemId value for this FulfillmentPreviewItem.
     * 
     * @return merchantFulfillmentOrderItemId
     */
    public java.lang.String getMerchantFulfillmentOrderItemId() {
        return merchantFulfillmentOrderItemId;
    }


    /**
     * Sets the merchantFulfillmentOrderItemId value for this FulfillmentPreviewItem.
     * 
     * @param merchantFulfillmentOrderItemId
     */
    public void setMerchantFulfillmentOrderItemId(java.lang.String merchantFulfillmentOrderItemId) {
        this.merchantFulfillmentOrderItemId = merchantFulfillmentOrderItemId;
    }


    /**
     * Gets the estimatedShippingWeight value for this FulfillmentPreviewItem.
     * 
     * @return estimatedShippingWeight
     */
    public com.amazonaws.fba_outbound.doc._2007_08_02.Weight getEstimatedShippingWeight() {
        return estimatedShippingWeight;
    }


    /**
     * Sets the estimatedShippingWeight value for this FulfillmentPreviewItem.
     * 
     * @param estimatedShippingWeight
     */
    public void setEstimatedShippingWeight(com.amazonaws.fba_outbound.doc._2007_08_02.Weight estimatedShippingWeight) {
        this.estimatedShippingWeight = estimatedShippingWeight;
    }


    /**
     * Gets the shippingWeightCalculationMethod value for this FulfillmentPreviewItem.
     * 
     * @return shippingWeightCalculationMethod
     */
    public java.lang.String getShippingWeightCalculationMethod() {
        return shippingWeightCalculationMethod;
    }


    /**
     * Sets the shippingWeightCalculationMethod value for this FulfillmentPreviewItem.
     * 
     * @param shippingWeightCalculationMethod
     */
    public void setShippingWeightCalculationMethod(java.lang.String shippingWeightCalculationMethod) {
        this.shippingWeightCalculationMethod = shippingWeightCalculationMethod;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FulfillmentPreviewItem)) return false;
        FulfillmentPreviewItem other = (FulfillmentPreviewItem) obj;
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
            this.quantity == other.getQuantity() &&
            ((this.merchantFulfillmentOrderItemId==null && other.getMerchantFulfillmentOrderItemId()==null) || 
             (this.merchantFulfillmentOrderItemId!=null &&
              this.merchantFulfillmentOrderItemId.equals(other.getMerchantFulfillmentOrderItemId()))) &&
            ((this.estimatedShippingWeight==null && other.getEstimatedShippingWeight()==null) || 
             (this.estimatedShippingWeight!=null &&
              this.estimatedShippingWeight.equals(other.getEstimatedShippingWeight()))) &&
            ((this.shippingWeightCalculationMethod==null && other.getShippingWeightCalculationMethod()==null) || 
             (this.shippingWeightCalculationMethod!=null &&
              this.shippingWeightCalculationMethod.equals(other.getShippingWeightCalculationMethod())));
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
        _hashCode += getQuantity();
        if (getMerchantFulfillmentOrderItemId() != null) {
            _hashCode += getMerchantFulfillmentOrderItemId().hashCode();
        }
        if (getEstimatedShippingWeight() != null) {
            _hashCode += getEstimatedShippingWeight().hashCode();
        }
        if (getShippingWeightCalculationMethod() != null) {
            _hashCode += getShippingWeightCalculationMethod().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FulfillmentPreviewItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "FulfillmentPreviewItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantSKU");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "MerchantSKU"));
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
        elemField.setFieldName("merchantFulfillmentOrderItemId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "MerchantFulfillmentOrderItemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedShippingWeight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "EstimatedShippingWeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "Weight"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingWeightCalculationMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "ShippingWeightCalculationMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
