package com.nt.test;

import java.util.Scanner;

public class ArrayProblem 
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the Array: ");
		int arrSize = s.nextInt();

		int[] arr = new int [arrSize];

		for(int i=0;i<arrSize;i++)
		{
			System.out.println("Enter the arraysElements:");
			
			arr[i] = s.nextInt();
		}

		int arr1[]=new int[arrSize];
		System.out.println("Enter the array position: ");
		int arrPos=s.nextInt();

		for(int j=0;j<arrPos;j++)
		{
			arr1[j]=arr[j];
		}
		for(int k=arr.length;k<=arrPos;k++)
		{
			arr1[k]=arr[k];
		}
		System.out.println(arr1.toString());
		s.close();
				
		
	}

}
