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

public class FwsException extends RuntimeException
{
    private static final long serialVersionUID = 5138427327290205905L;

    public FwsException(String message, Throwable cause)
    {
        super(message, cause);
    }

}
