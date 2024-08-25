package com.nt.test;

public class Tester 
{
	public static void main(String[] args) 
	{
		Book book1 = new Book("1984", "George Orwell", 14.99);
        book1.applyDiscount(-10);
        book1.printDetails(); 
        
        System.out.println("");

        Book book2 = new Book("Negative Price Book", "No Author", -5.0);
        book2.printDetails();
	}
}
