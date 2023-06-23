package com.alaa.full_crud.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.alaa.full_crud.models.Book;
import com.alaa.full_crud.services.BookService;

import jakarta.validation.Valid;

@Controller
public class BookController {
	
	@Autowired
	private BookService bookServ;
	
	
	@GetMapping("/books")
	public String allBooks(@ModelAttribute("book") Book book, Model model) {
		
		List<Book> allDaBooks = bookServ.allBooks();
		model.addAttribute("bookList", allDaBooks);
		return "books.jsp";
	}
	
	@PostMapping("/books")
	public String createBook(@Valid @ModelAttribute("book") Book book,
			BindingResult result,
			Model model) {
		
		if(result.hasErrors()) {
			List<Book> allDaBooks = bookServ.allBooks();
			model.addAttribute("bookList", allDaBooks);
			return "books.jsp";
		} else {
			Book newBook = bookServ.createBook(book);
			return "redirect:/books";
		}
		}
	
	// --- RENDER EDIT PAGE ---
	@GetMapping("/edit/{id}")
	public String editPage(@PathVariable("id") Long id, Model model) {
//		find that book with the provided id
		Book thisBook = bookServ.findBook(id);
//		pass thisBook to the jsp page to show
		model.addAttribute("book", thisBook);
		return "edit.jsp";
	}
	
	//	--- METHOD FOR EDIT ---
	
	@PutMapping("/books/{id}")
	public String update(@Valid @ModelAttribute("book") Book book,
			BindingResult result) {
		
		if(result.hasErrors()) {
			return "edit.jsp";
		}else {
			bookServ.updateBook(book);
			return "redirect:/books";
		}
			}
	
	
	
	// DELETE
	@DeleteMapping("/books/{bob}")
	public String delete(@PathVariable("bob") Long bob) {
		bookServ.deleteBook(bob);
		return "redirect:/books";
	}
	
	

}
