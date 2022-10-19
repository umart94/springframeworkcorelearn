package com.springcore.references;

public class A {
//a is dependent on B
	private int x;
	private B ob;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		System.out.println("calling setX , this method inside A class");
		this.x = x;
	}
	public B getOb() {
		return ob;
	}
	public void setOb(B ob) {
		System.out.println("calling setOb on B class object , this method is inside A class");
		this.ob = ob;
	}
	public A() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "A [x=" + x + ", ob=" + ob + "]";
	}
	
	
	
}
