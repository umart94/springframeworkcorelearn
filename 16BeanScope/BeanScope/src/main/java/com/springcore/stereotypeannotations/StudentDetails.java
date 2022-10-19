package com.springcore.stereotypeannotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
@Component("studentDetailsBeanCustomNameComponent")
@Scope("prototype")
public class StudentDetails {
/*
 To answer your question exactly...

@Value("${secret:secret}")
private String ldapSecret;
And a few more variations are below for completeness of the examples...

Default a String to null:

@Value("${secret:#{null}}")
private String secret;
Default a number:

@Value("${someNumber:0}")
private int someNumber;
 */
	@Value("371")//spring will do parsing itself
	private int studentId;
	@Value("muhammad umar tariq")
	private String studentName;
	@Value("karachi")
	private String city;
	
	
	//now we need to use @Value annotation on Collection Type
	//create standalone list inside xml file
	//then use @Value
	@Value("#{arrayListBeanID}")
	private List<String> addresses;



	public int getStudentId() {
		return studentId;
	}



	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}



	public String getStudentName() {
		return studentName;
	}



	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public List<String> getAddresses() {
		return addresses;
	}



	public void setAddresses(List<String> addresses) {
		this.addresses = addresses;
	}



	@Override
	public String toString() {
		return "StudentDetails [studentId=" + studentId + ", studentName=" + studentName + ", city=" + city
				+ ", addresses=" + addresses + "]";
	}



	public StudentDetails(int studentId, String studentName, String city, List<String> addresses) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.city = city;
		this.addresses = addresses;
	}



	public StudentDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
