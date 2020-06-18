package com.erabia.design_pattern.creational.bulider.bean;

import com.erabia.design_pattern.creational.bulider.builders.VehicleBuilder;

public class Car implements VehicleBuilder {
	private Vehicle vehicle;
	
	public Car() {
		vehicle=new Vehicle();
	}

	@Override
	public void buildBody() {
		// TODO Auto-generated method stub
		vehicle.addParts("Car Body Part");

	}

	@Override
	public void buildWheels() {
		// TODO Auto-generated method stub
		vehicle.addParts("4 car wheels");
	}

	@Override
	public void buildLights() {
		// TODO Auto-generated method stub
		vehicle.addParts("Car Lights");

	}

	@Override
	public Vehicle getVehicle() {
		// TODO Auto-generated method stub
		return vehicle;
	}

}
