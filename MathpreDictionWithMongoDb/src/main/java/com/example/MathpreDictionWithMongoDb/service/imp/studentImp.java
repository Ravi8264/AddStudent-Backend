package com.example.MathpreDictionWithMongoDb.service.imp;

import com.example.MathpreDictionWithMongoDb.entity.student;
import com.example.MathpreDictionWithMongoDb.repository.studentRepo;
import com.example.MathpreDictionWithMongoDb.security.SecurityService;
import com.example.MathpreDictionWithMongoDb.security.WebSecurity;
import com.example.MathpreDictionWithMongoDb.service.studentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class studentImp implements studentService {
    private static final Logger logger = LoggerFactory.getLogger(studentImp.class);
    private studentRepo repo;
    private SecurityService st;
    private WebSecurity ws;

    studentImp(studentRepo repo, SecurityService securityService, WebSecurity ws) {
        this.repo = repo;
        this.st = securityService;
        this.ws = ws;
    }

    @Override
    public student add(student st) {
        String encodedPassword = ws.passwordEncoder().encode(st.getPassword());
        st.setPassword(encodedPassword);
        this.st.generateAndSetTokens(st);
        return repo.save(st);
    }

    @Override
    public List<student> getAll() {
        logger.info("Fetching all students");
        List<student> students = repo.findAll();
        logger.info("Found {} students", students.size());
        return students;
    }

    @Override
    public student getById(String id) {
        logger.info("Looking for student with ID: {}", id);
        return repo.findById(id).orElse(null);
    }

    @Override
    public student update(student st) {
        return repo.save(st);
    }

    @Override
    public void delete(String id) {
        repo.deleteById(id);
    }

    @Override
    public List<student> getBySchool(String school) {
        return repo.findBySchool(school);
    }
}
