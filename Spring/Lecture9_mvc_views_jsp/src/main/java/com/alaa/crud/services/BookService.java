package com.alaa.crud.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.alaa.crud.models.Book;
import com.alaa.crud.repositories.BookRepository;

@Service
public class BookService {
	
    // adding the book repository as a dependency
	// Dependency Injection
    private final BookRepository bookRepository;
    
    // Constructor
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    
    
//	==== CRUD FUNCTIONALITIES ===
    
    
    
    // returns all the books
    // READ ALL
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    
    // creates a book
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    
    // retrieves a book
//    READ ONE
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
    
// UPDATE
    
    public Book updateBook(Book b) {
    	return bookRepository.save(b);
    }
    
 // DELETE
    public void deleteBook(Long id) {
    	bookRepository.deleteById(id);
    }
}