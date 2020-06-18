package com.erabia.design_pattern.creational.prototype.test;

import com.erabia.design_pattern.creational.prototype.prototype.Shape;
import com.erabia.design_pattern.creational.prototype.prototype.ShapeChache;

public class Client {
	public static void main(String arg[]) {
		ShapeChache.load();
		Shape sq = ShapeChache.getShape("1");
		sq.draw();
		System.out.println(sq.getId());
		sq.setId("4");
		System.out.println(sq.getId());
		sq = ShapeChache.getShape("1");

		System.out.println(sq.getId());
		
	}
}
