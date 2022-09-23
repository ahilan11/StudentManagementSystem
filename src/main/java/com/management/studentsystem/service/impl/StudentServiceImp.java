package com.management.studentsystem.service.impl;

import com.management.studentsystem.entity.Student;
import com.management.studentsystem.exception.StudentNotFoundException;
import com.management.studentsystem.repository.StudentRepository;
import com.management.studentsystem.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
        studentRepository.findById(id).orElseThrow(() -> new StudentNotFoundException("Student","Id",id));
        studentRepository.deleteById(id);
    }

    @Override
    public Student updateStudent(Student student, long id) {
        Student existingStudent = studentRepository.findById(id).orElseThrow(() -> new StudentNotFoundException("Student","Id",id));
        existingStudent.setEmail(student.getEmail());
        existingStudent.setName(student.getName());
        existingStudent.setSurname(student.getSurname());
        return studentRepository.save(existingStudent);
    }

    @Override
    public Student getStudentById(long id) {
        return studentRepository.findById(id).orElseThrow(() -> new StudentNotFoundException("Student","Id",id));
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
