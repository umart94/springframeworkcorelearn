package com.springcore.autowire.annotation;

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
		this.setStreet("temp street");
		System.out.println("calling modifyAddress, address class");
	}
	public Address(String street, String city) {
		
		super();
		this.street = street;
		this.city = city;
		System.out.println("called address constructor");
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Address(String street) {
		super();
		this.street = street;
		this.city = "single arg constructor default city.";
		System.out.println("called address constructor 1 arg");
	}
	
	
	
	
	
}
