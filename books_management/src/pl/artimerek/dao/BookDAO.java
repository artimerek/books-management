package pl.artimerek.dao;

import java.util.List;

import pl.artimerek.entity.Book;

public interface BookDAO {
	
	public List<Book> getBooks();

	public void saveBook(Book book);

	public Book getBook(int id);

	public void deleteBook(int id);

}
