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
 * FulfillmentOrderItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazonaws.fba_outbound.doc._2007_08_02;


/**
 * The MerchantFulfillmentOrderItemId must be unique for all items
 * in the same fulfillment order. This value can be used to
 *             disambiguate multiple fulfillment items that have the
 * same SKU.
 *             If your system already has a unique order line-item identifier,
 * then that may be a good value to put in this field.
 * 
 *             DisplayableComment contains a value that will appear in
 * recipient-facing materials such as the packing slip.
 * 
 *             FulfillmentNetworkSKU may be specified when the active
 * merchant SKU
 *             doesn't map to the desired fulfillment network SKU (FNSKU);
 * please
 *             note the merchant SKU is always required.  The value is
 * only ever
 *             considered when Removal fulfillment method is selected.
 * 
 *             OrderItemDisposition indicates the disposition of the
 * inventory,
 *             either Sellable or Unsellable.  The Unsellable disposition
 * is only
 *             permitted when Removal fulfillment method is selected.
 * See enumeration for possible values, default is Sellable.
 * 
 *             PerUnitDeclaredValue is the monetary value assigned by
 * the
 *             merchant to each unit of inventory of the merchantSku
 * for this line
 *             item. If not specified, it defaults to zero.
 */
public class FulfillmentOrderItem  implements java.io.Serializable {
    private java.lang.String merchantSKU;

    private java.lang.String merchantFulfillmentOrderItemId;

    private int quantity;

    private java.lang.String giftMessage;

    private java.lang.String displayableComment;

    private java.lang.String fulfillmentNetworkSKU;

    private java.lang.String orderItemDisposition;

    private int cancelledQuantity;

    private int unfulfillableQuantity;

    private java.lang.String estimatedShipDateTime;

    private java.lang.String estimatedArrivalDateTime;

    private com.amazonaws.fba_outbound.doc._2007_08_02.Currency perUnitDeclaredValue;

    public FulfillmentOrderItem() {
    }

    public FulfillmentOrderItem(
           java.lang.String merchantSKU,
           java.lang.String merchantFulfillmentOrderItemId,
           int quantity,
           java.lang.String giftMessage,
           java.lang.String displayableComment,
           java.lang.String fulfillmentNetworkSKU,
           java.lang.String orderItemDisposition,
           int cancelledQuantity,
           int unfulfillableQuantity,
           java.lang.String estimatedShipDateTime,
           java.lang.String estimatedArrivalDateTime,
           com.amazonaws.fba_outbound.doc._2007_08_02.Currency perUnitDeclaredValue) {
           this.merchantSKU = merchantSKU;
           this.merchantFulfillmentOrderItemId = merchantFulfillmentOrderItemId;
           this.quantity = quantity;
           this.giftMessage = giftMessage;
           this.displayableComment = displayableComment;
           this.fulfillmentNetworkSKU = fulfillmentNetworkSKU;
           this.orderItemDisposition = orderItemDisposition;
           this.cancelledQuantity = cancelledQuantity;
           this.unfulfillableQuantity = unfulfillableQuantity;
           this.estimatedShipDateTime = estimatedShipDateTime;
           this.estimatedArrivalDateTime = estimatedArrivalDateTime;
           this.perUnitDeclaredValue = perUnitDeclaredValue;
    }


    /**
     * Gets the merchantSKU value for this FulfillmentOrderItem.
     * 
     * @return merchantSKU
     */
    public java.lang.String getMerchantSKU() {
        return merchantSKU;
    }


    /**
     * Sets the merchantSKU value for this FulfillmentOrderItem.
     * 
     * @param merchantSKU
     */
    public void setMerchantSKU(java.lang.String merchantSKU) {
        this.merchantSKU = merchantSKU;
    }


    /**
     * Gets the merchantFulfillmentOrderItemId value for this FulfillmentOrderItem.
     * 
     * @return merchantFulfillmentOrderItemId
     */
    public java.lang.String getMerchantFulfillmentOrderItemId() {
        return merchantFulfillmentOrderItemId;
    }


    /**
     * Sets the merchantFulfillmentOrderItemId value for this FulfillmentOrderItem.
     * 
     * @param merchantFulfillmentOrderItemId
     */
    public void setMerchantFulfillmentOrderItemId(java.lang.String merchantFulfillmentOrderItemId) {
        this.merchantFulfillmentOrderItemId = merchantFulfillmentOrderItemId;
    }


