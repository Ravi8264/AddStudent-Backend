# 📚 Student Management System with MongoDB

A comprehensive Spring Boot application for managing student records using MongoDB as the database. This system provides a secure and efficient way to handle student information with modern authentication features.

## 🚀 Key Features

### Student Management

- **Add Students**: Create new student records with complete information
- **View Students**: Get list of all registered students
- **Search Students**: Find students by their unique ID
- **Update Information**: Modify existing student details
- **Remove Students**: Delete student records when needed
- **School-wise Search**: Find all students from a particular school

### Security Features

- **JWT Authentication**: Secure login system using JSON Web Tokens
- **Password Encryption**: All passwords are securely encrypted
- **Token Management**: Automatic token generation and refresh
- **Secure API Endpoints**: Protected routes for data safety

## 🛠️ Technology Stack

### Backend

- **Spring Boot**: Java framework for building web applications
- **MongoDB**: NoSQL database for flexible data storage
- **Spring Security**: Framework for securing the application
- **JWT**: For secure authentication and authorization
- **Lombok**: For reducing boilerplate code
- **Maven**: For project management and dependencies

## 🔌 API Documentation

### Student Management Endpoints

| Method | Endpoint                        | Description       | Example                                           |
| ------ | ------------------------------- | ----------------- | ------------------------------------------------- |
| POST   | `/api/students`                 | Add new student   | `{ "name": "John", "school": "ABC School", ... }` |
| GET    | `/api/students`                 | Get all students  | Returns list of all students                      |
| GET    | `/api/students/{id}`            | Get student by ID | Returns student with matching ID                  |
| PUT    | `/api/students/{id}`            | Update student    | Updates student with new data                     |
| DELETE | `/api/students/{id}`            | Delete student    | Removes student from database                     |
| GET    | `/api/students/school/{school}` | Get by school     | Returns students from specific school             |

## 🚀 Getting Started

### Prerequisites

- Java JDK 11 or higher
- MongoDB installed and running
- Maven installed
- Git for version control

### Installation Steps

1. **Clone the Repository**

   ```bash
   git clone https://github.com/Ravi8264/AddStudent-Backend.git
   cd AddStudent-Backend
   ```

2. **Configure Database**

   - Open `src/main/resources/application.properties`
   - Update MongoDB connection string:
     ```properties
     spring.data.mongodb.uri=mongodb://localhost:27017/studentdb
     ```

3. **Configure Security**

   - Set JWT secret key in `application.properties`:
     ```properties
     jwt.secret=your-secret-key-here
     ```

4. **Run the Application**
   ```bash
   mvn spring-boot:run
   ```

## ⚙️ Configuration

### Application Properties

```properties
# Server Configuration
server.port=8080

# MongoDB Configuration
spring.data.mongodb.uri=mongodb://localhost:27017/studentdb

# JWT Configuration
jwt.secret=your-secret-key-here
jwt.expiration=86400000  # 24 hours in milliseconds

# Security Configuration
spring.security.user.name=admin
spring.security.user.password=admin
```

## 📝 Student Data Structure

```json
{
  "id": "auto-generated-mongodb-id",
  "name": "Student Name",
  "school": "School Name",
  "sec": "Section",
  "cls": "Class",
  "password": "encrypted-password",
  "email": "student@email.com",
  "jwtToken": "generated-jwt-token",
  "refreshToken": "generated-refresh-token"
}
```

## 🔒 Security Implementation

1. **Authentication Flow**

   - User provides credentials
   - System validates credentials
   - JWT token is generated
   - Token is used for subsequent requests

2. **Password Security**

   - Passwords are encrypted using BCrypt
   - Never stored in plain text
   - Secure password hashing

3. **Token Management**
   - JWT tokens for session management
   - Refresh tokens for token renewal
   - Token expiration handling

## 🤝 Contributing

1. Fork the repository
2. Create your feature branch
3. Commit your changes
4. Push to the branch
5. Create a Pull Request

## 📄 License

This project is licensed under the MIT License - see the LICENSE file for details.

## 📞 Support

For support, email support@example.com or create an issue in the repository.
