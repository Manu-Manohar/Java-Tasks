package com.nt.test;

public class CardsOnOffer 
{
	public static CardType getOfferedCard(Customer customer)
	{
		int cp=customer.getCreditPoints();
		
		if(cp>=100 && cp<=500)
		{
			return new CardType(customer,"Silver");
		}
		else if(cp>=501 && cp<=1000)
		{
			return new CardType(customer,"Gold");
		}
		else if(cp>1000)
		{
			return new CardType(customer,"Platinum");
		}
		else
		{
			return new CardType(customer,"EMI");
		}
	}

}
