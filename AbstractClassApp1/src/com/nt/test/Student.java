package com.nt.test;

abstract class Student 
{
	protected String studentName;
	protected String studentClass;
	protected static int totalNoOfStudents=0;
	
	public abstract int getPercentage();
	
	public static int getTotalNoOfStudents() 
	{
		return totalNoOfStudents;
	}

	public Student()
	{
		
	}
	public Student(String studentName, String studentClass)
	{
		super();
		this.studentName = studentName;
		this.studentClass = studentClass;
		totalNoOfStudents++;
	}
}
