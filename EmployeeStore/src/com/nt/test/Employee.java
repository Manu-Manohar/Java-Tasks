package com.nt.test;

public class Employee 
{
	private String empName;
	private String empPosition;
	private float empSalary;
	
	public Employee(String empName, String empPosition, float empSalary) 
	{
		super();
		this.empName = empName;
		this.empPosition = empPosition;
		this.empSalary = empSalary;
	}

	public String getEmpName()
	{
		return empName;
	}

	public void setEmpName(String empName) 
	{
		this.empName = empName;
	}

	public String getEmpPosition() 
	{
		return empPosition;
	}

	public void setEmpPosition(String empPosition)
	{
		this.empPosition = empPosition;
	}

	public float getEmpSalary()
	{
		return empSalary;
	}

	public void setEmpSalary(float empSalary) 
	{
		this.empSalary = empSalary;
	}

	@Override
	public String toString() 
	{
		return "Employee [empName=" + empName + ", empPosition=" + empPosition + ", empSalary=" + empSalary + "]";
	}
	
	
	
}
