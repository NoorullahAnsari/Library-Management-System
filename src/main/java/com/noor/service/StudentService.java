package com.noor.service;

import java.util.List;

import com.noor.domain.Student;

public interface StudentService {

	public void addStudentData(Student student);

	List<Student> getStudentsDetails();

	Student getStudentDetailsById(int idNumber);
}
