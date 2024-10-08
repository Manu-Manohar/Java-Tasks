package com.nt.test;

import java.util.Scanner;

public class BusApp 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the initial distance between Bus A and Bus B (in km): ");
        double distance = sc.nextDouble();

        System.out.print("Enter the speed of Bus A (in km/h): ");
        double speedA = sc.nextDouble();

        
        System.out.print("Enter the speed of Bus B (in km/h): ");
        double speedB = sc.nextDouble();

        
        if (speedB <= speedA) 
        {
            System.out.println("Bus B cannot overtake Bus A since its speed is not greater than that of Bus A.");
        } 
        else
        {
            double time = distance / (speedB - speedA);
            System.out.printf("Bus B will overtake Bus A after %.2f hours.\n", time);
        }

        sc.close();
	}
}
