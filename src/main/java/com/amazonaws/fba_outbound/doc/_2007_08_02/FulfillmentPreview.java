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
 * FulfillmentPreview.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazonaws.fba_outbound.doc._2007_08_02;


/**
 * Provides information regarding the fulfillability of 
 *             an order and a specific shipping speed. This can also
 * provide
 *             information regarding the fees associated with fulfilling
 * this
 *             order.
 * 
 *             ShippingSpeedCategory - provides the relative speed for
 * this particular order
 * 
 *             IsFulfillable - True means Fulfillable, False means Unfulfillable
 * 
 * 
 *             EstimatedShippingWeight - the estimated shipping weight
 * for the shipment
 *                                       described.
 *             EstimatedFees -  if applicable the estimated fees for
 * this order
 * 
 *             FulfillmentPreviewShipments - a list of fulfillable shipments
 * UnfulfillableItems - a list of unfulfillable items
 * 
 *             OrderUnfulfillableReasons - error codes associated at
 * the order level. 
 *                                    Tries to explain why the order
 * was unfulfillable. 
 *                                    * DeliverySLAUnavailable
 *                                    * InvalidDestinationAddress
 */
public class FulfillmentPreview  implements java.io.Serializable {
    private java.lang.String shippingSpeedCategory;

    private boolean isFulfillable;

    private com.amazonaws.fba_outbound.doc._2007_08_02.Weight estimatedShippingWeight;

    private com.amazonaws.fba_outbound.doc._2007_08_02.Fee[] estimatedFees;

    private com.amazonaws.fba_outbound.doc._2007_08_02.FulfillmentPreviewShipment[] fulfillmentPreviewShipments;

    private com.amazonaws.fba_outbound.doc._2007_08_02.UnfulfillablePreviewItem[] unfulfillablePreviewItems;

    private java.lang.String[] orderUnfulfillableReasons;

    public FulfillmentPreview() {
    }

    public FulfillmentPreview(
           java.lang.String shippingSpeedCategory,
           boolean isFulfillable,
           com.amazonaws.fba_outbound.doc._2007_08_02.Weight estimatedShippingWeight,
           com.amazonaws.fba_outbound.doc._2007_08_02.Fee[] estimatedFees,
           com.amazonaws.fba_outbound.doc._2007_08_02.FulfillmentPreviewShipment[] fulfillmentPreviewShipments,
           com.amazonaws.fba_outbound.doc._2007_08_02.UnfulfillablePreviewItem[] unfulfillablePreviewItems,
           java.lang.String[] orderUnfulfillableReasons) {
           this.shippingSpeedCategory = shippingSpeedCategory;
           this.isFulfillable = isFulfillable;
           this.estimatedShippingWeight = estimatedShippingWeight;
           this.estimatedFees = estimatedFees;
           this.fulfillmentPreviewShipments = fulfillmentPreviewShipments;
           this.unfulfillablePreviewItems = unfulfillablePreviewItems;
           this.orderUnfulfillableReasons = orderUnfulfillableReasons;
    }


    /**
     * Gets the shippingSpeedCategory value for this FulfillmentPreview.
     * 
     * @return shippingSpeedCategory
     */
    public java.lang.String getShippingSpeedCategory() {
        return shippingSpeedCategory;
    }


    /**
     * Sets the shippingSpeedCategory value for this FulfillmentPreview.
     * 
     * @param shippingSpeedCategory
     */
    public void setShippingSpeedCategory(java.lang.String shippingSpeedCategory) {
        this.shippingSpeedCategory = shippingSpeedCategory;
    }


    /**
     * Gets the isFulfillable value for this FulfillmentPreview.
     * 
     * @return isFulfillable
     */
    public boolean isIsFulfillable() {
        return isFulfillable;
    }


    /**
     * Sets the isFulfillable value for this FulfillmentPreview.
     * 
     * @param isFulfillable
     */
    public void setIsFulfillable(boolean isFulfillable) {
        this.isFulfillable = isFulfillable;
    }


