package com.spring.student.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.dao.StudentDAO;
import com.spring.pojo.Studentpojo;
import com.spring.student.Student;

@Service
public class StudentImpl implements Student {

	@Autowired
	private StudentDAO studentDAO;

	@Override
//	@Transactional
	public String addStudent(Studentpojo studentpojo) {

		return studentDAO.addstudent(studentpojo);
	}

}
