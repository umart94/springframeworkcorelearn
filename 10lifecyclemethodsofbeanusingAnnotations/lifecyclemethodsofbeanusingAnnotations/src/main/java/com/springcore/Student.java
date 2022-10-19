package com.springcore;

public class Student {
	
	private int studentId;
	private String studentName;
	private String studentAddress;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		System.out.println("calling setStudentId");
		this.studentId = studentId;
	}
	public String getStudentName() {
	
		return studentName;
	}
	public void setStudentName(String studentName) {
		System.out.println("calling setstudentname");
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		System.out.println("calling setstudentaddress");
		this.studentAddress = studentAddress;
	}
	public Student(int studentId, String studentName, String studentAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}
	
	public Student() {
		super();
		
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ "]";
	}

	
	
	
}
