package com.nt.test;

public class ExceptionDemo 
{
	public static void main(String[] args)
	{
		try
		{
			int []a = new int[2];
			System.out.println(a[3]);

		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.err.println("Index 3 out of bounds for length 2 String representation");
			System.err.println("Message: "+e.getMessage());
			System.err.println("String Representation: "+e.toString());
			e.printStackTrace();
		}
	}
}
