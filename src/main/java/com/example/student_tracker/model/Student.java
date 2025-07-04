package com.example.student_tracker.model;

import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String course;

    // Empty constructor (required by Spring)
    public Student() {
    }

    // Constructor with fields
    public Student(String name, String email, String course) {
        this.name = name;
        this.email = email;
        this.course = course;
    }

    // Getters and setters (right-click → Generate → Getter and Setter in IntelliJ)
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}