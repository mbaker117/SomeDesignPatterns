package com.erabia.design_pattern.behavioral.template_method.template.impl;

import com.erabia.design_pattern.behavioral.template_method.template.HouseTemplate;

public class WoodHouseImpl extends HouseTemplate {

	@Override
	protected void buildPillars() {
		System.out.println("Building wood pillars");

	}

	@Override
	protected void buildWalls() {
		System.out.println("Building wood walls");

	}

}
