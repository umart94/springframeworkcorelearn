package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ValueAsAnAttribute {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Student student1 = (Student) context.getBean("student1");
		System.out.println(student1);
		
		Student student2 = (Student) context.getBean("student2");
		System.out.println(student2);
		
		
	}

}
