package com.springcore;

import java.util.Iterator;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.collections.Emp;
import com.springcore.constructorinjectioncustom.Person;
import com.springcore.references.A;

public class constructorinjection {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	/*
	 CONSTRUCTOR INJECTION
	 
	 */
		ApplicationContext constructorInjectionBeansContext = new ClassPathXmlApplicationContext(new String[]{"constructorinjectionconfig.xml"});//this is the method to merge two application contexts.
		
		Person personObject = (Person)constructorInjectionBeansContext.getBean("personObjectReference");
		System.out.println(personObject.toString());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
