# Family Cash Card

Family Cash Card is a simple, modern Java application that helps parents manage allowance funds for their children. The app is designed to give parents ease and control over family allowance management in a clean and practical way.

## Key Features

- Parent-focused allowance management
- Modern, easy-to-use interface
- Simple fund control for kids
- Built as a Java Spring Boot application

## Purpose

The primary goal of Family Cash Card is to provide parents with a straightforward and reliable tool to oversee and manage funds for their children, helping keep allowance tracking organized and stress-free.

This project is also built as a learning/tutorial application to explore Spring Boot and Java application development.

## Technology

- Java
- Spring Boot
- Gradle

## Getting Started

### Prerequisites

- Java 17 or above
- Gradle (optional, `./gradlew` is included)

### Run the application

From the project root:

```bash
./gradlew bootRun
```

Or build and run the JAR:

```bash
./gradlew build
java -jar build/libs/cashcard.jar
```

## What I Learned

This project was completed as part of the **Spring Academy's Building a REST API in Spring Boot** tutorial. It served as a comprehensive introduction to modern Java web development using Spring Boot.

### Test-First Development (TDD)
- Implemented the **Red-Green-Refactor cycle** throughout development
- Started with failing tests to define expected behavior before writing implementation code
- Ensured comprehensive test coverage for all endpoints and business logic
- Learned how tests serve as executable documentation and catch regressions early

### REST API & HTTP Fundamentals
- Designed and implemented RESTful endpoints following best practices
- **GET requests**: Retrieve single resources and paginated collections
- **POST requests**: Create new resources and return location headers (201 Created)
- **PUT requests**: Update existing resources with full replacement of resource data
- **DELETE requests**: Remove resources from the database
- Understood HTTP status codes: 200 (OK), 201 (Created), 204 (No Content), 401 (Unauthorized), 404 (Not Found)
- Proper use of request/response bodies and URI path parameters
- Idempotency concepts: GET and PUT operations can be repeated safely

### CRUD Operations with Spring Data JDBC
- Implemented full CRUD functionality (Create, Read, Update, Delete)
- Leveraged Spring Data JDBC repositories for database operations 
- Used Spring's abstraction layer to interact with H2 embedded database
- Learned pagination and sorting using `Pageable` and `Page` interfaces

### Spring Security & Authentication
- Configured HTTP Basic Authentication for API endpoints
- Implemented in-memory user details service for testing
- Protected endpoints with security filters and authentication requirements
- Understood role-based access control patterns

### Spring Boot Best Practices
- Dependency injection through constructor parameters
- Automatic bean creation and wiring by Spring

## Notes

This project is intended as a simple family allowance management tool and can be extended with additional features like child profiles, transaction history, and notifications. It demonstrates foundational REST API development patterns applicable to enterprise applications.
