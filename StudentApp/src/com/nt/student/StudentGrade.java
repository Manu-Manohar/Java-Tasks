package com.nt.student;

public class StudentGrade 
{
	private Student student;
	private char studentGrade;
	
	public StudentGrade(Student student, char studentGrade)
	{
		super();
		this.student = student;
		this.studentGrade = studentGrade;
	}

	@Override
	public String toString() 
	{
		
		return "The Student "+this.student+" has '"+this.studentGrade+"' Grade ";
	}
	
	
	
	
}
