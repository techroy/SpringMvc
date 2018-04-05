package com.springmvc.dao;

import org.springframework.stereotype.Repository;

import com.springmvc.entities.CourseEntity;

@Repository
public class CourseDaoImpl extends AbstractDao implements ICourseDao {

	@Override
	public void save(CourseEntity courseEntity) {

			getSession().save(courseEntity);
		
	}

	
}
