package com.erabia.design_pattern.structural.adapter.test;

import com.erabia.design_pattern.structural.adapter.adapter.CalculatorAdapter;
import com.erabia.design_pattern.structural.adapter.bean.Calculator;
import com.erabia.design_pattern.structural.adapter.bean.Rectangle;
import com.erabia.design_pattern.structural.adapter.bean.Triangle;

public class Client {
	public static void main(String[] args) {
		Rectangle rect = new Rectangle(1,5);
		Calculator calc = new Calculator();
		System.out.println("Rectangle Area = "+calc.getArea(rect));
		Triangle tri = new Triangle(1, 5);
		CalculatorAdapter calcAdapter= new CalculatorAdapter(tri);
		System.out.println("Triangle Area = "+calcAdapter.getArea(null));
		
	}

}
