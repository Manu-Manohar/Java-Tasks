package com.nt.test;

import java.util.stream.Stream;

public class StreamExample1 
{
	public static void main(String[] args)
	{
		Stream<Integer> st = Stream.of(1,2,3,4,5,6,7,8,9,10);
		st.filter(x->x%2==0).forEach(System.out::println);
	}

}
