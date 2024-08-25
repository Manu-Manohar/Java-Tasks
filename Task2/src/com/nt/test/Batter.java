package com.nt.test;

public class Batter
{
	public String name;
	public int runs;
	public int matches;
	public float batting_avg;
	
	public Batter()
	{
		name="";
		runs=0;
		matches=0;
		batting_avg=0.0f;
	}

	public Batter(String name, int runs, int matches) 
	{
		if(name.isEmpty() || name==null)
		{
			System.err.println("Error: Name cannot be Empty..");
			this.name="";
		}
		else
		{
			this.name = name;
		}
		
		if(runs<0 || matches<0 || (runs>0 && matches==0))
		{
			System.err.println("Error: runs and Matches must be non-negative...");
			this.runs = 0;
			this.matches = 0;
			this.batting_avg=0.0f;
		}
		else
		{
			this.runs = runs;
			this.matches = matches;
			computeBattingAverage();

		}
	}
	
	
	public void computeBattingAverage()
	{
		if (matches!=0)
		{
			batting_avg=(float)runs/matches;	
		}
		
		else
		{
			System.err.println("Error: Matches cannot be zero.");
		}
		
	}
	public void getStatistice()
	{
		if(runs<0 || matches<0 || (runs>0 && matches==0))
		{
			System.err.println("Error: runs and Matches must be non-negative...");
			return;
		}
		else
		{
			System.out.println("Name: "+name);
			System.out.println("Runs: "+runs);
			System.out.println("Batting Average: "+batting_avg);	
		}
	}

}
