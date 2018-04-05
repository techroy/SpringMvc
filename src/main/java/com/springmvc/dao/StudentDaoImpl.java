package com.springmvc.dao;

import org.springframework.stereotype.Repository;

import com.springmvc.entities.StudentEntity;

@Repository
public class StudentDaoImpl extends AbstractDao  implements IStudentDao {

	@Override
	public void save(StudentEntity studentEntity) {

		getSession().save(studentEntity);

	}

	

}
