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

import static org.mule.module.fws.api.internal.ItemCondition.Club;
import static org.mule.module.fws.api.internal.ItemCondition.CollectibleAcceptable;
import static org.mule.module.fws.api.internal.ItemCondition.CollectibleGood;
import static org.mule.module.fws.api.internal.ItemCondition.CollectibleLikeNew;
import static org.mule.module.fws.api.internal.ItemCondition.CollectiblePoor;
import static org.mule.module.fws.api.internal.ItemCondition.CollectibleVeryGood;
import static org.mule.module.fws.api.internal.ItemCondition.NewItem;
import static org.mule.module.fws.api.internal.ItemCondition.NewOEM;
import static org.mule.module.fws.api.internal.ItemCondition.NewOpenBox;
import static org.mule.module.fws.api.internal.ItemCondition.NewWithWarranty;
import static org.mule.module.fws.api.internal.ItemCondition.Refurbished;
import static org.mule.module.fws.api.internal.ItemCondition.RefurbishedWithWarranty;
import static org.mule.module.fws.api.internal.ItemCondition.Unknown;
import static org.mule.module.fws.api.internal.ItemCondition.UsedAcceptable;
import static org.mule.module.fws.api.internal.ItemCondition.UsedGood;
import static org.mule.module.fws.api.internal.ItemCondition.UsedLikeNew;
import static org.mule.module.fws.api.internal.ItemCondition.UsedPoor;
import static org.mule.module.fws.api.internal.ItemCondition.UsedRefurbished;
import static org.mule.module.fws.api.internal.ItemCondition.UsedVeryGood;

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
    
    private final org.mule.module.fws.api.internal.ItemCondition fwsItemCondition;

    private ItemCondition(org.mule.module.fws.api.internal.ItemCondition fwsItemCondition)
    {
        this.fwsItemCondition = fwsItemCondition;
    }

    public org.mule.module.fws.api.internal.ItemCondition toFwsItemCondition()
    {
        return fwsItemCondition;
    }
    
}


