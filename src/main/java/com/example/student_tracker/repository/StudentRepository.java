package com.example.student_tracker.repository;


import com.example.student_tracker.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    // No need to write any code – Spring will auto-generate methods like:
    // findAll(), save(), deleteById(), findById(), etc.
}
