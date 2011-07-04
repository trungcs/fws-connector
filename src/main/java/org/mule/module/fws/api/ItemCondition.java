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

import static com.amazonaws.fba_inbound.doc._2007_05_10.ItemCondition.*;

public enum ItemCondition
{
    
    NEW_ITEM (NewItem),
    NEW_WITH_WARRANTY (NewWithWarranty),
    NEW_OEM (NewOEM),
    NEW_OPEN_BOX (NewOpenBox),
    USED_LIKE_NEW (UsedLikeNew),
    USED_VERY_GOOD (UsedVeryGood),
    USED_GOOD (UsedGood),
    USED_ACCEPTABLE (UsedAcceptable),
    USED_POOR (UsedPoor),
    USED_REFURBISHED (UsedRefurbished),
    COLLECTIBLE_LIKE_NEW (CollectibleLikeNew),
    COLLECTIBLE_VERY_GOOD (CollectibleVeryGood),
    COLLECTIBLE_GOOD (CollectibleGood),
    COLLECTIBLE_ACCEPTABLE (CollectibleAcceptable),
    COLLECTIBLE_POOR (CollectiblePoor),
    REFURBISHED_WITH_WARRANTY (RefurbishedWithWarranty),
    REFUrbished (Refurbished),
    CLUB (Club),
    UNKNOWN (Unknown);
    
    private final com.amazonaws.fba_inbound.doc._2007_05_10.ItemCondition fwsItemCondition;

    private ItemCondition(com.amazonaws.fba_inbound.doc._2007_05_10.ItemCondition fwsItemCondition)
    {
        this.fwsItemCondition = fwsItemCondition;
    }

    public com.amazonaws.fba_inbound.doc._2007_05_10.ItemCondition toFwsItemCondition()
    {
        return fwsItemCondition;
    }
    
}


