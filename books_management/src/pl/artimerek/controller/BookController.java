package pl.artimerek.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	@GetMapping("/showAddBookForm")
	public String showAddBookForm(Model model) {
		
		Book book = new Book();
		
		model.addAttribute("book", book);
		return "form-book";
	}
	
	@PostMapping("/saveBook")
	public String addBook(@ModelAttribute("book") Book book) {
		
		bookService.saveBook(book);
		
		return "redirect:/book/list";
	}
	
	@GetMapping("/showUpdateForm")
	public String showUpdateForm(@RequestParam("bookId") int id, Model model) {
		
		Book book = bookService.getBook(id);
		
		model.addAttribute("book", book);
		
		return "form-book";
	}
	
	@GetMapping("/delete")
	public String deleteBook(@RequestParam("bookId") int id) {
		
		 bookService.deleteBook(id);
		
		 return "redirect:/book/list";
	}
}
