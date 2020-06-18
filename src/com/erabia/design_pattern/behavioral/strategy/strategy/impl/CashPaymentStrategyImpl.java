package com.erabia.design_pattern.behavioral.strategy.strategy.impl;

import com.erabia.design_pattern.behavioral.strategy.strategy.PaymentStrategy;

public class CashPaymentStrategyImpl implements PaymentStrategy {
	
	@Override
	public void pay(double amount) {
		System.out.println(amount +" Payed Cash");

	}

}
