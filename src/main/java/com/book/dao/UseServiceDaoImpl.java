package com.book.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.book.models.Book;
import com.book.models.User;
@Component
public class UseServiceDaoImpl implements UserServiceDao {
	@Autowired
	SessionFactory sessionfactory;

	public User register(String userName, String email, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	public User login(String userName, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Book> searchBook(long ISBN, String title, String author) {
		// TODO Auto-generated method stub
		return null;
	}

	public Book bookDetails(int bookId) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
