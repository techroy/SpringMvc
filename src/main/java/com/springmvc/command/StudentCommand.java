package com.springmvc.command;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class StudentCommand {

	@Size(min=3,max=20)
	private String name;
	
	@NotEmpty
	private String qualification;
	
	@NotNull
	private String gender;
	
	@NotEmpty
	private String address;
	
	@NotEmpty
	private String courseName;
	
	@NotEmpty
	private String duration;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "StudentCommand [name=" + name + ", qualification=" + qualification + ", gender=" + gender + ", address="
				+ address + ", courseName=" + courseName + ", duration=" + duration + "]";
	}
	
	
	
	
	
}
