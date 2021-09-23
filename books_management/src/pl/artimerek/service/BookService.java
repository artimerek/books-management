package pl.artimerek.service;

import java.util.List;

import pl.artimerek.entity.Book;

public interface BookService {
	
	public List<Book> getBooks();

	public void saveBook(Book book);
}
