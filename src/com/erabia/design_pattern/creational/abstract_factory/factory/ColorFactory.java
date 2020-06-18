package com.erabia.design_pattern.creational.abstract_factory.factory;

import com.erabia.design_pattern.creational.abstract_factory.bean.Green;
import com.erabia.design_pattern.creational.abstract_factory.bean.Red;
import com.erabia.design_pattern.creational.abstract_factory.interfaces.Color;
import com.erabia.design_pattern.creational.abstract_factory.interfaces.Shape;

public class ColorFactory extends AbstractFactory {

	
	public Color getColor(String type) {
		if(type.equalsIgnoreCase("Red"))
			return new Red();
		else if (type.equalsIgnoreCase("Green"))
			return new Green();
		
		return null;
	}

	@Override
	public Shape getShape(String type) {
		// TODO Auto-generated method stub
		return null;
	}


}
