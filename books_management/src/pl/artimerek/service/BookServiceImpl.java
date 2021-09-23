package pl.artimerek.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.artimerek.dao.BookDAO;
import pl.artimerek.entity.Book;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookDAO bookDAO;
	
	@Override
	@Transactional
	public List<Book> getBooks() {
		return bookDAO.getBooks();
	}

	@Override
	@Transactional
	public void saveBook(Book book) {
		bookDAO.saveBook(book);
	}

	@Override
	@Transactional
	public Book getBook(int id) {
		return bookDAO.getBook(id);
	}

	@Override
	@Transactional
	public void deleteBook(int id) {
		bookDAO.deleteBook(id); 
	}

}
