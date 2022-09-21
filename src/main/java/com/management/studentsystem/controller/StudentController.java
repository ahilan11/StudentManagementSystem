package com.management.studentsystem.controller;

import com.management.studentsystem.entity.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/student")
public class StudentController {

    @RequestMapping("addStudent")
    @PostMapping()
    public ResponseEntity<Student> addStudent(Student stud){
        return new ResponseEntity<>();
    }
}
