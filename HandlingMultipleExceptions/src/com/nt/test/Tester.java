package com.nt.test;

import java.util.Scanner;

public class Tester 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		try
		{
			ChildClass child = new ChildClass();
			System.out.println("enter the class name: ");
			child.loadingClass(sc.nextLine());
		}
		catch (Exception e) 
		{
			System.err.println(e.getMessage());
		}
		sc.close();		
	}
}
