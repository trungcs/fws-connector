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
 * ListUpdatedInventorySupplyResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazonaws.fba_inventory.doc._2009_07_31;

public class ListUpdatedInventorySupplyResult  implements java.io.Serializable {
    private java.lang.String nextToken;

    private boolean hasNext;

    private com.amazonaws.fba_inventory.doc._2009_07_31.MerchantSKUSupply[] merchantSKUSupply;

    public ListUpdatedInventorySupplyResult() {
    }

    public ListUpdatedInventorySupplyResult(
           java.lang.String nextToken,
           boolean hasNext,
           com.amazonaws.fba_inventory.doc._2009_07_31.MerchantSKUSupply[] merchantSKUSupply) {
           this.nextToken = nextToken;
           this.hasNext = hasNext;
           this.merchantSKUSupply = merchantSKUSupply;
    }


    /**
     * Gets the nextToken value for this ListUpdatedInventorySupplyResult.
     * 
     * @return nextToken
     */
    public java.lang.String getNextToken() {
        return nextToken;
    }


    /**
     * Sets the nextToken value for this ListUpdatedInventorySupplyResult.
     * 
     * @param nextToken
     */
    public void setNextToken(java.lang.String nextToken) {
        this.nextToken = nextToken;
    }


    /**
     * Gets the hasNext value for this ListUpdatedInventorySupplyResult.
     * 
     * @return hasNext
     */
    public boolean isHasNext() {
        return hasNext;
    }


    /**
     * Sets the hasNext value for this ListUpdatedInventorySupplyResult.
     * 
     * @param hasNext
     */
    public void setHasNext(boolean hasNext) {
        this.hasNext = hasNext;
    }


    /**
     * Gets the merchantSKUSupply value for this ListUpdatedInventorySupplyResult.
     * 
     * @return merchantSKUSupply
     */
    public com.amazonaws.fba_inventory.doc._2009_07_31.MerchantSKUSupply[] getMerchantSKUSupply() {
        return merchantSKUSupply;
    }


    /**
     * Sets the merchantSKUSupply value for this ListUpdatedInventorySupplyResult.
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
        if (!(obj instanceof ListUpdatedInventorySupplyResult)) return false;
        ListUpdatedInventorySupplyResult other = (ListUpdatedInventorySupplyResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nextToken==null && other.getNextToken()==null) || 
             (this.nextToken!=null &&
              this.nextToken.equals(other.getNextToken()))) &&
            this.hasNext == other.isHasNext() &&
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
        if (getNextToken() != null) {
            _hashCode += getNextToken().hashCode();
        }
        _hashCode += (isHasNext() ? Boolean.TRUE : Boolean.FALSE).hashCode();
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
        new org.apache.axis.description.TypeDesc(ListUpdatedInventorySupplyResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fba-inventory.amazonaws.com/doc/2009-07-31/", ">ListUpdatedInventorySupplyResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextToken");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-inventory.amazonaws.com/doc/2009-07-31/", "NextToken"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasNext");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-inventory.amazonaws.com/doc/2009-07-31/", "HasNext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
