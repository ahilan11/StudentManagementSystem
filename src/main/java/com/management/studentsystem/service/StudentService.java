package com.management.studentsystem.service;

import com.management.studentsystem.entity.Student;

import java.util.List;

public interface StudentService {
    Student addStudent(Student student);
    void deleteStudent(long id);
    Student updateStudent(Student student, long id);
    Student getStudentById(long id);
    List<Student> getAllStudents();
}
