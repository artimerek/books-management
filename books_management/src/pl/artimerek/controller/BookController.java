package pl.artimerek.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/book")
public class BookController {
	
	@RequestMapping("/list")
	public String listBooks(Model model) {
		
		return "list-books";
	}
}
