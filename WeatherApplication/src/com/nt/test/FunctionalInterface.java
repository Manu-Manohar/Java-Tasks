package com.nt.test;

import java.util.function.Function;

public class FunctionalInterface
{
	public static void main(String[] args)
	{
		Function<Integer,Double> f1 =(x)-> 
		{
			double Kelvin = x + 273.15;
			return Kelvin;
		};
		double celTokel=f1.apply(35);
		System.out.println("converting celsius to kelvin's : "+celTokel+" Kelvins");
		
		Function<Integer,Double> f2 =(x)-> 
		{
			double cel = (x-32)*5/9;
			return cel;
		};
		double celsius=f2.apply(32);
		System.out.println("Converting Farhen's to celsius : "+celsius+" celsius");
	}

}
