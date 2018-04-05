package com.springmvc.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractDao {

	@Autowired
	SessionFactory sessionFactory;

	public Session getSession() {

		return sessionFactory.getCurrentSession();
	}

}
