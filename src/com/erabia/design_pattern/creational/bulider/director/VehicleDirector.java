package com.erabia.design_pattern.creational.bulider.director;

import com.erabia.design_pattern.creational.bulider.builders.VehicleBuilder;

public class VehicleDirector {
	VehicleBuilder myVehicleBuilder;
	public void construct(VehicleBuilder vehicleBuilder) {
		myVehicleBuilder = vehicleBuilder;
		myVehicleBuilder.buildBody();
		myVehicleBuilder.buildWheels();
		myVehicleBuilder.buildLights();
	}

}
