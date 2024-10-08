package com.nt.test;

public class CartItem 
{
	private String name;
	private double price;
	private int quantity;
	
	protected CartItem(String name, double price, int quantity) 
	{
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public double getTotalPrice()
	{
		return (price*quantity);
	}

	@Override
	public String toString()
	{
		return "CartItem [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
	
	

}
