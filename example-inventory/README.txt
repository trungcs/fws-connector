FWS Inventory Demo
===========================================

INTRODUCTION
   TODO    

HOW TO DEMO:
  TODO PRE
  1. Run the MongoFunctionalTestDriver, or deploy this demo an a Mule Container. 
  	a. Add one or more a weather observations for one or more airports: 
  		Run the testAddWeatherObservation  test or alternatively hit 
  		http://localhost:9091/mongo-demo-add-weater-observations,
  		passing an ICAO code - http://en.wikipedia.org/wiki/List_of_airports_by_ICAO_code. 
  	Example: http://localhost:9091/mongo-demo-add-weater-observations?cityIcao=KMCO
  2. Consult the average temperature of any previously added airport: 
  		Run the testGetAverageTemperature test or alternatively hit
  		http://localhost:9091/mongo-demo-get-average-temperature. This will return the average of 
  		temperatures for each observation for the given airport
  		Example: http://localhost:9091/mongo-demo-get-average-temperature?cityIcao=KMCO
 	
HOW IT WORKS:
  * The AddWeatherObservation flow queries and HTTP service that has a JSon output, and adds the result 
  to a weatherObservations collection. 
  * The GetAverageTemperature flow uses map-reduce to group weather observations by ICAO code, 
  and get the average of temperatures for each observations group  
  
  