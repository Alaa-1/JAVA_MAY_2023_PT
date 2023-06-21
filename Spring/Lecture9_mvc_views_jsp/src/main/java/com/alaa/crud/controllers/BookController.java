package com.alaa.crud.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.alaa.crud.models.Book;
import com.alaa.crud.services.BookService;

@Controller
public class BookController {

	// Dependency Injection
    private final BookService bookService;

    // Constructor
    public BookController(BookService bookService){
        this.bookService = bookService;
    }
    
    @GetMapping("/books")
    public String allBooks(Model model) {
    	List<Book> allBooks = bookService.allBooks();
    	model.addAttribute("bookList",allBooks);
    	return "books.jsp";
    }
    
    @GetMapping("/books/create")
    public String dsiplayForm() {
    	
    	return "form.jsp";
    }
    
    @PostMapping("/processForm")
    public String createBook(@RequestParam(value="title") String title,
    		@RequestParam(value="description") String desc,
    		@RequestParam(value="language") String lang,
    		@RequestParam(value="numberOfPages") Integer numOfPages) {
    	
    	Book book = new Book(title, desc, lang, numOfPages);
        Book newlyCreatedBook = bookService.createBook(book);
        
        return "redirect:/books";

    }
    
    @GetMapping("/books/{id}")
    public String showOne(@PathVariable("id") Long bookId,
    						Model model) {
    	
    	Book oneBook = bookService.findBook(bookId);
    	model.addAttribute("book",oneBook);
    	return "show.jsp";
    }
    
    @GetMapping("/books/{id}/edit")
    public String displayEdit(@PathVariable("id") Long id,
    							Model model) {
    	
    	Book oneBook = bookService.findBook(id);
    	model.addAttribute("book",oneBook);
    	return "update.jsp";
    }
    
    
    @PutMapping("/books/{id}")
    public String edit(@RequestParam(value="title") String title,
    		@RequestParam(value="description") String desc,
    		@RequestParam(value="language") String lang,
    		@RequestParam(value="numberOfPages") Integer numOfPages,
    		@PathVariable("id") Long id) {
    	Book updatedBook = new Book (title, desc, lang, numOfPages);
    	updatedBook.setId(id);
    	bookService.updateBook(updatedBook);
    	return "redirect:/books";
    }
    
    
    
    
    
    // DELETE a BOOK
    @DeleteMapping(value="/books/{id}/delete")
    public String destroy(@PathVariable("id") Long id) {
    	
    	bookService.deleteBook(id);
    	
    	return "redirect:/books";
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
