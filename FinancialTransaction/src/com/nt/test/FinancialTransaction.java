package com.nt.test;


public class FinancialTransaction 
{
	public void processTransaction(double amount, long accountNumber) throws NumberFormatException
	{
		try 
		{
			if (amount <= 0)
			{
                throw new IllegalArgumentException("Transaction amount must be positive.");
            }
			System.out.println("Processing transaction...");
	        System.out.println("Transaction successful: Amount Rs." + amount + " transferred to account " + accountNumber);
        } 
		catch (IllegalArgumentException e)
		{
            System.out.println("Error processing transaction: " + e.getMessage());
        } 
		catch (RuntimeException e) 
		{
            System.out.println("Unexpected error occurred: " + e.getMessage());
        }
	}
	   
}