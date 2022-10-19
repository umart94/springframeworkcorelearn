package com.springcore.autowire.annotation;

public class Qualification {
private int qualificationID;
private String qualificationName;
public int getQualificationID() {
	return qualificationID;
}
public void setQualificationID(int qualificationID) {
	System.out.println("called setQualificationID setter");
	this.qualificationID = qualificationID;
}
public String getQualificationName() {
	return qualificationName;
}
public void setQualificationName(String qualificationName) {
	System.out.println("called qualification name setter");
	this.qualificationName = qualificationName;
}
public Qualification(int qualificationID, String qualificationName) {
	super();
	this.qualificationID = qualificationID;
	this.qualificationName = qualificationName;
	System.out.println("called full argument Qualification constructor");
}
@Override
public String toString() {
	return "Qualification [qualificationID=" + qualificationID + ", qualificationName=" + qualificationName + "]";
}
public Qualification() {
	super();
	// TODO Auto-generated constructor stub
}

}
