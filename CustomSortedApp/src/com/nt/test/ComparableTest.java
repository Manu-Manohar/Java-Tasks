package com.nt.test;

import java.util.ArrayList;
import java.util.Collections;

record Product( Integer productNumber,String productName,Double productPrice) implements Comparable<Product>
{
	/*@Override
	public int compareTo(Product p2)
	{
		return this.productName.compareTo(p2.productName);
	}*/
	@Override
	public int compareTo(Product p2)
	{
		return this.productName.compareTo(p2.productName);
	}
}

public class ComparableTest
{
	public static void main(String[] args) 
	{
		ArrayList<Product> list = new ArrayList<>();
		
		list.add(new Product(1001, "Laptop", 85000.0));
		list.add(new Product(1002, "TV", 35000.0));
		list.add(new Product(1003, "SmartPhone", 95000.0));
		list.add(new Product(102, "Iphone", 950000.0));
		list.add(new Product(104, "HeadSet", 750000.0));
		Collections.sort(list);
		for (Product product : list) 
		{
			System.out.println(product);
		}
	}
}
