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
 * FulfillmentOrder.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazonaws.fba_outbound.doc._2007_08_02;


/**
 * The MerchantFulfillmentOrderId must be unique for all fulfillment
 * orders created by the merchant. If your system already has a unique
 * order identifier, then that may be a good value to put in this
 *             field.
 * 
 *             This DisplayableOrderDate will appear as the "order date"
 * in
 *             recipient-facing materials such as the packing slip. The
 * DisplayableOrderId will appear as the "order id" in those
 *             materials, and the DisplayableOrderComment will appear
 * as well.
 * 
 *             The ReceivedDate indicates when Amazon received the
 *             CreateFulfillmentOrder request for this order.
 * 
 *             The StatusUpdatedDate indicates when Status of this order
 * last
 *             changed.
 * 
 *             ShippingSpeedCategory is the Service Level Agreement for
 * how long it will
 *             take a shipment to be transported from the fulfillment
 * center to
 *             the recipient, once shipped.
 *             See enumeration for possible values, no default.
 * 
 *             FulfillmentPolicy indicates how unfulfillable items should
 * be handled.
 *             See enumeration for possible values, default is FillOrKill.
 * 
 *             FulfillmentMethod indicates the intended recipient channel
 * for the
 *             order whether it be a consumer order or inventory return.
 * See enumeration for possible values, default is Consumer.
 * 
 *             NotificationEmailList can be used to provide a list of
 * e-mail 
 *             addresses to receive ship-complete e-mail notifications.
 * These 
 *             e-mails are customer-facing e-mails sent by FBA on behalf
 * of 
 *             the merchant.
 */
public class FulfillmentOrder  implements java.io.Serializable {
    private java.lang.String merchantFulfillmentOrderId;

    private java.lang.String displayableOrderId;

    private java.lang.String displayableOrderDateTime;

    private java.lang.String displayableOrderComment;

    private java.lang.String shippingSpeedCategory;

    private com.amazonaws.fba_outbound.doc._2007_08_02.Address destinationAddress;

    private java.lang.String fulfillmentPolicy;

    private java.lang.String fulfillmentMethod;

    private java.lang.String receivedDateTime;

    private com.amazonaws.fba_outbound.doc._2007_08_02.FulfillmentOrderStatus fulfillmentOrderStatus;

    private java.lang.String statusUpdatedDateTime;

    private java.lang.String[] notificationEmailList;

    public FulfillmentOrder() {
    }

    public FulfillmentOrder(
           java.lang.String merchantFulfillmentOrderId,
           java.lang.String displayableOrderId,
           java.lang.String displayableOrderDateTime,
           java.lang.String displayableOrderComment,
           java.lang.String shippingSpeedCategory,
           com.amazonaws.fba_outbound.doc._2007_08_02.Address destinationAddress,
           java.lang.String fulfillmentPolicy,
           java.lang.String fulfillmentMethod,
           java.lang.String receivedDateTime,
           com.amazonaws.fba_outbound.doc._2007_08_02.FulfillmentOrderStatus fulfillmentOrderStatus,
           java.lang.String statusUpdatedDateTime,
           java.lang.String[] notificationEmailList) {
           this.merchantFulfillmentOrderId = merchantFulfillmentOrderId;
           this.displayableOrderId = displayableOrderId;
           this.displayableOrderDateTime = displayableOrderDateTime;
           this.displayableOrderComment = displayableOrderComment;
           this.shippingSpeedCategory = shippingSpeedCategory;
           this.destinationAddress = destinationAddress;
           this.fulfillmentPolicy = fulfillmentPolicy;
           this.fulfillmentMethod = fulfillmentMethod;
           this.receivedDateTime = receivedDateTime;
           this.fulfillmentOrderStatus = fulfillmentOrderStatus;
           this.statusUpdatedDateTime = statusUpdatedDateTime;
           this.notificationEmailList = notificationEmailList;
    }


