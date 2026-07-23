# 📚 Student Management System - Spring Boot REST API

A simple **Student Management System** built using **Spring Boot** to learn the fundamentals of **REST APIs**, **3-Tier Architecture**, **DTO (Data Transfer Object)**, **Spring Data JPA**, and **PostgreSQL**.

The main goal of this project is to understand how a Spring Boot backend application is structured and how client requests travel through different layers before interacting with the database.

---

## 🚀 Tech Stack

- Java
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Maven
- Lombok
- REST APIs

---

## 📂 Project Structure

```text
src
│
├── controller
│      Handles HTTP requests and responses
│
├── service
│      Contains business logic
│
├── repository
│      Handles database operations
│
├── entity
│      Represents database tables
│
├── DTO
│      Transfers data between layers
│
└── application.properties
       Database configuration
```

---

## 🏗️ 3-Tier Architecture

This project follows the **3-Tier Architecture** to keep the application clean, modular, and easy to maintain.

### 1. Presentation Layer (Controller)

- Accepts HTTP requests from the client.
- Calls the Service Layer.
- Returns JSON responses.

### 2. Service Layer

- Contains business logic.
- Communicates with the Repository Layer.
- Converts Entity objects into DTOs before sending the response.

### 3. Persistence Layer (Repository)

- Interacts with the PostgreSQL database.
- Uses Spring Data JPA to perform CRUD operations.

---

## 🔄 Request Flow

```text
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
PostgreSQL Database
   ▲
   │
Repository
   ▲
   │
Service (Entity → DTO)
   ▲
   │
Controller
   ▲
   │
JSON Response
```

---

## 📦 DTO (Data Transfer Object)

Instead of returning the Entity directly, this project uses a DTO.

The `StudentDTO` contains only the required fields:

- ID
- Name
- Email

### Benefits

- Improves security
- Hides unnecessary database fields
- Returns clean API responses

---

## 🗄️ Database Configuration

```properties
server.port=8000

spring.datasource.url=jdbc:postgresql://localhost:5432/rest_api
spring.datasource.username=postgres
spring.datasource.password=root

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

---

## 📌 REST API Endpoints

### Get All Students

```http
GET /students
```

#### Response

```json
[
  {
    "id": 1,
    "name": "Younus",
    "email": "younus@gmail.com"
  }
]
```

---

### Get Student By ID

```http
GET /students/{id}
```

#### Example

```http
GET /students/1
```

#### Response

```json
{
  "id": 1,
  "name": "Younus",
  "email": "younus@gmail.com"
}
```

---

## 📖 What I Learned

- Spring Boot Project Structure
- REST API Development
- Controller Layer
- Service Layer
- Repository Layer
- Entity Mapping
- DTO Pattern
- PostgreSQL Integration
- Spring Data JPA
- Dependency Injection
- Constructor Injection using Lombok
- 3-Tier Architecture
- JSON Response Handling

---

## 🎯 Future Improvements

- ✅ Get All Students API
- ✅ Get Student By ID API
- ⏳ Create Student API
- ⏳ Update Student API
- ⏳ Delete Student API
- ⏳ Global Exception Handling
- ⏳ Validation using `@Valid`
- ⏳ Pagination & Sorting
- ⏳ Swagger Documentation
- ⏳ Unit Testing
- ⏳ Spring Security + JWT Authentication

---

## 💡 Project Purpose

This project was built to practice backend development with Spring Boot and understand how a real-world REST API is developed using the **3-Tier Architecture**. It helped me learn how Controllers, Services, Repositories, DTOs, and Entities work together to process client requests and communicate with a PostgreSQL database.

---

## 👨‍💻 Author

**Mohammed Younus Uddin**

B.Tech CSE Student | Learning Spring Boot, Java, REST APIs, and Backend Development.