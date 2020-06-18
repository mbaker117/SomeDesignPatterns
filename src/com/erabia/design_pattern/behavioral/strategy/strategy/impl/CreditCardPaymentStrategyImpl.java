package com.erabia.design_pattern.behavioral.strategy.strategy.impl;

import com.erabia.design_pattern.behavioral.strategy.strategy.PaymentStrategy;

public class CreditCardPaymentStrategyImpl implements PaymentStrategy{
	private String cardNumber;
	private String cvv;
	private String password;
	
	public CreditCardPaymentStrategyImpl(String cardNumber, String cvv, String password) {
		super();
		this.cardNumber = cardNumber;
		this.cvv = cvv;
		this.password = password;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public void pay(double amount) {
		System.out.println(amount +" Payed using credit card");
		
	}

}
