package com.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



import com.app.pojo.Student;
import com.app.repository.StudentRepository;

@Service
@Transactional//readOnly: false
public class StudentServiceImpl implements StudentService {
	//dep : dao layer i/f
	@Autowired
	private StudentRepository studRepository;

	@Override
	public List<Student> getAllStudDetails() {
		// TODO Auto-generated method stub
		return studRepository.findAll();
	}

	@Override
	public Student addNewStudDetails(Student s) {
		// TODO Auto-generated method stub
		return studRepository.save(s);
	}
	

}