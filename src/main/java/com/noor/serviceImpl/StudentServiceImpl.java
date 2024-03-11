package com.noor.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.noor.domain.Student;
import com.noor.repository.StudentRepo;
import com.noor.service.StudentService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepo studentRepo;

	@Override
	public void addStudentData(Student student) {
		log.info("Add student Details {} ",student);
		studentRepo.save(student);
	}

	@Override
	public List<Student> getStudentsDetails() {
		List<Student> students = studentRepo.findAll();
		log.info("Get All student Details :{} ",students);
		return students;
	}

	@Override
	public Student getStudentDetailsById(int idNumber) {
		Student student = new Student();
		student = studentRepo.findById(idNumber);
		return student;
	}

}
