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
 * FulfillmentPreviewShipment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazonaws.fba_outbound.doc._2007_08_02;


/**
 * Holds items and promise attributes for this fulfillable shipment
 */
public class FulfillmentPreviewShipment  implements java.io.Serializable {
    private java.lang.String earliestShipDate;

    private java.lang.String latestShipDate;

    private java.lang.String earliestArrivalDate;

    private java.lang.String latestArrivalDate;

    private com.amazonaws.fba_outbound.doc._2007_08_02.FulfillmentPreviewItem[] fulfillmentPreviewItems;

    public FulfillmentPreviewShipment() {
    }

    public FulfillmentPreviewShipment(
           java.lang.String earliestShipDate,
           java.lang.String latestShipDate,
           java.lang.String earliestArrivalDate,
           java.lang.String latestArrivalDate,
           com.amazonaws.fba_outbound.doc._2007_08_02.FulfillmentPreviewItem[] fulfillmentPreviewItems) {
           this.earliestShipDate = earliestShipDate;
           this.latestShipDate = latestShipDate;
           this.earliestArrivalDate = earliestArrivalDate;
           this.latestArrivalDate = latestArrivalDate;
           this.fulfillmentPreviewItems = fulfillmentPreviewItems;
    }


    /**
     * Gets the earliestShipDate value for this FulfillmentPreviewShipment.
     * 
     * @return earliestShipDate
     */
    public java.lang.String getEarliestShipDate() {
        return earliestShipDate;
    }


    /**
     * Sets the earliestShipDate value for this FulfillmentPreviewShipment.
     * 
     * @param earliestShipDate
     */
    public void setEarliestShipDate(java.lang.String earliestShipDate) {
        this.earliestShipDate = earliestShipDate;
    }


    /**
     * Gets the latestShipDate value for this FulfillmentPreviewShipment.
     * 
     * @return latestShipDate
     */
    public java.lang.String getLatestShipDate() {
        return latestShipDate;
    }


    /**
     * Sets the latestShipDate value for this FulfillmentPreviewShipment.
     * 
     * @param latestShipDate
     */
    public void setLatestShipDate(java.lang.String latestShipDate) {
        this.latestShipDate = latestShipDate;
    }


    /**
     * Gets the earliestArrivalDate value for this FulfillmentPreviewShipment.
     * 
     * @return earliestArrivalDate
     */
    public java.lang.String getEarliestArrivalDate() {
        return earliestArrivalDate;
    }


    /**
     * Sets the earliestArrivalDate value for this FulfillmentPreviewShipment.
     * 
     * @param earliestArrivalDate
     */
    public void setEarliestArrivalDate(java.lang.String earliestArrivalDate) {
        this.earliestArrivalDate = earliestArrivalDate;
    }


    /**
     * Gets the latestArrivalDate value for this FulfillmentPreviewShipment.
     * 
     * @return latestArrivalDate
     */
    public java.lang.String getLatestArrivalDate() {
        return latestArrivalDate;
    }


    /**
     * Sets the latestArrivalDate value for this FulfillmentPreviewShipment.
     * 
     * @param latestArrivalDate
     */
    public void setLatestArrivalDate(java.lang.String latestArrivalDate) {
        this.latestArrivalDate = latestArrivalDate;
    }


    /**
     * Gets the fulfillmentPreviewItems value for this FulfillmentPreviewShipment.
     * 
     * @return fulfillmentPreviewItems
     */
    public com.amazonaws.fba_outbound.doc._2007_08_02.FulfillmentPreviewItem[] getFulfillmentPreviewItems() {
        return fulfillmentPreviewItems;
    }


    /**
     * Sets the fulfillmentPreviewItems value for this FulfillmentPreviewShipment.
     * 
     * @param fulfillmentPreviewItems
     */
    public void setFulfillmentPreviewItems(com.amazonaws.fba_outbound.doc._2007_08_02.FulfillmentPreviewItem[] fulfillmentPreviewItems) {
        this.fulfillmentPreviewItems = fulfillmentPreviewItems;
    }

    public com.amazonaws.fba_outbound.doc._2007_08_02.FulfillmentPreviewItem getFulfillmentPreviewItems(int i) {
        return this.fulfillmentPreviewItems[i];
    }

    public void setFulfillmentPreviewItems(int i, com.amazonaws.fba_outbound.doc._2007_08_02.FulfillmentPreviewItem _value) {
        this.fulfillmentPreviewItems[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FulfillmentPreviewShipment)) return false;
        FulfillmentPreviewShipment other = (FulfillmentPreviewShipment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.earliestShipDate==null && other.getEarliestShipDate()==null) || 
             (this.earliestShipDate!=null &&
              this.earliestShipDate.equals(other.getEarliestShipDate()))) &&
            ((this.latestShipDate==null && other.getLatestShipDate()==null) || 
             (this.latestShipDate!=null &&
              this.latestShipDate.equals(other.getLatestShipDate()))) &&
            ((this.earliestArrivalDate==null && other.getEarliestArrivalDate()==null) || 
             (this.earliestArrivalDate!=null &&
              this.earliestArrivalDate.equals(other.getEarliestArrivalDate()))) &&
            ((this.latestArrivalDate==null && other.getLatestArrivalDate()==null) || 
             (this.latestArrivalDate!=null &&
              this.latestArrivalDate.equals(other.getLatestArrivalDate()))) &&
            ((this.fulfillmentPreviewItems==null && other.getFulfillmentPreviewItems()==null) || 
             (this.fulfillmentPreviewItems!=null &&
              java.util.Arrays.equals(this.fulfillmentPreviewItems, other.getFulfillmentPreviewItems())));
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
        if (getEarliestShipDate() != null) {
            _hashCode += getEarliestShipDate().hashCode();
        }
        if (getLatestShipDate() != null) {
            _hashCode += getLatestShipDate().hashCode();
        }
        if (getEarliestArrivalDate() != null) {
            _hashCode += getEarliestArrivalDate().hashCode();
        }
        if (getLatestArrivalDate() != null) {
            _hashCode += getLatestArrivalDate().hashCode();
        }
        if (getFulfillmentPreviewItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFulfillmentPreviewItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFulfillmentPreviewItems(), i);
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
        new org.apache.axis.description.TypeDesc(FulfillmentPreviewShipment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "FulfillmentPreviewShipment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("earliestShipDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "EarliestShipDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("latestShipDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "LatestShipDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("earliestArrivalDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "EarliestArrivalDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("latestArrivalDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "LatestArrivalDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fulfillmentPreviewItems");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "FulfillmentPreviewItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "FulfillmentPreviewItem"));
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
