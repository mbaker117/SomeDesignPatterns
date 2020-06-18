package com.erabia.design_pattern.creational.prototype.prototype;

import java.util.Hashtable;

import com.erabia.design_pattern.creational.prototype.bean.Rectangle;
import com.erabia.design_pattern.creational.prototype.bean.Square;



public class ShapeChache {
	private static Hashtable<String,Shape> shapes = new Hashtable<>();
	
	public static void load() {
		Square sq = new Square();
		sq.setId("1");
		shapes.put(sq.getId(), sq);
		Rectangle rect = new Rectangle();
		rect.setId("2");
		shapes.put(rect.getId(), rect);
		
	}
	public static Shape getShape(String id) {
		Shape shape = shapes.get(id);
		return (Shape) shape.clone();
	}
	
}
