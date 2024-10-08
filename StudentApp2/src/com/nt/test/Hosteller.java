package com.nt.test;

public class Hosteller extends Student
{
	private double hostelFee;

	public Hosteller(int studentId, String studentName, double examFee, double hostelFee) 
	{
		super(studentId, studentName, examFee);
		this.hostelFee = hostelFee;
	}
	
	public String displayDetails()
	{
		return super.studentId+" "+super.studentName
				+" "+super.examFee+" "+this.hostelFee;
	}
	public void payFee(double amount)
	{
		double totalFee=examFee+hostelFee;
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
	public String toString() {
		return displayDetails();
	}
	
	
	

}
