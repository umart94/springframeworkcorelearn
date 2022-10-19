package com.springcore.references;

public class B {
private int y;

public int getY() {
	return y;
}

public void setY(int y) {
	System.out.println("calling setY this method is inside B class");
	this.y = y;
}

public B() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "B [y=" + y + "]";
}



}
