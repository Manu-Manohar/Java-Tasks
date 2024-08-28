package com.nt.test;

import java.util.Scanner;

public class Zomato 
{
	public static void main(String[] args)
	{	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the customerId:");
		int custId=Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter the customerName:");
		String custName=sc.nextLine();
		
		System.out.println("Enter the customerAddress:");
		String custAddress=sc.nextLine();
		
		Customer c1 = new Customer(custId, custName, custAddress,new Order(1001, "Birani", 1200.0));
		System.out.println(c1);
		sc.close();
		
	}

}
