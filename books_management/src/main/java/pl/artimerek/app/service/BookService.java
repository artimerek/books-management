package pl.artimerek.app.service;

import pl.artimerek.app.entity.Book;

import java.util.List;



public interface BookService {
	
	public List<Book> getBooks();

	public void saveBook(Book book);

	public Book getBook(int id);

	public void deleteBook(int id);
}
