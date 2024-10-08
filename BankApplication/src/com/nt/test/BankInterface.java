package com.nt.test;

public interface BankInterface
{
	void deposit(double amount) throws InvalidAmountException;
	void withdraw(double amount) throws InsufficinentFundsException, InvalidAmountException;
	void transfer(BankAccount toAccount,double amount) throws InsufficinentFundsException, InvalidAmountException, AccountNotFoundException;
	void applyForLoan(double amount) throws LoanNotAllowedException, InvalidAmountException;
	double getBalance();

}
