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
 * LabelPrepType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazonaws.fba_inbound.doc._2007_05_10;

public class LabelPrepType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected LabelPrepType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NO_LABEL = "NO_LABEL";
    public static final java.lang.String _AMAZON_LABEL = "AMAZON_LABEL";
    public static final java.lang.String _MERCHANT_LABEL = "MERCHANT_LABEL";
    public static final LabelPrepType NO_LABEL = new LabelPrepType(_NO_LABEL);
    public static final LabelPrepType AMAZON_LABEL = new LabelPrepType(_AMAZON_LABEL);
    public static final LabelPrepType MERCHANT_LABEL = new LabelPrepType(_MERCHANT_LABEL);
    public java.lang.String getValue() { return _value_;}
    public static LabelPrepType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        LabelPrepType enumeration = (LabelPrepType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static LabelPrepType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(LabelPrepType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "LabelPrepType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