    /**
     * Gets the merchantFulfillmentOrderId value for this FulfillmentOrder.
     * 
     * @return merchantFulfillmentOrderId
     */
    public java.lang.String getMerchantFulfillmentOrderId() {
        return merchantFulfillmentOrderId;
    }


    /**
     * Sets the merchantFulfillmentOrderId value for this FulfillmentOrder.
     * 
     * @param merchantFulfillmentOrderId
     */
    public void setMerchantFulfillmentOrderId(java.lang.String merchantFulfillmentOrderId) {
        this.merchantFulfillmentOrderId = merchantFulfillmentOrderId;
    }


    /**
     * Gets the displayableOrderId value for this FulfillmentOrder.
     * 
     * @return displayableOrderId
     */
    public java.lang.String getDisplayableOrderId() {
        return displayableOrderId;
    }


    /**
     * Sets the displayableOrderId value for this FulfillmentOrder.
     * 
     * @param displayableOrderId
     */
    public void setDisplayableOrderId(java.lang.String displayableOrderId) {
        this.displayableOrderId = displayableOrderId;
    }


    /**
     * Gets the displayableOrderDateTime value for this FulfillmentOrder.
     * 
     * @return displayableOrderDateTime
     */
    public java.lang.String getDisplayableOrderDateTime() {
        return displayableOrderDateTime;
    }


    /**
     * Sets the displayableOrderDateTime value for this FulfillmentOrder.
     * 
     * @param displayableOrderDateTime
     */
    public void setDisplayableOrderDateTime(java.lang.String displayableOrderDateTime) {
        this.displayableOrderDateTime = displayableOrderDateTime;
    }


    /**
     * Gets the displayableOrderComment value for this FulfillmentOrder.
     * 
     * @return displayableOrderComment
     */
    public java.lang.String getDisplayableOrderComment() {
        return displayableOrderComment;
    }


    /**
     * Sets the displayableOrderComment value for this FulfillmentOrder.
     * 
     * @param displayableOrderComment
     */
    public void setDisplayableOrderComment(java.lang.String displayableOrderComment) {
        this.displayableOrderComment = displayableOrderComment;
    }


    /**
     * Gets the shippingSpeedCategory value for this FulfillmentOrder.
     * 
     * @return shippingSpeedCategory
     */
    public java.lang.String getShippingSpeedCategory() {
        return shippingSpeedCategory;
    }


    /**
     * Sets the shippingSpeedCategory value for this FulfillmentOrder.
     * 
     * @param shippingSpeedCategory
     */
    public void setShippingSpeedCategory(java.lang.String shippingSpeedCategory) {
        this.shippingSpeedCategory = shippingSpeedCategory;
    }


    /**
     * Gets the destinationAddress value for this FulfillmentOrder.
     * 
     * @return destinationAddress
     */
    public com.amazonaws.fba_outbound.doc._2007_08_02.Address getDestinationAddress() {
        return destinationAddress;
    }


    /**
     * Sets the destinationAddress value for this FulfillmentOrder.
     * 
     * @param destinationAddress
     */
    public void setDestinationAddress(com.amazonaws.fba_outbound.doc._2007_08_02.Address destinationAddress) {
        this.destinationAddress = destinationAddress;
    }


    /**
     * Gets the fulfillmentPolicy value for this FulfillmentOrder.
     * 
     * @return fulfillmentPolicy
     */
    public java.lang.String getFulfillmentPolicy() {
        return fulfillmentPolicy;
    }


    /**
     * Sets the fulfillmentPolicy value for this FulfillmentOrder.
     * 
     * @param fulfillmentPolicy
     */
    public void setFulfillmentPolicy(java.lang.String fulfillmentPolicy) {
        this.fulfillmentPolicy = fulfillmentPolicy;
    }


    /**
     * Gets the fulfillmentMethod value for this FulfillmentOrder.
     * 
     * @return fulfillmentMethod
     */
    public java.lang.String getFulfillmentMethod() {
        return fulfillmentMethod;
    }


