package com.nt.test;

public class Employee 
{
	
	private String firstName;
	private String lastName;
	private int empId;
	double empSalary;
	private int noOfProj;
	
	public Employee(String firstName, String lastName, int empId, double empSalary, int noOfProj) 
	{
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.empId = empId;
		this.empSalary = empSalary;
		this.noOfProj = noOfProj;
	}
	
	public void calculateSalary()
	{
		if(noOfProj>5 && noOfProj<10)
		{
			empSalary+=5000;
		}
		else if(noOfProj>10 && noOfProj<20)
		{
			empSalary+=10000;
		}
		else if(noOfProj>20)
		{
			empSalary+=15000;
		}
		else
		{
			System.out.println("Number of Projects cannot be negative");
		}
	}
	public void printSalary() 
	{
        System.out.printf("Updated Salary: %.2f%n", empSalary);
    }
}
