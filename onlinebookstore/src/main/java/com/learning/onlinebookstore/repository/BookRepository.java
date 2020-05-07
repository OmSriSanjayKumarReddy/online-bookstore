package com.learning.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.onlinebookstore.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long>{
	
	
}
