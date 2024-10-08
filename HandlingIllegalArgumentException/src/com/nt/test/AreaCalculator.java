package com.nt.test;

public class AreaCalculator
{
	public static double calculateArea(double x,double y)
	{
		if(x<0 || y<0)
		{
			throw new IllegalArgumentException();
		}
		else
		{
			System.out.println("Area of rectangle with length: "+x+" and width: "+y+" is "+(x*y));
		}
		return 0;
		
	}
}
