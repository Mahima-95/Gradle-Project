package com.spring.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import com.spring.dao.StudentDAO;
import com.spring.pojo.Studentpojo;

@Repository
public class StudentDAOImpl implements StudentDAO {

	@Autowired
	private SessionFactory sessionFactory;

	private Session session;

	private Transaction transaction;

	StudentDAOImpl() {
		super();
	}

	public StudentDAOImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}

	@Override
	public String addstudent(Studentpojo studentpojo) {

		
		if (StringUtils.isEmpty(session) || !session.isOpen()) {
			session = getSession();
		}
		System.out.println(transaction);
		session.save(studentpojo);
		transaction.commit();
		session.close();
		return "sucessfully inserted...!!!!!!!";
	}

	private Session getSession() {
		session = sessionFactory.getCurrentSession();
		transaction = session.beginTransaction();
		return session;
	}
}
