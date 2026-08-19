☕ Spring Boot Backend Development

A personal Spring Boot learning repository documenting my journey from Spring Boot fundamentals to building REST APIs and database-backed backend applications.

This repository contains multiple practice projects covering Dependency Injection, Spring Beans, REST APIs, CRUD operations, 3-Tier Architecture, DTOs, Spring Data JPA, PostgreSQL, and backend application structure.

The goal of this repository is not just to collect code, but to understand how a real Spring Boot backend works internally and progressively build stronger backend development skills.

---

📚 What This Repository Covers

- Spring Boot fundamentals
- Spring Beans
- Dependency Injection
- Constructor Injection
- Interfaces and loose coupling
- Conditional Bean Loading
- "@ConditionalOnProperty"
- "CommandLineRunner"
- REST API fundamentals
- HTTP methods
- CRUD operations
- Controllers
- Service Layer
- Repository Layer
- 3-Tier Architecture
- DTO — Data Transfer Object
- Spring Data JPA
- PostgreSQL integration
- Entity mapping
- JSON request/response handling
- Maven
- Backend project structure

---

📂 Repository Structure

springboot/
│
├── DAY02/
│   ├── src/
│   ├── pom.xml
│   └── README.md
│
├── REST-API/
│   ├── src/
│   ├── pom.xml
│   └── README.md
│
├── demopratice/
│   ├── src/
│   ├── pom.xml
│   └── README.md
│
├── selfREASTAPI/
│   ├── src/
│   ├── pom.xml
│   └── README.md
│
└── README.md

---

🧩 Projects

1. DAY02 — Dependency Injection & Conditional Beans

This project focuses on understanding how Spring manages objects and injects dependencies automatically.

Concepts Covered

- Spring Beans
- "@Component"
- "@Controller"
- Constructor Injection
- Dependency Injection
- Interfaces
- "CommandLineRunner"
- "@ConditionalOnProperty"
- "application.properties"
- Environment variable configuration

Payment Provider Example

The project defines a common "PaymentService" interface with different implementations:

                PaymentService
                     │
             ┌───────┴────────┐
             │                │
     RazorpayPaymentService   PhonepayService
             │                │
             └───────┬────────┘
                     │
              Spring Container

The implementation can be selected through:

payment.provider=razor

or:

payment.provider=phonepe

This demonstrates how Spring can select a Bean based on application configuration without changing the main application logic.

---

2. REST-API — Understanding REST APIs

This section focuses on understanding the fundamentals of REST API development.

Topics Covered

- What is an API?
- What is REST?
- HTTP
- JSON
- HTTP Methods
- GET
- POST
- PUT
- DELETE
- CRUD
- URL and endpoints
- "@RestController"
- "@GetMapping"
- "@PostMapping"
- "@PutMapping"
- "@DeleteMapping"
- "@RequestBody"
- "@PathVariable"

REST API Flow

Client / React
      │
      ▼
 HTTP Request
      │
      ▼
 Controller
      │
      ▼
 Service
      │
      ▼
 Repository
      │
      ▼
 Database
      │
      ▼
 Repository
      │
      ▼
 Service
      │
      ▼
 Controller
      │
      ▼
 JSON Response
      │
      ▼
 Client / React

CRUD

HTTP Method| Operation| Purpose
GET| Read| Retrieve data
POST| Create| Create new data
PUT| Update| Update existing data
DELETE| Delete| Remove data

---

3. demopratice — Spring Boot Basics

This project represents my initial Spring Boot practice.

It focuses on creating a basic Spring Boot application and understanding how a controller works with a simple GET endpoint.

Example

GET /hello

The project helped me understand:

- Creating a Spring Boot application
- Creating a Controller
- "@RestController"
- "@GetMapping"
- Running a Spring Boot application
- Handling a basic HTTP request

This was one of my first steps toward understanding backend development with Spring Boot.

---

4. selfREASTAPI — Student Management REST API

This is the most complete backend project currently included in the repository.

It is a Student Management REST API built using Spring Boot.

The main purpose of this project is to understand how a backend application is structured using a 3-Tier Architecture and how REST APIs communicate with a PostgreSQL database.

---

🛠️ Tech Stack

Technology| Purpose
Java| Programming Language
Spring Boot| Backend Framework
Spring Data JPA| Database abstraction
Hibernate| ORM
PostgreSQL| Relational Database
Maven| Build & Dependency Management
Lombok| Boilerplate reduction
REST API| Client-server communication
DTO| Data transfer between layers

---

🏗️ 3-Tier Architecture

The Student Management API follows a layered architecture:

                 Client
                   │
                   ▼
             Controller
                   │
                   ▼
               Service
                   │
                   ▼
              Repository
                   │
                   ▼
              PostgreSQL

Controller Layer

Responsible for:

- Receiving HTTP requests
- Mapping API endpoints
- Calling the Service layer
- Returning HTTP/JSON responses

Service Layer

Responsible for:

- Business logic
- Communication between Controller and Repository
- Converting Entity objects to DTOs

Repository Layer

Responsible for:

- Database communication
- CRUD operations
- Using Spring Data JPA

Entity Layer

Represents the database structure.

DTO Layer

Controls the data exposed by the API instead of directly returning database entities.

---

🔄 Request Flow

A typical request follows this flow:

GET /students
       │
       ▼
Controller
       │
       ▼
