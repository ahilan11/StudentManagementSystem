package com.management.studentsystem;

import com.management.studentsystem.entity.Student;
import com.management.studentsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentsystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentsystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception{

//		Student student = new Student("Ahilan" , "Naidoo", "going@gmail.com");
//		Student stud = new Student("Tony", "Stark", "stock@gmail.com");
//		Student std = new Student("Ram", "Sanjay", "ramjay@gmail.com");
//		studentRepository.save(student);
//		studentRepository.save(stud);
//		studentRepository.save(std);

	}
}
