package com.springcore.stereotypeannotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import com.springcore.University;

//@Component
//@Component("studentDetailsBeanCustomNameComponent")
//@Scope("prototype")

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
	
	//@Value("#{arrayListBeanID}")
	private List<String> addresses;

	@Value("#{22+11}")
	private int x;
	@Value("#{2+5+56+34}")
	private int y;
	
	//instead of making another variable, copy paste value expression and change it and test it
	//@Value("#{ T(java.lang.Math).sqrt(729) }")
	@Value("#{ T(java.lang.Math).E + T(java.lang.Math).PI}")
	
	private double z;
	
	@Value("#{ new java.lang.String('MUHAMMAD UMAR TARIQ') } ")
	
	private String nameofStudentAsNewStringObject;

	private University universityOfStudent;
	
	
	
	
	
	





	
	
	public StudentDetails(University university) {
		super();
		// TODO Auto-generated constructor stub
		this.universityOfStudent = university;
	}










	
	public StudentDetails(int studentId, String studentName, String city, List<String> addresses, int x, int y,
			double z, String nameofStudentAsNewStringObject, University universityOfStudent) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.city = city;
		this.addresses = addresses;
		this.x = x;
		this.y = y;
		this.z = z;
		this.nameofStudentAsNewStringObject = nameofStudentAsNewStringObject;
		this.universityOfStudent = universityOfStudent;
	}











	@Override
	public String toString() {
		return "StudentDetails [studentId=" + studentId + ", studentName=" + studentName + ", city=" + city
				+ ", addresses=" + addresses + ", x=" + x + ", y=" + y + ", z=" + z
				+ ", nameofStudentAsNewStringObject=" + nameofStudentAsNewStringObject + ", universityOfStudent="
				+ universityOfStudent + "]";
	}











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











	public int getX() {
		return x;
	}











	public void setX(int x) {
		this.x = x;
	}











	public int getY() {
		return y;
	}











	public void setY(int y) {
		this.y = y;
	}











	public double getZ() {
		return z;
	}











	public void setZ(double z) {
		this.z = z;
	}











	public String getNameofStudentAsNewStringObject() {
		return nameofStudentAsNewStringObject;
	}











	public void setNameofStudentAsNewStringObject(String nameofStudentAsNewStringObject) {
		this.nameofStudentAsNewStringObject = nameofStudentAsNewStringObject;
	}











	public University getUniversityOfStudent() {
		return universityOfStudent;
	}











	public void setUniversityOfStudent(University universityOfStudent) {
		this.universityOfStudent = universityOfStudent;
	}











	public void study() {
		System.out.println("hello from == studentdetails object study method , calling university display method : ");
		this.universityOfStudent.display();//if university object bean is not created then it will give nullpointerexception
		
		
		System.out.println("Student"+this.studentName+"with id" +this.studentId+"is Studying");
	}
	
	
	

	
}
