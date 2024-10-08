package com.nt.test;

public class Airtel implements SIMCardInterface {
    private String phoneNumber;
    @SuppressWarnings("unused")
	private boolean isActive;

    public Airtel(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        this.isActive = false;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String getNetworkProvider() {
        return "Airtel";
    }

    @Override
    public void activate() {
        isActive = true;
        System.out.println("Airtel SIM activated.");
    }

    @Override
    public void deactivate() {
        isActive = false;
        System.out.println("Airtel SIM deactivated.");
    }
}