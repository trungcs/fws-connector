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
 * This file was automatically generated by the Mule Cloud Connector Development Kit
 */

package org.mule.module.fws.config;

import org.mule.api.processor.MessageProcessor;
import org.mule.tck.FunctionalTestCase;

public class FWSNamespaceHandlerTestCase extends FunctionalTestCase
{
    @Override
    protected String getConfigResources()
    {
        return "fws-namespace-config.xml";
    }

    public void testSendMessageToFlow() throws Exception
    {
        try
        {
            lookupFlowConstruct("DeleteInboundShipmentItems").process(getTestEvent(""));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        try
        {
            lookupFlowConstruct("DeleteInboundShipmentItems").process(getTestEvent(""));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private MessageProcessor lookupFlowConstruct(String name)
    {
        return (MessageProcessor) muleContext.getRegistry().lookupFlowConstruct(name);
    }
}