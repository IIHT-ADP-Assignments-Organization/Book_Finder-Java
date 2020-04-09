package com.book.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.book.dao.UserServiceDao;
import com.book.models.Book;
import com.book.models.User;

@Component
public class UserServiceImpl implements UserService {
	@Autowired
	UserServiceDao userserviceDao;
	
	@Transactional
	public User register(String userName, String email, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public User login(String userName, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public List<Book> searchBook(long ISBN, String title, String author) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public Book bookDetails(int bookId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
