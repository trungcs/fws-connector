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
 * UnfulfillablePreviewItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazonaws.fba_outbound.doc._2007_08_02;


/**
 * Holds item attributes and if available, reasons why the item was
 * unfulfillable.
 *             ItemUnfulfillableReasons - error codes associated at the
 * item level. 
 *                                Tries to explain why the item was unfulfillable.
 * currently state:
 *                                * InventoryUnavailable
 *                                * NoDeliveryOption
 *                                * UnknownDeliveryServiceError
 */
public class UnfulfillablePreviewItem  implements java.io.Serializable {
    private java.lang.String merchantSKU;

    private int quantity;

    private java.lang.String merchantFulfillmentOrderItemId;

    private java.lang.String[] itemUnfulfillableReasons;

    public UnfulfillablePreviewItem() {
    }

    public UnfulfillablePreviewItem(
           java.lang.String merchantSKU,
           int quantity,
           java.lang.String merchantFulfillmentOrderItemId,
           java.lang.String[] itemUnfulfillableReasons) {
           this.merchantSKU = merchantSKU;
           this.quantity = quantity;
           this.merchantFulfillmentOrderItemId = merchantFulfillmentOrderItemId;
           this.itemUnfulfillableReasons = itemUnfulfillableReasons;
    }


    /**
     * Gets the merchantSKU value for this UnfulfillablePreviewItem.
     * 
     * @return merchantSKU
     */
    public java.lang.String getMerchantSKU() {
        return merchantSKU;
    }


    /**
     * Sets the merchantSKU value for this UnfulfillablePreviewItem.
     * 
     * @param merchantSKU
     */
    public void setMerchantSKU(java.lang.String merchantSKU) {
        this.merchantSKU = merchantSKU;
    }


    /**
     * Gets the quantity value for this UnfulfillablePreviewItem.
     * 
     * @return quantity
     */
    public int getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this UnfulfillablePreviewItem.
     * 
     * @param quantity
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the merchantFulfillmentOrderItemId value for this UnfulfillablePreviewItem.
     * 
     * @return merchantFulfillmentOrderItemId
     */
    public java.lang.String getMerchantFulfillmentOrderItemId() {
        return merchantFulfillmentOrderItemId;
    }


    /**
     * Sets the merchantFulfillmentOrderItemId value for this UnfulfillablePreviewItem.
     * 
     * @param merchantFulfillmentOrderItemId
     */
    public void setMerchantFulfillmentOrderItemId(java.lang.String merchantFulfillmentOrderItemId) {
        this.merchantFulfillmentOrderItemId = merchantFulfillmentOrderItemId;
    }


    /**
     * Gets the itemUnfulfillableReasons value for this UnfulfillablePreviewItem.
     * 
     * @return itemUnfulfillableReasons
     */
    public java.lang.String[] getItemUnfulfillableReasons() {
        return itemUnfulfillableReasons;
    }


    /**
     * Sets the itemUnfulfillableReasons value for this UnfulfillablePreviewItem.
     * 
     * @param itemUnfulfillableReasons
     */
    public void setItemUnfulfillableReasons(java.lang.String[] itemUnfulfillableReasons) {
        this.itemUnfulfillableReasons = itemUnfulfillableReasons;
    }

    public java.lang.String getItemUnfulfillableReasons(int i) {
        return this.itemUnfulfillableReasons[i];
    }

    public void setItemUnfulfillableReasons(int i, java.lang.String _value) {
        this.itemUnfulfillableReasons[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UnfulfillablePreviewItem)) return false;
        UnfulfillablePreviewItem other = (UnfulfillablePreviewItem) obj;
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
            ((this.itemUnfulfillableReasons==null && other.getItemUnfulfillableReasons()==null) || 
             (this.itemUnfulfillableReasons!=null &&
              java.util.Arrays.equals(this.itemUnfulfillableReasons, other.getItemUnfulfillableReasons())));
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
        if (getItemUnfulfillableReasons() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemUnfulfillableReasons());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItemUnfulfillableReasons(), i);
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
        new org.apache.axis.description.TypeDesc(UnfulfillablePreviewItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "UnfulfillablePreviewItem"));
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
        elemField.setFieldName("itemUnfulfillableReasons");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "ItemUnfulfillableReasons"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
