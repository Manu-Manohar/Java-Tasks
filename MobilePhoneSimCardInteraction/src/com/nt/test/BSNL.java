package com.nt.test;

public class BSNL implements SIMCardInterface {
    private String phoneNumber;
    @SuppressWarnings("unused")
	private boolean isActive;

    public BSNL(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        this.isActive = false;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String getNetworkProvider() {
        return "BSNL";
    }

    @Override
    public void activate() {
        isActive = true;
        System.out.println("BSNL SIM activated.");
    }

    @Override
    public void deactivate() {
        isActive = false;
        System.out.println("BSNL SIM deactivated.");
    }
}

