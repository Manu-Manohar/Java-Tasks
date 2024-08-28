package com.nt.test;

public class Tester 
{
	public static void main(String[] args)
	{
		Employee e1=new Employee("manohar", 22,45000.0,"Java Developer");
		System.out.println(e1);
	
		Employee e2=new Employee(e1);
		
		e2.raiseSalary(10);
		System.out.println(e2);		
	}
}
