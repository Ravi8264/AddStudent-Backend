package com.example.MathpreDictionWithMongoDb.repository;

import com.example.MathpreDictionWithMongoDb.entity.student;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface studentRepo extends MongoRepository<student, String> {
    student findByName(String name);

    List<student> findBySchool(String school);

    List<student> findByCls(String cls);

    List<student> findBySec(String sec);

}