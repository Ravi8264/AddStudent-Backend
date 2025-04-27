package com.example.MathpreDictionWithMongoDb.service;

import com.example.MathpreDictionWithMongoDb.entity.student;
import java.util.List;

public interface studentService {
    student add(student st);

    List<student> getAll();

    student getById(String id);

    student update(student st);

    void delete(String id);

    List<student> getBySchool(String school);

}
