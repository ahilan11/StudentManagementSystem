package com.management.studentsystem.service.impl;

import com.management.studentsystem.entity.Student;
import com.management.studentsystem.repository.StudentRepository;
import com.management.studentsystem.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImp implements StudentService {
    StudentRepository studentRepository;

    public StudentServiceImp(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }
    @Override
    public Student addStudent(Student student){
        return studentRepository.save(student);
    }
    @Override
    public void deleteStudent(long id){
        studentRepository.findById(id).
    }

    @Override
    public Student updateStudent(Student student, long id) {
        return null;
    }

    @Override
    public Student getStudentById(long id) {
        return null;
    }

    @Override
    public List<Student> getAllStudents() {
        return null;
    }
}