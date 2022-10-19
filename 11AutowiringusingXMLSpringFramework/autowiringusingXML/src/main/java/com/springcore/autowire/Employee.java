package com.springcore.autowire;

public class Employee {

	private int empID;
	private String empName;
	private Address empAddress;
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		System.out.println("calling setEmpID, address class");
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		System.out.println("calling setEmpName, address class");
		this.empName = empName;
	}
	public Address getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(Address empAddress) {
		System.out.println("calling setEmpAddress, address class");
		this.empAddress = empAddress;
	}
	public Employee(int empID, String empName, Address empAddress) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.empAddress = empAddress;
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
