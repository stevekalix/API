package com.example.Secondabi;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.management.ConstructorParameters;
import java.beans.ConstructorProperties;

@Data
@Getter
@Setter
public class Student {
    public Student(){

    }
    private String firstName;
    private String lastName;
    private int age;

    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
}