    /**
     * Gets the quantity value for this FulfillmentOrderItem.
     * 
     * @return quantity
     */
    public int getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this FulfillmentOrderItem.
     * 
     * @param quantity
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the giftMessage value for this FulfillmentOrderItem.
     * 
     * @return giftMessage
     */
    public java.lang.String getGiftMessage() {
        return giftMessage;
    }


    /**
     * Sets the giftMessage value for this FulfillmentOrderItem.
     * 
     * @param giftMessage
     */
    public void setGiftMessage(java.lang.String giftMessage) {
        this.giftMessage = giftMessage;
    }


    /**
     * Gets the displayableComment value for this FulfillmentOrderItem.
     * 
     * @return displayableComment
     */
    public java.lang.String getDisplayableComment() {
        return displayableComment;
    }


    /**
     * Sets the displayableComment value for this FulfillmentOrderItem.
     * 
     * @param displayableComment
     */
    public void setDisplayableComment(java.lang.String displayableComment) {
        this.displayableComment = displayableComment;
    }


    /**
     * Gets the fulfillmentNetworkSKU value for this FulfillmentOrderItem.
     * 
     * @return fulfillmentNetworkSKU
     */
    public java.lang.String getFulfillmentNetworkSKU() {
        return fulfillmentNetworkSKU;
    }


    /**
     * Sets the fulfillmentNetworkSKU value for this FulfillmentOrderItem.
     * 
     * @param fulfillmentNetworkSKU
     */
    public void setFulfillmentNetworkSKU(java.lang.String fulfillmentNetworkSKU) {
        this.fulfillmentNetworkSKU = fulfillmentNetworkSKU;
    }


    /**
     * Gets the orderItemDisposition value for this FulfillmentOrderItem.
     * 
     * @return orderItemDisposition
     */
    public java.lang.String getOrderItemDisposition() {
        return orderItemDisposition;
    }


    /**
     * Sets the orderItemDisposition value for this FulfillmentOrderItem.
     * 
     * @param orderItemDisposition
     */
    public void setOrderItemDisposition(java.lang.String orderItemDisposition) {
        this.orderItemDisposition = orderItemDisposition;
    }


    /**
     * Gets the cancelledQuantity value for this FulfillmentOrderItem.
     * 
     * @return cancelledQuantity
     */
    public int getCancelledQuantity() {
        return cancelledQuantity;
    }


    /**
     * Sets the cancelledQuantity value for this FulfillmentOrderItem.
     * 
     * @param cancelledQuantity
     */
    public void setCancelledQuantity(int cancelledQuantity) {
        this.cancelledQuantity = cancelledQuantity;
    }


    /**
     * Gets the unfulfillableQuantity value for this FulfillmentOrderItem.
     * 
     * @return unfulfillableQuantity
     */
    public int getUnfulfillableQuantity() {
        return unfulfillableQuantity;
    }


    /**
     * Sets the unfulfillableQuantity value for this FulfillmentOrderItem.
     * 
     * @param unfulfillableQuantity
     */
    public void setUnfulfillableQuantity(int unfulfillableQuantity) {
        this.unfulfillableQuantity = unfulfillableQuantity;
    }


    /**
     * Gets the estimatedShipDateTime value for this FulfillmentOrderItem.
     * 
     * @return estimatedShipDateTime
     */
    public java.lang.String getEstimatedShipDateTime() {
        return estimatedShipDateTime;
    }


    /**
     * Sets the estimatedShipDateTime value for this FulfillmentOrderItem.
     * 
     * @param estimatedShipDateTime
     */
    public void setEstimatedShipDateTime(java.lang.String estimatedShipDateTime) {
        this.estimatedShipDateTime = estimatedShipDateTime;
    }


    /**
     * Gets the estimatedArrivalDateTime value for this FulfillmentOrderItem.
     * 
     * @return estimatedArrivalDateTime
     */
    public java.lang.String getEstimatedArrivalDateTime() {
        return estimatedArrivalDateTime;
    }


    /**
     * Sets the estimatedArrivalDateTime value for this FulfillmentOrderItem.
     * 
     * @param estimatedArrivalDateTime
     */
    public void setEstimatedArrivalDateTime(java.lang.String estimatedArrivalDateTime) {
        this.estimatedArrivalDateTime = estimatedArrivalDateTime;
    }


    /**
     * Gets the perUnitDeclaredValue value for this FulfillmentOrderItem.
     * 
     * @return perUnitDeclaredValue
     */
    public com.amazonaws.fba_outbound.doc._2007_08_02.Currency getPerUnitDeclaredValue() {
        return perUnitDeclaredValue;
    }


