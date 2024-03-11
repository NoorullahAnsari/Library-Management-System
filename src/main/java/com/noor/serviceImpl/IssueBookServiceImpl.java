package com.noor.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.noor.domain.Book;
import com.noor.domain.IssueBook;
import com.noor.domain.Student;
import com.noor.dto.IssueBookDTO;
import com.noor.repository.IssueBookRepo;
import com.noor.service.IssueBookService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class IssueBookServiceImpl implements IssueBookService {

	@Autowired
	private IssueBookRepo issueBookRepo;

	@Autowired
	private BookServiceImpl bookServiceImpl;

	@Autowired
	private StudentServiceImpl studentServiceImpl;

	@Override
	public void issueBook(IssueBookDTO issueBookDTO) {
		IssueBook issueBook = new IssueBook();
		Student student = new Student();
		Book book = new Book();
		student = studentServiceImpl.getStudentDetailsById(issueBookDTO.getIdNumber());
		book = bookServiceImpl.getBookDetailsByBookId(issueBookDTO.getBookId());
		log.info("Book issueing : {}", issueBookDTO);
		BeanUtils.copyProperties(issueBookDTO, issueBook);
		if (issueBookDTO.getBookId() != book.getBookId() && issueBookDTO.getIdNumber() != student.getIdNumber()) {
			log.info("Student or Book is not registered ", issueBookDTO);
			return;
		}
		issueBookRepo.save(issueBook);
	}

	@Override
	public List<IssueBookDTO> getIssueBooks() {

		List<IssueBookDTO> issueBookDTOs = new ArrayList<>();
		List<IssueBook> issueBooks = issueBookRepo.findAll();

		for (IssueBook issueBook : issueBooks) {
			IssueBookDTO issueBookDTO = new IssueBookDTO();
			BeanUtils.copyProperties(issueBook, issueBookDTO);
			issueBookDTOs.add(issueBookDTO);
		}
		log.info("Get issued books {}", issueBookDTOs);
		return issueBookDTOs;
	}

}
