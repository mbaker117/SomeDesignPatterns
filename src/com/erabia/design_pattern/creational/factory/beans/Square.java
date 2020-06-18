package com.erabia.design_pattern.creational.factory.beans;

import com.erabia.design_pattern.creational.factory.interfaces.Shape;

public class Square implements Shape {
	private double size;
	
	public Square(double size) {
		this.size = size;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Square");

	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return size*size;
	}
	
	public void setSize(double size) {
		this.size = size;
	}
	public double getSize() {
		return size;
	}

}
