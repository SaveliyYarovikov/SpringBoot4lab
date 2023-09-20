package com.example.springboot4lab.service;

import com.example.springboot4lab.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {

    List<Student> getAllStudents();

    Student getStudent(int id);

    Student saveStudent(Student student);

    void deleteStudent(int id);

}
