package com.noor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.noor.domain.Student;
import com.noor.serviceImpl.StudentServiceImpl;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@CrossOrigin(origins = "*")
public class StudentController {

	@Autowired
	private StudentServiceImpl studentServiceImpl;

	@PostMapping("/addStudent")
	public ResponseEntity<?> addStudentData(@RequestBody Student student) {
		studentServiceImpl.addStudentData(student);
		log.info("Add student Details : {}",student);
		return ResponseEntity.ok(student);
	}

	@GetMapping("/getStudents")
	public List<Student> getStudentsDetails() {
		List<Student> students = studentServiceImpl.getStudentsDetails();
		log.info("Get students details : {} ",students);
		return students;
	}
	@GetMapping("/getStudent/{idNumber}")
	public Student getStudentsDetails(@PathVariable int idNumber) {
		Student student = studentServiceImpl.getStudentDetailsById(idNumber);
		log.info("Get student details by Id : ",idNumber);
		return student;
	}

}
