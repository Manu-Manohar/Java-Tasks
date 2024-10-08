package com.nt.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

 record Customer(Integer customerNumber,String customerName,Double customerBill)
{
	
}

public class ComparatorApp 
{
	public static void main(String[] args)
	{
		ArrayList<Customer> list = new ArrayList<>();
		list.add(new Customer(101, "Manohar", 10000.0));
		list.add(new Customer(105, "Rajesh", 8000.0));
		list.add(new Customer(107, "Nagaraju", 4000.0));
		list.add(new Customer(103, "Chaitan",2000.0));
		list.add(new Customer(102, "DivyaSri", 950000.0));
		list.add(new Customer(104, "Sunnay", 750000.0));
		
		
		Comparator<Customer> compNum = new Comparator<Customer>() 
		{
			@Override
			public int compare(Customer c1, Customer c2) 
			{
				return c1.customerNumber().compareTo(c2.customerNumber());
			}
		};
		System.out.println("----Sorted based on CustomerNumber: ------------");
		Collections.sort(list, compNum);
		list.forEach(System.out::println);
		
		System.out.println();
		System.out.println("----Sorted based on CustomerName: ------------");
		Collections.sort(list, (c1, c2) ->c1.customerName().compareTo(c2.customerName()) ); 
		list.forEach(System.out::println);
		
		System.out.println();
		System.out.println("----Sorted based on CustomerBill ------------");
		Collections.sort(list, (c1, c2) ->c1.customerBill().compareTo(c2.customerBill()) ); 
		list.forEach(System.out::println);
		
		list.sort(compNum);
		System.out.println();
		for (Customer customer : list)
		{
			System.out.println(customer);
			
		}
		
	}

}
