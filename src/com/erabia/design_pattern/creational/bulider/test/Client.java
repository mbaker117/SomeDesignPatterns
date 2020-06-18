package com.erabia.design_pattern.creational.bulider.test;

import com.erabia.design_pattern.creational.bulider.bean.Car;
import com.erabia.design_pattern.creational.bulider.bean.MotorCycle;
import com.erabia.design_pattern.creational.bulider.bean.User;
import com.erabia.design_pattern.creational.bulider.bean.Vehicle;
import com.erabia.design_pattern.creational.bulider.builders.UserBuilder;
import com.erabia.design_pattern.creational.bulider.builders.VehicleBuilder;
import com.erabia.design_pattern.creational.bulider.director.VehicleDirector;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VehicleDirector director = new VehicleDirector();

		VehicleBuilder carBuilder = new Car();
		VehicleBuilder motorBuilder = new MotorCycle();

		director.construct(carBuilder);
		director.construct(motorBuilder);

		Vehicle car = carBuilder.getVehicle();
		Vehicle motor = motorBuilder.getVehicle();

		System.out.println(car.toString());
		System.out.println(motor.toString());
		
	User user = new UserBuilder("Mohammed","Baker")
				.age(22)
				.address("Amman")
				.build();
		System.out.println(user.toString());
	}

}
