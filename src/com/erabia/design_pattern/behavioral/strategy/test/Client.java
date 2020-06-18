package com.erabia.design_pattern.behavioral.strategy.test;

import com.erabia.design_pattern.behavioral.strategy.bean.Item;
import com.erabia.design_pattern.behavioral.strategy.context.impl.ShoppingCartContextImpl;
import com.erabia.design_pattern.behavioral.strategy.strategy.impl.CashPaymentStrategyImpl;
import com.erabia.design_pattern.behavioral.strategy.strategy.impl.CreditCardPaymentStrategyImpl;

public class Client {
	
	public static void main(String[] args) {
		ShoppingCartContextImpl sh = new ShoppingCartContextImpl();
		sh.addItem(new Item("ss",15));
		sh.addItem(new Item("ssaa",20));
		sh.pay(new CashPaymentStrategyImpl());
		sh.pay(new CreditCardPaymentStrategyImpl("15616161651", "451", "123"));
		
	}

}
