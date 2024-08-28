package com.nt.test;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		try(sc;)
		{
			System.out.println("Enter the your Name: ");
			String name=sc.nextLine();
			
			System.out.println("Enter the your CreditPoints: ");
			int cp=Integer.parseInt(sc.nextLine());
			
			Customer c1=new Customer(name, cp);
			
			CardType cardType = CardsOnOffer.getOfferedCard(c1);
			
			System.out.println(cardType);
			
			
		}
		
	}
	

}
