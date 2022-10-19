
package com.springcore;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.autowire.annotation.Employee;
import com.springcore.beanscope.Teacher;
import com.springcore.collections.Emp;
import com.springcore.constructorinjectioncustom.Addition;
import com.springcore.lifecycle.Oreo;
import com.springcore.lifecycle.Pepsi;
import com.springcore.lifecycle.Topic;
import com.springcore.standalone.collections.Person;
import com.springcore.stereotypeannotations.StudentDetails;

public class BeanScope {
	
	public static void main(String[] args) {
		
		//AbstractApplicationContext beanscopeContext =  new ClassPathXmlApplicationContext(new String[]{"beanscopeconfig.xml"});
		AbstractApplicationContext beanscopeContext =  new ClassPathXmlApplicationContext(new String[]{"beanscopexmlconfig.xml"});
		StudentDetails studentDetailsBean = (StudentDetails)beanscopeContext.getBean("studentDetailsBeanCustomNameComponent");
		
		beanscopeContext.registerShutdownHook();
	
		/*
		 Bean Scope : 
		 Singleton - springcore - 1 object
		 Prototype - spring core - har time new object return karega spring
		 Request - webapp specific
		 Session - webapp specific
		 GlobalSession - portlet
		 
		 */
		
		/*
		 hashCode remains same of two references of same object, but for different object and its references hashcode will change
		 
		 */
		System.out.println(studentDetailsBean.hashCode());
		
		StudentDetails studentDetailsBean2 = (StudentDetails)beanscopeContext.getBean("studentDetailsBeanCustomNameComponent");
		
		System.out.println(studentDetailsBean2.hashCode());
		
		
		
		
		
		/*Teacher t =(Teacher) beanscopeContext.getBean("teacher");
		System.out.println(t.hashCode());
		Teacher t2 =(Teacher) beanscopeContext.getBean("teacher");
		System.out.println(t2.hashCode());*/
		
		
	}

}
