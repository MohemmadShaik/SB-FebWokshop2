# 🚀 3-Day Spring Boot Backend Workshop

---
## SB-FebWokshop2
Building Ecommerce backend using Spring Boot Practical implementation of Real Rest APIs Spring Data JPA + MYSQL Docker + Cloud Deployment 


## Day 1 – Swagger (OpenAPI) Integration with Spring Boot 4 ✅

### Tech Stack Used
- Spring Boot: 4.0.3
- Java: 21
- SpringDoc OpenAPI: 3.0.1
- Build Tool: Maven Wrapper (mvnw)

---

## Swagger Setup

### 1️⃣ Added Swagger Dependency

```xml
<dependency>
    <groupId>org.springdoc</groupId>
    <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
    <version>3.0.1</version>
</dependency>
```

---

### 2️⃣ Verified Compatibility

- Spring Boot 4.0.3 works correctly with SpringDoc 3.0.1
- Swagger UI loads without issues
- `/v3/api-docs` endpoint is available

---

### 3️⃣ Build & Run Using Maven Wrapper

Since global Maven was not installed:

```powershell
.\mvnw clean install
```

This ensures consistent dependency resolution and build process.

---

## Swagger URLs

After starting the application:

Swagger UI:
```
http://localhost:8080/swagger-ui/index.html
```

OpenAPI JSON:
```
http://localhost:8080/v3/api-docs
```

---

## Issue Faced & Resolution

### Problem:
Swagger UI was initially returning:

```
404 - No static resource swagger-ui/index.html
```

### Root Cause:
- Dependencies were not properly rebuilt.
- Maven was not installed globally.
- Project required clean build using Maven Wrapper.

### Fix:
- Used `.\mvnw clean install`
- Restarted application
- Verified auto-configuration loaded correctly.

---

## Key Learnings

- Always ensure dependency compatibility between Spring Boot and SpringDoc.
- Use Maven Wrapper (`mvnw`) for consistent builds.
- Clean rebuild resolves most auto-configuration issues.
- Swagger UI resources are auto-registered via classpath detection.

---

## Status

Day 1 REST APIs + Swagger Integration Completed Successfully ✅

---

## ✅ Day 1 – REST APIs + Exception Handling + Swagger

### 🎯 Objective
Understand and implement REST APIs using Spring Boot (Controller Layer Focus).

---

## 📌 Topics Covered

### 1️⃣ REST Controller

- Difference between `@Controller` and `@RestController`
- Why `@RestController` is preferred for REST APIs
- Layered architecture basics

---

### 2️⃣ HTTP Methods Implemented

Base URL:
```
/api/v1
```

| Method | Endpoint | Description |
|--------|----------|------------|
| GET | `/hello` | Test endpoint |
| POST | `/products` | Create product |
| GET | `/products` | Get all products |
| PUT | `/products/{id}` | Update product by ID |
| DELETE | `/products/query?id=0` | Delete product using RequestParam |

---

### 3️⃣ PathVariable vs RequestParam

- `@PathVariable` → used to extract value from URL path  
  Example: `/products/{id}`

- `@RequestParam` → used to extract query parameter  
  Example: `/products/query?id=0`

---

### 4️⃣ Exception Handling

Used:

```java
@RestControllerAdvice
@ExceptionHandler(Exception.class)
```

Global exception handler to catch runtime errors and return custom error message.

Example:

```java
@ExceptionHandler(Exception.class)
public String handleException(Exception e){
    return "An error occurred: " + e.getMessage();
}
```

---

### 5️⃣ Swagger Integration

- Spring Boot 4.0.3
- SpringDoc OpenAPI 3.0.1
- Swagger UI available at:

```
http://localhost:8080/swagger-ui/index.html
```

---

## 🧠 Key Learnings

- REST is stateless
- `@RestController = @Controller + @ResponseBody`
- Difference between `@PathVariable` and `@RequestParam`
- Basic CRUD endpoint structure
- Centralized exception handling using `@RestControllerAdvice`
- Maven Wrapper ensures consistent builds

---

## 🏁 Day 1 Status

✔ Controller Layer Completed  
✔ CRUD APIs Implemented  
✔ Exception Handling Implemented  
✔ Swagger Integrated

---

## 🔜 Day 2 – Spring Data JPA + MySQL

- Entity Mapping
- Repository Layer
- Database Configuration
- CRUD with Database
- JPA Concepts