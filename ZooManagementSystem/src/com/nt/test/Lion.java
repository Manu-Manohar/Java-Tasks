package com.nt.test;

public class Lion extends Animal
{
	private int maneLength;

	public Lion(String name, int age, int maneLength)
	{
		super(name, age);
		this.maneLength = maneLength;
	}

	public void makeSound()
	{
		System.out.println("The Lion roars loudly."); 
	}
	
	public void displayManeLength()

	{
		System.out.println("maneLength : "+maneLength);
	}
	
}
