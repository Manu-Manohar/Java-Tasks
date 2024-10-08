package com.nt.test;

import java.util.ArrayList;
import java.util.List;

public class Duplicates
{
	List<Integer> numberList;
	
	public Duplicates()
	{
		
	}

	public Duplicates(List<Integer> numberList) 
	{
		super();
		this.numberList = numberList;
	}
	
	public List<Integer> getDuplicatesList()
	{
		ArrayList<Integer> dup = new ArrayList<>();
		int count = 0;
		for(int i=0;i<numberList.size();i++)
		{
			 count = 0;
			Integer integer = numberList.get(i);
			if(integer.equals(numberList.get(i)))
			{
				count++;
			}
			if(count>1)
			{
				dup.add(Integer.valueOf(integer));
			}
		}
		if(dup.isEmpty() ||  dup.equals(null))
		{
			return null;
		}
		else
		{
			return dup;
		}
		
	}

	public List<Integer> getNumberList()
	{
		return numberList;
	}

	public void setNumberList(List<Integer> numberList)
	{
		this.numberList = numberList;
	}
	
	

}
