package com.springcore.beanscope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component()
@Scope("prototype")
public class Teacher {

	private String teacherName;

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public Teacher(String teacherName) {
		super();
		this.teacherName = teacherName;
	}

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
