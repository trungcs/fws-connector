FWS Inventory Demo
===========================================

INTRODUCTION
  This demo sends an email from a GMail account, with inventory items that experienced changes in the last 10 days.      

HOW TO DEMO:
  In order to run this test, you need to setup the following environment variable:
  	* fwsAccessKey - your public FWS access key
	* fwsSecretKey - your private FWS access key
	* smtpFromAddress - the sender email address
	* smtpToAddress - the recipient email address 
	* smtpUsername - the GMail username of the sender account 
	* smtpPassword - the GMail password of the sender account
  1. Run the FwsFunctionalTestDriver, or deploy this demo to a Mule Container. 
  	a. Request an inventory status report: 
  		Run the testSendInventoryStatus  test or alternatively hit 
  		http://localhost:9090/fws-demo-inventory 
  	
HOW IT WORKS:
  * The InventoryStatus logs the service status, and then gets an iterable of recent inventory changes
  * For each MerchantSKUSupply instance returned by the iterable, it is formatted using a groovy script
  * The resultant text is send by email using the smtp transport
  