# Student Management System with MongoDB

A Spring Boot application for managing student records using MongoDB as the database.

## Features

- Add new students
- View all students
- Get student by ID
- Update student information
- Delete students
- Search students by school
- Secure authentication with JWT tokens

## Technologies Used

- Spring Boot
- MongoDB
- Spring Security
- JWT Authentication
- Lombok
- Maven

## API Endpoints

- `POST /api/students` - Add a new student
- `GET /api/students` - Get all students
- `GET /api/students/{id}` - Get student by ID
- `PUT /api/students/{id}` - Update student
- `DELETE /api/students/{id}` - Delete student
- `GET /api/students/school/{school}` - Get students by school

## Setup

1. Clone the repository
2. Configure MongoDB connection in `application.properties`
3. Run the application using Maven: `mvn spring-boot:run`

## Configuration

Update the following in `application.properties`:

- MongoDB connection string
- JWT secret key
- Server port (if needed)
