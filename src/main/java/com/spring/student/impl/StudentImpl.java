package com.spring.student.impl;


import org.springframework.beans.factory.annotation.Autowired;

import com.spring.dao.StudentDAO;
import com.spring.pojo.Studentpojo;
import com.spring.student.Student;

public class StudentImpl implements Student {

	@Autowired
	private Student student;
	
	@Autowired
	private StudentDAO studentDAO;

	public void addStudent(Studentpojo studentpojo) {

		studentDAO.addstudent(studentpojo);
	}

}
