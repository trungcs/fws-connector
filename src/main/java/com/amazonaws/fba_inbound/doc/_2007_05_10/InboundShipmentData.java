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
 * InboundShipmentData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazonaws.fba_inbound.doc._2007_05_10;


/**
 * Information about a shipment.  Does not list the
 *                             items in the shipment, however.
 */
public class InboundShipmentData  implements java.io.Serializable {
    private java.lang.String shipmentId;

    private java.lang.String shipmentName;

    private com.amazonaws.fba_inbound.doc._2007_05_10.ShipmentStatus shipmentStatus;

    private java.lang.String destinationFulfillmentCenter;

    private com.amazonaws.fba_inbound.doc._2007_05_10.Address shipToAddress;

    private com.amazonaws.fba_inbound.doc._2007_05_10.Address shipFromAddress;

    private java.util.Calendar createDate;

    private com.amazonaws.fba_inbound.doc._2007_05_10.LabelPrepType labelPrepType;

    public InboundShipmentData() {
    }

    public InboundShipmentData(
           java.lang.String shipmentId,
           java.lang.String shipmentName,
           com.amazonaws.fba_inbound.doc._2007_05_10.ShipmentStatus shipmentStatus,
           java.lang.String destinationFulfillmentCenter,
           com.amazonaws.fba_inbound.doc._2007_05_10.Address shipToAddress,
           com.amazonaws.fba_inbound.doc._2007_05_10.Address shipFromAddress,
           java.util.Calendar createDate,
           com.amazonaws.fba_inbound.doc._2007_05_10.LabelPrepType labelPrepType) {
           this.shipmentId = shipmentId;
           this.shipmentName = shipmentName;
           this.shipmentStatus = shipmentStatus;
           this.destinationFulfillmentCenter = destinationFulfillmentCenter;
           this.shipToAddress = shipToAddress;
           this.shipFromAddress = shipFromAddress;
           this.createDate = createDate;
           this.labelPrepType = labelPrepType;
    }


    /**
     * Gets the shipmentId value for this InboundShipmentData.
     * 
     * @return shipmentId
     */
    public java.lang.String getShipmentId() {
        return shipmentId;
    }


    /**
     * Sets the shipmentId value for this InboundShipmentData.
     * 
     * @param shipmentId
     */
    public void setShipmentId(java.lang.String shipmentId) {
        this.shipmentId = shipmentId;
    }


    /**
     * Gets the shipmentName value for this InboundShipmentData.
     * 
     * @return shipmentName
     */
    public java.lang.String getShipmentName() {
        return shipmentName;
    }


    /**
     * Sets the shipmentName value for this InboundShipmentData.
     * 
     * @param shipmentName
     */
    public void setShipmentName(java.lang.String shipmentName) {
        this.shipmentName = shipmentName;
    }


    /**
     * Gets the shipmentStatus value for this InboundShipmentData.
     * 
     * @return shipmentStatus
     */
    public com.amazonaws.fba_inbound.doc._2007_05_10.ShipmentStatus getShipmentStatus() {
        return shipmentStatus;
    }


    /**
     * Sets the shipmentStatus value for this InboundShipmentData.
     * 
     * @param shipmentStatus
     */
    public void setShipmentStatus(com.amazonaws.fba_inbound.doc._2007_05_10.ShipmentStatus shipmentStatus) {
        this.shipmentStatus = shipmentStatus;
    }


    /**
     * Gets the destinationFulfillmentCenter value for this InboundShipmentData.
     * 
     * @return destinationFulfillmentCenter
     */
    public java.lang.String getDestinationFulfillmentCenter() {
        return destinationFulfillmentCenter;
    }


    /**
     * Sets the destinationFulfillmentCenter value for this InboundShipmentData.
     * 
     * @param destinationFulfillmentCenter
     */
    public void setDestinationFulfillmentCenter(java.lang.String destinationFulfillmentCenter) {
        this.destinationFulfillmentCenter = destinationFulfillmentCenter;
    }


    /**
     * Gets the shipToAddress value for this InboundShipmentData.
     * 
     * @return shipToAddress
     */
    public com.amazonaws.fba_inbound.doc._2007_05_10.Address getShipToAddress() {
        return shipToAddress;
    }


    /**
     * Sets the shipToAddress value for this InboundShipmentData.
     * 
     * @param shipToAddress
     */
    public void setShipToAddress(com.amazonaws.fba_inbound.doc._2007_05_10.Address shipToAddress) {
        this.shipToAddress = shipToAddress;
    }


