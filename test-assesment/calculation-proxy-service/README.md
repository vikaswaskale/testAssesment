APP REST API
===

This API is used as a proxy service to invoke calculation-api to calculate two numbers
In this service we have used a Eureka Server for service registry and Ribbon as a naming server


Installation
---
    * you need docker to be installed
    * java and maven also needed

Scripts
---

	Maven Build JAR
		* mvn clean install -DskipTests
	Maven Start Spring Boot Server
		* java -jar target/calculation-proxy-api-0.0.1-SNAPSHOT.jar
	

Technologies Used
---
    * Java 1.8, Spring 2.0, 
     * Spring Boot, REST API

Test
---
    * Unit test, 100% coverages
    * Int Test , all flows of end points
    * Reports