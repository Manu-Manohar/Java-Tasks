package com.nt.test;

import java.util.Arrays;
import java.util.List;

public class StreamExample5
{
	public static void main(String[] args) 
	{
		List<String> list = Arrays.asList("Toby","Anna","Leroy","Alex");
		list.stream().filter(str->str.length()==4).sorted().limit(2).forEach(System.out::println);
		
	}
}
