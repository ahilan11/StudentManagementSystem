package com.management.studentsystem.service;

import com.management.studentsystem.entity.Student;
import com.management.studentsystem.repository.StudentRepository;

public class StudentService {
    StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    public Student addStudent(Student student){
        return studentRepository.save(student);
    }
}
