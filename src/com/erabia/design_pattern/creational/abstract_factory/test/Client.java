package com.erabia.design_pattern.creational.abstract_factory.test;

import com.erabia.design_pattern.creational.abstract_factory.factory.AbstractFactory;
import com.erabia.design_pattern.creational.abstract_factory.factory.FactoryProducer;
import com.erabia.design_pattern.creational.abstract_factory.interfaces.Color;
import com.erabia.design_pattern.creational.abstract_factory.interfaces.Shape;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractFactory sf = FactoryProducer.getFactory("shape");
		Shape shape =sf.getShape("square");
		shape.draw();
		
		AbstractFactory cf = FactoryProducer.getFactory("color");
		Color color = cf.getColor("Red");
		color.fill();
	}

}
