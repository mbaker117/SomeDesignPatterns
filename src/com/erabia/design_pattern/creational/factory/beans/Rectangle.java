package com.erabia.design_pattern.creational.factory.beans;

import com.erabia.design_pattern.creational.factory.interfaces.Shape;

public class Rectangle implements Shape {
	private double width;
	private double height;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Rectangle");
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return height*width;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	

}
