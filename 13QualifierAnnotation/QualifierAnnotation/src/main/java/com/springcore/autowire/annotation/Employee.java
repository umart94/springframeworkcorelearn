package com.springcore.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

	private int empID;
	private String empName;

	private Address empAddress;
	
	private Qualification empQualification;
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		System.out.println("calling setEmpID, Employee class");
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		System.out.println("calling setEmpName, Employee class");
		this.empName = empName;
	}
	public Address getEmpAddress() {
		return empAddress;
	}
	
	public void setEmpAddress(Address empAddress) {
		System.out.println("calling setEmpAddress, Employee class");
		this.empAddress = empAddress;
	}
	
	
	
	public Qualification getEmpQualification() {
		return empQualification;
	}
	
	public void setEmpQualification(Qualification empQualification) {
		System.out.println("calling setEmpQualification, Employee class");
		this.empQualification = empQualification;
	}
	public Employee(int empID, String empName, Address empAddress) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.empAddress = empAddress;
	}
	
	@Autowired
	public Employee(@Qualifier("addressAutowiredBean2") Address empAddress, Qualification empQualification) {
		super();
		this.empAddress = empAddress;
		this.empQualification = empQualification;
	}
	public Employee(int empID, String empName, Address empAddress, Qualification empQualification) {
		super();
		System.out.println("called full argument employee constructor");
		this.empID = empID;
		this.empName = empName;
		this.empAddress = empAddress;
		this.empQualification = empQualification;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + ", empAddress=" + empAddress + "]";
	}
	
	public void modifyAddress() {
		empAddress.modifyAddress();
	   }
	
	
	
	
	
}
