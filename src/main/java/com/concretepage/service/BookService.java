package com.concretepage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.concretepage.model.Book;
import com.concretepage.repos.BookRepository;

@Service
public class BookService {
	
	@Autowired
	private BookRepository repos;
	
	public Book getBookById(int id) {
        return repos.findById(id);
	}
	public Book createBook(Book book) {
	
		return repos.save(book);
	}
}