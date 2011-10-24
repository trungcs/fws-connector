/**
 * Mule FWS Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mulesoft.demo.fws;

import org.mule.api.MuleEvent;
import org.mule.api.MuleException;
import org.mule.api.MuleMessage;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.transport.PropertyScope;
import org.mule.tck.FunctionalTestCase;

public class FwsFunctionalTestDriver extends FunctionalTestCase
{
    @Override
    protected String getConfigResources()
    {
        return "mule-config.xml";
    }

    public void testCreateShipment() throws Exception
    {
        addAddress("MainAddress", "605 5th Ave SE", "Seattle", "US", "WA", "98101");
        //Add more address if you want 
        //addAddress("AnotherAddress", .. );
        
        //We assume you have already created this sku: http://docs.amazonwebservices.com/fws/1.1/GettingStartedGuide/createShip.html
        addItem("my-test-sku-01", 10);
        
        //Add more skus if you want, but remember to register them in Amazon Seller Central first
        //addItem("my-test-sku-01", 10);
        
        //Create the shipment. The shipment is NOT marked as SHIPPED. 
        //Use set-inbound-shipment-status operation for marking it as SHIPPED
        createShipments("MainAddress", "Your First Shipment");
    }

    private void addItem(Object merchantSku, Integer quantity) throws Exception, MuleException
    {
        MuleEvent addItemEvent = getTestEvent("");
        addItemEvent.getMessage().setProperty("merchantSku", merchantSku, PropertyScope.INBOUND);
        addItemEvent.getMessage().setProperty("quantity", quantity.toString(), PropertyScope.INBOUND);
        lookupFlowConstruct("AddItem").process(addItemEvent);
    }

    private void createShipments(String fromAddressName, String shipmentName) throws Exception, MuleException
    {
        MuleEvent createShipmentEvent = getTestEvent("");
        createShipmentEvent.getMessage().setProperty("addressName", fromAddressName, PropertyScope.INBOUND);
        createShipmentEvent.getMessage().setProperty("shipmentName", shipmentName, PropertyScope.INBOUND);
        lookupFlowConstruct("CreateShipments").process(createShipmentEvent);
    }

    private void addAddress(String fromAddressName,
                            String addressLine,
                            String city,
                            String countryCode,
                            String stateCode,
                            String postalCode) throws Exception, MuleException
    {
        MuleEvent newAddressEvent = getTestEvent("");
        MuleMessage message = newAddressEvent.getMessage();
        message.setProperty("addressLine1", addressLine, PropertyScope.INBOUND);
        message.setProperty("city", city, PropertyScope.INBOUND);
        message.setProperty("countryCode", countryCode, PropertyScope.INBOUND);
        message.setProperty("name", fromAddressName, PropertyScope.INBOUND);
        message.setProperty("postalCode", postalCode, PropertyScope.INBOUND);
        message.setProperty("stateOrProvinceCode", stateCode, PropertyScope.INBOUND);
        lookupFlowConstruct("AddFromAddress").process(newAddressEvent);
    }

    private MessageProcessor lookupFlowConstruct(final String name)
    {
        return (MessageProcessor) muleContext.getRegistry().lookupFlowConstruct(name);
    }

}
