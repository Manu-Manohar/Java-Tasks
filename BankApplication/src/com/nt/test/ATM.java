package com.nt.test;

import java.util.Scanner;

public class ATM 
{
	public static void main(String[] args)
	{
		BankAccount account1 = new BankAccount(123456789, 100000);
        BankAccount account2 = new BankAccount(987654321, 50000);
        
        Customer c1 = new Customer("John Doe", account1);
        Customer c2 = new Customer("Jane Smith", account2);
        
        boolean exit = false;
        
		try (Scanner sc = new Scanner(System.in)) {
			while(!exit)
			{
				try
				{
					System.out.println("Select an Option: ");
					System.out.println("1. Deposit"+"\n"+"2. Withdraw"+"\n"+"3. Transfer "+"\n"+"4. Loan Application" +"\n"+"5. Check Balance"+"\n"+"6. Exit");
					System.out.println("Enter your Option: ");
					int option = sc.nextInt();
					switch (option) 
					{
						case 1://Deposit
							System.out.println("Enter amount to deposit: ");
							double depositAmount = sc.nextDouble();
							c1.getAccount().deposit(depositAmount);
							break;
			            case 2: // Withdraw
			                System.out.print("Enter amount to withdraw: ");
			                double withdrawAmount = sc.nextDouble();
			                c1.getAccount().withdraw(withdrawAmount);
			                break;

			            case 3: // Transfer
			                System.out.print("Enter amount to transfer: ");
			                double transferAmount = sc.nextDouble();
			                c1.getAccount().transfer(c2.getAccount(), transferAmount);
			                break;

			            case 4: // Apply for Loan
			                System.out.print("Enter loan amount: ");
			                double loanAmount = sc.nextDouble();
			                c1.getAccount().applyForLoan(loanAmount);
			                break;

			            case 5: // Check Balance
			                System.out.println("Current balance: " + c1.getAccount().getBalance());
			                break;
						case 6:
							exit = true;
							break;
						default:
							System.err.println("Invalid Option. Please try again..");
					}
				}
				 catch(InvalidAmountException | AccountNotFoundException |InsufficinentFundsException | LoanNotAllowedException e)
				{
					 System.err.println(e.getMessage());
				}
			}
		}
	}
}