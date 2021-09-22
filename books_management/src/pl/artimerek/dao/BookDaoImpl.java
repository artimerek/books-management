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
	@Transactional
	public List<Book> getBooks() {
		
		Session session = factory.getCurrentSession();
		
		Query<Book> query = session.createQuery("from Book", Book.class);
		
		List<Book> books = query.getResultList();
		
		return books;
	}

}
