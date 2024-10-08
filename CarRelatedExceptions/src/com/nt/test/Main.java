package com.nt.test;

public class Main 
{
	public static void main(String[] args)
	{
		 // Test case 1: Car Stopped Exception Test
        try 
        {
            CarTest.stop("stop");
        } 
        catch (CarStoppedException e) 
        {
            System.out.println(e.getMessage());
        }

        // Test case 2: Car Not Started Test
        try 
        {
            CarTest.stop("go");
        } catch (CarStoppedException e) {
            System.out.println(e.getMessage());
        }

        // Test case 3: Car Puncture Exception Test
        try 
        {
            CarTest.puncture("puncture");
        } 
        catch (CarPunctureException e)
        {
            System.out.println(e.getMessage());
        }

        // Test case 4: Car Not Punctured Test
        try 
        {
            CarTest.puncture("move");
        }
        catch (CarPunctureException e)
        {
            System.out.println(e.getMessage());
        }

        // Test case 5: Car Overheating Exception Test
        try 
        {
            CarTest.carHeat(60);
        } 
        catch (CarHeatException e)
        {
            System.out.println(e.getMessage());
        }

        // Test case 6: Car Temperature Normal Test
        try
        {
            CarTest.carHeat(40);
        } 
        catch (CarHeatException e)
        {
            System.out.println(e.getMessage());
        }
	}
}