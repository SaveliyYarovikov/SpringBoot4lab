package com.example.springboot4lab.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "STUDENTS")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surame;

    @Column(name = "faculty")
    private String faculty;

    @Column(name = "age")
    private int age;

    public Student(){

    }

    public Student (String name,  String surame, String faculty, int age){

        this.name = name;
        this.surame = surame;
        this.faculty = faculty;
        this.age = age;
    }

}
