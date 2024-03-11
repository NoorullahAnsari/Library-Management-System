package com.noor.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class IssueBookDTO {

	private int bookId;
	private int idNumber;
	private String bookRefNo;
	private String title;
	private String publication;
	private String author;
	private String firstName;
	private String lastName;
	private LocalDate issuedDate;
	private LocalDate returnDate;

}
