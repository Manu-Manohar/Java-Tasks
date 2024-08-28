package com.nt.student;

public class Student
{
	private String studentName;
	private int studentMarks;
	
	public Student(String studentName, int studentMarks)
	{
		super();
		this.studentName = studentName;
		this.studentMarks = studentMarks;
	}

	public String getStudentName()
	{
		return studentName;
	}

	public void setStudentName(String studentName) 
	{
		this.studentName = studentName;
	}

	public int getStudentMarks() 
	{
		return studentMarks;
	}

	public void setStudentMarks(int studentMarks) 
	{
		this.studentMarks = studentMarks;
	}

	@Override
	public String toString() {
		return this.studentName;
	}
	
	
	
	
	
	

}
