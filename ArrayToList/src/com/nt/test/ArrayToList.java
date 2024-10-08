package com.nt.test;

import java.util.Arrays;
import java.util.List;

public class ArrayToList
{
	public static List<String> convertToList(String[] inputArray)
	{
		List<String> list = Arrays.asList(inputArray);
		int lenght = inputArray.length;
		if(lenght==list.size())
		{
			return list;
		}
		else
		{
			return null;
		}
	}
}
