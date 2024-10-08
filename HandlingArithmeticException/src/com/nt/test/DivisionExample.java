package com.nt.test;

public class DivisionExample 
{
	public static int performDivison(int dividend,int divisor)
	{
		if(divisor==0)
		{
			throw new ArithmeticException();
		}
		else
		{
			System.out.println("Result of Divison:"+(dividend/divisor));
		}
		return 0;	
	}
}