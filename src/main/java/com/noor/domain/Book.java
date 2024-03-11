package com.noor.domain;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bookId;
	@Nonnull
	private String bookRefNo;
	private String isbn;
	private String title;
	private String author;
	private String publication;
	private String edition;
	private int publishedYear;
	private String category;
	private int NoOfCopies;

}
