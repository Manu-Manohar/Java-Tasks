package com.nt.test;

@SuppressWarnings("serial")
public class CarStoppedException extends Exception 
{
    // Constructor that accepts a message
    public CarStoppedException(String message)
    {
        super(message);
    }
}
