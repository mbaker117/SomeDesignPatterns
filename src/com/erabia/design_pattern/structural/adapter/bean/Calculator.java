package com.erabia.design_pattern.structural.adapter.bean;

import com.erabia.design_pattern.structural.adapter.interfaces.CalculatorInterface;

public class Calculator implements CalculatorInterface {
	private Rectangle rect;

	@Override
	public double getArea(Rectangle r) {
		// TODO Auto-generated method stub
		this.rect =r;
		return rect.getHeight()*rect.getWidth();
	}

}
