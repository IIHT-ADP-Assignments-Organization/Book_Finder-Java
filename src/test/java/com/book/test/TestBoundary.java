package com.book.test;

import static org.junit.Assert.assertEquals;

import java.util.regex.Pattern;

import org.junit.Test;

import com.book.models.Book;
import com.book.models.User;



public class TestBoundary {
	 @Test
	    public void validPassword()
	    {
	     User user=new User();
	     user.setEmail("james@gmail.com");
	     user.setPassword("hello1234");
	     user.setUserId(1234);
	     user.setUserName("john");
	        
	        		
	        int passwordLength=8;
	        boolean check=user.getPassword().length()>=passwordLength;
	assertEquals(true,check);
}
	 
	 @Test
	    public void validName()
	    {
		 User user=new User();
	     user.setEmail("james@gmail.com");
	     user.setPassword("hello1234");
	     user.setUserId(1234);
	     user.setUserName("john");
	        
	        int min=2;
	        boolean name=user.getUserName().length()>min;
	        assertEquals(true,name);
	    }
	 @Test
	 public void validEmail()
	 {
		 User user=new User();
	     user.setEmail("james@gmail.com");
	     user.setPassword("hello1234");
	     user.setUserId(1234);
	     user.setUserName("john");
	     String emailRegex = "[a-zA-Z0-9_.]+@[a-zA-Z0-9]+.[a-zA-Z]{2,3}[.] {0,1}[a-zA-Z]+";
	     boolean check=Pattern.matches(emailRegex,user.getEmail());
	     assertEquals(true,check);
	 }
	 
	 @Test
	 public void validUserName()
	 {
		 User user=new User();
	     user.setEmail("james@gmail.com");
	     user.setPassword("hello1234");
	     user.setUserId(1234);
	     user.setUserName("john");
	     String userNameRegex =  "^[a-z0-9_-]{3,15}$";
	     boolean check=Pattern.matches(userNameRegex,user.getUserName());
	     assertEquals(true,check);
	 }
	 @Test
	 public void validAuthorName()
	 {
		 User user=new User();
		 Book b=new Book();
		    b.setAuthor("padmaReddy");
		    b.setISBN(1234567890);
		    b.setTitle("programming");
	     String authorNameRegex =  "^[a-z0-9_-]{3,15}$";
	     boolean check=Pattern.matches(authorNameRegex,b.getAuthor());
	     assertEquals(true,check);
	 }
	 
	 
}
