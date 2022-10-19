package com.springcore.standalone.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
	
	
	private String name;
	private List<String> friends;
	private Map<String,Integer> feeStructure;
	private Properties properties;
	public String getName() {
		return name;
	}
	public List<String> getFriends() {
		return friends;
	}
	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	public Map<String, Integer> getFeeStructure() {
		return feeStructure;
	}
	public void setFeeStructure(Map<String, Integer> feeStructure) {
		this.feeStructure = feeStructure;
	}
	public Properties getProperties() {
		return properties;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Person(String name, List<String> friends, Map<String, Integer> feeStructure, Properties properties) {
		super();
		this.name = name;
		this.friends = friends;
		this.feeStructure = feeStructure;
		this.properties = properties;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
