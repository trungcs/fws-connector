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

import static org.mule.module.fws.api.internal.ShipmentStatus.Cancelled;
import static org.mule.module.fws.api.internal.ShipmentStatus.CheckedIn;
import static org.mule.module.fws.api.internal.ShipmentStatus.Closed;
import static org.mule.module.fws.api.internal.ShipmentStatus.Delivered;
import static org.mule.module.fws.api.internal.ShipmentStatus.Error;
import static org.mule.module.fws.api.internal.ShipmentStatus.InTransit;
import static org.mule.module.fws.api.internal.ShipmentStatus.Receiving;
import static org.mule.module.fws.api.internal.ShipmentStatus.Shipped;
import static org.mule.module.fws.api.internal.ShipmentStatus.Working;


/**
 * @author flbulgarelli
 */
public enum ShipmentStatus
{
    WORKING (Working),
    SHIPPED (Shipped),
    INTRANSIT (InTransit),
    DELIVERED (Delivered),
    CHECKEDIN (CheckedIn),
    RECEIVING (Receiving),
    CLOSED (Closed),
    CANCELLED (Cancelled),
    ERROR (Error);

    private final org.mule.module.fws.api.internal.ShipmentStatus fwsShipmentStatus;

    private ShipmentStatus(org.mule.module.fws.api.internal.ShipmentStatus fwsShipmentStatus)
    {
        this.fwsShipmentStatus = fwsShipmentStatus;
    }

    public org.mule.module.fws.api.internal.ShipmentStatus toFwsShipmentStatus()
    {
        return fwsShipmentStatus;
    }

}
