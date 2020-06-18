package com.erabia.design_pattern.creational.factory.factory;

import com.erabia.design_pattern.creational.factory.beans.Square;
import com.erabia.design_pattern.creational.factory.interfaces.Shape;

public class SquareFactory extends ShapeFactory {

	@Override
	protected Shape factoryMethod(double... s) {
		if (s.length == 1)
			return new Square(s[0]);
		else
			return null;
	}
	
}