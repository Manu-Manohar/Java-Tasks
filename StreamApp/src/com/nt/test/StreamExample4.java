package com.nt.test;

import java.util.Arrays;
import java.util.List;

public class StreamExample4
{
	public static void main(String[] args)
	{
		
		List<Integer> list = Arrays.asList(-3,2,-5,6,-1,4);
		Integer collect = list.stream().filter(x->x>=0).map(x-> x*x).reduce(0,Integer::sum);
				
		System.out.println(collect);
		
	}

}