    /**
     * Gets the shipFromAddress value for this InboundShipmentData.
     * 
     * @return shipFromAddress
     */
    public com.amazonaws.fba_inbound.doc._2007_05_10.Address getShipFromAddress() {
        return shipFromAddress;
    }


    /**
     * Sets the shipFromAddress value for this InboundShipmentData.
     * 
     * @param shipFromAddress
     */
    public void setShipFromAddress(com.amazonaws.fba_inbound.doc._2007_05_10.Address shipFromAddress) {
        this.shipFromAddress = shipFromAddress;
    }


    /**
     * Gets the createDate value for this InboundShipmentData.
     * 
     * @return createDate
     */
    public java.util.Calendar getCreateDate() {
        return createDate;
    }


    /**
     * Sets the createDate value for this InboundShipmentData.
     * 
     * @param createDate
     */
    public void setCreateDate(java.util.Calendar createDate) {
        this.createDate = createDate;
    }


    /**
     * Gets the labelPrepType value for this InboundShipmentData.
     * 
     * @return labelPrepType
     */
    public com.amazonaws.fba_inbound.doc._2007_05_10.LabelPrepType getLabelPrepType() {
        return labelPrepType;
    }


    /**
     * Sets the labelPrepType value for this InboundShipmentData.
     * 
     * @param labelPrepType
     */
    public void setLabelPrepType(com.amazonaws.fba_inbound.doc._2007_05_10.LabelPrepType labelPrepType) {
        this.labelPrepType = labelPrepType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InboundShipmentData)) return false;
        InboundShipmentData other = (InboundShipmentData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.shipmentId==null && other.getShipmentId()==null) || 
             (this.shipmentId!=null &&
              this.shipmentId.equals(other.getShipmentId()))) &&
            ((this.shipmentName==null && other.getShipmentName()==null) || 
             (this.shipmentName!=null &&
              this.shipmentName.equals(other.getShipmentName()))) &&
            ((this.shipmentStatus==null && other.getShipmentStatus()==null) || 
             (this.shipmentStatus!=null &&
              this.shipmentStatus.equals(other.getShipmentStatus()))) &&
            ((this.destinationFulfillmentCenter==null && other.getDestinationFulfillmentCenter()==null) || 
             (this.destinationFulfillmentCenter!=null &&
              this.destinationFulfillmentCenter.equals(other.getDestinationFulfillmentCenter()))) &&
            ((this.shipToAddress==null && other.getShipToAddress()==null) || 
             (this.shipToAddress!=null &&
              this.shipToAddress.equals(other.getShipToAddress()))) &&
            ((this.shipFromAddress==null && other.getShipFromAddress()==null) || 
             (this.shipFromAddress!=null &&
              this.shipFromAddress.equals(other.getShipFromAddress()))) &&
            ((this.createDate==null && other.getCreateDate()==null) || 
             (this.createDate!=null &&
              this.createDate.equals(other.getCreateDate()))) &&
            ((this.labelPrepType==null && other.getLabelPrepType()==null) || 
             (this.labelPrepType!=null &&
              this.labelPrepType.equals(other.getLabelPrepType())));
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
        if (getShipmentId() != null) {
            _hashCode += getShipmentId().hashCode();
        }
        if (getShipmentName() != null) {
            _hashCode += getShipmentName().hashCode();
        }
        if (getShipmentStatus() != null) {
            _hashCode += getShipmentStatus().hashCode();
        }
        if (getDestinationFulfillmentCenter() != null) {
            _hashCode += getDestinationFulfillmentCenter().hashCode();
        }
        if (getShipToAddress() != null) {
            _hashCode += getShipToAddress().hashCode();
        }
        if (getShipFromAddress() != null) {
            _hashCode += getShipFromAddress().hashCode();
        }
        if (getCreateDate() != null) {
            _hashCode += getCreateDate().hashCode();
        }
        if (getLabelPrepType() != null) {
            _hashCode += getLabelPrepType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InboundShipmentData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "InboundShipmentData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ShipmentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ShipmentName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ShipmentStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ShipmentStatus"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationFulfillmentCenter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "DestinationFulfillmentCenter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipToAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ShipToAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "Address"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipFromAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ShipFromAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "Address"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "CreateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("labelPrepType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "LabelPrepType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "LabelPrepType"));
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
