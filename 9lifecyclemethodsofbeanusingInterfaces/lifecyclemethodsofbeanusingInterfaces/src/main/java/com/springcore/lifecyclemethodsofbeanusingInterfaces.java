package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.constructorinjectioncustom.Addition;
import com.springcore.lifecycle.Oreo;
import com.springcore.lifecycle.Pepsi;

public class lifecyclemethodsofbeanusingInterfaces {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext lifecyclemethodsofbeanusingInterfacesBeansContext =  new ClassPathXmlApplicationContext(new String[]{"lifecyclemethodsofbeanusingInterfaceconfig.xml"});
		Pepsi pepsiBean = (Pepsi) lifecyclemethodsofbeanusingInterfacesBeansContext.getBean("PepsiBean");
		lifecyclemethodsofbeanusingInterfacesBeansContext.registerShutdownHook();
		
		
	}

}
