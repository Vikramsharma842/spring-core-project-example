package com.example.springdependencyinjection.bean;

public class Address {

	private int houseno;
	private int pincode;
	private String city;

	@Override
	public String toString() {
		return houseno + " " + pincode + " " + city;
	}

	public int getHouseno() {
		return houseno;
	}

	public void setHouseno(int houseno) {
		this.houseno = houseno;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
