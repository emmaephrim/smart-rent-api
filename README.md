Since this is going on your GitHub as **smart-rent-api** , let’s make it look serious — not tutorial-level.

Below is a **clean, production-style README** you can paste directly.

---

# Smart Rent API

A scalable **Spring Boot REST API** powering a Smart Property & Rental Management Platform designed to simplify house and hostel discovery in Ghana and beyond.

This platform enables landlords to list properties, renters to search and book visits, agents to manage multiple listings, and admins to verify properties to reduce fraud.

---

## 🚀 Tech Stack

- **Java 21**
- **Spring Boot**
- Spring Security (JWT – upcoming)
- Spring Data JPA
- PostgreSQL
- Maven
- Lombok

## 🏗️ Architecture

The project follows a clean layered architecture:
com.smartrent.api
│
├── config # Configuration classes (Security, CORS, Beans)
├── controller # REST endpoints
├── service # Business logic
├── repository # JPA repositories
├── model # JPA entities
├── dto # Request & response DTOs
├── exception # Global exception handling
└── security # JWT & authentication logic

## 👥 User Roles

The system supports multiple roles using a Many-to-Many relationship:

- LANDLORD
- RENTER
- AGENT
- ADMIN

Tables:

- `users`
- `roles`
- `user_roles` (join table)

This design allows flexible role expansion (e.g. SUPER_ADMIN) without schema changes.

## ⚙️ Setup Instructions

### 1️⃣ Clone the Repository

git clone https://github.com/YOUR_USERNAME/smart-rent-api.git
cd smart-rent-api

### 2️⃣ Configure Database

Create a PostgreSQL database:
CREATE DATABASE smart_rent;

Update `application.properties`:

spring.datasource.url=jdbc:postgresql://localhost:5432/smart_rent
spring.datasource.username=postgres
spring.datasource.password=your_password
