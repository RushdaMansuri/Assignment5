# RESTful Web Service Implementation with Docker

This project is part of assignment at Pace University.

The project uses Maven build and is implemented using Spring Boot.

The web service contains four GET routes:
<ul>
  <li>One that displays a collection of records (List all customers)</li>
  <li>One that displays a single record that corresponds to an ID (List a particular customer)</li>
  <li>One that displays a collection of records for a given entity (List of orders for individual customer)</li>
  <li>One that displays a single record from a collection of a given entity (List a particular orders for individual customer)</li>
</ul>

## Source Data
I have used a static [JSON] (https://github.com/RushdaMansuri/Assignment5/blob/main/customers.json) as source for data. 

## Get Requests available 
List all customers: localhost:8080/customers  
List a particular customer: localhost:8080/customers/custId  
List of orders for individual customer: localhost:8080/customers/custId/orders  
List a particular orders for individual customer: localhost:8080/customers/custId/orders/orderId  

### Follow the below steps to create a local environment and run this Spring Boot Application
## Step 1:
[Download](https://github.com/RushdaMansuri/Assignment5.git) and unzip the source repository.

## Step 2:
Go to terminal or command prompt and change the directory to where you have cloned or downloaded the project. 
Type in the following:
#### `./mvnw package`
This command is used to execute all Maven phases until the package phase. It does the job of compiling, verifying and building the project.
It builds the jar file and places it in the target directory under the root project folder.

## Step 3:
Containerize the project:
Docker has a simple "Dockerfile" file format that it uses to specify the layers of an image. 
Dockerfile is included in this project and below is how I have created the Dockerfile:  
FROM openjdk:8-jdk-alpine
RUN mkdir -p /etc/rushda/
COPY customers.json /etc/rushda/customers.json
ARG JAR_FILE=target/*.jar 
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]

This Dockerfile has a DEPENDENCY parameter pointing to a directory. 
So from the terminal or command prompt type in the following:
#### `mkdir -p target/dependency && (cd target/dependency; jar -xf ../*.jar)`
This command will generate the following folders in the target/dependency folder
BOOT-INF/classes - with the application classes
BOOT-INF/lib - with the dependency jars
META-INF

## Step 4:
Now we have all the setup we need to build the docker image. To build the image you can use the Docker command line. 
#### docker build -t test .`
-t -- tags the imagename "DockerSpringWebservice", you can optionally f=give a tag name after the imagename and a : (DockerSpringWebservice:v1.0).  
If you dont provide a tagname, docker by defuault assigns latest to the tagname.'  
Tagnames are useful when you have to version your build images.  
You can check the image built by typing the following on your terminal/cmd:
#### `docker images`

## Step 5:
Now you can run the docker image that is built using the following docker run command:
#### `docker run -p 8080:8080 test`
-p - publishes a container’s port(s) to the host  
Now go to the browser and type localhost:8080/customers and it will show you a JSON with the list of customers.  
To see the details of individual customer: localhost:8080/customers/1 or localhost:8080/customers/2 or localhost:8080/customers/3
To see the details of order for individual customer: localhost:8080/customers/1/orders   
To see the details of a particular order for individual customer: localhost:8080/customers/1/orders/123  or localhost:8080/customers/1/orders/124 or localhost:8080/customers/1/orders/125 



