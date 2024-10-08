package com.nt.test;

@FunctionalInterface
interface PolyFunction<T,U,V,R>
{
	R apply(T t,U u,V v);     
}

public class CustomFunction
{
	public static void main(String[] args) 
	{	
		PolyFunction<Integer,Integer,Integer,Float> cal = (t,u,v)->
		{
			return (float)(t+u+v);
		};
		System.out.println("Result: "+cal.apply(10, 20, 30));
	}

}
	