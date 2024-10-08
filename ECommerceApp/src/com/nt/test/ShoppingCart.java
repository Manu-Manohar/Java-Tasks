package com.nt.test;

public class ShoppingCart 
{
	private CartItem items;
	
	public ShoppingCart(CartItem items) {
		super();
		this.items = items;
	}

	public CartItem getItems() 
	{
		return items;
	}

	public void setItems(CartItem items) 
	{
		this.items = items;
	}

	@Override
	public String toString() 
	{
		return "ShoppingCart [items=" + items + "]";
	}
	
	
}
