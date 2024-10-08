package com.nt.test;

import java.util.Scanner;

public class ArmstrongProgram 
{
	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in))
		{
			System.out.println("Enter a Number : ");
			int num = sc.nextInt();
			int sum=0;
			int temp=num;
			while(num>0)
			{
				int re = num%10;
				sum=sum+(re*re*re);
				num/=10;
			}
			//System.out.println(sum);
			if(temp==sum)
			{
				System.out.println("Given Number is an Armstrong: "+temp+" "+sum);			
			}
			else
			{
				System.out.println("Given Number is not an Armstrong: "+temp+" "+sum);
			}
		}	
	}
}
