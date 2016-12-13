package com.spring.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.dao.StudentDAO;
import com.spring.pojo.Studentpojo;

public class StudentDAOImpl implements StudentDAO {

	@Autowired
	private StudentDAO studentDAO;

	StudentDAOImpl(){
		super();
	}
	
	public void addstudent(Studentpojo studentpojo) {

	}

}
