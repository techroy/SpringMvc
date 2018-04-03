package com.springmvc.command;

public class StudentCommand {

	private String name;
	
	private String qualification;
	
	private String gender;
	
	private String address;
	
	private String courseName;
	
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
