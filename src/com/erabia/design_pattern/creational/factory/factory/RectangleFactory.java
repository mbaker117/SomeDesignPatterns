package com.erabia.design_pattern.creational.factory.factory;

import com.erabia.design_pattern.creational.factory.beans.Rectangle;
import com.erabia.design_pattern.creational.factory.interfaces.Shape;

public class RectangleFactory extends ShapeFactory {

	@Override
	protected Shape factoryMethod(double... s) {
		if (s.length == 2)
			return new Rectangle(s[0], s[1]);
		else
			return null;
	}

}