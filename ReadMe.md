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
   CREATE DATABASE user_management;
   ```
3. Configure database credentials in `application.properties`:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/user_management
   spring.datasource.username=root
   spring.datasource.password=yourpassword
   spring.jpa.hibernate.ddl-auto=update
   ```

### Backend Setup (Spring Boot)
1. Clone the repository:
   ```sh
   git clone https://github.com/your-repo/user-management.git
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

### Frontend Setup (React)
1. Navigate to the frontend directory:
   ```sh
   cd ../frontend
   ```
2. Install dependencies:
   ```sh
   npm install
   ```
3. Start the React application:
   ```sh
   npm start
   ```

## API Workflow

### User Management
- **Get User Profile** (`GET /api/users/{id}`)
- **Update User Profile** (`PUT /api/users/{id}`)
- **Delete User Account** (`DELETE /api/users/{id}`)
- **Get All Users (Admin Only)** (`GET /api/users`)
- **Update User Role (Admin Only)** (`PUT /api/users/{id}/role`)

## Testing the API
Use Postman or any API testing tool to test endpoints. Ensure the backend is running before sending requests.

## Conclusion
You have successfully set up the User Management System. For further customization, refer to the respective documentation of Spring Boot and React.

