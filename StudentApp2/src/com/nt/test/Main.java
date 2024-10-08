package com.nt.test;

public class Main
{

	public static void main(String[] args)
	{
		Student student = new Student(1, "John Smith", 25000.0);
		System.out.println(student.displayDetails());
        student.payFee(25000.0);

        // Testing DayScholar class
        DayScholar dayScholar = new DayScholar(2, "Brian Lara", 25000.0, 5000.0);
        System.out.println(dayScholar.displayDetails());
        dayScholar.payFee(12000.0);
        

        // Testing Hosteller class
        Hosteller hosteller = new Hosteller(3, "Virat Kohli", 25000.0, 8000.0);
        System.out.println(hosteller.displayDetails());
        hosteller.payFee(33000.0);
    }
}
