package com.nt.test;

import java.util.ArrayList;
import java.util.Vector;

public class ArrayListTest 
{
	public static void main(String[] args)
	{
		long startTime = System.currentTimeMillis();
		
		Vector<Integer> v = new Vector<>();
		for(int i=0;i<1000000;i++)
		{
			v.add(i);
		}
		
		long endTime = System.currentTimeMillis();
		System.out.println("Vector Time consume: "+(endTime-startTime)+" ms");
		
		startTime = System.currentTimeMillis();
		
		ArrayList<Integer> al = new ArrayList<>();
		for(int i=0;i<1000000;i++)
		{
			al.add(i);
		}
		
		endTime = System.currentTimeMillis();
		System.out.println("ArrayList Time consume: "+(endTime-startTime)+" ms");
		
	}
}
