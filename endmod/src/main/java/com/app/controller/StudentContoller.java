package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojo.Student;
import com.app.services.StudentService;



@RestController
@CrossOrigin(origins = "http://localhost:3000")//enables CORS header 
@RequestMapping("/students")
public class StudentContoller {

	
		
			@Autowired
			private StudentService studService;
			public StudentContoller() {
				System.out.println("in def ctor of "+getClass());
			}
			//URL : http://host:port/employees , method=GET
			@GetMapping
			public List<Student> getStuds()
			{
				System.out.println("in get studs");
				return studService.getAllStudDetails();
			}
			//URL : http://host:port/employees , method=POST
			@PostMapping
			public Student saveStudDetails(@RequestBody Student s)
			{
				System.out.println("in save stud "+s);
				return studService.addNewStudDetails(s);
			}
			
		

	
	
}
