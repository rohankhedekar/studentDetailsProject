package com.project.student.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.project.student.model.Student;

@Component
public class StudentDao {

	public List<Student> getAllStudentsDetails(String studID) {
		List<Student> studentList =  createStudentsDetailsList();
		List<Student> students = new ArrayList<Student>();
		
		for(Student student : studentList) {
			if(studID.equalsIgnoreCase(student.getStudID())) {
				students.add(student);
			}
		}
		return students;
	}

	public List<Student> createStudentsDetailsList() {
		return Arrays.asList(new Student("1","Rohan","9665007742","Pune", null),
							 new Student("2","Akshay","9561174117","Satara", null));
	}
	
	
}
