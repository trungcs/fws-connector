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


/**
 * {@link LabelPreference} enum wrapper for
 * {@link org.mule.module.fws.api.internal.LabelPrepPreference}
 * 
 * @author flbulgarelli
 */
public enum LabelPreference
{
    AMAZON_LABEL_ONLY(com.amazonaws.fba_inbound.doc._2007_05_10.LabelPrepPreference.AMAZON_LABEL_ONLY), 
    AMAZON_LABEL_PREFERRED(com.amazonaws.fba_inbound.doc._2007_05_10.LabelPrepPreference.AMAZON_LABEL_PREFERRED), 
    MERCHANT_LABEL(com.amazonaws.fba_inbound.doc._2007_05_10.LabelPrepPreference.MERCHANT_LABEL);

    private final com.amazonaws.fba_inbound.doc._2007_05_10.LabelPrepPreference fwsLabelPrepPreference;

    private LabelPreference(com.amazonaws.fba_inbound.doc._2007_05_10.LabelPrepPreference fwsLabelPrepPreference)
    {
        this.fwsLabelPrepPreference = fwsLabelPrepPreference;
    }

    public com.amazonaws.fba_inbound.doc._2007_05_10.LabelPrepPreference toFwsLabelPrepPreference()
    {
        return fwsLabelPrepPreference;
    }

    public static com.amazonaws.fba_inbound.doc._2007_05_10.LabelPrepPreference toFwsLabelPrepPreference(LabelPreference labelPreference)
    {
        return labelPreference == null ? null : labelPreference.toFwsLabelPrepPreference();
    }

}