    /**
     * Sets the fulfillmentMethod value for this FulfillmentOrder.
     * 
     * @param fulfillmentMethod
     */
    public void setFulfillmentMethod(java.lang.String fulfillmentMethod) {
        this.fulfillmentMethod = fulfillmentMethod;
    }


    /**
     * Gets the receivedDateTime value for this FulfillmentOrder.
     * 
     * @return receivedDateTime
     */
    public java.lang.String getReceivedDateTime() {
        return receivedDateTime;
    }


    /**
     * Sets the receivedDateTime value for this FulfillmentOrder.
     * 
     * @param receivedDateTime
     */
    public void setReceivedDateTime(java.lang.String receivedDateTime) {
        this.receivedDateTime = receivedDateTime;
    }


    /**
     * Gets the fulfillmentOrderStatus value for this FulfillmentOrder.
     * 
     * @return fulfillmentOrderStatus
     */
    public com.amazonaws.fba_outbound.doc._2007_08_02.FulfillmentOrderStatus getFulfillmentOrderStatus() {
        return fulfillmentOrderStatus;
    }


    /**
     * Sets the fulfillmentOrderStatus value for this FulfillmentOrder.
     * 
     * @param fulfillmentOrderStatus
     */
    public void setFulfillmentOrderStatus(com.amazonaws.fba_outbound.doc._2007_08_02.FulfillmentOrderStatus fulfillmentOrderStatus) {
        this.fulfillmentOrderStatus = fulfillmentOrderStatus;
    }


    /**
     * Gets the statusUpdatedDateTime value for this FulfillmentOrder.
     * 
     * @return statusUpdatedDateTime
     */
    public java.lang.String getStatusUpdatedDateTime() {
        return statusUpdatedDateTime;
    }


    /**
     * Sets the statusUpdatedDateTime value for this FulfillmentOrder.
     * 
     * @param statusUpdatedDateTime
     */
    public void setStatusUpdatedDateTime(java.lang.String statusUpdatedDateTime) {
        this.statusUpdatedDateTime = statusUpdatedDateTime;
    }


    /**
     * Gets the notificationEmailList value for this FulfillmentOrder.
     * 
     * @return notificationEmailList
     */
    public java.lang.String[] getNotificationEmailList() {
        return notificationEmailList;
    }


    /**
     * Sets the notificationEmailList value for this FulfillmentOrder.
     * 
     * @param notificationEmailList
     */
    public void setNotificationEmailList(java.lang.String[] notificationEmailList) {
        this.notificationEmailList = notificationEmailList;
    }

    public java.lang.String getNotificationEmailList(int i) {
        return this.notificationEmailList[i];
    }

