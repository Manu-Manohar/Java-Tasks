package com.nt.test;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 'Length' value: ");
		int len = sc.nextInt();
		
		System.out.println("Enter the 'Width' value: ");
		int wid = sc.nextInt();
		
		try
		{			
			AreaCalculator.calculateArea(len, wid);
		}
		catch (IllegalArgumentException e) 
		{
			System.err.println("IllegalArgumentException caught: Dimensions must be positive: "+"length="+len+" width="+wid);
		}
		
		sc.close();
		
	}

}
