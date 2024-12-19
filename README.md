
#Customer Product API

## Features
- RESTful API with CRUD operations
- Caching with Hazelcast
- Event handling with Kafka
- Logging with Logback
- Exception Handling
- Swagger for API documentation

## Prerequisites
- JDK 17+
- Maven
- Spring Boot 3.3.x
- SQL Database

## Running the Project
1. Clone the repository.
2. Run `mvn spring-boot:run`.

## API Endpoints
| Method | Endpoint           | Description            |
|--------|--------------------|------------------------|
| GET    | /api/customers     | Fetch all customers    |
| POST   | /api/customers     | Create a customer      |
| GET    | /api/products      | Fetch all products     |
| POST   | /api/products      | Create a product       |

## GitHub Actions
GitHub Actions automatically build and test the project on each push or pull request.


##Testing Swagger
Access http://localhost:8080/swagger-ui.html to view the auto-generated API documentation.
