package com.project.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.student.model.Student;
import com.project.student.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@RequestMapping(value="/students/{studID}",method=RequestMethod.GET)
	public List<Student> getAllStudentsDetails(@PathVariable String studID){
		return studentService.getAllStudentsDetails(studID);
	}
}
