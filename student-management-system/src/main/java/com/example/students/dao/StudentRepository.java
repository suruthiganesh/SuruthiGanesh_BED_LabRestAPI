package com.example.students.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.students.model.Student;
@Repository

public interface StudentRepository extends JpaRepository<Student, Integer>
{

}
