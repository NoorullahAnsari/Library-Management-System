package com.noor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.noor.domain.IssueBook;

public interface IssueBookRepo extends JpaRepository<IssueBook, Integer> {

}
