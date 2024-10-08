package com.nt.bank;

import java.util.Scanner;

public class BankCustomer 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        Bank bank = new Bank();

        System.out.println("Enter the name, account number, and initial balance:");
        String customerName = sc.nextLine();
        int accountNumber = sc.nextInt();
        int initialBalance = sc.nextInt();
        sc.nextLine();
        
        Thread t1 = new Thread(() ->
        {
            bank.setDetails(customerName, accountNumber, initialBalance);
            System.out.println(bank);
        });
        t1.start();

        try 
        {
            t1.join();
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }

        
        System.out.println("Enter amount to withdraw:");
        double withdrawAmount = sc.nextDouble();
        Thread t2 = new Thread(() -> bank.withdraw(withdrawAmount));
        t2.start();

        
        System.out.println("Enter amount to deposit:");
        double depositAmount = sc.nextDouble();
        Thread t3 = new Thread(() -> bank.deposit(depositAmount));
        t3.start();

        Thread t4 = new Thread(()-> bank.currentBalance());
        t4.start();

        sc.close();
    }
}
