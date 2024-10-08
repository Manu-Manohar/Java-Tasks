package com.nt.test;

public class Student
{
	protected int studentId;
	protected String studentName;
	protected double examFee;
	
	public Student(int studentId, String studentName, double examFee) 
	{
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.examFee = examFee;
	}
	
	public String displayDetails()
	{
		return this.studentId+" "+this.studentName
				+" "+this.examFee;
	}
	public void payFee(double amount)
	{
		double totalFee=examFee;
		double remainAmount=totalFee-amount;
		if (amount<totalFee)
		{
			System.out.println("The amount will be negative: "+remainAmount);
		}
		else
		{
			System.out.println(remainAmount);
		}
	}

	@Override
	public String toString()
	{
		return displayDetails();
	}
	
	

}
