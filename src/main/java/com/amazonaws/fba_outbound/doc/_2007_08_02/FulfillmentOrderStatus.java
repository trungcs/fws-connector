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
 * FulfillmentOrderStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazonaws.fba_outbound.doc._2007_08_02;

public class FulfillmentOrderStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected FulfillmentOrderStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _New = "New";
    public static final java.lang.String _Received = "Received";
    public static final java.lang.String _Planning = "Planning";
    public static final java.lang.String _Processing = "Processing";
    public static final java.lang.String _Cancelled = "Cancelled";
    public static final java.lang.String _Complete = "Complete";
    public static final java.lang.String _CompletePartialled = "CompletePartialled";
    public static final java.lang.String _Unfulfillable = "Unfulfillable";
    public static final java.lang.String _Invalid = "Invalid";
    public static final FulfillmentOrderStatus New = new FulfillmentOrderStatus(_New);
    public static final FulfillmentOrderStatus Received = new FulfillmentOrderStatus(_Received);
    public static final FulfillmentOrderStatus Planning = new FulfillmentOrderStatus(_Planning);
    public static final FulfillmentOrderStatus Processing = new FulfillmentOrderStatus(_Processing);
    public static final FulfillmentOrderStatus Cancelled = new FulfillmentOrderStatus(_Cancelled);
    public static final FulfillmentOrderStatus Complete = new FulfillmentOrderStatus(_Complete);
    public static final FulfillmentOrderStatus CompletePartialled = new FulfillmentOrderStatus(_CompletePartialled);
    public static final FulfillmentOrderStatus Unfulfillable = new FulfillmentOrderStatus(_Unfulfillable);
    public static final FulfillmentOrderStatus Invalid = new FulfillmentOrderStatus(_Invalid);
    public java.lang.String getValue() { return _value_;}
    public static FulfillmentOrderStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        FulfillmentOrderStatus enumeration = (FulfillmentOrderStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static FulfillmentOrderStatus fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FulfillmentOrderStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fba-outbound.amazonaws.com/doc/2007-08-02/", "FulfillmentOrderStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
