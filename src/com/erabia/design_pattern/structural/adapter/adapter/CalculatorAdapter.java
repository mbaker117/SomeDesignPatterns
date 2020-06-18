package com.erabia.design_pattern.structural.adapter.adapter;

import com.erabia.design_pattern.structural.adapter.bean.Calculator;
import com.erabia.design_pattern.structural.adapter.bean.Rectangle;
import com.erabia.design_pattern.structural.adapter.bean.Triangle;
import com.erabia.design_pattern.structural.adapter.interfaces.CalculatorInterface;

public class CalculatorAdapter implements CalculatorInterface {
	private Calculator calculator;
	private Triangle t; 
	public CalculatorAdapter(Triangle t) {
		// TODO Auto-generated constructor stub
		this.t = t;
	}
	@Override
	public double getArea(Rectangle r) {
		// TODO Auto-generated method stub
		calculator = new Calculator();
		Rectangle rect  = new Rectangle(0.5*t.getBase(), t.getHeight());
		
		
		return calculator.getArea(rect);
	}

}
