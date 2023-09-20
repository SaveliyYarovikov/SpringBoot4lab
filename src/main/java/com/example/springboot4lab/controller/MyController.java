package com.example.springboot4lab.controller;

import com.example.springboot4lab.entity.Student;
import com.example.springboot4lab.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyController {

    @Autowired
    private StudentService studentService;
//check
    @GetMapping("/students")
    public List<Student> showAllStudents(){
        List<Student> allStudents = studentService.getAllStudents();
        return allStudents;
    }
}
