package com.springcore.autowire;

public class Address {

	private String street;
	private String city;
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		System.out.println("calling setstreet, address class");
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		System.out.println("calling setCity, address class");
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + "]";
	}
	public void modifyAddress() {
		// TODO Auto-generated method stub
		this.setStreet("al rae avenue , gulshan-e-iqbal, karachi");
		System.out.println("calling modifyAddress, address class");
	}
	
}
