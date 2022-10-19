package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean,DisposableBean{

	private double price;
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("setter method called");
		this.price = price;
	}

	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		/*
		 * This method is the same as init method
		 * 
		 */
		System.out.println("Intializing pepsi: init method i.e afterPropertiesSet Method called.");
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("destroying PepsiBean , calling destroy method.");
	}

}
