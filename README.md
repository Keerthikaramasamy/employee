# employee
Employee Time and Absence Tracker

This is an application that tracks employees time and absences. This is offered as a simple web service that provides the following operations: • Add Work • Add Vacation

Requirements Java 8 Maven 3 Design The application is structured in layers, namely: A controller is responsible for handling the requests and communicating with the layer service for providing a response. Here the internal domain is converted to DTOs to eliminate the coupling between the API and the internal domain. A service is responsible for executing the business logic, here we know how to update work days and vacation days. A domain object represents the model (Employee) A repository abstracts the underlying datastore. For the sake of the example, the underlying datastore is a local concurrent hash map. Code structure The application contains the main application source code and unit tests.

Build project$ mvn clean install Running project$ cd employee project$ mvn spring-boot:run (or) java -jar employee-0.0.1-SNAPSHOT

For validation purposes you can now access localhost:8080/swagger-ui.html in the corresponding endpoints in order to test the service. The following endpoints are available:

PUT /employee/work - Updates work days 

PUT /employee/vacation - Updates vacation days
