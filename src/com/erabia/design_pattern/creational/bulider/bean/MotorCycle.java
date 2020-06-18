package com.erabia.design_pattern.creational.bulider.bean;

import com.erabia.design_pattern.creational.bulider.builders.VehicleBuilder;

public class MotorCycle implements VehicleBuilder {
	private Vehicle vehicle;
	
	public MotorCycle() {
		vehicle=new Vehicle();
	}
	@Override
	public void buildBody() {
		// TODO Auto-generated method stub
		vehicle.addParts("Motorcycle Body Part");

	}

	@Override
	public void buildWheels() {
		// TODO Auto-generated method stub
		vehicle.addParts("2 motorcycle wheels");
	}

	@Override
	public void buildLights() {
		// TODO Auto-generated method stub
		vehicle.addParts("MotorCycle Lights");

	}

	@Override
	public Vehicle getVehicle() {
		// TODO Auto-generated method stub
		return vehicle;
	}

}