Service
       │
       ▼
Repository
       │
       ▼
PostgreSQL
       │
       ▼
Repository
       │
       ▼
Service
       │
   Entity → DTO
       │
       ▼
Controller
       │
       ▼
JSON Response

This architecture keeps responsibilities separated and makes the application easier to maintain and extend.

---

📡 REST API Endpoints

Get All Students

GET /students

Example response:

[
  {
    "id": 1,
    "name": "Younus",
    "email": "younus@gmail.com"
  }
]

---

Get Student By ID

GET /students/{id}

Example:

GET /students/1

Response:

{
  "id": 1,
  "name": "Younus",
  "email": "younus@gmail.com"
}

«Additional CRUD operations are planned as the project develops.»

---

📦 DTO Pattern

The Student Management API uses a "StudentDTO" instead of directly exposing the database Entity.

Example:

Student Entity
      │
      ▼
Service Layer
      │
      ▼
StudentDTO
      │
      ▼
Controller
      │
      ▼
JSON Response

Why use DTOs?

- Prevents unnecessary database fields from being exposed
- Provides cleaner API responses
- Separates database models from API models
- Makes future API changes easier
- Improves control over the data returned to clients

---

🗄️ PostgreSQL Integration

The Student Management API uses PostgreSQL as its relational database.

Example configuration:

server.port=8000

spring.datasource.url=jdbc:postgresql://localhost:5432/rest_api
spring.datasource.username=postgres
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true

Do not commit real database passwords or credentials to GitHub.

---

🚀 Running a Project

Each folder is an independent Maven/Spring Boot project.

Navigate into the project you want to run:

cd selfREASTAPI

Install/build the project:

./mvnw clean install

On Windows:

mvnw.cmd clean install

Run the application:

./mvnw spring-boot:run

On Windows:

mvnw.cmd spring-boot:run

---

📋 Prerequisites

Before running the projects, install:

- Java JDK
- Maven or Maven Wrapper
- PostgreSQL for database-based projects
- IntelliJ IDEA / VS Code / another Java IDE
- Postman or another API testing tool

---

🧠 Key Concepts Learned

Through these projects, I am building an understanding of:

Spring Core

- IoC — Inversion of Control
- Dependency Injection
- Spring Container
- Spring Beans
- Constructor Injection
- Interfaces
- Loose Coupling

Spring Boot

- "@SpringBootApplication"
- "@Component"
- "@Service"
- "@Repository"
- "@RestController"
- Configuration properties
- Environment variables
- "CommandLineRunner"

REST API

- REST architecture
- HTTP
- JSON
- HTTP methods
- CRUD
- Request/Response
- "@RequestBody"
- "@PathVariable"
- REST Controllers

Database

- PostgreSQL
- Spring Data JPA
- Hibernate
- Entity mapping
- Repository pattern

Architecture

Controller
    ↓
Service
    ↓
Repository
    ↓
Database

---

📈 Learning Progress

Spring Boot Basics
       │
       ▼
Spring Beans
       │
       ▼
Dependency Injection
       │
       ▼
Conditional Bean Loading
       │
       ▼
REST API Fundamentals
       │
       ▼
HTTP & CRUD
       │
       ▼
Controller
       │
       ▼
Service
       │
       ▼
Repository
       │
       ▼
Spring Data JPA
       │
       ▼
PostgreSQL
       │
       ▼
DTO
       │
       ▼
3-Tier Architecture
       │
       ▼
Next: Validation + Exception Handling
       │
       ▼
Spring Security + JWT
       │
       ▼
Testing
       │
       ▼
Production-Ready Backend

---

🔮 Next Steps

The next areas I plan to implement and study include:

- [ ] Complete Student CRUD
- [ ] POST Student API
- [ ] PUT Student API
- [ ] DELETE Student API
- [ ] Request validation
- [ ] "@Valid"
- [ ] Global Exception Handling
- [ ] Custom Exceptions
- [ ] Pagination
- [ ] Sorting
- [ ] Search & Filtering
- [ ] Swagger / OpenAPI
- [ ] Unit Testing
- [ ] Integration Testing
- [ ] Spring Security
- [ ] JWT Authentication
- [ ] Role-Based Authorization
- [ ] Docker
- [ ] Deployment
- [ ] Microservices
- [ ] Spring Cloud

---

🎯 Repository Goal

The long-term goal of this repository is to progress from basic Spring Boot concepts to production-level backend development.

Rather than jumping directly into advanced frameworks, I am building the fundamentals step by step:

Java
 ↓
Spring
 ↓
Spring Boot
 ↓
REST APIs
 ↓
JPA / Hibernate
 ↓
PostgreSQL
 ↓
Security
 ↓
Testing
 ↓
Docker
 ↓
Microservices
 ↓
Production Backend

---

👨‍💻 Author

Mohammed Younus Uddin

B.Tech Computer Science Engineering Student

Currently learning:

- Java
- Spring Boot
- REST APIs
- PostgreSQL
- Backend Development
- Full-Stack Development

GitHub:
https://github.com/MOHAMMEDYOUNUSUDDIN

---

⭐ About This Repository

This repository is continuously evolving as I learn and implement new Spring Boot concepts.

Every project represents a step in my backend development journey — from writing my first "/hello" endpoint to building layered REST APIs connected to PostgreSQL.

Learning → Building → Debugging → Improving.
