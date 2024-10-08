package com.nt.test;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string to convert to an integer: ");
		String st1 = sc.nextLine();
		ExceptionHandlingDemo.handleException(st1);
		
		sc.close();
		
		
	}

}
