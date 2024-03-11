package com.noor.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.noor.domain.Book;
import com.noor.repository.BookRepo;
import com.noor.service.BookService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepo bookRepo;

	@Override
	public void addBookDetails(Book book) {
		log.info("Add book Details {}: ",book);
		bookRepo.save(book);
	}

	@Override
	public List<Book> getBooksDetails() {
		List<Book> books = bookRepo.findAll();
		log.info("Get books Details {}: ",books);
		return books;
	}

	@Override
	public Book getBookDetailsByBookId(int bookId) {
		Book book = new Book();
		book = bookRepo.findById(bookId);
		log.info("get book by id ",bookId);
		return book;
	}

	@Override
	public Book getBookDetailsById(int bookId) {
		Book book = bookRepo.findById(bookId);
		return book;
	}

}
