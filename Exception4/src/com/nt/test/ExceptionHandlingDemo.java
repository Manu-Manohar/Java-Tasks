package com.nt.test;

public class ExceptionHandlingDemo
{
	@SuppressWarnings("null")
	public static void handleException(String str)
	{
		try 
		{
			if(str.equalsIgnoreCase("null"))
			{
				str=null;
				System.out.println("Length of String: "+str.length());
				int str1 = Integer.parseInt(str);
				System.out.println("Converted Number: "+str1);
			}
			else
			{
				System.out.println("Length of String: "+str.length());
				int str1 = Integer.parseInt(str);
				System.out.println("Converted Number: "+str1);
			}
		}
		catch (NullPointerException e)
		{
			System.err.println("NullPointerException: Attempted to operate on a null object.");
			e.printStackTrace();	
		}
		catch (NumberFormatException e) 
		{
			e.printStackTrace();
		}
		
	}
}