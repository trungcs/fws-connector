FWS Inbound Products Demo
=============================

INTRODUCTION
  This demo adds addresses and items to a Mongo database, creates Amazon network SKUs if necessary for the added products, and
  previews and creates shipments to the appropriate Amazon Distribution Center for all them.        

HOW TO DEMO:
  In order to run this test, you need to setup the following environment variable:
  	* fwsAccessKey - your public FWS access key
	* fwsSecretKey - your private FWS access key
  You also need a local Mongo server running with under default port
  1. Run the FwsFunctionalTestDriver, or deploy this demo to a Mule Container. 
  	a. Request an inventory status report: 
  		Run the testSendInventoryStatus  test or alternatively hit 
  		http://localhost:9090/fws-demo-inventory 
  	
HOW IT WORKS:
  * The AddFromAddress flow stores and address in a mongo database. This address has a logical, unique "address name", which will be used to find it in the CreateShipments flow.
  	You can add multiple address, but you should always provide different logical address names.
  * The AddItem flow stores fulfillment items in the mongo database, and creates the Amazon NSKU, if necessary.
    You can add multiple items.  
  	* IMPORTANT: Please notice that you still need to manually list each item in the Amazon Seller Center before executing this flow, if you don't, this step will fail. 
  * The CreateShipments flow creates shipments for the stored items:
  	 * gets all shipment items previously stored in the database
     * fetches the previously stored sender address for the given logical address name
     * gets a preview for all the items and address. This previews contains information about how to group items and to which Amazon Center should they be sent
     * creates the necessary shipments, based on the preview information.
     * this flows does NOT set items as SHIPPED, use set-inbound-shipment-status operation for marking it as SHIPPED
  