package com.nt.test;

public class Employee 
{
	public int employeeNumber;
	public String employeeName;
	public double employeeSalary;
	public Employee(int employeeNumber, String employeeName, double employeeSalary) 
	{	
		if(employeeNumber<0)
		{
			System.out.println("EmployeeNumber Must be always positive Integer.");
			this.employeeNumber=0;
		}
		else
		{
			this.employeeNumber = employeeNumber;
		}
		
		if(employeeSalary<0)
		{
			System.out.println("EmployeeSalary cannot be negative.");
			this.employeeSalary=0.0;
		}
		else
		{
			this.employeeSalary = employeeSalary;
		}
		
		if(employeeName==null)
		{
			System.out.println("Employee name must be initialized with a default name.");
			this.employeeName="";
		}
		else
		{
			this.employeeName = employeeName;
		}
	}
}
