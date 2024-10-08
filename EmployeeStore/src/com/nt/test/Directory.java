package com.nt.test;

import java.util.ArrayList;

public class Directory 
{
	private ArrayList<Employee> list= new ArrayList<>();
	
	public void addEmployee(Employee emp)
	{
		list.add(emp);
	}
	
	public void displayAllEmployees()
	{
		for(Employee employee:list)
		{
			System.out.println(employee);
		}
	}
	
	public void updateEmployee(int index,Employee emp)
	{
		list.set(index,emp);
	}
	
	public void deleteEmployee(int index)
	{
		list.remove(index);
	}
	
	
	
}
