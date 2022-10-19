
package com.springcore;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.autowire.annotation.Employee;
import com.springcore.collections.Emp;
import com.springcore.constructorinjectioncustom.Addition;
import com.springcore.lifecycle.Oreo;
import com.springcore.lifecycle.Pepsi;
import com.springcore.lifecycle.Topic;
import com.springcore.standalone.collections.Person;
import com.springcore.stereotypeannotations.StudentDetails;

public class StereotypeAnnotations {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext stereotypeannotationsBeansContext =  new ClassPathXmlApplicationContext(new String[]{"stereotypeannotationsconfig.xml"});
		
		stereotypeannotationsBeansContext.registerShutdownHook();
	
		//StudentDetails studentDetailsBean = (StudentDetails)stereotypeannotationsBeansContext.getBean("studentDetails");
		//No bean named 'studentDetails' available
		
		StudentDetails studentDetailsBean = (StudentDetails)stereotypeannotationsBeansContext.getBean("studentDetailsBeanCustomNameComponent");
		
		
		
		System.out.println(studentDetailsBean);
		studentDetailsBean.setStudentId(2717);
		//studentDetailsBean.setStudentName("MUHAMMAD UMAR TARIQ");
		studentDetailsBean.setCity("Karachi");
		System.out.println(studentDetailsBean);
		
		/*
		 note that Student class is in :com.springcore.stereotypeannotations
		 and also inside com.springcore
		 
		 so if you annotate both Student classes with Component annotation it will give error
		 Annotation-specified bean name 'student' for bean class [com.springcore.stereotypeannotations.Student] conflicts with existing, non-compatible bean definition of same name and class [com.springcore.Student]
		 
		 */
		
		
		
		
		
		
		
	}

}
