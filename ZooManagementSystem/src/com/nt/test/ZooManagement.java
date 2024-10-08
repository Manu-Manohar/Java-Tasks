package com.nt.test;

public class ZooManagement 
{
	public static void main(String[] args)
	{
		Lion lion = new Lion("Simba", 35, 10);
		
		Elephant elephant = new Elephant("Dumbo", 40, 50.0f);
		
		lion.displayInfo();
		lion.makeSound();
		lion.displayManeLength();;
		
		System.out.println();
		
		elephant.displayInfo();
		elephant.makeSound();
		elephant.displayTuskLength();
		
	}

}
