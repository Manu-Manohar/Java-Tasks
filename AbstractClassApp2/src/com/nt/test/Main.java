package com.nt.test;

public class Main
{
	public static void main(String[] args) 
	{
		OrderedCake defaultCake = new OrderedCake();
        OrderedCake paramCake = new OrderedCake("Round", "Chocolate", 2);
        OrderedCake messageCake = new OrderedCake("Square", "Strawberry", 3, "Happy Birthday");

        defaultCake.showCake();
        paramCake.showCake();
        messageCake.showCake();
	}
}
