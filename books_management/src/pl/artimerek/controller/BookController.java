package pl.artimerek.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.artimerek.dao.BookDAO;
import pl.artimerek.entity.Book;

@Controller
@RequestMapping("/book")
public class BookController {
	
	@Autowired
	private BookDAO bookDAO; 
	
	@RequestMapping("/list")
	public String listBooks(Model model) {
			
		List<Book> books = bookDAO.getBooks();

		model.addAttribute("books", books);
		
		return "list-books";
	}
}
