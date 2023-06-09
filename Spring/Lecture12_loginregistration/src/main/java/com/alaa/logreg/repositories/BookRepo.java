package com.alaa.logreg.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.alaa.logreg.models.Book;

@Repository
public interface BookRepo extends CrudRepository<Book, Long> {
	
	List<Book> findAll();
	

	
}
