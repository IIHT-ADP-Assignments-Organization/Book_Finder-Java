package com.book.common;

public class InvalidCredentials extends Exception {
	public static  String message="please enter valid email and password";


	public InvalidCredentials()
	{
		
	}
	public InvalidCredentials(String message)
	{
		this.message=message;
	}
}

