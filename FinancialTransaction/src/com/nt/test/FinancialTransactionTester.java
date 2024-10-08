package com.nt.test;

import java.util.Scanner;

public class FinancialTransactionTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter transaction amount: ");
        String amountStr = scanner.nextLine();

        System.out.print("Enter account number: ");
        String accountStr = scanner.nextLine();

        try {
            double amount = Double.parseDouble(amountStr);
            long accountNumber = Long.parseLong(accountStr);

            FinancialTransaction transaction = new FinancialTransaction();
            transaction.processTransaction(amount, accountNumber);

        } 
        catch (NumberFormatException e) 
        {
            System.out.println("Invalid input: Please enter a valid number for transaction amount.");
        }
        finally
        {
            scanner.close();
        }
    }
}