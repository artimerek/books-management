package pl.artimerek.app.service;



import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.artimerek.app.dao.BookDAO;
import pl.artimerek.app.entity.Book;

import java.util.List;


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
