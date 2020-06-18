package com.erabia.design_pattern.creational.bulider.builders;

import com.erabia.design_pattern.creational.bulider.bean.User;

public class UserBuilder {
	private final String firstName;
	private final String lastName;
	private int age;
	private String phone;
	private String address;

	public UserBuilder(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public UserBuilder age(int age) {
		this.age = age;
		return this;
	}

	public UserBuilder phone(String phone) {
		this.phone = phone;
		return this;
	}

	public UserBuilder address(String address) {
		this.address = address;
		return this;
	}


	public User build() {
		User user = new User(this);
		
		return user;
	}

	

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public String getPhone() {
		return phone;
	}

	public String getAddress() {
		return address;
	}
	
}
