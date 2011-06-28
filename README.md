Mule FWS Cloud Connector
========================

Mule Cloud connector to FWS

Installation
------------

The connector can either be installed for all applications running within the Mule instance or can be setup to be used
for a single application.

*All Applications*

Download the connector from the link above and place the resulting jar file in
/lib/user directory of the Mule installation folder.

*Single Application*

To make the connector available only to single application then place it in the
lib directory of the application otherwise if using Maven to compile and deploy
your application the following can be done:

Add the connector's maven repo to your pom.xml:

    <repositories>
        <repository>
            <id>muleforge-releases</id>
            <name>MuleForge Snapshot Repository</name>
            <url>https://repository.muleforge.org/release/</url>
            <layout>default</layout>
        </repsitory>
    </repositories>

Add the connector as a dependency to your project. This can be done by adding
the following under the dependencies element in the pom.xml file of the
application:

    <dependency>
        <groupId>org.mule.modules</groupId>
        <artifactId>mule-module-fws</artifactId>
        <version>1.0-SNAPSHOT</version>
    </dependency>

Configuration
-------------

You can configure the connector as follows:

    <fws:config client="value" accessKey="value" secretKey="value"/>

Here is detailed list of all the configuration attributes:

| attribute | description | optional | default value |
|:-----------|:-----------|:---------|:--------------|
|name|Give a name to this configuration so it can be later referenced by config-ref.|yes||
|client||yes|
|accessKey||no|
|secretKey||no|


Delete Inbound Shipment Items
-----------------------------

Removes items from a pre-existing shipment specified by the ShipmentId. 

This operation removes the items
specified in each MerchantSKU parameter from the shipment in their entirety, no matter the quantity.
If the MerchantSKU is not currently a part of the shipment, then that particular line item is ignored, but others are still processed.



     <delete-inbound-shipment-items merchantSku="#[header:merchantSku]" shipmentId="#[header:shipmentId]" />

| attribute | description | optional | default value | possible values |
|:-----------|:-----------|:---------|:--------------|:----------------|
|config-ref|Specify which configuration to use for this invocation|yes||
|merchantSku||no||
|shipmentId||no||



Get Fulfillment Identifier
--------------------------

Gets the Fulfillment Network SKU (FNSKU) for each supplied merchant item—creating one if needed.

This operation is  idempotent in that it can be called multiple times without any adverse effects. This operation is required whenever you need to register items
for Amazon fulfillment that require labeling and when you need to get the identifier prior to creating an offer. This operation is necessary to register items for Amazon
fulfillment in order to send them to Amazon, but does not do the work of marking any offer for this item as Amazon fulfilled.
A response does not imply that the item has an offer for which it can be fulfilled; only that the Amazon Fulfillment Network can track it. An inactive item can have a
quantity in the fulfillment center, but will never be fulfilled.
Use this operation instead of getFulfillmentIdentifierForMSKU if an offer does not already exist for the MerchantSKU.



     <get-fulfillment-identifier
         asin="#[variable:asin]"
         itemCondition="#[variable:itemCondition]"
         merchantSku="#[variable:merchantSku]" />

| attribute | description | optional | default value | possible values |
|:-----------|:-----------|:---------|:--------------|:----------------|
|config-ref|Specify which configuration to use for this invocation|yes||
|asin|the mandatory Aamzon's identifier|no||
|itemCondition|the mandatory item's condition|no||*NEW_ITEM*, *NEW_WITH_WARRANTY*, *NEW_OEM*, *NEW_OPEN_BOX*, *USED_LIKE_NEW*, *USED_VERY_GOOD*, *USED_GOOD*, *USED_ACCEPTABLE*, *USED_POOR*, *USED_REFURBISHED*, *COLLECTIBLE_LIKE_NEW*, *COLLECTIBLE_VERY_GOOD*, *COLLECTIBLE_GOOD*, *COLLECTIBLE_ACCEPTABLE*, *COLLECTIBLE_POOR*, *REFURBISHED_WITH_WARRANTY*, *REFUrbished*, *CLUB*, *UNKNOWN*, *fwsItemCondition*
|merchantSku|the mandatory merchant's sku|no||



Get Fulfillment Identifier For Msku
-----------------------------------

Gets the Fulfillment Network SKU (FNSKU) for each supplied merchant item—creating one if needed. 

This operation is idempotent in that you can call it multiple times without any adverse effects. 
This operation is required whenever you need to register items for Amazon fulfillment that require
labeling. This operation is necessary to register items for Amazon fulfillment in order to send them to Amazon, but doesn't mark any offer for this item as 
Amazon fulfilled.
A response does not imply that the item has an offer for which it can be fulfilled; only that the Amazon Fulfillment Network can track it. An inactive item can have a
quantity in the fulfillment center, but will never be fulfilled.
Use this operation instead of GetFulfillmentIdentifier if an offer already exists for the SKU.



     <get-fulfillment-identifier-for-msku merchantSku="#[map-payload:merchantSku]"/>

