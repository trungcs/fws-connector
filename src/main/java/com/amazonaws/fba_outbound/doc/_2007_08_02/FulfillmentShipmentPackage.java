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
 * FulfillmentShipmentPackage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazonaws.fba_outbound.doc._2007_08_02;


/**
 * Represents a single package in a shipment. The package id
 *             uniquely identifies the package within the shipment. The
 * CarrierCode identifies the carrier who will deliver the shipment
 *             to the end recipient. The TrackingNumber, if provided,
 * may be
 *             used to obtain tracking and delivery information about
 * the
 *             package from the carrier.
 */
public class FulfillmentShipmentPackage  implements java.io.Serializable {
    private int packageNumber;

    private java.lang.String carrierCode;

    private java.lang.String trackingNumber;

    private java.lang.String estimatedArrivalDateTime;

    public FulfillmentShipmentPackage() {
    }

    public FulfillmentShipmentPackage(
           int packageNumber,
           java.lang.String carrierCode,
           java.lang.String trackingNumber,
           java.lang.String estimatedArrivalDateTime) {
           this.packageNumber = packageNumber;
           this.carrierCode = carrierCode;
           this.trackingNumber = trackingNumber;
           this.estimatedArrivalDateTime = estimatedArrivalDateTime;
    }


    /**
     * Gets the packageNumber value for this FulfillmentShipmentPackage.
     * 
     * @return packageNumber
     */
    public int getPackageNumber() {
        return packageNumber;
    }


    /**
     * Sets the packageNumber value for this FulfillmentShipmentPackage.
     * 
     * @param packageNumber
     */
    public void setPackageNumber(int packageNumber) {
        this.packageNumber = packageNumber;
    }


    /**
     * Gets the carrierCode value for this FulfillmentShipmentPackage.
     * 
     * @return carrierCode
     */
    public java.lang.String getCarrierCode() {
        return carrierCode;
    }


    /**
     * Sets the carrierCode value for this FulfillmentShipmentPackage.
     * 
     * @param carrierCode
     */
    public void setCarrierCode(java.lang.String carrierCode) {
        this.carrierCode = carrierCode;
    }


    /**
     * Gets the trackingNumber value for this FulfillmentShipmentPackage.
     * 
     * @return trackingNumber
     */
    public java.lang.String getTrackingNumber() {
        return trackingNumber;
    }


    /**
     * Sets the trackingNumber value for this FulfillmentShipmentPackage.
     * 
     * @param trackingNumber
     */
    public void setTrackingNumber(java.lang.String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }


    /**
     * Gets the estimatedArrivalDateTime value for this FulfillmentShipmentPackage.
     * 
     * @return estimatedArrivalDateTime
     */
    public java.lang.String getEstimatedArrivalDateTime() {
        return estimatedArrivalDateTime;
    }


    /**
     * Sets the estimatedArrivalDateTime value for this FulfillmentShipmentPackage.
     * 
     * @param estimatedArrivalDateTime
     */
    public void setEstimatedArrivalDateTime(java.lang.String estimatedArrivalDateTime) {
        this.estimatedArrivalDateTime = estimatedArrivalDateTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FulfillmentShipmentPackage)) return false;
        FulfillmentShipmentPackage other = (FulfillmentShipmentPackage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.packageNumber == other.getPackageNumber() &&
            ((this.carrierCode==null && other.getCarrierCode()==null) || 
             (this.carrierCode!=null &&
              this.carrierCode.equals(other.getCarrierCode()))) &&
            ((this.trackingNumber==null && other.getTrackingNumber()==null) || 
             (this.trackingNumber!=null &&
              this.trackingNumber.equals(other.getTrackingNumber()))) &&
            ((this.estimatedArrivalDateTime==null && other.getEstimatedArrivalDateTime()==null) || 
             (this.estimatedArrivalDateTime!=null &&
              this.estimatedArrivalDateTime.equals(other.getEstimatedArrivalDateTime())));
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
        _hashCode += getPackageNumber();
        if (getCarrierCode() != null) {
            _hashCode += getCarrierCode().hashCode();
        }
        if (getTrackingNumber() != null) {
            _hashCode += getTrackingNumber().hashCode();
        }
        if (getEstimatedArrivalDateTime() != null) {
            _hashCode += getEstimatedArrivalDateTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FulfillmentShipmentPackage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "FulfillmentShipmentPackage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "PackageNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carrierCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "CarrierCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackingNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "TrackingNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedArrivalDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "EstimatedArrivalDateTime"));
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
