package com.erabia.design_pattern.behavioral.strategy.context.impl;

import java.util.ArrayList;
import java.util.List;

import com.erabia.design_pattern.behavioral.strategy.bean.Item;
import com.erabia.design_pattern.behavioral.strategy.context.ShoppingCartContext;
import com.erabia.design_pattern.behavioral.strategy.strategy.PaymentStrategy;

public class ShoppingCartContextImpl implements ShoppingCartContext {
	private List<Item> items;
	
	public ShoppingCartContextImpl() {
		items= new ArrayList<>();
	}
	
	public void addItem(Item item) {
		items.add(item);
	}
	public double calculatePrice() {
		double sum=0;
		for(Item item:items)
			sum+=item.getPrice();
		return sum;
	}
	@Override
	public void pay(PaymentStrategy py) {
		py.pay(this.calculatePrice());
		
	}

}
