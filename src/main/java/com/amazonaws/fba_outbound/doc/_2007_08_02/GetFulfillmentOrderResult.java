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
 * GetFulfillmentOrderResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazonaws.fba_outbound.doc._2007_08_02;

public class GetFulfillmentOrderResult  implements java.io.Serializable {
    private com.amazonaws.fba_outbound.doc._2007_08_02.FulfillmentOrder fulfillmentOrder;

    private com.amazonaws.fba_outbound.doc._2007_08_02.FulfillmentOrderItem[] fulfillmentOrderItem;

    private com.amazonaws.fba_outbound.doc._2007_08_02.FulfillmentShipment[] fulfillmentShipment;

    public GetFulfillmentOrderResult() {
    }

    public GetFulfillmentOrderResult(
           com.amazonaws.fba_outbound.doc._2007_08_02.FulfillmentOrder fulfillmentOrder,
           com.amazonaws.fba_outbound.doc._2007_08_02.FulfillmentOrderItem[] fulfillmentOrderItem,
           com.amazonaws.fba_outbound.doc._2007_08_02.FulfillmentShipment[] fulfillmentShipment) {
           this.fulfillmentOrder = fulfillmentOrder;
           this.fulfillmentOrderItem = fulfillmentOrderItem;
           this.fulfillmentShipment = fulfillmentShipment;
    }


    /**
     * Gets the fulfillmentOrder value for this GetFulfillmentOrderResult.
     * 
     * @return fulfillmentOrder
     */
    public com.amazonaws.fba_outbound.doc._2007_08_02.FulfillmentOrder getFulfillmentOrder() {
        return fulfillmentOrder;
    }


    /**
     * Sets the fulfillmentOrder value for this GetFulfillmentOrderResult.
     * 
     * @param fulfillmentOrder
     */
    public void setFulfillmentOrder(com.amazonaws.fba_outbound.doc._2007_08_02.FulfillmentOrder fulfillmentOrder) {
        this.fulfillmentOrder = fulfillmentOrder;
    }


    /**
     * Gets the fulfillmentOrderItem value for this GetFulfillmentOrderResult.
     * 
     * @return fulfillmentOrderItem
     */
    public com.amazonaws.fba_outbound.doc._2007_08_02.FulfillmentOrderItem[] getFulfillmentOrderItem() {
        return fulfillmentOrderItem;
    }


    /**
     * Sets the fulfillmentOrderItem value for this GetFulfillmentOrderResult.
     * 
     * @param fulfillmentOrderItem
     */
    public void setFulfillmentOrderItem(com.amazonaws.fba_outbound.doc._2007_08_02.FulfillmentOrderItem[] fulfillmentOrderItem) {
        this.fulfillmentOrderItem = fulfillmentOrderItem;
    }

    public com.amazonaws.fba_outbound.doc._2007_08_02.FulfillmentOrderItem getFulfillmentOrderItem(int i) {
        return this.fulfillmentOrderItem[i];
    }

    public void setFulfillmentOrderItem(int i, com.amazonaws.fba_outbound.doc._2007_08_02.FulfillmentOrderItem _value) {
        this.fulfillmentOrderItem[i] = _value;
    }


    /**
     * Gets the fulfillmentShipment value for this GetFulfillmentOrderResult.
     * 
     * @return fulfillmentShipment
     */
    public com.amazonaws.fba_outbound.doc._2007_08_02.FulfillmentShipment[] getFulfillmentShipment() {
        return fulfillmentShipment;
    }


    /**
     * Sets the fulfillmentShipment value for this GetFulfillmentOrderResult.
     * 
     * @param fulfillmentShipment
     */
    public void setFulfillmentShipment(com.amazonaws.fba_outbound.doc._2007_08_02.FulfillmentShipment[] fulfillmentShipment) {
        this.fulfillmentShipment = fulfillmentShipment;
    }

    public com.amazonaws.fba_outbound.doc._2007_08_02.FulfillmentShipment getFulfillmentShipment(int i) {
        return this.fulfillmentShipment[i];
    }

    public void setFulfillmentShipment(int i, com.amazonaws.fba_outbound.doc._2007_08_02.FulfillmentShipment _value) {
        this.fulfillmentShipment[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetFulfillmentOrderResult)) return false;
        GetFulfillmentOrderResult other = (GetFulfillmentOrderResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fulfillmentOrder==null && other.getFulfillmentOrder()==null) || 
             (this.fulfillmentOrder!=null &&
              this.fulfillmentOrder.equals(other.getFulfillmentOrder()))) &&
            ((this.fulfillmentOrderItem==null && other.getFulfillmentOrderItem()==null) || 
             (this.fulfillmentOrderItem!=null &&
              java.util.Arrays.equals(this.fulfillmentOrderItem, other.getFulfillmentOrderItem()))) &&
            ((this.fulfillmentShipment==null && other.getFulfillmentShipment()==null) || 
             (this.fulfillmentShipment!=null &&
              java.util.Arrays.equals(this.fulfillmentShipment, other.getFulfillmentShipment())));
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
        if (getFulfillmentOrder() != null) {
            _hashCode += getFulfillmentOrder().hashCode();
        }
        if (getFulfillmentOrderItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFulfillmentOrderItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFulfillmentOrderItem(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFulfillmentShipment() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFulfillmentShipment());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFulfillmentShipment(), i);
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
        new org.apache.axis.description.TypeDesc(GetFulfillmentOrderResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", ">GetFulfillmentOrderResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fulfillmentOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "FulfillmentOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "FulfillmentOrder"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fulfillmentOrderItem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "FulfillmentOrderItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "FulfillmentOrderItem"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fulfillmentShipment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "FulfillmentShipment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "FulfillmentShipment"));
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
