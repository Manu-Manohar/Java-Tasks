package com.nt.test;

public interface SIMCardInterface 
{
    String getPhoneNumber();
    String getNetworkProvider();
    void activate();
    void deactivate();
}
