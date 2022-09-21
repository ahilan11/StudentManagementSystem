package com.management.studentsystem.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Student {
    @Id
    @GeneratedValue
    private long id;

    private String name;
    private String surname;
    private String email;


}