| attribute | description | optional | default value | possible values |
|:-----------|:-----------|:---------|:--------------|:----------------|
|config-ref|Specify which configuration to use for this invocation|yes||
|merchantSku|the merchant's sku|no||



Get Fulfillment Item By Fnsku
-----------------------------

Gets fulfillment item data for the provided Fulfillment Network SKUs (FNSKUs). 
If any of the provided FNSKUs are invalid they are ignored and only the valid SKUs are returned.
A response does not imply that the item has an offer for which it can be fulfilled; only that the Amazon Fulfillment Network
can track it. An inactive item can have a quantity in the fulfillment center, but will never be fulfilled. 



     <get-fulfillment-item-by-fnsku fulfillmentNetworkSku="#[payload]" />

| attribute | description | optional | default value | possible values |
|:-----------|:-----------|:---------|:--------------|:----------------|
|config-ref|Specify which configuration to use for this invocation|yes||
|fulfillmentNetworkSku|the mandatory fulfillment network sku - aka nsku, aka fnsku|no||



Get Fulfillment Item By Msku
----------------------------

Gets fulfillment item data for the provided Merchant SKUs. 

If any of the provided MSKUs are invalid (e.g. does not have an assigned Fulfillment Network SKU), they are ignored and only the valid SKUs are returned.
A response does not imply that the item has an offer for which it can be fulfilled; only that the Amazon Fulfillment Network can track it. An inactive item can have a quantity in the fulfillment center, but will never be fulfille



     <get-fulfillment-item-by-msku merchantSku="#[map-payload:merchantSku]"/>

| attribute | description | optional | default value | possible values |
|:-----------|:-----------|:---------|:--------------|:----------------|
|config-ref|Specify which configuration to use for this invocation|yes||
|merchantSku|the mandatory merchant's sku|no||



Get Inbound Shipment
--------------------

Gets inbound shipment data without the item details for a given ShipmentId.


     <get-inbound-shipment-data shipmentId="#[header:ShipmentId]"/>

| attribute | description | optional | default value | possible values |
|:-----------|:-----------|:---------|:--------------|:----------------|
|config-ref|Specify which configuration to use for this invocation|yes||
|shipmentId|the mandatory shipment id|no||



Get Inbound Shipment Preview
----------------------------

Gets the information needed to create a set of shipments for a given set of items and the ship from address. 

You might need to create multiple shipments for various reasons, but the most common reason is when there are sortable and non-sortable items. 
In this case, there is one shipment for each of the shipment sets returned.



     <get-inbound-shipment-preview  merchantSku="AF15962"  address="#[address]" labelPreference="MERCHANT_LABEL" />

| attribute | description | optional | default value | possible values |
|:-----------|:-----------|:---------|:--------------|:----------------|
|config-ref|Specify which configuration to use for this invocation|yes||
|merchantSku|the mandatory merchant's sku|no||
|quantity|the optional quantity to deliver. Default is 1.|yes|1|
|address|the mandatory destination address|no||
|labelPreference|the optional label preference|yes||*AMAZON_LABEL_ONLY*, *AMAZON_LABEL_PREFERRED*, *MERCHANT_LABEL*, *fwsLabelPrepPreference*

Returns list of previews



Get Inbound Service Status
--------------------------

Answers a brief status message from the service



     <get-inbound-service-status/>

| attribute | description | optional | default value | possible values |
|:-----------|:-----------|:---------|:--------------|:----------------|
|config-ref|Specify which configuration to use for this invocation|yes||

Returns status message



List Fulfillment Items
----------------------

Lazily lists fulfillment items registered.

If IncludeInactive is set to True, the operation returns both active (available for fulfillment) and inactive (not available for fulfillment) mappings. This parameter defaults to False. You can use inactive mappings to track inventory in Amazon's fulfillment centers; however, inactive items can't be fulfilled.


     <list-fulfillment-items includeInactive="true"/>

| attribute | description | optional | default value | possible values |
|:-----------|:-----------|:---------|:--------------|:----------------|
|config-ref|Specify which configuration to use for this invocation|yes||
|includeInactive|optional. Whether non available items for fulfillment should be listed|yes|false|

Returns FulfillmentItem iterable



List Inbound Shipment Items
---------------------------

Lazily retrieved the all the inbound shipment items for the given shipmentId. 



     <list-inbound-shipment-items shipmentId="#[header:shipmentId]"/>

| attribute | description | optional | default value | possible values |
|:-----------|:-----------|:---------|:--------------|:----------------|
|config-ref|Specify which configuration to use for this invocation|yes||
|shipmentId|the mandatory shipment's id|no||

