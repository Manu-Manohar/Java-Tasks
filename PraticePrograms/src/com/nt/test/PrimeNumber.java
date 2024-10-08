package com.nt.test;

import java.util.Scanner;

public class PrimeNumber 
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num= s.nextInt();
		if(num==2)
		{
			System.out.println("Prime Number");
		}
		else
		{
			int count=0;
			for(int i=2;i<=num;i++)
			{
				if(num%i==0)
				{
					count+=1;
				}
			}
			if(count==1)
			{
				System.out.println("Prime");
			}
			else
			{
				System.out.println("Not Prime");
			}
		}
		s.close();
	}
}
