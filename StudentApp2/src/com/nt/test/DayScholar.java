package com.nt.test;

public class DayScholar extends Student 
{
	private double transportFee;

	public DayScholar(int studentId, String studentName, double examFee, double transportFee)
	{
		super(studentId, studentName, examFee);
		this.transportFee = transportFee;
	}
	
	public String displayDetails()
	{
		return super.studentId+" "+super.studentName
				+" "+super.examFee+" "+this.transportFee;
	}
	public void payFee(double amount)
	{
		double totalFee=examFee+transportFee;
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
