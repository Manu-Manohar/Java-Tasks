package com.nt.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleExceptionDemo 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		try
		{
			System.out.println("Enter a Number for a: ");
			int a = sc.nextInt();
			
			System.out.println("Enter a Number for b: ");
			int b = sc.nextInt();
			
			System.out.println("Value for a: "+a);
			System.out.println("Value for b: "+b);
			
		}
		catch(InputMismatchException e)
		{			
			System.err.println("An InputMismatchException occurred...");
			System.err.println(e.getMessage());
			System.err.println("String Representation: "+e.toString());
			e.printStackTrace();
		}
		finally
		{
			sc.close();
		}
	}

}
