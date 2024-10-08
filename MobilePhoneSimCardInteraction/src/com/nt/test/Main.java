package com.nt.test;

public class Main 
{
    public static void main(String[] args)
    {
        SIMCardInterface jioSim = new Jio("9876543210");
        SIMCardInterface airtelSim = new Airtel("8765432109");
        SIMCardInterface bsnlSim = new BSNL("7654321098");

        MobilePhone mobilePhone = new MobilePhone();

        mobilePhone.insertSIM(jioSim);
        mobilePhone.makeCall("8142038107");
        mobilePhone.sendText("Hello from Jio!");

        mobilePhone.removeSIM();

        mobilePhone.insertSIM(airtelSim);
        mobilePhone.makeCall("0987654321");
        mobilePhone.sendText("Hello from Airtel!");

        mobilePhone.removeSIM();

        mobilePhone.insertSIM(bsnlSim);
        mobilePhone.makeCall("1122334455");
        mobilePhone.sendText("Hello from BSNL!");

        mobilePhone.removeSIM();
    }
}