package com.erabia.design_pattern.creational.abstract_factory.factory;

import com.erabia.design_pattern.creational.abstract_factory.bean.Rectangle;
import com.erabia.design_pattern.creational.abstract_factory.bean.Square;
import com.erabia.design_pattern.creational.abstract_factory.interfaces.Color;
import com.erabia.design_pattern.creational.abstract_factory.interfaces.Shape;


public  class ShapeFactory extends AbstractFactory {

	
	public  Shape getShape(String type) {
		if(type.equalsIgnoreCase("Square"))
			return new Square();
		else if (type.equalsIgnoreCase("Rectangle"))
			return new Rectangle();
		
		return null;
	}
	@Override
	public Color getColor(String type) {
		// TODO Auto-generated method stub
		return null;
	}
}
