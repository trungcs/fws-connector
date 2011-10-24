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
 * SupplyDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazonaws.fba_inventory.doc._2009_07_31;


/**
 * Represents a quantity of merchant-owned inventory for a single
 * SKU
 *             -- either in Amazon's fulfillment network, or in a shipment
 * inbound
 *             to an Amazon fulfillment center -- that is or will be
 * available to
 *             fulfill Multi-Channel orders, and the date/time when the
 * inventory
 *             is expected to be available for picking.
 */
public class SupplyDetail  implements java.io.Serializable {
    private int quantity;

    private java.lang.String supplyType;

    private com.amazonaws.fba_inventory.doc._2009_07_31.Timepoint earliestAvailableToPickDateTime;

    private com.amazonaws.fba_inventory.doc._2009_07_31.Timepoint latestAvailableToPickDateTime;

    public SupplyDetail() {
    }

    public SupplyDetail(
           int quantity,
           java.lang.String supplyType,
           com.amazonaws.fba_inventory.doc._2009_07_31.Timepoint earliestAvailableToPickDateTime,
           com.amazonaws.fba_inventory.doc._2009_07_31.Timepoint latestAvailableToPickDateTime) {
           this.quantity = quantity;
           this.supplyType = supplyType;
           this.earliestAvailableToPickDateTime = earliestAvailableToPickDateTime;
           this.latestAvailableToPickDateTime = latestAvailableToPickDateTime;
    }


    /**
     * Gets the quantity value for this SupplyDetail.
     * 
     * @return quantity
     */
    public int getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this SupplyDetail.
     * 
     * @param quantity
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the supplyType value for this SupplyDetail.
     * 
     * @return supplyType
     */
    public java.lang.String getSupplyType() {
        return supplyType;
    }


    /**
     * Sets the supplyType value for this SupplyDetail.
     * 
     * @param supplyType
     */
    public void setSupplyType(java.lang.String supplyType) {
        this.supplyType = supplyType;
    }


    /**
     * Gets the earliestAvailableToPickDateTime value for this SupplyDetail.
     * 
     * @return earliestAvailableToPickDateTime
     */
    public com.amazonaws.fba_inventory.doc._2009_07_31.Timepoint getEarliestAvailableToPickDateTime() {
        return earliestAvailableToPickDateTime;
    }


    /**
     * Sets the earliestAvailableToPickDateTime value for this SupplyDetail.
     * 
     * @param earliestAvailableToPickDateTime
     */
    public void setEarliestAvailableToPickDateTime(com.amazonaws.fba_inventory.doc._2009_07_31.Timepoint earliestAvailableToPickDateTime) {
        this.earliestAvailableToPickDateTime = earliestAvailableToPickDateTime;
    }


    /**
     * Gets the latestAvailableToPickDateTime value for this SupplyDetail.
     * 
     * @return latestAvailableToPickDateTime
     */
    public com.amazonaws.fba_inventory.doc._2009_07_31.Timepoint getLatestAvailableToPickDateTime() {
        return latestAvailableToPickDateTime;
    }


    /**
     * Sets the latestAvailableToPickDateTime value for this SupplyDetail.
     * 
     * @param latestAvailableToPickDateTime
     */
    public void setLatestAvailableToPickDateTime(com.amazonaws.fba_inventory.doc._2009_07_31.Timepoint latestAvailableToPickDateTime) {
        this.latestAvailableToPickDateTime = latestAvailableToPickDateTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SupplyDetail)) return false;
        SupplyDetail other = (SupplyDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.quantity == other.getQuantity() &&
            ((this.supplyType==null && other.getSupplyType()==null) || 
             (this.supplyType!=null &&
              this.supplyType.equals(other.getSupplyType()))) &&
            ((this.earliestAvailableToPickDateTime==null && other.getEarliestAvailableToPickDateTime()==null) || 
             (this.earliestAvailableToPickDateTime!=null &&
              this.earliestAvailableToPickDateTime.equals(other.getEarliestAvailableToPickDateTime()))) &&
            ((this.latestAvailableToPickDateTime==null && other.getLatestAvailableToPickDateTime()==null) || 
             (this.latestAvailableToPickDateTime!=null &&
              this.latestAvailableToPickDateTime.equals(other.getLatestAvailableToPickDateTime())));
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
        _hashCode += getQuantity();
        if (getSupplyType() != null) {
            _hashCode += getSupplyType().hashCode();
        }
        if (getEarliestAvailableToPickDateTime() != null) {
            _hashCode += getEarliestAvailableToPickDateTime().hashCode();
        }
        if (getLatestAvailableToPickDateTime() != null) {
            _hashCode += getLatestAvailableToPickDateTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SupplyDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fba-inventory.amazonaws.com/doc/2009-07-31/", "SupplyDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-inventory.amazonaws.com/doc/2009-07-31/", "Quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supplyType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-inventory.amazonaws.com/doc/2009-07-31/", "SupplyType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("earliestAvailableToPickDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-inventory.amazonaws.com/doc/2009-07-31/", "EarliestAvailableToPickDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fba-inventory.amazonaws.com/doc/2009-07-31/", "Timepoint"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("latestAvailableToPickDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-inventory.amazonaws.com/doc/2009-07-31/", "LatestAvailableToPickDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fba-inventory.amazonaws.com/doc/2009-07-31/", "Timepoint"));
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
