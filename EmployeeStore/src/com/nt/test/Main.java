package com.nt.test;

public class Main 
{
	public static void main(String[] args) 
	{
		Employee emp1 = new Employee("Alice", "Manager",60000.0f);
		Employee emp2 = new Employee("Bob", "Developer",50000.0f);
		
		Directory dir = new Directory();
		dir.addEmployee(emp1);
		dir.addEmployee(emp2);
		dir.displayAllEmployees();
		System.out.println();
		dir.updateEmployee(1, new Employee("Bob","Senior-Developer",55000.0f));
		dir.displayAllEmployees();
		System.out.println();
		dir.deleteEmployee(0);
		dir.displayAllEmployees();
		
		
		
	}

}
