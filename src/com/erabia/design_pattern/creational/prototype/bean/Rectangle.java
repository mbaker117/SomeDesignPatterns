package com.erabia.design_pattern.creational.prototype.bean;

import com.erabia.design_pattern.creational.prototype.prototype.Shape;

public class Rectangle extends Shape {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Draw rectangle");

	}
	public void setType() {
		this.type="Rectangle";
	}

}
