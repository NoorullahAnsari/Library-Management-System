package com.noor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.noor.domain.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

	public Student findById(int id);
}
