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

import org.mule.module.fws.api.internal.LabelPrepPreference;

/**
 * {@link LabelPreference} enum wrapper for
 * {@link org.mule.module.fws.api.internal.LabelPrepPreference}
 * 
 * @author flbulgarelli
 */
public enum LabelPreference
{
    AMAZON_LABEL_ONLY(org.mule.module.fws.api.internal.LabelPrepPreference.AMAZON_LABEL_ONLY), AMAZON_LABEL_PREFERRED(
                    org.mule.module.fws.api.internal.LabelPrepPreference.AMAZON_LABEL_PREFERRED), MERCHANT_LABEL(
                    org.mule.module.fws.api.internal.LabelPrepPreference.MERCHANT_LABEL);

    private final org.mule.module.fws.api.internal.LabelPrepPreference fwsLabelPrepPreference;

    private LabelPreference(org.mule.module.fws.api.internal.LabelPrepPreference fwsLabelPrepPreference)
    {
        this.fwsLabelPrepPreference = fwsLabelPrepPreference;
    }

    public org.mule.module.fws.api.internal.LabelPrepPreference toFwsLabelPrepPreference()
    {
        return fwsLabelPrepPreference;
    }

    public static LabelPrepPreference toFwsLabelPrepPreference(LabelPreference labelPreference)
    {
        return labelPreference == null ? null : labelPreference.toFwsLabelPrepPreference();
    }

}
