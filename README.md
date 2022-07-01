# star-wars-api-testing
A NodeJS API to integrate with the star wars api https://swapi.dev Star Wars API! This documentation should help you familiarize yourself with the resources available and how to consume them with HTTP requests.


Our project consists of  DTOs, connection manager, and injector to implement the API to allow for testing. 
Connection Manager
As we start building the API we first establish a connection with the API using Json.

Injector Class
uses the object mapper to read the URL and injects them into the DTO class.


DTOs
DTOs were produced by the help of RoboPojoGenerator plugin in Intellij this allowed us to import the JSON text - which improves usability and readability. 


Helper Methods
Helper methods were added to the DTOs that were generated for validity checks - checking where the values in the fields were empty/null. More checks were carried out for the value type being entered into the field as they should follow the specified data type.
Some fields had limits on what they can output and cannot exceed that limit, placing the limits in those fields so only those can be entered. If anything other then specified values were entered the tests failed 

DTO Tests
DTO tests were carried out to see if the DTOs made are verifying the results which will be visible to the user. The tests were made from a users perspective on what a user can encounter when he runs it and different outcomes to avoid the program from crashing
