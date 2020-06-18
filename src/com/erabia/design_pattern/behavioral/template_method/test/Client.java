package com.erabia.design_pattern.behavioral.template_method.test;

import com.erabia.design_pattern.behavioral.template_method.template.HouseTemplate;
import com.erabia.design_pattern.behavioral.template_method.template.impl.GlassHouseImpl;
import com.erabia.design_pattern.behavioral.template_method.template.impl.WoodHouseImpl;

public class Client {
	public static void main(String[] args) {
		HouseTemplate house = new WoodHouseImpl();
		house.buildHouse();
		
		System.out.println("----------");
		house=new GlassHouseImpl();
		house.buildHouse();
	}

}
