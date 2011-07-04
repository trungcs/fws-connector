/**
 * Mule FWS Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.module.fws.api;

public class Address
{
    private String name;

    private String addressLine1;

    private String addressLine2;

    private String addressLine3;

    private String city;

    private String stateOrProvinceCode;

    private String countryCode;

    private String postalCode;

    private String phoneNumber;

    public Address()
    {
    }

    public Address(String name,
                   String addressLine1,
                   String addressLine2,
                   String addressLine3,
                   String city,
                   String stateOrProvinceCode,
                   String countryCode,
                   String postalCode,
                   String phoneNumber)
    {
        this.name = name;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.addressLine3 = addressLine3;
        this.city = city;
        this.stateOrProvinceCode = stateOrProvinceCode;
        this.countryCode = countryCode;
        this.postalCode = postalCode;
        this.phoneNumber = phoneNumber;
    }

    com.amazonaws.fba_inbound.doc._2007_05_10.Address toInboundAddress()
    {
        return new com.amazonaws.fba_inbound.doc._2007_05_10.Address(name, addressLine1, addressLine2, city,
            stateOrProvinceCode, countryCode, postalCode);
    }

    com.amazonaws.fba_outbound.doc._2007_08_02.Address toOutboundAddress()
    {
        return new com.amazonaws.fba_outbound.doc._2007_08_02.Address(name, addressLine1, addressLine2,
            addressLine3, city, stateOrProvinceCode, countryCode, postalCode, phoneNumber);
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getAddressLine1()
    {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1)
    {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2()
    {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2)
    {
        this.addressLine2 = addressLine2;
    }

    public String getAddressLine3()
    {
        return addressLine3;
    }

    public void setAddressLine3(String addressLine3)
    {
        this.addressLine3 = addressLine3;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public String getStateOrProvinceCode()
    {
        return stateOrProvinceCode;
    }

    public void setStateOrProvinceCode(String stateOrProvinceCode)
    {
        this.stateOrProvinceCode = stateOrProvinceCode;
    }

    public String getCountryCode()
    {
        return countryCode;
    }

    public void setCountryCode(String countryCode)
    {
        this.countryCode = countryCode;
    }

    public String getPostalCode()
    {
        return postalCode;
    }

    public void setPostalCode(String postalCode)
    {
        this.postalCode = postalCode;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

}
