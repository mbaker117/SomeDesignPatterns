package com.erabia.design_pattern.creational.bulider.bean;

import java.util.LinkedList;
import java.util.List;

public class Vehicle {
	private List<String> parts;

	public Vehicle() {
		parts = new LinkedList<>();
	}
	
	public void addParts(String part) {
		parts.add(part);
	}

	@Override
	public String toString() {
		return "Vehicle [parts=" + parts + "]";
	}
	
}
