package com.management.studentsystem.service.impl;

import com.management.studentsystem.entity.Student;
import com.management.studentsystem.repository.StudentRepository;

public class StudentServiceImp {
    StudentRepository studentRepository;

    public StudentServiceImp(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    public Student addStudent(Student student){
        return studentRepository.save(student);
    }

    public void deleteStudent(long id){
        studentRepository.findById(id).
    }
}
