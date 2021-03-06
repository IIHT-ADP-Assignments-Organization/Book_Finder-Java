package com.book.services;

import java.util.List;

import com.book.models.Book;
import com.book.models.User;

public interface UserService {
User register(String userName,String email,String password);
User login(String userName,String password);
List<Book> searchBook(long ISBN,String title,String author);
Book bookDetails(int bookId);
User getUserById(int userId);
}
