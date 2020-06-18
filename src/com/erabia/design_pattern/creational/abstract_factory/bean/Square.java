package com.erabia.design_pattern.creational.abstract_factory.bean;

import com.erabia.design_pattern.creational.abstract_factory.interfaces.Shape;

public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Square Shape");
		
	}

}
