# Sakila-API
Sakila API is a web service that provides access to the Sakila sample database. The API is implemented using both SOAP and REST architectures.

## Getting Started
### Prerequisites
Before you can run the Sakila API, you must have the following software installed:

- Java Development Kit (JDK) 17
- Apache Maven 
- Apache Tomcat 
- MySql Server
- Sakila DB

## Installation
To install the Sakila API, follow these steps:

1. Clone the Sakila-API repository from GitHub using the following command
```bash
git clone https://github.com/a342z/Sakila-API.git
```

2. Navigate to the Sakila-API directory.
```bash
cd Sakila-API
```

3. Build the project using Maven.
```bash
mvn clean install
```

4. Deploy the Sakila-API.war file to Tomcat.
```bash
mvn tomcat7:deploy
```

## Usage
Once you have installed the Sakila API, you can access the following endpoints:

- /soap/ - SOAP endpoint
- /api/ - REST endpoint

To access the SOAP endpoint, you can use any SOAP client, such as SoapUI. The WSDL file for the Sakila API can be found at /soap/SakilaAPI?wsdl.

To access the REST endpoint, you can use any HTTP client, such as Postman. The API supports the following HTTP methods:
- GET - retrieve a resource
- POST - create a new resource
- PUT - update an existing resource
- DELETE - delete a resource


## Documentation
[REST Documentation](https://documenter.getpostman.com/view/19585271/2s93Y3wh1c)
