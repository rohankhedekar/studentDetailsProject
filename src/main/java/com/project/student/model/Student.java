package com.project.student.model;

import java.util.List;

import org.springframework.stereotype.Component;

public class Student {

	private String studID;
	private String studName;
	private String mobNo;
	private String address;
	private List<Marks> marks;

	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(String studID, String studName, String mobNo, String address, List<Marks> marks) {
		super();
		this.studID = studID;
		this.studName = studName;
		this.mobNo = mobNo;
		this.address = address;
		this.marks = marks;
	}

	public String getStudID() {
		return studID;
	}
	public void setStudID(String studID) {
		this.studID = studID;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public String getMobNo() {
		return mobNo;
	}
	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<Marks> getMarks() {
		return marks;
	}

	public void setMarks(List<Marks> marks) {
		this.marks = marks;
	}
	
}
