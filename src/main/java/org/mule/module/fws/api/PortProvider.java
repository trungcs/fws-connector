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

import java.rmi.RemoteException;
import java.security.SignatureException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.rpc.ServiceException;
import javax.xml.rpc.holders.Holder;

import org.apache.axis.client.Stub;
import org.apache.commons.codec.binary.Base64;

public abstract class PortProvider<T>
{
    private static final String AWS_NAMESPACE = "http://security.amazonaws.com/doc/2007-01-01/";
    private final String accessKey;
    private final String secretKey;

    public PortProvider(String accessKey, String secretKey)
    {
        this.accessKey = accessKey;
        this.secretKey = secretKey;
    }

    
    public T getPort(String action) throws RemoteException
    {
        try
        {
            T port = newPort();
            setHeaders(getTimestamp(), action, (Stub) port);
            return port;
        }
        catch (Exception e)
        {
            throw new RemoteException("A Service exception occured while trying to create the port", e);
        }
    }

    protected abstract T newPort() throws ServiceException;


    private void setHeaders(String timestamp, String action, org.apache.axis.client.Stub port)
        throws SignatureException
    {
        port.setHeader(AWS_NAMESPACE, "AWSAccessKeyId", accessKey);
        port.setHeader(AWS_NAMESPACE, "Timestamp", timestamp);
        port.setHeader(AWS_NAMESPACE, "Signature", sign(action + timestamp, secretKey));
    }

    private String getTimestamp()
    {
        return FwsDates.formatForSignature(new Date());
    }

    private String sign(String data, String key) throws SignatureException
    {
        byte[] signature;
        try
        {
            Mac mac = Mac.getInstance("HmacSHA1");
            mac.init(new SecretKeySpec(key.getBytes(), "HmacSHA1"));
            signature = Base64.encodeBase64(mac.doFinal(data.getBytes("UTF-8")));
        }
        catch (Exception e)
        {
            throw new SignatureException("Failed to generate signature: " + e.getMessage(), e);
        }
        return new String(signature);
    }

}
