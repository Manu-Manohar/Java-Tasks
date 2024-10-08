package com.nt.Stream;

import java.util.ArrayList;

public class StreamDemo1 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(50);
		list.add(40);
		list.add(71);
		list.add(40);
		
		//list.stream().sorted((x,y)->y.compareTo(x)).forEach(System.out::println);
		list.stream().distinct().forEach(System.out::println);
	}
}
