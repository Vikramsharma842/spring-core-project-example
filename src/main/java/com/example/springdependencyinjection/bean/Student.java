package com.example.springdependencyinjection.bean;

public class Student {

	private String name;
	private int rollno;
	private Address address;

	public void show() {
		System.out.println(name + " " + rollno + " " + address);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
