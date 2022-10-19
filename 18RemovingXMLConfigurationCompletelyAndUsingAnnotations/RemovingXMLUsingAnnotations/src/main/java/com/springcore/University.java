package com.springcore;

public class University {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public University(String name) {
		super();
		this.name = name;
	}

	public University() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public void display() {
		System.out.println("hello from University : "+this.name);
	}

}
