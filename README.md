# User Ratings Management System

This Spring Boot repository contains three microservices for managing users, hotels, and their ratings. These microservices are accessed through an API gateway application named `ms-apigateway`. Additionally, the repository includes `ms-serviceRegistry`, which hosts Eureka Server for service registration and discovery.

## Overview

- **userAPI**: Manages CRUD operations for user data.
- **hotelAPI**: Handles CRUD operations for hotel data.
- **ratingAPI**: Provides CRUD operations for hotel ratings.
- **ms-apigateway**: API gateway application that routes requests to `userAPI`, `hotelAPI`, and `ratingAPI`.
- **ms-serviceRegistry**: API service registry application containing Eureka Server for service registration and discovery.

## Architecture

The system utilizes Spring Cloud for service discovery and Feign Client for making API calls between microservices. Eureka Server is used for service registration and discovery.

### Technologies Used

- **Spring Boot**: v3.x
- **Spring Cloud Netflix Eureka**: Service registration and discovery.
- **Spring Cloud OpenFeign**: Declarative REST client for inter-service communication.
- **Spring Cloud Gateway**: API Gateway for routing requests.
- **MySQL**: Database for storing user, hotel, and rating information.
- **Java 21**: Programming language.
- **Maven**: Dependency management and build tool.

## Setup and Deployment

### Prerequisites

- Java 21
- MySQL Server
- Maven

### Steps to Run
1. **Initialize mysql with database/schema name "microservices"**. 
2. **Clone the repository**:

   ```bash
   git clone https://github.com/vxrun/User-Ratings-Management-System.git
   cd User-Ratings-Management-System
   git checkout -b [your-branch-name]
   ```
3. **Build and run dockerfile**:
   * There is a dockerfile present in each folder.
   * First initialize **ms-serviceRegistry**, **ms-apigateway** and then other microservices.
   * Build Docker by running the following command for each microservice.
     ```bash
     cd [folder-name]
     mvn clean install
     sudo docker build -t [image-name] .
     sudo docker run -it [image-name]
     ```
   
     

