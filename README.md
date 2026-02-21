# SB-FebWokshop2
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