package com.nt.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

record Product(Integer productId,String productName,Integer productPrice) implements Serializable
{
	
}

public class SerializationApp 
{
	public static void main(String[] args) throws IOException 
	{
		ArrayList<Product> product = new ArrayList<Product>();
		product.add(new Product(1001, "Laptop", 45000));
		product.add(new Product(1002, "Mobile", 56000));
		product.add(new Product(1001, "TV", 70000));
		
		var fos = new FileOutputStream("D:\\Manu\\New folder\\Serialization.txt");
		var oos = new ObjectOutputStream(fos);
		try(fos;oos)
		{
			oos.writeObject(product);
			System.out.println("Serialization is completed....");
		}
		catch (Exception e)
		{
			e.printStackTrace();		
		}
		
		var fis = new FileInputStream("D:\\Manu\\New folder\\Serialization.txt");
		var ois = new ObjectInputStream(fis);
		try(fis;ois)
		{
			@SuppressWarnings("unchecked")
			ArrayList<String> list = (ArrayList<String>) ois.readObject();
			System.out.println(list);	
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
