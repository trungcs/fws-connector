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
 * FulfillmentShipment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazonaws.fba_outbound.doc._2007_08_02;


/**
 * The meaning of ShippingDate depends on the current shipment status.
 * If the shipment status is Pending, then the ShippingDate is the
 *             estimated date and time that the shipment will leave the
 * fulfillment center. If the shipment status is Shipped, then the
 *             ShippingDate is the actual date and time that the shipment
 * left
 *             the fulfillment center.
 * 
 *             If the shipment was cancelled, the ShippingDate field
 * does not
 *             appear.
 * 
 *             The EstimatedArrivalDate may change over time. If the
 * shipment has
 *             been cancelled, this field does not appear.
 * 
 *             Packages can be related to shipment items via the PackageId
 * element. Note that several packages in the same shipment may
 *             contain quantities of the same item.
 */
public class FulfillmentShipment  implements java.io.Serializable {
    private java.lang.String amazonShipmentId;

    private java.lang.String fulfillmentCenterId;

    private com.amazonaws.fba_outbound.doc._2007_08_02.FulfillmentShipmentStatus fulfillmentShipmentStatus;

    private java.lang.String shippingDateTime;

    private java.lang.String estimatedArrivalDateTime;

    private com.amazonaws.fba_outbound.doc._2007_08_02.FulfillmentShipmentItem[] fulfillmentShipmentItem;

    private com.amazonaws.fba_outbound.doc._2007_08_02.FulfillmentShipmentPackage[] fulfillmentShipmentPackage;

    public FulfillmentShipment() {
    }

    public FulfillmentShipment(
           java.lang.String amazonShipmentId,
           java.lang.String fulfillmentCenterId,
           com.amazonaws.fba_outbound.doc._2007_08_02.FulfillmentShipmentStatus fulfillmentShipmentStatus,
           java.lang.String shippingDateTime,
           java.lang.String estimatedArrivalDateTime,
           com.amazonaws.fba_outbound.doc._2007_08_02.FulfillmentShipmentItem[] fulfillmentShipmentItem,
           com.amazonaws.fba_outbound.doc._2007_08_02.FulfillmentShipmentPackage[] fulfillmentShipmentPackage) {
           this.amazonShipmentId = amazonShipmentId;
           this.fulfillmentCenterId = fulfillmentCenterId;
           this.fulfillmentShipmentStatus = fulfillmentShipmentStatus;
           this.shippingDateTime = shippingDateTime;
           this.estimatedArrivalDateTime = estimatedArrivalDateTime;
           this.fulfillmentShipmentItem = fulfillmentShipmentItem;
           this.fulfillmentShipmentPackage = fulfillmentShipmentPackage;
    }


    /**
     * Gets the amazonShipmentId value for this FulfillmentShipment.
     * 
     * @return amazonShipmentId
     */
    public java.lang.String getAmazonShipmentId() {
        return amazonShipmentId;
    }


    /**
     * Sets the amazonShipmentId value for this FulfillmentShipment.
     * 
     * @param amazonShipmentId
     */
    public void setAmazonShipmentId(java.lang.String amazonShipmentId) {
        this.amazonShipmentId = amazonShipmentId;
    }


    /**
     * Gets the fulfillmentCenterId value for this FulfillmentShipment.
     * 
     * @return fulfillmentCenterId
     */
    public java.lang.String getFulfillmentCenterId() {
        return fulfillmentCenterId;
    }


    /**
     * Sets the fulfillmentCenterId value for this FulfillmentShipment.
     * 
     * @param fulfillmentCenterId
     */
    public void setFulfillmentCenterId(java.lang.String fulfillmentCenterId) {
        this.fulfillmentCenterId = fulfillmentCenterId;
    }


    /**
     * Gets the fulfillmentShipmentStatus value for this FulfillmentShipment.
     * 
     * @return fulfillmentShipmentStatus
     */
    public com.amazonaws.fba_outbound.doc._2007_08_02.FulfillmentShipmentStatus getFulfillmentShipmentStatus() {
        return fulfillmentShipmentStatus;
    }


    /**
     * Sets the fulfillmentShipmentStatus value for this FulfillmentShipment.
     * 
     * @param fulfillmentShipmentStatus
     */
    public void setFulfillmentShipmentStatus(com.amazonaws.fba_outbound.doc._2007_08_02.FulfillmentShipmentStatus fulfillmentShipmentStatus) {
        this.fulfillmentShipmentStatus = fulfillmentShipmentStatus;
    }


    /**
     * Gets the shippingDateTime value for this FulfillmentShipment.
     * 
     * @return shippingDateTime
     */
    public java.lang.String getShippingDateTime() {
        return shippingDateTime;
    }


    /**
     * Sets the shippingDateTime value for this FulfillmentShipment.
     * 
     * @param shippingDateTime
     */
    public void setShippingDateTime(java.lang.String shippingDateTime) {
        this.shippingDateTime = shippingDateTime;
    }


    /**
     * Gets the estimatedArrivalDateTime value for this FulfillmentShipment.
     * 
     * @return estimatedArrivalDateTime
     */
    public java.lang.String getEstimatedArrivalDateTime() {
        return estimatedArrivalDateTime;
    }


    /**
     * Sets the estimatedArrivalDateTime value for this FulfillmentShipment.
     * 
     * @param estimatedArrivalDateTime
     */
    public void setEstimatedArrivalDateTime(java.lang.String estimatedArrivalDateTime) {
        this.estimatedArrivalDateTime = estimatedArrivalDateTime;
    }


