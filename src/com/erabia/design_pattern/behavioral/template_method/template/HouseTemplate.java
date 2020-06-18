package com.erabia.design_pattern.behavioral.template_method.template;

public abstract class HouseTemplate {
	
	public final void buildHouse() {
		System.out.println("Starting building operations");
		buildFoundations();
		buildPillars();
		buildWalls();
		buildWindows();
		System.out.println("House has been built");
	}
	
	private void buildFoundations() {
		System.out.println("Building foundation with cement and iron");
	}
	protected abstract void buildPillars();
	protected abstract void buildWalls();
	
	private void buildWindows() {
		System.out.println("Building glass windows");
	}
}
