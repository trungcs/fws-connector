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
 * ItemCondition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazonaws.fba_inbound.doc._2007_05_10;

public class ItemCondition implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ItemCondition(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NewItem = "NewItem";
    public static final java.lang.String _NewWithWarranty = "NewWithWarranty";
    public static final java.lang.String _NewOEM = "NewOEM";
    public static final java.lang.String _NewOpenBox = "NewOpenBox";
    public static final java.lang.String _UsedLikeNew = "UsedLikeNew";
    public static final java.lang.String _UsedVeryGood = "UsedVeryGood";
    public static final java.lang.String _UsedGood = "UsedGood";
    public static final java.lang.String _UsedAcceptable = "UsedAcceptable";
    public static final java.lang.String _UsedPoor = "UsedPoor";
    public static final java.lang.String _UsedRefurbished = "UsedRefurbished";
    public static final java.lang.String _CollectibleLikeNew = "CollectibleLikeNew";
    public static final java.lang.String _CollectibleVeryGood = "CollectibleVeryGood";
    public static final java.lang.String _CollectibleGood = "CollectibleGood";
    public static final java.lang.String _CollectibleAcceptable = "CollectibleAcceptable";
    public static final java.lang.String _CollectiblePoor = "CollectiblePoor";
    public static final java.lang.String _RefurbishedWithWarranty = "RefurbishedWithWarranty";
    public static final java.lang.String _Refurbished = "Refurbished";
    public static final java.lang.String _Club = "Club";
    public static final java.lang.String _Unknown = "Unknown";
    public static final ItemCondition NewItem = new ItemCondition(_NewItem);
    public static final ItemCondition NewWithWarranty = new ItemCondition(_NewWithWarranty);
    public static final ItemCondition NewOEM = new ItemCondition(_NewOEM);
    public static final ItemCondition NewOpenBox = new ItemCondition(_NewOpenBox);
    public static final ItemCondition UsedLikeNew = new ItemCondition(_UsedLikeNew);
    public static final ItemCondition UsedVeryGood = new ItemCondition(_UsedVeryGood);
    public static final ItemCondition UsedGood = new ItemCondition(_UsedGood);
    public static final ItemCondition UsedAcceptable = new ItemCondition(_UsedAcceptable);
    public static final ItemCondition UsedPoor = new ItemCondition(_UsedPoor);
    public static final ItemCondition UsedRefurbished = new ItemCondition(_UsedRefurbished);
    public static final ItemCondition CollectibleLikeNew = new ItemCondition(_CollectibleLikeNew);
    public static final ItemCondition CollectibleVeryGood = new ItemCondition(_CollectibleVeryGood);
    public static final ItemCondition CollectibleGood = new ItemCondition(_CollectibleGood);
    public static final ItemCondition CollectibleAcceptable = new ItemCondition(_CollectibleAcceptable);
    public static final ItemCondition CollectiblePoor = new ItemCondition(_CollectiblePoor);
    public static final ItemCondition RefurbishedWithWarranty = new ItemCondition(_RefurbishedWithWarranty);
    public static final ItemCondition Refurbished = new ItemCondition(_Refurbished);
    public static final ItemCondition Club = new ItemCondition(_Club);
    public static final ItemCondition Unknown = new ItemCondition(_Unknown);
    public java.lang.String getValue() { return _value_;}
    public static ItemCondition fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ItemCondition enumeration = (ItemCondition)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ItemCondition fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ItemCondition.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fba-inbound.amazonaws.com/doc/2007-05-10/", "ItemCondition"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
