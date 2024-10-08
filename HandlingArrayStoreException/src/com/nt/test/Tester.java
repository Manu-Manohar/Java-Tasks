package com.nt.test;

public class Tester
{
    public static void main(String[] args) 
    {
        try
        {
            ArrayStoreExample.storeObjects();
        } 
        catch (ArrayStoreException e) 
        {
            System.out.println("ArrayStoreException caught: Incompatible type: " + e.getMessage());
        }
    }
}

