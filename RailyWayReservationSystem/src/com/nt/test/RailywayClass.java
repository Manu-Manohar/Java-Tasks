package com.nt.test;

class Reservation extends Thread
{
	private static int availableSeat = 1;
	private int requiredSeat;
	
	
	public Reservation(int requiredSeat) 
	{
		super();
		this.requiredSeat = requiredSeat;
	}


	@Override
	public  void run()
	{
		String str = Thread.currentThread().getName();
		System.out.println(str+" Threading is running.");
		if((availableSeat)>=requiredSeat)
		{
			System.out.println(str+" is booked Ticket");
			availableSeat-=requiredSeat;
		}
		else
		{
			System.err.println("Tickets are not avilable.");
		}
	}
}
public class RailywayClass 
{	
	public static void main(String[] args) 
	{
		Reservation r1 = new Reservation(1);
		
		Thread t1 = new Thread(r1,"First");
		Thread t2 = new Thread(r1,"Second");
		
		t1.start();
		t2.start();
		
		
	}
}
