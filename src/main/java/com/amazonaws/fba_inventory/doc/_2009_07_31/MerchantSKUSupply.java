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
 * MerchantSKUSupply.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazonaws.fba_inventory.doc._2009_07_31;


/**
 * Represents merchant-owned inventory for a single SKU -- either
 * in
 *             Amazon's fulfillment network, or in a shipment inbound
 * to an Amazon
 *             fulfillment center -- that is or will be available to
 * fulfill
 *             Multi-Channel orders.
 *             
 *             TotalSupplyQuantity is the total number of units available,
 * including in-stock quantities, quantities on inbound shipments, and
 * quantities being transferred between FCs in Amazon's network.
 *             
 *             InStockSupplyQuantity is the total number of units actually
 * in-stock
 *             in Amazon's network.
 *             
 *             EarliestAvailability is a Timepoint representing the soonest
 * date/time that inventory is expected to be available for picking.
 *             If TotalSupplyQuantity is zero, EarliestAvailability will
 * not
 *             be present.
 *             
 *             SupplyDetail is an optional list detailing what specific
 * inventory
 *             quantities will be available for picking, when, and their
 * logical
 *             location in the supply chain (in-stock in a fulfillment
 * center,
 *             on an inbound shipment, or being transferred between FCs).
 */
public class MerchantSKUSupply  implements java.io.Serializable {
    private java.lang.String merchantSKU;

    private java.lang.String fulfillmentNetworkSKU;

    private java.lang.String ASIN;

    private java.lang.String condition;

    private int totalSupplyQuantity;

    private int inStockSupplyQuantity;

    private com.amazonaws.fba_inventory.doc._2009_07_31.Timepoint earliestAvailability;

    private com.amazonaws.fba_inventory.doc._2009_07_31.SupplyDetail[] supplyDetail;

    public MerchantSKUSupply() {
    }

    public MerchantSKUSupply(
           java.lang.String merchantSKU,
           java.lang.String fulfillmentNetworkSKU,
           java.lang.String ASIN,
           java.lang.String condition,
           int totalSupplyQuantity,
           int inStockSupplyQuantity,
           com.amazonaws.fba_inventory.doc._2009_07_31.Timepoint earliestAvailability,
           com.amazonaws.fba_inventory.doc._2009_07_31.SupplyDetail[] supplyDetail) {
           this.merchantSKU = merchantSKU;
           this.fulfillmentNetworkSKU = fulfillmentNetworkSKU;
           this.ASIN = ASIN;
           this.condition = condition;
           this.totalSupplyQuantity = totalSupplyQuantity;
           this.inStockSupplyQuantity = inStockSupplyQuantity;
           this.earliestAvailability = earliestAvailability;
           this.supplyDetail = supplyDetail;
    }


    /**
     * Gets the merchantSKU value for this MerchantSKUSupply.
     * 
     * @return merchantSKU
     */
    public java.lang.String getMerchantSKU() {
        return merchantSKU;
    }


    /**
     * Sets the merchantSKU value for this MerchantSKUSupply.
     * 
     * @param merchantSKU
     */
    public void setMerchantSKU(java.lang.String merchantSKU) {
        this.merchantSKU = merchantSKU;
    }


    /**
     * Gets the fulfillmentNetworkSKU value for this MerchantSKUSupply.
     * 
     * @return fulfillmentNetworkSKU
     */
    public java.lang.String getFulfillmentNetworkSKU() {
        return fulfillmentNetworkSKU;
    }


    /**
     * Sets the fulfillmentNetworkSKU value for this MerchantSKUSupply.
     * 
     * @param fulfillmentNetworkSKU
     */
    public void setFulfillmentNetworkSKU(java.lang.String fulfillmentNetworkSKU) {
        this.fulfillmentNetworkSKU = fulfillmentNetworkSKU;
    }


    /**
     * Gets the ASIN value for this MerchantSKUSupply.
     * 
     * @return ASIN
     */
    public java.lang.String getASIN() {
        return ASIN;
    }


    /**
     * Sets the ASIN value for this MerchantSKUSupply.
     * 
     * @param ASIN
     */
    public void setASIN(java.lang.String ASIN) {
        this.ASIN = ASIN;
    }


    /**
     * Gets the condition value for this MerchantSKUSupply.
     * 
     * @return condition
     */
    public java.lang.String getCondition() {
        return condition;
    }


    /**
     * Sets the condition value for this MerchantSKUSupply.
     * 
     * @param condition
     */
    public void setCondition(java.lang.String condition) {
        this.condition = condition;
    }


    /**
     * Gets the totalSupplyQuantity value for this MerchantSKUSupply.
     * 
     * @return totalSupplyQuantity
     */
    public int getTotalSupplyQuantity() {
        return totalSupplyQuantity;
    }


    /**
     * Sets the totalSupplyQuantity value for this MerchantSKUSupply.
     * 
     * @param totalSupplyQuantity
     */
    public void setTotalSupplyQuantity(int totalSupplyQuantity) {
        this.totalSupplyQuantity = totalSupplyQuantity;
    }


    /**
     * Gets the inStockSupplyQuantity value for this MerchantSKUSupply.
     * 
     * @return inStockSupplyQuantity
     */
    public int getInStockSupplyQuantity() {
        return inStockSupplyQuantity;
    }


