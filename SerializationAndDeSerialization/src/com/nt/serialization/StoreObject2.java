package com.nt.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class StoreObject2 
{
	public static void main(String[] args) throws IOException 
	{
		var fis = new FileInputStream("D:\\Manu\\New folder\\Serialization\\student.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		try(fis;ois)
		{
			@SuppressWarnings("unchecked")
			ArrayList<String> list1 = (ArrayList<String>) ois.readObject();
			System.out.println(list1);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			
		}	
		
	}

}
