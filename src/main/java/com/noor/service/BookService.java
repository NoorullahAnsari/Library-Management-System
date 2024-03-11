package com.noor.service;

import java.util.List;

import com.noor.domain.Book;

public interface BookService {
	public void addBookDetails(Book book);

	public List<Book> getBooksDetails();

	Book getBookDetailsByBookId(int bookId);

	Book getBookDetailsById(int bookId);
}
