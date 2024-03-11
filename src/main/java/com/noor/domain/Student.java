package com.noor.domain;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idNumber;
	private String firstName;
	private String lastName;
	@NonNull
	private String email;
	private String address;
	private String telephoneNo;
	private LocalDate registeredDate;
	private LocalDate terminatedDate;

}
