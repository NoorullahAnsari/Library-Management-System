package com.noor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.noor.dto.IssueBookDTO;
import com.noor.serviceImpl.IssueBookServiceImpl;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@CrossOrigin(origins = "*")
public class IssueBookController {

	@Autowired
	IssueBookServiceImpl issueBookServiceImpl;

	@PostMapping("/issueBook")
	public ResponseEntity<?> issueBook(@RequestBody IssueBookDTO issueBookDTO) {
		issueBookServiceImpl.issueBook(issueBookDTO);
		log.info("Issuing Book {} ", issueBookDTO);
		return ResponseEntity.ok(issueBookDTO);
	}

	@GetMapping("/getIssueBooks")
	public List<IssueBookDTO> getIssueBooks() {
		List<IssueBookDTO> issueBookDTOs = issueBookServiceImpl.getIssueBooks();
		log.info("Get Issuing Books {} ", issueBookDTOs);
		return issueBookDTOs;
	}

}
