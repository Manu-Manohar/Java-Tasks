package com.nt.test;

public class ClassCastExceptionDemo
{
	public static void handleClassCastException()
	{
		Object []obj = {"Hello", "World", "Java"};

		try
		{
			for(int i=0;i<obj.length;i++)
			{
				String str = (String)obj[i];
				System.out.println("Casting Successful: "+str);
			}
		}
		catch (ClassCastException e)
		{
			e.printStackTrace();
		}
				
		
	}
}
