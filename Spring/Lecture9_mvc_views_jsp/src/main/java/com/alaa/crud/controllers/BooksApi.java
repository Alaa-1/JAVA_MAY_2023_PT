package com.alaa.crud.controllers;

import java.util.List;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alaa.crud.models.Book;
import com.alaa.crud.services.BookService;

import jakarta.validation.Valid;

@RestController
public class BooksApi {
	
	
	
	// Dependency Injection
    private final BookService bookService;

    // Constructor
    public BooksApi(BookService bookService){
        this.bookService = bookService;
    }
    
    
 
    @RequestMapping("/api/books")
    public List<Book> index() {
        return bookService.allBooks();
    }
    
    
    @RequestMapping(value="/api/books", method=RequestMethod.POST)
    public Book create(@RequestParam(value="title") String title, @RequestParam(value="description") String desc, @RequestParam(value="language") String lang, @RequestParam(value="pages") Integer numOfPages) {
        Book book = new Book(title, desc, lang, numOfPages);
        return bookService.createBook(book);
    }
    
    @RequestMapping("/api/books/{id}")
    public Book show(@PathVariable("id") Long id) {
        Book book = bookService.findBook(id);
        return book;
    }
    
    // UPDATE a BOOK
    @RequestMapping(value="/api/books/{id}/edit", method=RequestMethod.PUT)
    public Book update(@RequestParam(value="title") String title,
    		@RequestParam(value="description") String desc,
    		@RequestParam(value="language") String lang,
    		@RequestParam(value="pages") Integer numOfPages,
    		@PathVariable("id") Long id) {
    	
    	Book updatedBook = new Book (title, desc, lang, numOfPages);
    	updatedBook.setId(id);
    	return bookService.updateBook(updatedBook);
     
    }
    
    // DELETE a BOOK
    @RequestMapping(value="/api/books/{id}/delete", method=RequestMethod.DELETE)
    public void destroy(@PathVariable("id") Long id) {
    	
    	bookService.deleteBook(id);
    }
    
    
}