package com.management.studentsystem.controller;

import com.management.studentsystem.entity.Student;
import com.management.studentsystem.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/student")
public class StudentController {

    StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }
    @RequestMapping("addStudent")
    @PostMapping()
    public ResponseEntity<Student> addStudent(@RequestBody Student stud){
        return new ResponseEntity<>(studentService.addStudent(stud), HttpStatus.CREATED);
    }

    @RequestMapping("updateStudent/{id}")
    @PutMapping()
    public ResponseEntity<Student> updateStudent(@RequestBody Student stud, @RequestParam("id") long id){
        return new ResponseEntity<>(studentService.updateStudent(stud,id), HttpStatus.OK);
    }

    @RequestMapping("getStudent/{id}")
    @GetMapping()
    public ResponseEntity<Student> getStudent(@RequestParam("id")long id){
        return new ResponseEntity<>(studentService.getStudentById(id), HttpStatus.FOUND);
    }

    @RequestMapping("getAllStudents")
    @GetMapping()
    public ResponseEntity<List<Student>> getStudent(){
        return new ResponseEntity<>(studentService.getAllStudents(), HttpStatus.FOUND);
    }

    @RequestMapping("deleteStudent/{id}")
    @DeleteMapping()
    public ResponseEntity<String> deleteStudent(@RequestParam("id") long id){
         studentService.deleteStudent(id);
         return new ResponseEntity<>("Student was successfully deleted", HttpStatus.OK);
    }
}
