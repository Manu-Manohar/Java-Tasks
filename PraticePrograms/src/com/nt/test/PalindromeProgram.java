package com.nt.test;

import java.util.Scanner;

public class PalindromeProgram
{
	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in))
		{
			System.out.println("Enter a Number : ");
			int num = sc.nextInt();
			int temp=num;
			int sum=0;
			while(num>0)
			{
				int re=num%10;
				sum=(sum*10)+re;
				num/=10;				
			}
			if(temp==sum)
			{
				System.out.println("Given Number is Palindrome: "+temp+" "+sum);
			}
			else
			{
				System.out.println("Given Number is not Palindrome: "+temp+" "+sum);
			}
			
		}
	}
}