    /**
     * Sets the inStockSupplyQuantity value for this MerchantSKUSupply.
     * 
     * @param inStockSupplyQuantity
     */
    public void setInStockSupplyQuantity(int inStockSupplyQuantity) {
        this.inStockSupplyQuantity = inStockSupplyQuantity;
    }


    /**
     * Gets the earliestAvailability value for this MerchantSKUSupply.
     * 
     * @return earliestAvailability
     */
    public com.amazonaws.fba_inventory.doc._2009_07_31.Timepoint getEarliestAvailability() {
        return earliestAvailability;
    }


    /**
     * Sets the earliestAvailability value for this MerchantSKUSupply.
     * 
     * @param earliestAvailability
     */
    public void setEarliestAvailability(com.amazonaws.fba_inventory.doc._2009_07_31.Timepoint earliestAvailability) {
        this.earliestAvailability = earliestAvailability;
    }


    /**
     * Gets the supplyDetail value for this MerchantSKUSupply.
     * 
     * @return supplyDetail
     */
    public com.amazonaws.fba_inventory.doc._2009_07_31.SupplyDetail[] getSupplyDetail() {
        return supplyDetail;
    }


    /**
     * Sets the supplyDetail value for this MerchantSKUSupply.
     * 
     * @param supplyDetail
     */
    public void setSupplyDetail(com.amazonaws.fba_inventory.doc._2009_07_31.SupplyDetail[] supplyDetail) {
        this.supplyDetail = supplyDetail;
    }

    public com.amazonaws.fba_inventory.doc._2009_07_31.SupplyDetail getSupplyDetail(int i) {
        return this.supplyDetail[i];
    }

    public void setSupplyDetail(int i, com.amazonaws.fba_inventory.doc._2009_07_31.SupplyDetail _value) {
        this.supplyDetail[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MerchantSKUSupply)) return false;
        MerchantSKUSupply other = (MerchantSKUSupply) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.merchantSKU==null && other.getMerchantSKU()==null) || 
             (this.merchantSKU!=null &&
              this.merchantSKU.equals(other.getMerchantSKU()))) &&
            ((this.fulfillmentNetworkSKU==null && other.getFulfillmentNetworkSKU()==null) || 
             (this.fulfillmentNetworkSKU!=null &&
              this.fulfillmentNetworkSKU.equals(other.getFulfillmentNetworkSKU()))) &&
            ((this.ASIN==null && other.getASIN()==null) || 
             (this.ASIN!=null &&
              this.ASIN.equals(other.getASIN()))) &&
            ((this.condition==null && other.getCondition()==null) || 
             (this.condition!=null &&
              this.condition.equals(other.getCondition()))) &&
            this.totalSupplyQuantity == other.getTotalSupplyQuantity() &&
            this.inStockSupplyQuantity == other.getInStockSupplyQuantity() &&
            ((this.earliestAvailability==null && other.getEarliestAvailability()==null) || 
             (this.earliestAvailability!=null &&
              this.earliestAvailability.equals(other.getEarliestAvailability()))) &&
            ((this.supplyDetail==null && other.getSupplyDetail()==null) || 
             (this.supplyDetail!=null &&
              java.util.Arrays.equals(this.supplyDetail, other.getSupplyDetail())));
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
        if (getMerchantSKU() != null) {
            _hashCode += getMerchantSKU().hashCode();
        }
        if (getFulfillmentNetworkSKU() != null) {
            _hashCode += getFulfillmentNetworkSKU().hashCode();
        }
        if (getASIN() != null) {
            _hashCode += getASIN().hashCode();
        }
        if (getCondition() != null) {
            _hashCode += getCondition().hashCode();
        }
        _hashCode += getTotalSupplyQuantity();
        _hashCode += getInStockSupplyQuantity();
        if (getEarliestAvailability() != null) {
            _hashCode += getEarliestAvailability().hashCode();
        }
        if (getSupplyDetail() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSupplyDetail());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSupplyDetail(), i);
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
        new org.apache.axis.description.TypeDesc(MerchantSKUSupply.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fba-inventory.amazonaws.com/doc/2009-07-31/", "MerchantSKUSupply"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantSKU");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-inventory.amazonaws.com/doc/2009-07-31/", "MerchantSKU"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fulfillmentNetworkSKU");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-inventory.amazonaws.com/doc/2009-07-31/", "FulfillmentNetworkSKU"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ASIN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-inventory.amazonaws.com/doc/2009-07-31/", "ASIN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("condition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-inventory.amazonaws.com/doc/2009-07-31/", "Condition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalSupplyQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-inventory.amazonaws.com/doc/2009-07-31/", "TotalSupplyQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inStockSupplyQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-inventory.amazonaws.com/doc/2009-07-31/", "InStockSupplyQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("earliestAvailability");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-inventory.amazonaws.com/doc/2009-07-31/", "EarliestAvailability"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fba-inventory.amazonaws.com/doc/2009-07-31/", "Timepoint"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supplyDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-inventory.amazonaws.com/doc/2009-07-31/", "SupplyDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fba-inventory.amazonaws.com/doc/2009-07-31/", "SupplyDetail"));
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
