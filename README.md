# Ecommerce Store REST API

A fully functional Ecommerce REST API built with Java Spring Boot, featuring JWT authentication, product management, category management, and order processing.

## Tech Stack
- Java 26
- Spring Boot
- Spring Security + JWT
- JPA / Hibernate
- H2 File Database
- Maven

## Features
- User registration & login with JWT authentication
- BCrypt password hashing
- Product CRUD with search and category filtering
- Category management
- Place orders with automatic stock management
- Cancel orders with automatic stock restoration
- Global exception handling with proper HTTP status codes
- DTO pattern for clean API responses
- SLF4J logging throughout

## Getting Started

### Prerequisites
- Java 17+
- Maven

### Run the project
```bash
git clone https://github.com/khubaib213/EcommerceStore_JavaSpringBoot.git
cd EcommerceStore_JavaSpringBoot
./mvnw spring-boot:run
```

API will start at: `http://localhost:8080`

## Authentication
Register and login to get a JWT token. Add it to all protected requests:


## API Endpoints

### Auth
| Method | Endpoint | Description | Auth |
|--------|----------|-------------|------|
| POST | /auth/register | Register new user | ❌ |
| POST | /auth/login | Login and get token | ❌ |

### Products
| Method | Endpoint | Description | Auth |
|--------|----------|-------------|------|
| GET | /products/all | Get all products | ✅ |
| GET | /products/{id} | Get product by ID | ✅ |
| GET | /products/search?keyword= | Search products | ✅ |
| GET | /products/category/{id} | Get by category | ✅ |
| POST | /products/add | Create product | ✅ |
| PUT | /products/{id} | Update product | ✅ |
| DELETE | /products/{id} | Delete product | ✅ |

### Categories
| Method | Endpoint | Description | Auth |
|--------|----------|-------------|------|
| GET | /category/all | Get all categories | ✅ |
| GET | /category/{id} | Get category by ID | ✅ |
| POST | /category/add | Create category | ✅ |
| PUT | /category/{id} | Update category | ✅ |
| DELETE | /category/{id} | Delete category | ✅ |

### Orders
| Method | Endpoint | Description | Auth |
|--------|----------|-------------|------|
| POST | /orders/place | Place an order | ✅ |
| GET | /orders/my-orders | Get my orders | ✅ |
| GET | /orders/{id} | Get order by ID | ✅ |
| PUT | /orders/{id}/cancel | Cancel order | ✅ |