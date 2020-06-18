package com.erabia.design_pattern.creational.abstract_factory.factory;

public class FactoryProducer {
	public static AbstractFactory getFactory(String fact) {
		if(fact.equalsIgnoreCase("shape"))
			return new ShapeFactory();
		else if (fact.equalsIgnoreCase("color"))
			return new ColorFactory();
		return null;
	}

}
