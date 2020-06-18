package com.erabia.design_pattern.creational.factory.test;

import com.erabia.design_pattern.creational.factory.factory.RectangleFactory;
import com.erabia.design_pattern.creational.factory.factory.SquareFactory;
import com.erabia.design_pattern.creational.factory.interfaces.Shape;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shape = new SquareFactory().getShape(1);
		shape.draw();
		System.out.println(shape.getArea());
		shape = new RectangleFactory().getShape(1,2);
		shape.draw();
		System.out.println(shape.getArea());

	}

}
