package com.springcore.lifecycle;

public class Oreo {
private double price;

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	System.out.println("setter method called");
	this.price = price;
}

public Oreo() {
	
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Oreo [price=" + price + "]";
}


public void init() {
	System.out.println("Init method called");
}

public void destroy() {
	System.out.println("Destroy method called");
}

}