    /**
     * Gets the estimatedShippingWeight value for this FulfillmentPreview.
     * 
     * @return estimatedShippingWeight
     */
    public com.amazonaws.fba_outbound.doc._2007_08_02.Weight getEstimatedShippingWeight() {
        return estimatedShippingWeight;
    }


    /**
     * Sets the estimatedShippingWeight value for this FulfillmentPreview.
     * 
     * @param estimatedShippingWeight
     */
    public void setEstimatedShippingWeight(com.amazonaws.fba_outbound.doc._2007_08_02.Weight estimatedShippingWeight) {
        this.estimatedShippingWeight = estimatedShippingWeight;
    }


    /**
     * Gets the estimatedFees value for this FulfillmentPreview.
     * 
     * @return estimatedFees
     */
    public com.amazonaws.fba_outbound.doc._2007_08_02.Fee[] getEstimatedFees() {
        return estimatedFees;
    }


    /**
     * Sets the estimatedFees value for this FulfillmentPreview.
     * 
     * @param estimatedFees
     */
    public void setEstimatedFees(com.amazonaws.fba_outbound.doc._2007_08_02.Fee[] estimatedFees) {
        this.estimatedFees = estimatedFees;
    }

    public com.amazonaws.fba_outbound.doc._2007_08_02.Fee getEstimatedFees(int i) {
        return this.estimatedFees[i];
    }

    public void setEstimatedFees(int i, com.amazonaws.fba_outbound.doc._2007_08_02.Fee _value) {
        this.estimatedFees[i] = _value;
    }


    /**
     * Gets the fulfillmentPreviewShipments value for this FulfillmentPreview.
     * 
     * @return fulfillmentPreviewShipments
     */
    public com.amazonaws.fba_outbound.doc._2007_08_02.FulfillmentPreviewShipment[] getFulfillmentPreviewShipments() {
        return fulfillmentPreviewShipments;
    }


    /**
     * Sets the fulfillmentPreviewShipments value for this FulfillmentPreview.
     * 
     * @param fulfillmentPreviewShipments
     */
    public void setFulfillmentPreviewShipments(com.amazonaws.fba_outbound.doc._2007_08_02.FulfillmentPreviewShipment[] fulfillmentPreviewShipments) {
        this.fulfillmentPreviewShipments = fulfillmentPreviewShipments;
    }

    public com.amazonaws.fba_outbound.doc._2007_08_02.FulfillmentPreviewShipment getFulfillmentPreviewShipments(int i) {
        return this.fulfillmentPreviewShipments[i];
    }

    public void setFulfillmentPreviewShipments(int i, com.amazonaws.fba_outbound.doc._2007_08_02.FulfillmentPreviewShipment _value) {
        this.fulfillmentPreviewShipments[i] = _value;
    }


    /**
     * Gets the unfulfillablePreviewItems value for this FulfillmentPreview.
     * 
     * @return unfulfillablePreviewItems
     */
    public com.amazonaws.fba_outbound.doc._2007_08_02.UnfulfillablePreviewItem[] getUnfulfillablePreviewItems() {
        return unfulfillablePreviewItems;
    }


    /**
     * Sets the unfulfillablePreviewItems value for this FulfillmentPreview.
     * 
     * @param unfulfillablePreviewItems
     */
    public void setUnfulfillablePreviewItems(com.amazonaws.fba_outbound.doc._2007_08_02.UnfulfillablePreviewItem[] unfulfillablePreviewItems) {
        this.unfulfillablePreviewItems = unfulfillablePreviewItems;
    }

    public com.amazonaws.fba_outbound.doc._2007_08_02.UnfulfillablePreviewItem getUnfulfillablePreviewItems(int i) {
        return this.unfulfillablePreviewItems[i];
    }

    public void setUnfulfillablePreviewItems(int i, com.amazonaws.fba_outbound.doc._2007_08_02.UnfulfillablePreviewItem _value) {
        this.unfulfillablePreviewItems[i] = _value;
    }


