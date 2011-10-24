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
 * ShipmentStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazonaws.fba_inbound.doc._2007_05_10;

public class ShipmentStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ShipmentStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Working = "Working";
    public static final java.lang.String _Shipped = "Shipped";
    public static final java.lang.String _InTransit = "InTransit";
    public static final java.lang.String _Delivered = "Delivered";
    public static final java.lang.String _CheckedIn = "CheckedIn";
    public static final java.lang.String _Receiving = "Receiving";
    public static final java.lang.String _Closed = "Closed";
    public static final java.lang.String _Cancelled = "Cancelled";
    public static final java.lang.String _Error = "Error";
    public static final ShipmentStatus Working = new ShipmentStatus(_Working);
    public static final ShipmentStatus Shipped = new ShipmentStatus(_Shipped);
    public static final ShipmentStatus InTransit = new ShipmentStatus(_InTransit);
    public static final ShipmentStatus Delivered = new ShipmentStatus(_Delivered);
    public static final ShipmentStatus CheckedIn = new ShipmentStatus(_CheckedIn);
    public static final ShipmentStatus Receiving = new ShipmentStatus(_Receiving);
    public static final ShipmentStatus Closed = new ShipmentStatus(_Closed);
    public static final ShipmentStatus Cancelled = new ShipmentStatus(_Cancelled);
    public static final ShipmentStatus Error = new ShipmentStatus(_Error);
    public java.lang.String getValue() { return _value_;}
    public static ShipmentStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ShipmentStatus enumeration = (ShipmentStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ShipmentStatus fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ShipmentStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ShipmentStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
