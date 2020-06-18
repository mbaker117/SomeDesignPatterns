package com.erabia.design_pattern.creational.factory.factory;

import com.erabia.design_pattern.creational.factory.interfaces.Shape;

public abstract class ShapeFactory {
	protected abstract Shape factoryMethod(double... s);

	public Shape getShape(double... s) {
		return factoryMethod(s);
	}

}




