package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Emp {
	
	private String name;
	private List<String> phones;
	private Set<String> addresses;
	private Map<String,String> courses;
	//private Properties props;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("calling setName Emp object");
		this.name = name;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		System.out.println("calling setPhones Emp object");
		this.phones = phones;
	}
	public Set<String> getAddress() {
		return addresses;
	}
	public void setAddresses(Set<String> addresses) {
		System.out.println("calling setAddresses Emp object");
		this.addresses = addresses;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		System.out.println("calling setCourses Emp object");
		this.courses = courses;
	}
	public Emp(String name, List<String> phones, Set<String> addresses, Map<String, String> courses) {
		super();
		this.name = name;
		this.phones = phones;
		this.addresses = addresses;
		this.courses = courses;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", phones=" + phones + ", addresses=" + addresses + ", courses=" + courses + "]";
	}
	
	

}
