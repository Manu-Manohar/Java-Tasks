package com.nt.test;

public class Animal 
{
	private String name;
	private int age;
	
	public Animal(String name, int age)
	{
		super();
		this.name = name;
		this.age = age;
	}
	
	public void makeSound()
	{
		System.out.println("The animal makes a generic sound."); 
		
	}
	
	public void displayInfo()
	{
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
	}
}
