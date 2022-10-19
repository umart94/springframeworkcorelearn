
package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.autowire.Employee;
import com.springcore.constructorinjectioncustom.Addition;
import com.springcore.lifecycle.Oreo;
import com.springcore.lifecycle.Pepsi;
import com.springcore.lifecycle.Topic;

public class autowiringusingxml {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext autowiringUsingXMLBeansContext =  new ClassPathXmlApplicationContext(new String[]{"autowiringusingXMLConfig.xml"});
		Employee employeeBean = (Employee) autowiringUsingXMLBeansContext.getBean("employeeBean");
		autowiringUsingXMLBeansContext.registerShutdownHook();
		
		/*
		 TODO = Handle Null Pointer Exception here.
		 */
		System.out.println(employeeBean.getEmpAddress().getCity());
		System.out.println(employeeBean.getEmpAddress().getStreet());
		
		//employeeBean.getEmpAddress().setCity("islamabad");
		//employeeBean.getEmpAddress().setStreet("temp street");
		
		
		//System.out.println(employeeBean.getEmpAddress().getCity());
		//System.out.println(employeeBean.getEmpAddress().getStreet());
		
		/*
		 we can also create employee bean in following way:
		 Employee employeeBean2 = autowiringUsingXMLBeansContext.getBean("employeeBean",Employee.class);
		 
		 */
		//Employee employeeBean2 = autowiringUsingXMLBeansContext.getBean("employeeBean",Employee.class);
		//System.out.println(employeeBean2.getEmpAddress().getCity());
		
	}

}
