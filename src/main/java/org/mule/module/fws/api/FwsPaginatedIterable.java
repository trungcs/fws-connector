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

import com.amazonaws.fba_outbound.doc._2007_08_02.holders.ListAllFulfillmentOrdersResultHolder;

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

import org.apache.commons.beanutils.MethodUtils;
import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.lang.UnhandledException;

public abstract class FwsPaginatedIterable<T, Page> extends PaginatedIterable<T, Page>
{
    private static final Object[] EMPTY = new Object[0];

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
    @SuppressWarnings("unchecked")
    protected final Page nextPage(Page currentPage)
    {
        try
        {
            Page nextPage = (Page) currentPage.getClass().newInstance();
            PropertyUtils.copyProperties(nextPage, nextFwsPage(currentPage));
            return nextPage;
        }
        catch (RemoteException e)
        {
            throw new UnhandledException(e);
        }
        catch (Exception e)
        {
            throw new AssertionError(e);
        }
    }

    protected abstract Object nextFwsPage(Page currentPage) throws RemoteException;

    @Override
    protected final Iterator<T> pageIterator(Page page)
    {
        T[] pageArray = pageArray(page);
        if (pageArray != null)
        {
            return Arrays.asList(pageArray).iterator();
        }
        return Collections.<T> emptyList().iterator();
    }

    protected abstract T[] pageArray(Page page);

    protected boolean hasNextPage(ListAllFulfillmentOrdersResultHolder page)
    {
        return page.value.isHasNext();
    }

}
