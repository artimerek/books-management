package pl.artimerek.dao;

import java.util.List;


import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pl.artimerek.entity.Book;

@Repository
public class BookDaoImpl implements BookDAO {

	@Autowired
	private SessionFactory factory;
	
	@Override
	public List<Book> getBooks() {
		
		Session session = factory.getCurrentSession();
		
		Query<Book> query = session.createQuery("from Book order by author", Book.class);
		
		List<Book> books = query.getResultList();
		
		return books;
	}

	@Override
	public void saveBook(Book book) {
	
		Session session = factory.getCurrentSession();
		
		session.saveOrUpdate(book);
		
	}

	@Override
	public Book getBook(int id) {
		
		Session session = factory.getCurrentSession();
		
		Book book = session.get(Book.class, id);
		
		return book;
	}

	@Override
	public void deleteBook(int id) {
		Session session = factory.getCurrentSession();
		
	    Query query = session.createQuery("delete from Book where id=:bookId"); 
	    
	    query.setParameter("bookId", id);
	    
	    query.executeUpdate();
		
	}
	
	

}
