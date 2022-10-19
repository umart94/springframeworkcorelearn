package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.constructorinjectioncustom.Addition;
import com.springcore.lifecycle.Oreo;

public class lifecyclemethodsofbeanusingXML {
	
	public static void main(String[] args) {
		
		/*
		 * lifecyclemethodsofbeanusingXML
		when spring creates bean
		it provides 2 methods
		public void init()
		public void destroy()
		
		we can change name of these two methods
		signature i.e argument and return type must be same as above
		
		initialization means code such as loading,config,connect to db,web service etc.
		close connection objects in destroy method
		
		
		
		 */
		
	/*ApplicationContext lifecyclemethodsofbeanusingXMLBeansContext = new ClassPathXmlApplicationContext(new String[]{"lifecyclemethodsofbeanusingXMLconfig.xml"});//this is the method to merge two application contexts.
		
		Oreo oreo = (Oreo) lifecyclemethodsofbeanusingXMLBeansContext.getBean("OreoBean");
		*/
		
		
		AbstractApplicationContext lifecyclemethodsofbeanusingXMLBeansContext =  new ClassPathXmlApplicationContext(new String[]{"lifecyclemethodsofbeanusingXMLconfig.xml"});
		Oreo oreo = (Oreo) lifecyclemethodsofbeanusingXMLBeansContext.getBean("OreoBean");
		System.out.println(oreo.toString());
		
		/*
		 the registershutdownhook will call destroy method upon jvm shutdown.
		note that  registershutdownhook is inside AbstractApplicationContext
		 */
		lifecyclemethodsofbeanusingXMLBeansContext.registerShutdownHook();
		
		
		
		
		
		
		
		
	}

}
