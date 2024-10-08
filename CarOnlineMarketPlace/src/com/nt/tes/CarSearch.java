package com.nt.tes;

import java.util.function.Predicate;

public class CarSearch 
{
	public static void main(String[] args) 
	{
		Car car = new Car("Toyota", 35000, 40000);
        
		Predicate<Car> c1 = t ->
		{
			if((t.getPrice()>=10000 && t.getPrice()<=30000) && t.getMileage()<50000)
			{
				System.out.println("Car Details: " + car.toString());
				return true;
				
			}
			else
			{
				System.out.println("Your car is not for sale.");
				return false;
			}
		};
		c1.test(car);
	}
}
