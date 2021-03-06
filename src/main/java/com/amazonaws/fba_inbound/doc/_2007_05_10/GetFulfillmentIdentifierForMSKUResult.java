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
 * GetFulfillmentIdentifierForMSKUResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazonaws.fba_inbound.doc._2007_05_10;

public class GetFulfillmentIdentifierForMSKUResult  implements java.io.Serializable {
    private com.amazonaws.fba_inbound.doc._2007_05_10.FulfillmentItem[] fulfillmentItem;

    public GetFulfillmentIdentifierForMSKUResult() {
    }

    public GetFulfillmentIdentifierForMSKUResult(
           com.amazonaws.fba_inbound.doc._2007_05_10.FulfillmentItem[] fulfillmentItem) {
           this.fulfillmentItem = fulfillmentItem;
    }


    /**
     * Gets the fulfillmentItem value for this GetFulfillmentIdentifierForMSKUResult.
     * 
     * @return fulfillmentItem
     */
    public com.amazonaws.fba_inbound.doc._2007_05_10.FulfillmentItem[] getFulfillmentItem() {
        return fulfillmentItem;
    }


    /**
     * Sets the fulfillmentItem value for this GetFulfillmentIdentifierForMSKUResult.
     * 
     * @param fulfillmentItem
     */
    public void setFulfillmentItem(com.amazonaws.fba_inbound.doc._2007_05_10.FulfillmentItem[] fulfillmentItem) {
        this.fulfillmentItem = fulfillmentItem;
    }

    public com.amazonaws.fba_inbound.doc._2007_05_10.FulfillmentItem getFulfillmentItem(int i) {
        return this.fulfillmentItem[i];
    }

    public void setFulfillmentItem(int i, com.amazonaws.fba_inbound.doc._2007_05_10.FulfillmentItem _value) {
        this.fulfillmentItem[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetFulfillmentIdentifierForMSKUResult)) return false;
        GetFulfillmentIdentifierForMSKUResult other = (GetFulfillmentIdentifierForMSKUResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fulfillmentItem==null && other.getFulfillmentItem()==null) || 
             (this.fulfillmentItem!=null &&
              java.util.Arrays.equals(this.fulfillmentItem, other.getFulfillmentItem())));
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
        if (getFulfillmentItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFulfillmentItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFulfillmentItem(), i);
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
        new org.apache.axis.description.TypeDesc(GetFulfillmentIdentifierForMSKUResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", ">GetFulfillmentIdentifierForMSKUResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fulfillmentItem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "FulfillmentItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "FulfillmentItem"));
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
