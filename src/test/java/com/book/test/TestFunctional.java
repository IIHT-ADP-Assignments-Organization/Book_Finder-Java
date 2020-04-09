package com.book.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.book.models.Book;
import com.book.models.User;
import com.book.services.UserService;



public class TestFunctional {
	@Test
	public void testForSearchBook() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Book-application.xml");
    Book b=new Book();
    b.setAuthor("padmaReddy");
    b.setISBN(1234567890);
    b.setTitle("programming");
    UserService userservice=(UserService) context.getBean("UserService");
	List<Book> listfromdb =userservice.searchBook(b.getISBN(),b.getTitle(),b.getAuthor());
	assertNotNull(listfromdb);
}
	
	@Test
	public void testForBookDetails() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Book-application.xml");
    Book b=new Book();
    b.setAuthor("padmaReddy");
    b.setISBN(1234567890);
    b.setTitle("programming");
    UserService userservice=(UserService) context.getBean("UserService");
	Book listfromdb =userservice.bookDetails(b.getBookId());
	assertNotNull(listfromdb);
}
	@Test
	public void testForGetUser() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Book-application.xml");
    User user=new User();
    user.setEmail("james@gmail.com");
    user.setPassword("hello1234");
    user.setUserId(1234);
    user.setUserName("john");
    UserService userservice=(UserService) context.getBean("UserService");
	User listfromdb =userservice.getUserById(user.getUserId());
	assertNotNull(listfromdb);
}
	@Test
	public void testvalidregistration() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Book-application.xml");
	User user=new User();
    user.setEmail("james@gmail.com");
    user.setPassword("hello1234");
    user.setUserId(1234);
    user.setUserName("john");
String isRegistered=(user.getUserName());
	

	UserService userservice=(UserService) context.getBean("UserService");
	User registration =userservice.register(user.getUserName(),user.getEmail(),user.getPassword());
	assertEquals(isRegistered,registration);
}
	@Test
	public void tesForValidLogin() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Book-application.xml");
	User user=new User();
    user.setEmail("james@gmail.com");
    user.setPassword("hello1234");
    user.setUserId(1234);
    user.setUserName("john");
	    UserService userservice=(UserService) context.getBean("UserService");
	User userdetailsfromdb=userservice.login(user.getUserName(),user.getPassword());
	assertEquals(true,userdetailsfromdb);
}
}
