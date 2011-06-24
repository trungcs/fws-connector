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

import org.mule.module.fws.api.internal.holders.ListAllFulfillmentOrdersResultHolder;

import java.lang.reflect.InvocationTargetException;
import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.Iterator;

import org.apache.commons.beanutils.MethodUtils;
import org.apache.commons.lang.UnhandledException;

public abstract class FwsPaginatedIterable<T, Page> extends PaginatedIterable<T, Page>
{
    private Object[] EMPTY = new Object[0];

    @Override
    protected final Page firstPage()
    {
        try
        {
            return firstFwsPage();
        }
        catch (RemoteException e)
        {
            throw new UnhandledException(e);
        }
    }

    protected abstract Page firstFwsPage() throws RemoteException;

    @Override
    protected final boolean hasNextPage(Page page)
    {
        try
        {
            return (Boolean) MethodUtils.invokeExactMethod(page, "isHasNext", EMPTY);
        }
        catch (Exception e)
        {
            throw new AssertionError(e);
        }
    }

    @Override
    protected final Page nextPage(Page currentPage)
    {
        try
        {
            return nextFwsPage(currentPage);
        }
        catch (RemoteException e)
        {
            throw new UnhandledException(e);
        }
    }

    protected abstract Page nextFwsPage(Page currentPage) throws RemoteException;

    @Override
    protected final Iterator<T> pageIterator(Page page)
    {
        return Arrays.asList(pageArray(page)).iterator();
    }

    protected abstract T[] pageArray(Page page);

    protected boolean hasNextPage(ListAllFulfillmentOrdersResultHolder page)
    {
        return page.value.isHasNext();
    }

}
