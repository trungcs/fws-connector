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
 * GetInventorySupplyResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazonaws.fba_inventory.doc._2009_07_31;

public class GetInventorySupplyResult  implements java.io.Serializable {
    private com.amazonaws.fba_inventory.doc._2009_07_31.MerchantSKUSupply[] merchantSKUSupply;

    public GetInventorySupplyResult() {
    }

    public GetInventorySupplyResult(
           com.amazonaws.fba_inventory.doc._2009_07_31.MerchantSKUSupply[] merchantSKUSupply) {
           this.merchantSKUSupply = merchantSKUSupply;
    }


    /**
     * Gets the merchantSKUSupply value for this GetInventorySupplyResult.
     * 
     * @return merchantSKUSupply
     */
    public com.amazonaws.fba_inventory.doc._2009_07_31.MerchantSKUSupply[] getMerchantSKUSupply() {
        return merchantSKUSupply;
    }


    /**
     * Sets the merchantSKUSupply value for this GetInventorySupplyResult.
     * 
     * @param merchantSKUSupply
     */
    public void setMerchantSKUSupply(com.amazonaws.fba_inventory.doc._2009_07_31.MerchantSKUSupply[] merchantSKUSupply) {
        this.merchantSKUSupply = merchantSKUSupply;
    }

    public com.amazonaws.fba_inventory.doc._2009_07_31.MerchantSKUSupply getMerchantSKUSupply(int i) {
        return this.merchantSKUSupply[i];
    }

    public void setMerchantSKUSupply(int i, com.amazonaws.fba_inventory.doc._2009_07_31.MerchantSKUSupply _value) {
        this.merchantSKUSupply[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetInventorySupplyResult)) return false;
        GetInventorySupplyResult other = (GetInventorySupplyResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.merchantSKUSupply==null && other.getMerchantSKUSupply()==null) || 
             (this.merchantSKUSupply!=null &&
              java.util.Arrays.equals(this.merchantSKUSupply, other.getMerchantSKUSupply())));
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
        if (getMerchantSKUSupply() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMerchantSKUSupply());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMerchantSKUSupply(), i);
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
        new org.apache.axis.description.TypeDesc(GetInventorySupplyResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fba-inventory.amazonaws.com/doc/2009-07-31/", ">GetInventorySupplyResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantSKUSupply");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-inventory.amazonaws.com/doc/2009-07-31/", "MerchantSKUSupply"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fba-inventory.amazonaws.com/doc/2009-07-31/", "MerchantSKUSupply"));
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