Returns InboundShipmentItem items iterable



List Inbound Shipments
----------------------

Lazily lists the inbound shipments a merchant has created, according to the specified query parameters. 



     <list-inbound-shipments shipmentStatus="CANCELED" createdAfter="#[varaible:creationDate]" />

| attribute | description | optional | default value | possible values |
|:-----------|:-----------|:---------|:--------------|:----------------|
|config-ref|Specify which configuration to use for this invocation|yes||
|shipmentStatus|the mandatory status of listed items|no||*WORKING*, *SHIPPED*, *INTRANSIT*, *DELIVERED*, *CHECKEDIN*, *RECEIVING*, *CLOSED*, *CANCELLED*, *ERROR*, *fwsShipmentStatus*
|createdAfter|optional. The min creation date of listed shipment|yes||
|createdBefore|optional. The max creation date of listed shipments|yes||

Returns shipment data iterable



Put Inbound Shipment
--------------------

Adds or replaces inbound shipment data (minus the item details) for a given shipmentId.



     <put-inbound-shipment 
       labelPreference="MERCHANT_LABEL"
       merchantSku="#[variable:merchantSku]"
       quantity="10"
       shipmentId="#[variable:shipmentId]" shipmentName="#[variable:shipmentName]"
       destinationFulfillmentCenter="#[variable:destinationFulfillmentCenter]"
       shipFromAddress="#[variable:shipFromAddress]" />

| attribute | description | optional | default value | possible values |
|:-----------|:-----------|:---------|:--------------|:----------------|
|config-ref|Specify which configuration to use for this invocation|yes||
|shipmentId|the mandatory shipment's id|no||
|shipmentName||no||
|destinationFulfillmentCenter|the mandatory Amazon's fulfillment center where the client's products are stored|no||
|shipFromAddress||no||
|labelPreference|the optional label preference|yes||*AMAZON_LABEL_ONLY*, *AMAZON_LABEL_PREFERRED*, *MERCHANT_LABEL*, *fwsLabelPrepPreference*



Put Inbound Shipment Items
--------------------------

Adds line items to a pre-existing shipment that the ShipmentId specifies. 

If the MerchantSKU is already in the shipment, then that particular line item is replaced. 
Call PutInboundShipment to create a new shipment. 
This call returns an exception if you attempt to add line items to a shipment that is in a status other than Working.



     <put-inbound-shipment-items
         shipmentId="#[variable:shipmentId]">
             <itemQuantities>
                 <itemQuantity key="#[variable:aMerchantSku]" value="#[variable:quantity]"/>
             </itemQuantities>
           </put-inbound-shipment-items>

| attribute | description | optional | default value | possible values |
|:-----------|:-----------|:---------|:--------------|:----------------|
|config-ref|Specify which configuration to use for this invocation|yes||
|shipmentId||no||
|itemQuantities||yes||
|itemQuantitiesRef||yes||



Set Inbound Shipment Status
---------------------------

Sets the inbound shipment status to the specified ShipmentStatus.
Once a shipment's status has been set to Shipped, you cannot make any further changes except to update the status to Cancelled. Any item not received at the time a shipment is cancelled is put into problem receive at the fulfillment center.

This operation returns a RequestId upon success, otherwise an explicit error is returned.


     <set-inbound-shipment-status
         shipmentId="#[variable:shipmentId]"
         shipmentStatus="SHIPPED"/>

| attribute | description | optional | default value | possible values |
|:-----------|:-----------|:---------|:--------------|:----------------|
|config-ref|Specify which configuration to use for this invocation|yes||
|shipmentId|the mandatory shipment's id|no||
|shipmentStatus|the mandatory new status for the given shipment|no||*WORKING*, *SHIPPED*, *INTRANSIT*, *DELIVERED*, *CHECKEDIN*, *RECEIVING*, *CLOSED*, *CANCELLED*, *ERROR*, *fwsShipmentStatus*



Cancel Fulfillment Order
------------------------

Requests Amazon not to fulfill an existing fulfillment order. This is just a hint, already shipped 
orders may not be canceled.



     <cancel-fulfillment-order orderId="#[header:orderId]"/>

| attribute | description | optional | default value | possible values |
|:-----------|:-----------|:---------|:--------------|:----------------|
|config-ref|Specify which configuration to use for this invocation|yes||
|orderId|the mandatory order's id|no||



Create Fulfillment Order
------------------------

Generates a request for Amazon to ship items from the merchant's inventory to a destination address.



     <create-fulfillment-order 
              destinationAddress="#[map-payload:destinationAddress]" orderId="#[map-payload:orderId]"
              displayableOrderComment="#[map-payload:comment]"
              displayableOrderDate="[map-payload:orderDate]" items="#[map-payload:items]"
              shippingSpeedCategory="#[map-payload:shippingSpeed]" /> 

