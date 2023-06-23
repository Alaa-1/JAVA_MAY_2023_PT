package com.alaa.full_crud.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.alaa.full_crud.models.Book;

@Repository
public interface BookRepo extends CrudRepository<Book, Long> {
	
	List<Book> findAll();
	

	
}
