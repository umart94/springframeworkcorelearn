
package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.autowire.annotation.Employee;
import com.springcore.constructorinjectioncustom.Addition;
import com.springcore.lifecycle.Oreo;
import com.springcore.lifecycle.Pepsi;
import com.springcore.lifecycle.Topic;

public class qualifierannotations {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext autowiringUsingAnnotationsBeansContext =  new ClassPathXmlApplicationContext(new String[]{"qualifierannotationconfig.xml"});
		/* previous project was autowiringusingXML
		 * 
		 Employee class = com.springcore.autowire.Employee
		 
		 this project is autowiringusingAnnotations
		 it uses class inside com.springcore.autowire.annotation.Employee and com.springcore.autowire.annotation.Address
		 */
		Employee employeeBean = (Employee) autowiringUsingAnnotationsBeansContext.getBean("employeeBean");
		autowiringUsingAnnotationsBeansContext.registerShutdownHook();
		//System.out.println(employeeBean.getEmpAddress().getCity());
		//System.out.println(employeeBean.getEmpAddress().getStreet());
		//System.out.println(employeeBean.getEmpQualification().getQualificationName());
		
		
		//employeeBean.getEmpAddress().setStreet("ABC");
		//employeeBean.getEmpAddress().setCity("XYZ");
		//System.out.println(employeeBean.getEmpAddress().getCity());
		//System.out.println(employeeBean.getEmpAddress().getStreet());
		
		
		/*
		 @Autowired Annotation can be used on:
		 1. Setter
		 2. Property Variable member 
		 2. Constructor
		 */
		
		
		
		
		/*
		 Starting with Spring 4.3, if a class, which is configured as a Spring bean, has only one constructor, the @Autowired annotation can be omitted and Spring will use that constructor and inject all necessary dependencies.

Regarding the default constructor: You either need the default constructor, a constructor with the @Autowired annotation when you have multiple constructors, or only one constructor in your class with or without the @Autowired annotation.

Read the @Autowired chapter from the official Spring documentation for more information.
		 */
	
		
		
		
		System.out.println("BEFORE --- IDEALLY VALUES SHOULD BE NULL");
		System.out.println("EMPLOYEE ID == "+employeeBean.getEmpID());
		System.out.println("EMPLOYEE NAME == "+employeeBean.getEmpName());
		System.out.println("ADDRESS STREET == "+employeeBean.getEmpAddress().getStreet());
		System.out.println("ADDRESS CITY == "+employeeBean.getEmpAddress().getCity());
		System.out.println("QUALIFICATION ID == "+employeeBean.getEmpQualification().getQualificationID());
		System.out.println("QUALIFICATION NAME == "+employeeBean.getEmpQualification().getQualificationName());
		System.out.println("BEFORE --- IDEALLY VALUES SHOULD BE NULL");
		
		
		//programmatically setting values of autowired beans address and qualification.
		System.out.println("AFTER --- IDEALLY VALUES SHOULD BE what we set in setter methods");
		employeeBean.getEmpAddress().setCity("LAHORE");
		employeeBean.getEmpAddress().setStreet("xyz street , abc building");
		employeeBean.getEmpQualification().setQualificationID(12);
		employeeBean.getEmpQualification().setQualificationName("Bachelors in computer science");
		System.out.println("EMPLOYEE ID == "+employeeBean.getEmpID());
		System.out.println("EMPLOYEE NAME == "+employeeBean.getEmpName());
		System.out.println("ADDRESS STREET == "+employeeBean.getEmpAddress().getStreet());
		System.out.println("ADDRESS CITY == "+employeeBean.getEmpAddress().getCity());
		System.out.println("QUALIFICATION ID == "+employeeBean.getEmpQualification().getQualificationID());
		System.out.println("QUALIFICATION NAME == "+employeeBean.getEmpQualification().getQualificationName());
		System.out.println("AFTER --- IDEALLY VALUES SHOULD BE what we set in setter methods");
		
		
	}

}
