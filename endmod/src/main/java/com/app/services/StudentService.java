package com.app.services;
import java.util.List;
import com.app.pojo.Student;




public interface StudentService {

	List<Student> getAllStudDetails();
	
	Student addNewStudDetails( Student s);
}


