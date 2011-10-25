/**
 * Mule FWS Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.module.fws.config;

import static org.junit.Assert.assertEquals;

import org.mule.api.MuleEvent;
import org.mule.api.processor.MessageProcessor;
import org.mule.tck.junit4.FunctionalTestCase;

import org.junit.Test;

public class FWSInitilializationTestDriver extends FunctionalTestCase
{
    @Override
    protected String getConfigResources()
    {
        return "fws-namespace-config.xml";
    }

    /**
     * Tests that the connector client was initialized properly
     * 
     * @throws Exception
     */
    @Test
    public void connectorInitialized() throws Exception
    {
        MuleEvent result = lookupFlowConstruct("DeleteInboundShipmentItems").process(getTestEvent(""));
        assertEquals("The AWS Access Key Id you provided does not exist in our records.", result.getMessage()
            .getExceptionPayload()
            .getRootException()
            .getMessage());
    }

    private MessageProcessor lookupFlowConstruct(String name)
    {
        return (MessageProcessor) muleContext.getRegistry().lookupFlowConstruct(name);
    }
}
