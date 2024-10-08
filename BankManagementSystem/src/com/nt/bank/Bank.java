package com.nt.bank;

public class Bank {
    private static String bankName;
    private String bankCustomerName;
    private static String bankAddress;
    private static String bankIFSCCode;
    private int customerAccountNumber;
    private int currentBalance;


    static
    {
        bankName = "SBI";
        bankAddress = "Hyderabad";
        bankIFSCCode = "SBI01234";
    }

    public synchronized void setDetails(String bankCustomerName, int customerAccountNumber, int currentBalance)
    {
        this.bankCustomerName = bankCustomerName;
        this.customerAccountNumber = customerAccountNumber;
        this.currentBalance = currentBalance;
        this.toString();
    }

    public synchronized void withdraw(double amount)
    {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (currentBalance < 1000) {
            System.out.println("Insufficient Balance. Minimum balance of 1000 must be maintained.");
        } else if ((currentBalance - amount) < 1000) {
            System.out.println("Cannot withdraw. Minimum balance must be maintained.");
        } else {
            currentBalance -= amount;
            System.out.println("Transaction successful.");
            System.out.println("Available Balance: " + currentBalance);
        }
    }

    public synchronized void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount.");
        } else {
            currentBalance += amount;
            System.out.println("Deposited Successfully.");
            //currentBalance();
        }
    }

    public synchronized void currentBalance() {
        System.out.println("Available Balance: " + currentBalance);
    }

    @Override
    public synchronized String toString() {
        return "Bank Name: " + bankName + "\nBank Customer Name: " + bankCustomerName + "\nBank Address: " + bankAddress
                + "\nBank IFSC Code: " + bankIFSCCode + "\nCustomer Account Number: " + customerAccountNumber
                + "\nCurrent Balance: " + currentBalance;
    }
}
