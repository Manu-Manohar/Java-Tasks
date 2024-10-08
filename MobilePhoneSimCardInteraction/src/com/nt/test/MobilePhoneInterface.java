package com.nt.test;

public interface MobilePhoneInterface
{
	void insertSIM(SIMCardInterface simCard);
	void removeSIM();
	void makeCall(String number);
	void sendText(String message);
}
