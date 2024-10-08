package com.nt.test;

public class CabCustomerServiceTester 
{
	public static void main(String[] args) 
	{
        CabCustomerService service = new CabCustomerService();

        CabCustomer customer1 = new CabCustomer(1, "JOHN", "LocationA", "LocationB", 4, "1234567890");
        service.addCabCustomer(customer1);
        System.out.println(service.printBill(customer1));

        CabCustomer customer2 = new CabCustomer(2, "SMITH", "LocationC", "LocationD", 10, "0987654321");
        service.addCabCustomer(customer2);
        System.out.println(service.printBill(customer2));

        CabCustomer customer3 = new CabCustomer(3, "JOHN", "LocationE", "LocationF", 40, "1234567890");
        System.out.println(service.printBill(customer3));
    }
}


