package com.erabia.design_pattern.behavioral.strategy.bean;

public class Item {
	private String code;
	private double price;
	public Item(String code, double price) {
		
		this.code = code;
		this.price = price;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	

}
