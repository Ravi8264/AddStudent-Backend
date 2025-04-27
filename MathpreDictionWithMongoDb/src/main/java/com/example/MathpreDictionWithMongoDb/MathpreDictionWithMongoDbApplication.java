package com.example.MathpreDictionWithMongoDb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import com.example.MathpreDictionWithMongoDb.entity.student;
import com.example.MathpreDictionWithMongoDb.service.imp.studentImp;
import java.util.List;

@SpringBootApplication
public class MathpreDictionWithMongoDbApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(MathpreDictionWithMongoDbApplication.class,
				args);
		// studentImp studentService = context.getBean(studentImp.class);

		// // Add students
		// student john = new student("John", "School A", "Section 1", "Class 1", "ravi", "r@gmail.com");
		// student jane = new student("Jane", "School B", "Section 2", "Class 2", "ravi", "rr@gmail.com");
		// student jim = new student("Jim", "School C", "Section 3", "Class 3", "ravi", "rrr@gmail.com");

		// // Save students and get their auto-generated IDs
		// john = studentService.add(john);
		// jane = studentService.add(jane);
		// jim = studentService.add(jim);

		// System.out.println("Students added successfully");

		// List<student> students = studentService.getAll();
		// students.forEach(System.out::println);
	}

}