    /**
     * Sets the perUnitDeclaredValue value for this FulfillmentOrderItem.
     * 
     * @param perUnitDeclaredValue
     */
    public void setPerUnitDeclaredValue(com.amazonaws.fba_outbound.doc._2007_08_02.Currency perUnitDeclaredValue) {
        this.perUnitDeclaredValue = perUnitDeclaredValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FulfillmentOrderItem)) return false;
        FulfillmentOrderItem other = (FulfillmentOrderItem) obj;
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
            ((this.merchantFulfillmentOrderItemId==null && other.getMerchantFulfillmentOrderItemId()==null) || 
             (this.merchantFulfillmentOrderItemId!=null &&
              this.merchantFulfillmentOrderItemId.equals(other.getMerchantFulfillmentOrderItemId()))) &&
            this.quantity == other.getQuantity() &&
            ((this.giftMessage==null && other.getGiftMessage()==null) || 
             (this.giftMessage!=null &&
              this.giftMessage.equals(other.getGiftMessage()))) &&
            ((this.displayableComment==null && other.getDisplayableComment()==null) || 
             (this.displayableComment!=null &&
              this.displayableComment.equals(other.getDisplayableComment()))) &&
            ((this.fulfillmentNetworkSKU==null && other.getFulfillmentNetworkSKU()==null) || 
             (this.fulfillmentNetworkSKU!=null &&
              this.fulfillmentNetworkSKU.equals(other.getFulfillmentNetworkSKU()))) &&
            ((this.orderItemDisposition==null && other.getOrderItemDisposition()==null) || 
             (this.orderItemDisposition!=null &&
              this.orderItemDisposition.equals(other.getOrderItemDisposition()))) &&
            this.cancelledQuantity == other.getCancelledQuantity() &&
            this.unfulfillableQuantity == other.getUnfulfillableQuantity() &&
            ((this.estimatedShipDateTime==null && other.getEstimatedShipDateTime()==null) || 
             (this.estimatedShipDateTime!=null &&
              this.estimatedShipDateTime.equals(other.getEstimatedShipDateTime()))) &&
            ((this.estimatedArrivalDateTime==null && other.getEstimatedArrivalDateTime()==null) || 
             (this.estimatedArrivalDateTime!=null &&
              this.estimatedArrivalDateTime.equals(other.getEstimatedArrivalDateTime()))) &&
            ((this.perUnitDeclaredValue==null && other.getPerUnitDeclaredValue()==null) || 
             (this.perUnitDeclaredValue!=null &&
              this.perUnitDeclaredValue.equals(other.getPerUnitDeclaredValue())));
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
        if (getMerchantFulfillmentOrderItemId() != null) {
            _hashCode += getMerchantFulfillmentOrderItemId().hashCode();
        }
        _hashCode += getQuantity();
        if (getGiftMessage() != null) {
            _hashCode += getGiftMessage().hashCode();
        }
        if (getDisplayableComment() != null) {
            _hashCode += getDisplayableComment().hashCode();
        }
        if (getFulfillmentNetworkSKU() != null) {
            _hashCode += getFulfillmentNetworkSKU().hashCode();
        }
        if (getOrderItemDisposition() != null) {
            _hashCode += getOrderItemDisposition().hashCode();
        }
        _hashCode += getCancelledQuantity();
        _hashCode += getUnfulfillableQuantity();
        if (getEstimatedShipDateTime() != null) {
            _hashCode += getEstimatedShipDateTime().hashCode();
        }
        if (getEstimatedArrivalDateTime() != null) {
            _hashCode += getEstimatedArrivalDateTime().hashCode();
        }
        if (getPerUnitDeclaredValue() != null) {
            _hashCode += getPerUnitDeclaredValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FulfillmentOrderItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "FulfillmentOrderItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantSKU");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "MerchantSKU"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantFulfillmentOrderItemId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "MerchantFulfillmentOrderItemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "Quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giftMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "GiftMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayableComment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "DisplayableComment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fulfillmentNetworkSKU");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "FulfillmentNetworkSKU"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderItemDisposition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "OrderItemDisposition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancelledQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "CancelledQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unfulfillableQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "UnfulfillableQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedShipDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "EstimatedShipDateTime"));
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
        elemField.setFieldName("perUnitDeclaredValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "PerUnitDeclaredValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "Currency"));
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
