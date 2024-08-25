package com.nt.test;

public class Book
{
	public String title;
	public String author;
	public double price;
	public Book(String title, String author, double price)
	{
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public void printDetails()
	{
		System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: ?" + price);
	}
	public void applyDiscount(double discountPercentage)
	{
		if(discountPercentage<0)
		{
			System.out.println("Applying Invalid Discount.");
			return;
		}
		price-=(price*(discountPercentage/100));
	}
	
	
}
