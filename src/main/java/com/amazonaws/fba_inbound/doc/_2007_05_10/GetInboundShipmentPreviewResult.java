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
 * GetInboundShipmentPreviewResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazonaws.fba_inbound.doc._2007_05_10;

public class GetInboundShipmentPreviewResult  implements java.io.Serializable {
    private com.amazonaws.fba_inbound.doc._2007_05_10.ShipmentPreview[] shipmentPreview;

    public GetInboundShipmentPreviewResult() {
    }

    public GetInboundShipmentPreviewResult(
           com.amazonaws.fba_inbound.doc._2007_05_10.ShipmentPreview[] shipmentPreview) {
           this.shipmentPreview = shipmentPreview;
    }


    /**
     * Gets the shipmentPreview value for this GetInboundShipmentPreviewResult.
     * 
     * @return shipmentPreview
     */
    public com.amazonaws.fba_inbound.doc._2007_05_10.ShipmentPreview[] getShipmentPreview() {
        return shipmentPreview;
    }


    /**
     * Sets the shipmentPreview value for this GetInboundShipmentPreviewResult.
     * 
     * @param shipmentPreview
     */
    public void setShipmentPreview(com.amazonaws.fba_inbound.doc._2007_05_10.ShipmentPreview[] shipmentPreview) {
        this.shipmentPreview = shipmentPreview;
    }

    public com.amazonaws.fba_inbound.doc._2007_05_10.ShipmentPreview getShipmentPreview(int i) {
        return this.shipmentPreview[i];
    }

    public void setShipmentPreview(int i, com.amazonaws.fba_inbound.doc._2007_05_10.ShipmentPreview _value) {
        this.shipmentPreview[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetInboundShipmentPreviewResult)) return false;
        GetInboundShipmentPreviewResult other = (GetInboundShipmentPreviewResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.shipmentPreview==null && other.getShipmentPreview()==null) || 
             (this.shipmentPreview!=null &&
              java.util.Arrays.equals(this.shipmentPreview, other.getShipmentPreview())));
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
        if (getShipmentPreview() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShipmentPreview());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShipmentPreview(), i);
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
        new org.apache.axis.description.TypeDesc(GetInboundShipmentPreviewResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", ">GetInboundShipmentPreviewResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentPreview");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ShipmentPreview"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ShipmentPreview"));
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
