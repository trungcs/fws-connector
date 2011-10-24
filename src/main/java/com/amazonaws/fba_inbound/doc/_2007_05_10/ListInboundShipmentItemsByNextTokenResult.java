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
 * ListInboundShipmentItemsByNextTokenResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazonaws.fba_inbound.doc._2007_05_10;

public class ListInboundShipmentItemsByNextTokenResult  implements java.io.Serializable {
    private java.lang.String nextToken;

    private boolean hasNext;

    private com.amazonaws.fba_inbound.doc._2007_05_10.InboundShipmentItem[] shipmentItem;

    public ListInboundShipmentItemsByNextTokenResult() {
    }

    public ListInboundShipmentItemsByNextTokenResult(
           java.lang.String nextToken,
           boolean hasNext,
           com.amazonaws.fba_inbound.doc._2007_05_10.InboundShipmentItem[] shipmentItem) {
           this.nextToken = nextToken;
           this.hasNext = hasNext;
           this.shipmentItem = shipmentItem;
    }


    /**
     * Gets the nextToken value for this ListInboundShipmentItemsByNextTokenResult.
     * 
     * @return nextToken
     */
    public java.lang.String getNextToken() {
        return nextToken;
    }


    /**
     * Sets the nextToken value for this ListInboundShipmentItemsByNextTokenResult.
     * 
     * @param nextToken
     */
    public void setNextToken(java.lang.String nextToken) {
        this.nextToken = nextToken;
    }


    /**
     * Gets the hasNext value for this ListInboundShipmentItemsByNextTokenResult.
     * 
     * @return hasNext
     */
    public boolean isHasNext() {
        return hasNext;
    }


    /**
     * Sets the hasNext value for this ListInboundShipmentItemsByNextTokenResult.
     * 
     * @param hasNext
     */
    public void setHasNext(boolean hasNext) {
        this.hasNext = hasNext;
    }


    /**
     * Gets the shipmentItem value for this ListInboundShipmentItemsByNextTokenResult.
     * 
     * @return shipmentItem
     */
    public com.amazonaws.fba_inbound.doc._2007_05_10.InboundShipmentItem[] getShipmentItem() {
        return shipmentItem;
    }


    /**
     * Sets the shipmentItem value for this ListInboundShipmentItemsByNextTokenResult.
     * 
     * @param shipmentItem
     */
    public void setShipmentItem(com.amazonaws.fba_inbound.doc._2007_05_10.InboundShipmentItem[] shipmentItem) {
        this.shipmentItem = shipmentItem;
    }

    public com.amazonaws.fba_inbound.doc._2007_05_10.InboundShipmentItem getShipmentItem(int i) {
        return this.shipmentItem[i];
    }

    public void setShipmentItem(int i, com.amazonaws.fba_inbound.doc._2007_05_10.InboundShipmentItem _value) {
        this.shipmentItem[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ListInboundShipmentItemsByNextTokenResult)) return false;
        ListInboundShipmentItemsByNextTokenResult other = (ListInboundShipmentItemsByNextTokenResult) obj;
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
            ((this.shipmentItem==null && other.getShipmentItem()==null) || 
             (this.shipmentItem!=null &&
              java.util.Arrays.equals(this.shipmentItem, other.getShipmentItem())));
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
        if (getShipmentItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShipmentItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShipmentItem(), i);
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
        new org.apache.axis.description.TypeDesc(ListInboundShipmentItemsByNextTokenResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", ">ListInboundShipmentItemsByNextTokenResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextToken");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "NextToken"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasNext");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "HasNext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentItem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ShipmentItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "InboundShipmentItem"));
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
