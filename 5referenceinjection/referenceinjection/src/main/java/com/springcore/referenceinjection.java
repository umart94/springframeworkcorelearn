package com.springcore;

import java.util.Iterator;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.collections.Emp;
import com.springcore.references.A;

public class referenceinjection {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
	
		/*
		SETTER INJECTION
		ApplicationContext studentBeansContext = new ClassPathXmlApplicationContext("studentconfig.xml");
		
		
		
		 NOTE THAT, WHEN CREATING studentBeansContext APPLICATIONCONTEXT OBJECT
		 there is BeanFactory and ClasspathXMLAppContext file.
		 so all beans are initialized by spring framework
		 and we see that since two student bean objects are present in studentconfig
		 so they are loaded by the context.
		
		
		Student umarStudent = (Student) studentBeansContext.getBean("student1");
		Student talhaStudent = (Student) studentBeansContext.getBean("student2");
		
		System.out.println(umarStudent);
		System.out.println(talhaStudent);
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		/*
		 INJECTING LIST TYPES COLLECTION TYPES
		 		ApplicationContext listBeansContext = new ClassPathXmlApplicationContext(new String[]{"listconfig.xml"});//this is the method to merge two application contexts.
		
		
		
		 */

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * 
		 REFERENCE INJECTION
		 A aObject = new A();
		 B class
		 A has member field object B inside it (composition)
		 
		ApplicationContext referencesBeansContext = new ClassPathXmlApplicationContext(new String[]{"referencesconfig.xml"},listBeansContext);//this is the method to merge two application contexts. 
		
		
		
		*/
		
		
		
		/*
		 TODO == FIND ORDER OF BEAN CREATION, find order of setter injection and reference injection
		  
		 */
		ApplicationContext referencesBeansContext = new ClassPathXmlApplicationContext(new String[]{"referencesconfig.xml"});
		A referenceOfObjectA = (A) referencesBeansContext.getBean("referenceOfObjectA");
		System.out.println(referenceOfObjectA.getX());
		System.out.println(referenceOfObjectA.getOb().getY());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
