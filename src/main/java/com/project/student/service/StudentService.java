package com.project.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.student.dao.StudentDao;
import com.project.student.model.Student;

@Component
public class StudentService {

	@Autowired
	private StudentDao studentDao;
	
	
	public List<Student> getAllStudentsDetails(String studID) {
		return studentDao.getAllStudentsDetails(studID);
	}

}
