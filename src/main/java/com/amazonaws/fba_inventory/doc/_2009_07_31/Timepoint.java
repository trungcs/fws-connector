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
 * Timepoint.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazonaws.fba_inventory.doc._2009_07_31;


/**
 * Represents a point in time. A time point is either a specific date
 * and time, or a logical value (e.g., "Immediately").
 *             
 *             If TimepointType is "Immediately" or "Unknown", the DateTime
 * may
 *             not be specified and should be ignored. "Immediately"
 * means
 *             inventory is available for picking immediately and will
 * continue
 *             to be so until in-stock quantities are exhausted. "Unknown"
 * means
 *             inventory is expected to be available for picking at some
 * point
 *             in the future, but it's not known with confidence when
 * that might
 *             be.
 *             
 *             Otherwise, if TimepointType is "DateTime", the DateTime
 * element
 *             represents the latest date and time by which inventory
 * is
 *             confidently expected to be available for picking.
 */
public class Timepoint  implements java.io.Serializable {
    private java.lang.String timepointType;

    private java.lang.String dateTime;

    public Timepoint() {
    }

    public Timepoint(
           java.lang.String timepointType,
           java.lang.String dateTime) {
           this.timepointType = timepointType;
           this.dateTime = dateTime;
    }


    /**
     * Gets the timepointType value for this Timepoint.
     * 
     * @return timepointType
     */
    public java.lang.String getTimepointType() {
        return timepointType;
    }


    /**
     * Sets the timepointType value for this Timepoint.
     * 
     * @param timepointType
     */
    public void setTimepointType(java.lang.String timepointType) {
        this.timepointType = timepointType;
    }


    /**
     * Gets the dateTime value for this Timepoint.
     * 
     * @return dateTime
     */
    public java.lang.String getDateTime() {
        return dateTime;
    }


    /**
     * Sets the dateTime value for this Timepoint.
     * 
     * @param dateTime
     */
    public void setDateTime(java.lang.String dateTime) {
        this.dateTime = dateTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Timepoint)) return false;
        Timepoint other = (Timepoint) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.timepointType==null && other.getTimepointType()==null) || 
             (this.timepointType!=null &&
              this.timepointType.equals(other.getTimepointType()))) &&
            ((this.dateTime==null && other.getDateTime()==null) || 
             (this.dateTime!=null &&
              this.dateTime.equals(other.getDateTime())));
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
        if (getTimepointType() != null) {
            _hashCode += getTimepointType().hashCode();
        }
        if (getDateTime() != null) {
            _hashCode += getDateTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Timepoint.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fba-inventory.amazonaws.com/doc/2009-07-31/", "Timepoint"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timepointType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-inventory.amazonaws.com/doc/2009-07-31/", "TimepointType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-inventory.amazonaws.com/doc/2009-07-31/", "DateTime"));
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
