package com.nt.test;

import java.util.Scanner;

public class HandlingArithmeticException 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 'a' value: ");
		int a = sc.nextInt();
		
		System.out.println("Enter the 'b' value: ");
		int b = sc.nextInt();
		
		try
		{			
			DivisionExample.performDivison(a,b);			
		}
		catch (ArithmeticException e) 
		{
			System.err.println("ArithmeticException: Divison by Zero "+"dividend= "+a+"divisor= "+b);
			
		}
		finally 
		{
			sc.close();	
		}
	}
}
