package com.erabia.design_pattern.creational.abstract_factory.factory;

import com.erabia.design_pattern.creational.abstract_factory.interfaces.Color;
import com.erabia.design_pattern.creational.abstract_factory.interfaces.Shape;

public abstract class AbstractFactory {
	public abstract Shape getShape(String type);
	public abstract Color getColor(String type);

}
