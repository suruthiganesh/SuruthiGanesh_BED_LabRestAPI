package com.example.students.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.example.students.model.Student;
import lombok.RequiredArgsConstructor;
import com.example.students.dao.StudentRepository;

@Service
@RequiredArgsConstructor

public class StudentServiceImpl implements StudentService
{
	private final StudentRepository studentRepository;

	@Override
	public List<Student> findAll() 
	{
		return this.studentRepository.findAll();
	}

	@Override
	public Student findById(int id) 
	{
		return this.studentRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("invalid student id"));
	}

	@Override
	public Student save(Student student) 
	{
		return this.studentRepository.save(student);
		
	}

	@Override
	public void deleteById(int id) 
	{
		return this.studentRepository.deleteById(id);	
	}

}