    /**
     * Gets the orderUnfulfillableReasons value for this FulfillmentPreview.
     * 
     * @return orderUnfulfillableReasons
     */
    public java.lang.String[] getOrderUnfulfillableReasons() {
        return orderUnfulfillableReasons;
    }


    /**
     * Sets the orderUnfulfillableReasons value for this FulfillmentPreview.
     * 
     * @param orderUnfulfillableReasons
     */
    public void setOrderUnfulfillableReasons(java.lang.String[] orderUnfulfillableReasons) {
        this.orderUnfulfillableReasons = orderUnfulfillableReasons;
    }

    public java.lang.String getOrderUnfulfillableReasons(int i) {
        return this.orderUnfulfillableReasons[i];
    }

    public void setOrderUnfulfillableReasons(int i, java.lang.String _value) {
        this.orderUnfulfillableReasons[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FulfillmentPreview)) return false;
        FulfillmentPreview other = (FulfillmentPreview) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.shippingSpeedCategory==null && other.getShippingSpeedCategory()==null) || 
             (this.shippingSpeedCategory!=null &&
              this.shippingSpeedCategory.equals(other.getShippingSpeedCategory()))) &&
            this.isFulfillable == other.isIsFulfillable() &&
            ((this.estimatedShippingWeight==null && other.getEstimatedShippingWeight()==null) || 
             (this.estimatedShippingWeight!=null &&
              this.estimatedShippingWeight.equals(other.getEstimatedShippingWeight()))) &&
            ((this.estimatedFees==null && other.getEstimatedFees()==null) || 
             (this.estimatedFees!=null &&
              java.util.Arrays.equals(this.estimatedFees, other.getEstimatedFees()))) &&
            ((this.fulfillmentPreviewShipments==null && other.getFulfillmentPreviewShipments()==null) || 
             (this.fulfillmentPreviewShipments!=null &&
              java.util.Arrays.equals(this.fulfillmentPreviewShipments, other.getFulfillmentPreviewShipments()))) &&
            ((this.unfulfillablePreviewItems==null && other.getUnfulfillablePreviewItems()==null) || 
             (this.unfulfillablePreviewItems!=null &&
              java.util.Arrays.equals(this.unfulfillablePreviewItems, other.getUnfulfillablePreviewItems()))) &&
            ((this.orderUnfulfillableReasons==null && other.getOrderUnfulfillableReasons()==null) || 
             (this.orderUnfulfillableReasons!=null &&
              java.util.Arrays.equals(this.orderUnfulfillableReasons, other.getOrderUnfulfillableReasons())));
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
        if (getShippingSpeedCategory() != null) {
            _hashCode += getShippingSpeedCategory().hashCode();
        }
        _hashCode += (isIsFulfillable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getEstimatedShippingWeight() != null) {
            _hashCode += getEstimatedShippingWeight().hashCode();
        }
        if (getEstimatedFees() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEstimatedFees());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEstimatedFees(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFulfillmentPreviewShipments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFulfillmentPreviewShipments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFulfillmentPreviewShipments(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUnfulfillablePreviewItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUnfulfillablePreviewItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUnfulfillablePreviewItems(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOrderUnfulfillableReasons() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOrderUnfulfillableReasons());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOrderUnfulfillableReasons(), i);
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
        new org.apache.axis.description.TypeDesc(FulfillmentPreview.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "FulfillmentPreview"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingSpeedCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "ShippingSpeedCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isFulfillable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "IsFulfillable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedShippingWeight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "EstimatedShippingWeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "Weight"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedFees");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "EstimatedFees"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "Fee"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fulfillmentPreviewShipments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "FulfillmentPreviewShipments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "FulfillmentPreviewShipment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unfulfillablePreviewItems");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "UnfulfillablePreviewItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "UnfulfillablePreviewItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderUnfulfillableReasons");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "OrderUnfulfillableReasons"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
