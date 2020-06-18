package com.erabia.design_pattern.creational.prototype.bean;

import com.erabia.design_pattern.creational.prototype.prototype.Shape;

public class Square extends Shape {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Draw Square");

	}
	public void setType() {
		this.type="Square";
	}

}
