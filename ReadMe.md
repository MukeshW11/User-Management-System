# User Management System - README

## Introduction
This document outlines the installation, setup, and API workflow for the User Management System. This system handles user profile management and administrative controls.

## Prerequisites
Ensure you have the following installed:
- Java 17 or 22
- Spring Boot
- MySQL
- Postman (for API testing)
- Node.js and npm/yarn (for frontend setup)

## Installation & Setup

### Database Setup (MySQL)
1. Install MySQL and start the MySQL server.
2. Create a new database:
   ```sql
   CREATE DATABASE ums;
   ```
3. Configure database credentials in `application.properties`:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/ums
   spring.datasource.username=root
   spring.datasource.password=password
   spring.jpa.hibernate.ddl-auto=update
   ```

### Backend Setup (Spring Boot)
1. Clone the repository:
   ```sh
   git clone https://github.com/your-repo/UserManagementSystem.git
   ```
2. Navigate to the backend directory:
   ```sh
   cd user-management/backend
   ```
3. Build and run the Spring Boot application:
   ```sh
   mvn clean install
   mvn spring-boot:run
   ```

## API Workflow

### User Management
- **Add User Profile** (`GET /usm/add`)
- **Get User Profile** (`GET /usm/fetch/{id}`)
- **Get All Users Profile** (`GET /usm/fetch`)
- **Update User Profile** (`PUT /usm/users/{id}`)
- **Delete User Account** (`DELETE /usm/users/{id}`)


## Testing the API
Use Postman or any API testing tool to test endpoints. Ensure the backend is running before sending requests.


