package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.pojo.Studentpojo;
import com.spring.student.Student;

@RestController
public class StudentController {

	@Autowired
	private Student student;

	@RequestMapping("/addStudent")
	public String test() {

		Studentpojo studentpojo = new Studentpojo();
		studentpojo.setAddress("Shastri Nagar");
		studentpojo.setMobile_no("8527701990");
		studentpojo.setName("Aviral");
		String response = student.addStudent(studentpojo);
		return response;
	}
}
