package com.management.studentsystem.controller;

import com.management.studentsystem.entity.Student;
import com.management.studentsystem.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class StudentController {

    StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }
    @GetMapping("students/new")
    public String saveStudentForm( Model model){
        Student student = new Student();
        model.addAttribute("student",student);
        return "create_student";
    }

    @PostMapping("students")
    public String saveStudent(@ModelAttribute("student") Student student){
studentService.addStudent(student);
return "redirect:/getAllStudents";
    }

 @GetMapping("students/edit/{id}")
 public String updateStudent(@PathVariable Long id, Model model){
       Student student = studentService.getStudentById(id);

       model.addAttribute("student",student);
       return "edit_student";
 }

 @PostMapping("students/{id}")
        public String updateStudent(@PathVariable("id") Long id, @ModelAttribute("student") Student student, Model model){
studentService.updateStudent(student,id);
return "redirect:/getAllStudents";
     }

    @RequestMapping("getStudent/{id}")
    @GetMapping()
    public ResponseEntity<Student> getStudent(@PathVariable("id")long id){
        return new ResponseEntity<>(studentService.getStudentById(id), HttpStatus.FOUND);
    }

    @GetMapping("getAllStudents")
    public String listStudents(Model model){
        model.addAttribute("students",studentService.getAllStudents());
        return "students";
    }

    @GetMapping("students/delete/{id}")
    public String deleteStudent(@PathVariable("id") long id, Model model){
         studentService.deleteStudent(id);
         return "redirect:/getAllStudents";
    }
}
