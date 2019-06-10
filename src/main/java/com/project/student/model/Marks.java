package com.project.student.model;

public class Marks {
	
	private String studId;
	private String subjectName;
	private int mark;
	
	public Marks(String studId,String subjectName, int mark) {
		super();
		this.studId = studId;
		this.subjectName = subjectName;
		this.mark = mark;
	}
	
	public String getStudId() {
		return studId;
	}
	public void setStudId(String studId) {
		this.studId = studId;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	
	

}
