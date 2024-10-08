package com.nt.test;

public class Jio implements SIMCardInterface 
{
    private String phoneNumber;
    @SuppressWarnings("unused")
	private boolean isActive;

    public Jio(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
        this.isActive = false;
    }

    @Override
    public String getPhoneNumber() 
    {
        return phoneNumber;
    }

    @Override
    public String getNetworkProvider()
    {
        return "Jio";
    }

    @Override
    public void activate()
    {
        isActive = true;
        System.out.println("Jio SIM activated.");
    }

    @Override
    public void deactivate()
    {
        isActive = false;
        System.out.println("Jio SIM deactivated.");
    }
}
