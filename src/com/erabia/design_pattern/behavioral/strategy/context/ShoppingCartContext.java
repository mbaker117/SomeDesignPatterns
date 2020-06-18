package com.erabia.design_pattern.behavioral.strategy.context;

import com.erabia.design_pattern.behavioral.strategy.strategy.PaymentStrategy;

public interface ShoppingCartContext {
	public void pay(PaymentStrategy py);

}
