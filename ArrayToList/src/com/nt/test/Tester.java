package com.nt.test;

import java.util.List;

public class Tester 
{
	public static void main(String[] args) 
	{
		String[] str = {"Apple","Mango","Grapes","Kiwi","Guvava"};
		List<String> convertToList = ArrayToList.convertToList(str);
		System.out.println(convertToList);
		
	}
	

}
