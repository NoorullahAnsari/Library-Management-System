package com.noor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.noor.domain.Book;

public interface BookRepo extends JpaRepository<Book, Integer> {
	public Book findById(int bookId);

}
