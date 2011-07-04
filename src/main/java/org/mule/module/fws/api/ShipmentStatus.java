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

import static com.amazonaws.fba_inbound.doc._2007_05_10.ShipmentStatus.*;


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

    private final com.amazonaws.fba_inbound.doc._2007_05_10.ShipmentStatus fwsShipmentStatus;

    private ShipmentStatus(com.amazonaws.fba_inbound.doc._2007_05_10.ShipmentStatus fwsShipmentStatus)
    {
        this.fwsShipmentStatus = fwsShipmentStatus;
    }

    public com.amazonaws.fba_inbound.doc._2007_05_10.ShipmentStatus toFwsShipmentStatus()
    {
        return fwsShipmentStatus;
    }

}
