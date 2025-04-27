package com.example.MathpreDictionWithMongoDb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "students")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class student {
    @Id
    private String id;

    @Field("name")
    private String name;

    @Field("school")
    private String school;

    @Field("sec")
    private String sec;

    @Field("cls")
    private String cls;

    @Field("password")
    private String password;

    @Field("Email")
    private String Email;

    @Field("jwtToken")
    private String jwtToken;

    @Field("refreshToken")
    private String refreshToken;

    // Constructor without ID - MongoDB will generate it
    public student(String name, String school, String sec, String cls, String password, String Email) {
        this.name = name;
        this.school = school;
        this.sec = sec;
        this.cls = cls;
        this.password = password;
        this.Email = Email;
    }

}