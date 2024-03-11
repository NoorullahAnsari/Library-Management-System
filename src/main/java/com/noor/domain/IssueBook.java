package com.noor.domain;

import java.time.LocalDate;

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
public class IssueBook {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int issueId;
	@Nonnull
	private LocalDate issuedDate;
	@Nonnull
	private LocalDate returnDate;
	private String firstName;
	private String lastName;
	@Nonnull
	private String bookRefNo;
	private String title;
	private String author;
	private String publication;

}
