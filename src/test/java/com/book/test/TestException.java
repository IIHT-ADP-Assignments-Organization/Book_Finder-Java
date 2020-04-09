package com.book.test;

import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.book.common.InvalidCredentials;
import com.book.common.UserAlreadyExistException;
import com.book.common.UserDoesNotExistException;
import com.book.models.User;
import com.book.services.UserService;

import junit.framework.Assert;

public class TestException {
	@Test
    public void testForUserRegistration() throws UserAlreadyExistException 
    {
	 ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Book-application.xml");
	 User user=new User();
     user.setEmail("james@gmail.com");
     user.setPassword("hello1234");
     user.setUserId(1234);
     user.setUserName("john");
        
	 UserService userservice = (UserService) context.getBean("UserService");
	 userservice.register(user.getUserName(), user.getEmail(), user.getPassword());
Assert.assertEquals(UserAlreadyExistException.message," user already exists !..please login");
    }
	
	@Test
    public void testForUserLogin() throws UserDoesNotExistException  
    {
		
	 ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Book-application.xml");
	 User user=new User();
     user.setEmail("james@gmail.com");
     user.setPassword("hello1234");
     user.setUserId(1234);
     user.setUserName("john");
        
     UserService userservice = (UserService) context.getBean("UserService");
     userservice.login(user.getUserName(),user.getPassword());
Assert.assertEquals(UserDoesNotExistException.message," user does not exists !..please register");
     }
	@Test
    public void testForvalidpassword() throws InvalidCredentials  
    {
		
	 ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Book-application.xml");
	 User user=new User();
     user.setEmail("james@gmail.com");
     user.setPassword("hello1234");
     user.setUserId(1234);
     user.setUserName("john");
     UserService userservice = (UserService) context.getBean("UserService");
     userservice.login(user.getUserName(),user.getPassword());
Assert.assertEquals(InvalidCredentials.message,"please enter valid email and password");
     }
	@Test
    public void testForvalidname() throws InvalidCredentials  
    {
		
	 ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Book-application.xml");
	 User user=new User();
     user.setEmail("james@gmail.com");
     user.setPassword("hello1234");
     user.setUserId(1234);
     user.setUserName("john");
     UserService userservice = (UserService) context.getBean("UserService");
     userservice.login(user.getUserName(),user.getPassword());
    
Assert.assertEquals(InvalidCredentials.message,"please enter valid email and password");
     }
	
}


