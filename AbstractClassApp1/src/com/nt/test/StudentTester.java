package com.nt.test;

public class StudentTester {

	public static void main(String[] args)
	{
		ScienceStudent s = new ScienceStudent("Ravi", "MPC", 85, 85, 85);

		System.out.println("TotalNoOfStudents : "+Student.getTotalNoOfStudents());
		System.out.println("Percentage is : "+s.getPercentage());
		
		System.out.println();
		
		HistoryStudent hs = new HistoryStudent("Roht", "CSC", 85, 90);
		
		System.out.println("TotalNoOfStudents : "+Student.getTotalNoOfStudents());
		System.out.println("Percentage is : "+hs.getPercentage());
		
		
	}

}
