package com.springmvc.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springmvc.command.StudentCommand;
import com.springmvc.dao.ICourseDao;
import com.springmvc.dao.IStudentDao;
import com.springmvc.entities.CourseEntity;
import com.springmvc.entities.StudentEntity;

@Service

public class StudentServiceImpl implements IStudentService{

	@Autowired
	private IStudentDao studentDao;
	
	@Autowired
	private ICourseDao courseDao;
	
	@Override
	//@Transactional(readOnly=true)
	@Transactional
	public void save(StudentCommand studentCommand) {
		
		
		System.out.println("service Layer--"+studentCommand);
		
		StudentEntity studentEntity = new StudentEntity();
		studentEntity.setRoll(123);
		studentEntity.setSname(studentCommand.getName());
		
		studentDao.save(studentEntity);
		
		
		
		
		CourseEntity courseEntity = new CourseEntity();
		
		courseEntity.setCourseName(studentCommand.getCourseName());
		courseEntity.setDuration(studentCommand.getDuration());
		courseEntity.setFees(String.valueOf(2*200));
		
		courseDao.save(courseEntity);
		
		
		
		
	}

	
	
}