    /**
     * Gets the fulfillmentShipmentItem value for this FulfillmentShipment.
     * 
     * @return fulfillmentShipmentItem
     */
    public com.amazonaws.fba_outbound.doc._2007_08_02.FulfillmentShipmentItem[] getFulfillmentShipmentItem() {
        return fulfillmentShipmentItem;
    }


    /**
     * Sets the fulfillmentShipmentItem value for this FulfillmentShipment.
     * 
     * @param fulfillmentShipmentItem
     */
    public void setFulfillmentShipmentItem(com.amazonaws.fba_outbound.doc._2007_08_02.FulfillmentShipmentItem[] fulfillmentShipmentItem) {
        this.fulfillmentShipmentItem = fulfillmentShipmentItem;
    }

    public com.amazonaws.fba_outbound.doc._2007_08_02.FulfillmentShipmentItem getFulfillmentShipmentItem(int i) {
        return this.fulfillmentShipmentItem[i];
    }

    public void setFulfillmentShipmentItem(int i, com.amazonaws.fba_outbound.doc._2007_08_02.FulfillmentShipmentItem _value) {
        this.fulfillmentShipmentItem[i] = _value;
    }


    /**
     * Gets the fulfillmentShipmentPackage value for this FulfillmentShipment.
     * 
     * @return fulfillmentShipmentPackage
     */
    public com.amazonaws.fba_outbound.doc._2007_08_02.FulfillmentShipmentPackage[] getFulfillmentShipmentPackage() {
        return fulfillmentShipmentPackage;
    }


    /**
     * Sets the fulfillmentShipmentPackage value for this FulfillmentShipment.
     * 
     * @param fulfillmentShipmentPackage
     */
    public void setFulfillmentShipmentPackage(com.amazonaws.fba_outbound.doc._2007_08_02.FulfillmentShipmentPackage[] fulfillmentShipmentPackage) {
        this.fulfillmentShipmentPackage = fulfillmentShipmentPackage;
    }

    public com.amazonaws.fba_outbound.doc._2007_08_02.FulfillmentShipmentPackage getFulfillmentShipmentPackage(int i) {
        return this.fulfillmentShipmentPackage[i];
    }

    public void setFulfillmentShipmentPackage(int i, com.amazonaws.fba_outbound.doc._2007_08_02.FulfillmentShipmentPackage _value) {
        this.fulfillmentShipmentPackage[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FulfillmentShipment)) return false;
        FulfillmentShipment other = (FulfillmentShipment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.amazonShipmentId==null && other.getAmazonShipmentId()==null) || 
             (this.amazonShipmentId!=null &&
              this.amazonShipmentId.equals(other.getAmazonShipmentId()))) &&
            ((this.fulfillmentCenterId==null && other.getFulfillmentCenterId()==null) || 
             (this.fulfillmentCenterId!=null &&
              this.fulfillmentCenterId.equals(other.getFulfillmentCenterId()))) &&
            ((this.fulfillmentShipmentStatus==null && other.getFulfillmentShipmentStatus()==null) || 
             (this.fulfillmentShipmentStatus!=null &&
              this.fulfillmentShipmentStatus.equals(other.getFulfillmentShipmentStatus()))) &&
            ((this.shippingDateTime==null && other.getShippingDateTime()==null) || 
             (this.shippingDateTime!=null &&
              this.shippingDateTime.equals(other.getShippingDateTime()))) &&
            ((this.estimatedArrivalDateTime==null && other.getEstimatedArrivalDateTime()==null) || 
             (this.estimatedArrivalDateTime!=null &&
              this.estimatedArrivalDateTime.equals(other.getEstimatedArrivalDateTime()))) &&
            ((this.fulfillmentShipmentItem==null && other.getFulfillmentShipmentItem()==null) || 
             (this.fulfillmentShipmentItem!=null &&
              java.util.Arrays.equals(this.fulfillmentShipmentItem, other.getFulfillmentShipmentItem()))) &&
            ((this.fulfillmentShipmentPackage==null && other.getFulfillmentShipmentPackage()==null) || 
             (this.fulfillmentShipmentPackage!=null &&
              java.util.Arrays.equals(this.fulfillmentShipmentPackage, other.getFulfillmentShipmentPackage())));
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
        if (getAmazonShipmentId() != null) {
            _hashCode += getAmazonShipmentId().hashCode();
        }
        if (getFulfillmentCenterId() != null) {
            _hashCode += getFulfillmentCenterId().hashCode();
        }
        if (getFulfillmentShipmentStatus() != null) {
            _hashCode += getFulfillmentShipmentStatus().hashCode();
        }
        if (getShippingDateTime() != null) {
            _hashCode += getShippingDateTime().hashCode();
        }
        if (getEstimatedArrivalDateTime() != null) {
            _hashCode += getEstimatedArrivalDateTime().hashCode();
        }
        if (getFulfillmentShipmentItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFulfillmentShipmentItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFulfillmentShipmentItem(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFulfillmentShipmentPackage() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFulfillmentShipmentPackage());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFulfillmentShipmentPackage(), i);
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
        new org.apache.axis.description.TypeDesc(FulfillmentShipment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "FulfillmentShipment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amazonShipmentId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "AmazonShipmentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fulfillmentCenterId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "FulfillmentCenterId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fulfillmentShipmentStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "FulfillmentShipmentStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "FulfillmentShipmentStatus"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "ShippingDateTime"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fulfillmentShipmentItem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "FulfillmentShipmentItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "FulfillmentShipmentItem"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fulfillmentShipmentPackage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "FulfillmentShipmentPackage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "FulfillmentShipmentPackage"));
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
