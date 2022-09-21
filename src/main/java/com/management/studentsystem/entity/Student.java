package com.management.studentsystem.entity;

import javax.persistence.*;

@Entity
@Table
public class Student {
    @Id
    @GeneratedValue
    private long id;

    @Column(name = "student_name" , nullable= true)
    private String name;
    private String surname;
    private String email;


}
