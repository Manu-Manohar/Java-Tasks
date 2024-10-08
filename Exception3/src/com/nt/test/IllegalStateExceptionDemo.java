package com.nt.test;

public class IllegalStateExceptionDemo
{
	public static void throwIllegalException( )
	{ 
		try
		{ 
			throw new IllegalStateException("MyException"); 
		} 
		catch(IllegalStateException objA)
		{
			System.err.println("Calling throwIllegalException from main method:");
			System.out.println("caught:" +objA); 
		}
	}
	public static void main(String[] args) 
	{
		throwIllegalException();
	}
}
