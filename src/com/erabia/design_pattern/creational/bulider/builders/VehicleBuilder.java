package com.erabia.design_pattern.creational.bulider.builders;

import com.erabia.design_pattern.creational.bulider.bean.Vehicle;

public interface VehicleBuilder {
	public void buildBody();
	public void buildWheels();
	public void buildLights();
	public Vehicle getVehicle();

}
