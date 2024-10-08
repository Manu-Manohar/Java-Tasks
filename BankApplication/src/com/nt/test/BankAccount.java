package com.nt.test;

@SuppressWarnings("serial")
public class BankAccount extends Exception  implements BankInterface 
{
	private long accountNumber;
	private double balance;
	
	public BankAccount(long accountNumber, double balance)
	{
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	@Override
	public void deposit(double amount) throws InvalidAmountException 
	{
		if(amount<=0)
		{
			throw new InvalidAmountException("InvalidAmountException with appropriate message.");
		}
		else
		{
			this.balance+=amount;
			System.out.println("TotalBalance: "+balance);
			System.out.println("Balance should increase by "+amount);
		}
	}
	
	@Override
	public void withdraw(double amount) throws InsufficinentFundsException, InvalidAmountException
	{
		if(amount>this.balance)
		{
			throw new InsufficinentFundsException("InsufficientFundsException with appropriate message.");			
		}
		else if(amount<=0)
		{
			throw new InvalidAmountException("InvalidAmountException with appropriate message.");
		}
		else
		{
			this.balance-=amount;
			System.out.println("TotalBalance: "+balance);
			System.out.println("Balance should decrease by "+amount);
		}
	}
	
	@Override
	public void transfer(BankAccount toAccount, double amount) throws InsufficinentFundsException, InvalidAmountException, AccountNotFoundException
	{
		if(amount>this.balance)
		{
			throw new InsufficinentFundsException("InsufficientFundsException with appropriate message.");			
		}
		else if(amount<=0)
		{
			throw new InvalidAmountException("InvalidAmountException with appropriate message.");
		}
		else if(toAccount==null)
		{
			throw new AccountNotFoundException("Account is not Available.");			
		}
		else
		{
			this.withdraw(amount);
			toAccount.deposit(amount);
			System.out.println("Transferred: " + amount + " to account " + toAccount.accountNumber);
		}
	}
	
	@Override
	public void applyForLoan(double amount) throws LoanNotAllowedException, InvalidAmountException
	{
		if(amount > 50000 || balance < 50000)
		{
			throw new LoanNotAllowedException("LoanNotAllowedException with appropriate message.");
		}
		else if(amount<=0)
		{
			throw new InvalidAmountException("InvalidAmountException with appropriate message.");
		}
		else
		{
			 System.out.println("Loan approved for amount: " + amount);
		}
	}
	
	
	@Override
	public double getBalance()
	{
		return balance;
	}

}
