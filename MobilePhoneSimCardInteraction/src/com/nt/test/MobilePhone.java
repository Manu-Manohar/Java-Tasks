package com.nt.test;

public class MobilePhone implements MobilePhoneInterface
{
    private SIMCardInterface simCard;

    @Override
    public void insertSIM(SIMCardInterface simCard)
    {
    	if(simCard !=null)
    	{
    		this.simCard = simCard;
            simCard.activate();
            System.out.println(simCard.getNetworkProvider() + " SIM inserted.");
    	}
    }

    @Override
    public void removeSIM()
    {
        if (simCard != null)
        {
            simCard.deactivate();
            System.out.println(simCard.getNetworkProvider() + " SIM removed.");
            simCard = null;
        }
        else
        {
            System.out.println("No SIM card to remove.");
        }
    }

    @Override
    public void makeCall(String number)
    {
        if (simCard != null)
        {
            System.out.println("Calling " + number + " using " + simCard.getNetworkProvider() + " SIM.");
        }
        else
        {
            System.out.println("No SIM card inserted.");
        }
    }

    @Override
    public void sendText(String message)
    {
        if (simCard != null)
        {
            System.out.println("Sending text: \"" + message + "\" using " + simCard.getNetworkProvider() + " SIM.");
        }
        else
        {
            System.out.println("No SIM card inserted.");
        }
    }
}
