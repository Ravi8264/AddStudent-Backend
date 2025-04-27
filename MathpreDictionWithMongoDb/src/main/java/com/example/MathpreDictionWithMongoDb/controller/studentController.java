package com.example.MathpreDictionWithMongoDb.controller;

import com.example.MathpreDictionWithMongoDb.entity.student;
import com.example.MathpreDictionWithMongoDb.service.imp.studentImp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
@CrossOrigin(origins = "http://localhost:5173")
public class studentController {
    private static final Logger logger = LoggerFactory.getLogger(studentController.class);

    @Autowired
    private studentImp studentService;

    // Create new student
    @PostMapping
    public student addStudent(@RequestBody student st) {
        logger.info("Adding new student: {}", st);
        return studentService.add(st);
    }

    // Get all students
    @GetMapping
    public List<student> getAllStudents() {
        logger.info("Getting all students");
        List<student> students = studentService.getAll();
        logger.info("Returning {} students", students.size());
        return students;
    }

    // Get student by ID
    @GetMapping("/{id}")
    public student getStudentById(@PathVariable String id) {
        logger.info("Getting student by ID: {}", id);
        return studentService.getById(id);
    }

    // Update student
    @PutMapping("/{id}")
    public student updateStudent(@PathVariable String id, @RequestBody student st) {
        logger.info("Updating student with ID: {}", id);
        st.setId(id);
        return studentService.update(st);
    }

    // Delete student
    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable String id) {
        logger.info("Deleting student with ID: {}", id);
        studentService.delete(id);
        return "Student deleted successfully";
    }

    // Get students by school
    @GetMapping("/school/{school}")
    public List<student> getStudentsBySchool(@PathVariable String school) {
        logger.info("Getting students by school: {}", school);
        return studentService.getBySchool(school);
    }
}