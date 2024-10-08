package com.nt.test;

@SuppressWarnings("serial")
public class CarPunctureException extends Exception 
{
    // Constructor that accepts a message
    public CarPunctureException(String message) 
    {
        super(message);
    }
}