package com.nt.test;

public class Main 
{
	public static void main(String[] args) 
	{
		Car c1 = new Car("BMW","Top-Model",2024,new Driver("ABCD",30));
		System.out.println("Original Data: "+c1);
		
		Car c2 = new Car(c1);
		System.out.println("Copy of the Car-Object: "+c2);
		
		c1.changeDriver(new Driver("EFGH",35));
		System.out.println("Original Data: "+c1);
		System.out.println("Copy of the Car-Object: "+c2);
		
		
		
	}

}
