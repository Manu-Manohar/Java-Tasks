package com.nt.test;

public class CardType 
{
	private Customer customer;
	private String cardType;
	

	public CardType(Customer customer, String cardType) 
	{
		super();
		this.customer = customer;
		this.cardType = cardType;
	}
	
	

	public Customer getCustomer() 
	{
		return customer;
	}



	public void setCustomer(Customer customer)
	{
		this.customer = customer;
	}



	public String getCardType()
	{
		return cardType;
	}



	public void setCardType(String cardType) {
		this.cardType = cardType;
	}



	@Override
	public String toString()
	{
		return "The Customer "+this.customer+" is Eligible For '"+this.getCardType()+"' Card";
	}
}
