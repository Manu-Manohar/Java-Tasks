package com.nt.test;

public class Testing
{

	public static void main(String[] args)
	{
		Batter batter1=new Batter("",18000,463);
		batter1.computeBattingAverage();
		batter1.getStatistice();
		
		Batter batter2 = new Batter("Rahul", -15000, 300);
        batter2.computeBattingAverage();
        batter2.getStatistice();
	}

}
