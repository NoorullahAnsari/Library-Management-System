package com.noor.service;

import java.util.List;

import com.noor.dto.IssueBookDTO;

public interface IssueBookService {

	void issueBook(IssueBookDTO issueBookDTO);

	List<IssueBookDTO> getIssueBooks();

}
