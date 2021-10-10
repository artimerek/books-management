package pl.artimerek.app.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.artimerek.app.entity.Book;
import pl.artimerek.app.service.BookService;

import java.util.List;

@RestController
@RequestMapping("/rest")
public class BookRestController {

    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    private List<Book> getBooks(){

        return bookService.getBooks();
    }

    @GetMapping("/books/{bookId}")
    private Book getBook(@PathVariable int bookId){

        

        Book book = bookService.getBook(bookId);
        return book;
    }
}
