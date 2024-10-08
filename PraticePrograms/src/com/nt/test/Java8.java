package com.nt.test;

interface NIT
{
	void myInterface(int a);
	default void defalutFunction() 
	{
		System.out.println("Naresh I Technologies");
	}
	
}
public class Java8 {
	public static void main(String[] args) {
		NIT nit = (int a) -> System.out.println(a/5);
		nit.myInterface(15);
	}
}