| attribute | description | optional | default value | possible values |
|:-----------|:-----------|:---------|:--------------|:----------------|
|config-ref|Specify which configuration to use for this invocation|yes||
|orderId|the mandatory fulfillment order id|no||
|displayableOrderId|the order id displayed in the fulfillment. If not specified, the orderId is used.|yes||
|destinationAddress|the mandatory destination address of the fulfillment|no||
|fulfillmentPolicy|the optional fulfillment policy|yes||
|fulfillmentMethod|the optional fulfillment method|yes||
|shippingSpeedCategory|the mandatory shipping speed category|no||
|displayableOrderComment|the mandatory comment that will be displayed in the order|no||
|displayableOrderDate|the mandatory order date displayed in the fulfillment|no||
|emails|an optional list of email strings|yes||
|items|a mandatory list of CreateFulfillmentOrderItem. At least one item must be specified|no||

Returns fulfillment result



Get Fulfillment Order
---------------------

Gets the original fulfillment order request, the status of
both the order and its items in the Amazon Fulfillment Network, 
and the shipments that have been generated to fulfill the order.



     <insert-element orderId="#[map-payload:orderId]"/> 

| attribute | description | optional | default value | possible values |
|:-----------|:-----------|:---------|:--------------|:----------------|
|config-ref|Specify which configuration to use for this invocation|yes||
|orderId|the mandatory order id of the fulfillment|no||

Returns GetFulfillmentOrderResult



Get Fulfillment Preview
-----------------------

Answers estimated shipping dates and fees for a given set of merchant SKUs and quantities.



     <get-fulfillment-preview
        address="#[variable:address]" 
        merchantSku="FHUD4896" 
        shippingSpeedCategories="Standard"
        quantity="15"
        orderItemId="X123698" /> 

| attribute | description | optional | default value | possible values |
|:-----------|:-----------|:---------|:--------------|:----------------|
|config-ref|Specify which configuration to use for this invocation|yes||
|address|the mandatory destination address|no||
|merchantSku|the mandatory merchant's sku|no||
|shippingSpeedCategories|the optional shipping categories|yes||
|quantity|the optional quantity to deliver. Default is 1.|yes|1|
|orderItemId|the mandatory order item id|no||



Get Outbound Service Status
---------------------------

Answers a brief status message from the service



     <get-outbound-service-status/>

| attribute | description | optional | default value | possible values |
|:-----------|:-----------|:---------|:--------------|:----------------|
|config-ref|Specify which configuration to use for this invocation|yes||

Returns status message



List Fulfillment Orders
-----------------------

Lazily lists all the fulfillment orders



     <list-fulfillment-orders/> 

| attribute | description | optional | default value | possible values |
|:-----------|:-----------|:---------|:--------------|:----------------|
|config-ref|Specify which configuration to use for this invocation|yes||
|startDate|the start date of the query|yes||

Returns orders iterable



Get Inventory Supply
--------------------

Gets information about the supply of merchant-owned inventory in Amazon's fulfillment network. 
 
 This operation does not return inventory that is unsellable or that 
 is already bound to a customer order or bound to internal fulfillment center processing (for example, labeling).
 
 

     <get-inventory-supply 
        merchantSku="#[header:merchantSku]" 
        responseGroup="DETAILED"/> 

| attribute | description | optional | default value | possible values |
|:-----------|:-----------|:---------|:--------------|:----------------|
|config-ref|Specify which configuration to use for this invocation|yes||
|merchantSku|the mandatory merchant's sku|no||
|responseGroup|the optional response group|yes||

Returns merchant sku supply iterable



Get Inventory Service Status
----------------------------

Answers a brief status message from the service



     <get-inventory-service-status/>

| attribute | description | optional | default value | possible values |
|:-----------|:-----------|:---------|:--------------|:----------------|
|config-ref|Specify which configuration to use for this invocation|yes||

Returns status message



List Updated Inventory Supply
-----------------------------

Lazily retrieves all the information about the supply of merchant-owned inventory in Amazon's fulfillment network, for
inventory items that may have had recent changes in inventory levels. The type of inventory data
returned by this operation is the same as that returned by getInventorySupply.
This operation provides the most efficient mechanism for clients to maintain local copies of inventory supply data.



     <list-updated-inventory-supply 
         startDateTime="#[header:querystartDateTime]" 
         responseGroup="DETAILED" /> 

| attribute | description | optional | default value | possible values |
|:-----------|:-----------|:---------|:--------------|:----------------|
|config-ref|Specify which configuration to use for this invocation|yes||
|startDateTime||no||
|responseGroup||yes||

Returns MerchantSKUSupply iterable









