    public void setNotificationEmailList(int i, java.lang.String _value) {
        this.notificationEmailList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FulfillmentOrder)) return false;
        FulfillmentOrder other = (FulfillmentOrder) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.merchantFulfillmentOrderId==null && other.getMerchantFulfillmentOrderId()==null) || 
             (this.merchantFulfillmentOrderId!=null &&
              this.merchantFulfillmentOrderId.equals(other.getMerchantFulfillmentOrderId()))) &&
            ((this.displayableOrderId==null && other.getDisplayableOrderId()==null) || 
             (this.displayableOrderId!=null &&
              this.displayableOrderId.equals(other.getDisplayableOrderId()))) &&
            ((this.displayableOrderDateTime==null && other.getDisplayableOrderDateTime()==null) || 
             (this.displayableOrderDateTime!=null &&
              this.displayableOrderDateTime.equals(other.getDisplayableOrderDateTime()))) &&
            ((this.displayableOrderComment==null && other.getDisplayableOrderComment()==null) || 
             (this.displayableOrderComment!=null &&
              this.displayableOrderComment.equals(other.getDisplayableOrderComment()))) &&
            ((this.shippingSpeedCategory==null && other.getShippingSpeedCategory()==null) || 
             (this.shippingSpeedCategory!=null &&
              this.shippingSpeedCategory.equals(other.getShippingSpeedCategory()))) &&
            ((this.destinationAddress==null && other.getDestinationAddress()==null) || 
             (this.destinationAddress!=null &&
              this.destinationAddress.equals(other.getDestinationAddress()))) &&
            ((this.fulfillmentPolicy==null && other.getFulfillmentPolicy()==null) || 
             (this.fulfillmentPolicy!=null &&
              this.fulfillmentPolicy.equals(other.getFulfillmentPolicy()))) &&
            ((this.fulfillmentMethod==null && other.getFulfillmentMethod()==null) || 
             (this.fulfillmentMethod!=null &&
              this.fulfillmentMethod.equals(other.getFulfillmentMethod()))) &&
            ((this.receivedDateTime==null && other.getReceivedDateTime()==null) || 
             (this.receivedDateTime!=null &&
              this.receivedDateTime.equals(other.getReceivedDateTime()))) &&
            ((this.fulfillmentOrderStatus==null && other.getFulfillmentOrderStatus()==null) || 
             (this.fulfillmentOrderStatus!=null &&
              this.fulfillmentOrderStatus.equals(other.getFulfillmentOrderStatus()))) &&
            ((this.statusUpdatedDateTime==null && other.getStatusUpdatedDateTime()==null) || 
             (this.statusUpdatedDateTime!=null &&
              this.statusUpdatedDateTime.equals(other.getStatusUpdatedDateTime()))) &&
            ((this.notificationEmailList==null && other.getNotificationEmailList()==null) || 
             (this.notificationEmailList!=null &&
              java.util.Arrays.equals(this.notificationEmailList, other.getNotificationEmailList())));
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
        if (getMerchantFulfillmentOrderId() != null) {
            _hashCode += getMerchantFulfillmentOrderId().hashCode();
        }
        if (getDisplayableOrderId() != null) {
            _hashCode += getDisplayableOrderId().hashCode();
        }
        if (getDisplayableOrderDateTime() != null) {
            _hashCode += getDisplayableOrderDateTime().hashCode();
        }
        if (getDisplayableOrderComment() != null) {
            _hashCode += getDisplayableOrderComment().hashCode();
        }
        if (getShippingSpeedCategory() != null) {
            _hashCode += getShippingSpeedCategory().hashCode();
        }
        if (getDestinationAddress() != null) {
            _hashCode += getDestinationAddress().hashCode();
        }
        if (getFulfillmentPolicy() != null) {
            _hashCode += getFulfillmentPolicy().hashCode();
        }
        if (getFulfillmentMethod() != null) {
            _hashCode += getFulfillmentMethod().hashCode();
        }
        if (getReceivedDateTime() != null) {
            _hashCode += getReceivedDateTime().hashCode();
        }
        if (getFulfillmentOrderStatus() != null) {
            _hashCode += getFulfillmentOrderStatus().hashCode();
        }
        if (getStatusUpdatedDateTime() != null) {
            _hashCode += getStatusUpdatedDateTime().hashCode();
        }
        if (getNotificationEmailList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNotificationEmailList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNotificationEmailList(), i);
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
        new org.apache.axis.description.TypeDesc(FulfillmentOrder.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "FulfillmentOrder"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantFulfillmentOrderId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "MerchantFulfillmentOrderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayableOrderId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "DisplayableOrderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayableOrderDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "DisplayableOrderDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayableOrderComment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "DisplayableOrderComment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingSpeedCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "ShippingSpeedCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "DestinationAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "Address"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fulfillmentPolicy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "FulfillmentPolicy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fulfillmentMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "FulfillmentMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receivedDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "ReceivedDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fulfillmentOrderStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "FulfillmentOrderStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "FulfillmentOrderStatus"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusUpdatedDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "StatusUpdatedDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notificationEmailList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "NotificationEmailList"));
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
