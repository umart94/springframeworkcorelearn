package com.springcore.constructorinjectioncustom;

public class Addition {
	private int a;
	private int b;
	public Addition(int a, int b) {
		
		this.a = a;
		this.b = b;
		System.out.println("Constructor : int,int called");
	}
	public Addition(double a, double b) {
		super();
		this.a = (int)a;
		this.b = (int)b;
		System.out.println("Constructor : double,double called");

	}
	
	public Addition(String a, String b) {
		super();
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("Constructor : String,String called");

	}
	
	public void doSum() {
		System.out.println("Sum is "+ (this.a+this.b));
	}
	
	

}
