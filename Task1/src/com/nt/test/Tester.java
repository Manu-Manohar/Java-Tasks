package com.nt.test;

import java.util.Scanner;

public class Tester 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Employee First Name: ");
		String fn=sc.nextLine();
		
		System.out.println("Enter the Employee last Name: ");
		String ln=sc.nextLine();
		
		System.out.println("Enter the Employee ID: ");
		int id=Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter the Employee Salary: ");
		double sal=sc.nextDouble();
		
		System.out.println("Enter the Employee NoOfProjects: ");
		int proj=sc.nextInt();
		
		Employee emp=new Employee(fn,ln,id,sal,proj);
		emp.calculateSalary();
		emp.printSalary();
		
		sc.close();
	}

}
