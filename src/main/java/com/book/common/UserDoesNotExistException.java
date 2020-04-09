package com.book.common;

public class UserDoesNotExistException extends Exception
{
	public static  String message="user does not exists !..please register";


	public UserDoesNotExistException()
	{
		
	}
	public UserDoesNotExistException(String message)
	{
		this.message=message;
	}
}
