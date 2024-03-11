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

import com.noor.domain.Book;
import com.noor.serviceImpl.BookServiceImpl;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@CrossOrigin(origins = "*")
public class BookController {

	@Autowired
	private BookServiceImpl bookServiceImpl;

	@PostMapping("/addBook")
	public ResponseEntity<?> addBookDetails(@RequestBody Book book) {
		bookServiceImpl.addBookDetails(book);
		log.info("Add book details : ", book);
		return ResponseEntity.ok(book);
	}

	@GetMapping("/getBooks")
	public List<Book> getBooksDetails() {
		List<Book> books = bookServiceImpl.getBooksDetails();
		log.info("Get All book details : " + books);
		return books;
	}
	
	@GetMapping("/getBook/{bookId}")
	public Book getBookDetailsById(@PathVariable int bookId ) {
		Book book = bookServiceImpl.getBookDetailsById(bookId);
		log.info("Get book details by bookId : " + bookId);
		return book;
	}

}
