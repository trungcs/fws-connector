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

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.rmi.RemoteException;

import org.apache.axis.AxisFault;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class FWSClientAdaptor
{
    private static Logger log = LoggerFactory.getLogger(FWSClient.class);

    private FWSClientAdaptor()
    {
    }

    @SuppressWarnings("unchecked")
    public static FWSClient<RuntimeException> adapt(final FWSClient<?> client)
    {
        return (FWSClient<RuntimeException>) Proxy.newProxyInstance(FWSClient.class.getClassLoader(),
            new Class[]{FWSClient.class}, new InvocationHandler()
            {
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
                {
                    try
                    {
                        if (log.isDebugEnabled())
                        {
                            log.debug("Entering {} with args {}", method.getName(), args);
                        }
                        Object ret = method.invoke(client, args);
                        if (log.isDebugEnabled())
                        {
                            log.debug("Returning from {} with value {}", method.getName(), ret);
                        }
                        return ret;
                    }
                    catch (InvocationTargetException e)
                    {
                        if (log.isWarnEnabled())
                        {
                            log.warn("An exception was thrown while invoking {}: {}", method.getName(),
                                e.getCause());
                        }
                        throw adaptException(e.getCause());
                    }
                }

            });
    }

    private static Throwable adaptException(Throwable e)
    {
        if (e instanceof AxisFault)
        {
            return new FwsException(((AxisFault) e).getFaultString(), e);
        }
        if (e instanceof RemoteException)
        {
            return new FwsException(e);
        }
        return e;
    }

}
