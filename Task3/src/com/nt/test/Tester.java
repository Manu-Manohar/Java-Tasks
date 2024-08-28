package com.nt.test;


public class Tester 
{
	public static void main(String[] args)
	{
		Employee emp = new Employee(232,"Manohar", 43000);
		
		if(emp.employeeSalary>=60000)
		{
			System.out.println("Employee is a Developer.");
		}
		else if(emp.employeeSalary>=40000 && emp.employeeSalary<600000)
		{
			System.out.println("Employee is a Designer.");
		}
		else
		{
			System.out.println("Employee id a Tester.");
		}		
	}

}
