package com.nt.test;


import java.util.stream.Stream;

public class StreamExample2
{
	public static void main(String[] args) 
	{
		Stream<String> st = Stream.of("Hello","","World","","from","","Java","!");
		String string = st.filter(str->!str.isBlank()).reduce("",String::concat);
		System.out.println(string);
		
	}
}
