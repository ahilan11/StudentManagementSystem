package com.management.studentsystem.entity;

import javax.persistence.*;

@Entity
@Table(name = "student_database")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    @Column(name = "name" , nullable= true)

    private String name;
    @Column(name = "surname" , nullable= true)

    private String surname;
    @Column(name = "email" , nullable= true)

    private String email;

    public Student(long id, String name, String surname, String email) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
    }

    public Student( String name, String surname, String email) {
        this.name = name;
        this.surname = surname;
        this.email = email;
    }
    public Student(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
