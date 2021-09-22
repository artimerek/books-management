package pl.artimerek.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.artimerek.entity.Book;
import pl.artimerek.service.BookService;

@Controller
@RequestMapping("/book")
public class BookController {
	
	@Autowired
	private BookService bookService; 
	
	@GetMapping("/list")
	public String listBooks(Model model) {
			
		List<Book> books = bookService.getBooks();

		model.addAttribute("books", books);
		
		return "list-books";
	}
}
