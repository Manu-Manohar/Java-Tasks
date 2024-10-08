package com.nt.test;

import java.util.function.Consumer;

public class Tester 
{
	public static void main(String[] args) 
	{
		CartItem carItem = new CartItem("T-Shirt", 500, 5);
		ShoppingCart sp = new ShoppingCart(carItem);
		
		Consumer<ShoppingCart> db = (x)->
		{
			if(x.getItems().getTotalPrice()>100000)
			{
				System.out.println(x.getItems().getTotalPrice()*0.1);
			}
			else
			{
				System.out.println(x.getItems().getTotalPrice());	
			}
		};
		db.accept(sp);
	}
}
