package com.nt.test;

import java.util.Scanner;

public class FibonacciSeries
{
	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in))
		{
			System.out.println("Enter a Number : ");
			int num = sc.nextInt();
			int a=0,b=1,c;
			if(num==1)
			{
				System.out.print(a);
			}
			else if(num==2)
			{
				System.out.print(a+" "+b);
			}
			else
			{
				System.out.print(a+" "+b);
				for(int i=2;i<num;i++)
				{
					c=a+b;
					System.out.print(" "+c);
					a=b;
					b=c;
				}
			}
		}
	}

}
