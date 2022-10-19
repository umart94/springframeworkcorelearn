package com.springcore;

import java.util.Iterator;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.collections.Emp;
import com.springcore.constructorinjectioncustom.Addition;
import com.springcore.constructorinjectioncustom.Person;
import com.springcore.references.A;

public class ambiguityproblem {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	/*
	 AMBIGUITY PROBLEM USING CONSTRUCTOR INJECTION
	 
	 */
		ApplicationContext ambiguityproblemconstructorInjectionBeansContext = new ClassPathXmlApplicationContext(new String[]{"ambiguityproblemconfig.xml"});//this is the method to merge two application contexts.
		
		Addition additionObject = (Addition)ambiguityproblemconstructorInjectionBeansContext.getBean("additionBean");
		additionObject.doSum();
		//System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
