package com.nt.test;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the employeeID:");
		int empId=Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter the employeeName;");
		String empName=sc.nextLine();
		
		System.out.println("Enter the cityName:");
		String cn=sc.nextLine();
		
		System.out.println("Enter the districtName:");
		String dn=sc.nextLine();
		
		System.out.println("Enter the stateName:");
		String sn=sc.nextLine();
	
		Employee e1 = new Employee(empId,empName,new Address(cn,dn,sn));
		System.out.println(e1);
		sc.close();
	}

}
