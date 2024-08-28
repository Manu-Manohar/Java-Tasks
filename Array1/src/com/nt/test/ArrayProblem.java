package com.nt.test;

import java.util.Arrays;

public class ArrayProblem
{
	public static void main(String[] args) 
	{
		int []arr1= {10,24,5,90,4};
		int []arr2= {14,2,32,5,6};
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int sum=0;
		for(int i=0;i<arr1.length;i++)
		{
			sum+=(arr2[i]-arr1[i]);
		}
		System.out.println("Difference is: "+Math.abs(sum));
		
	}

}
