package com.concretepage.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.concretepage.model.Book;

@Repository
public interface  BookRepository extends JpaRepository<Book, Integer>{

	Book findById(int id);
    
	Book save(Book book);
}
