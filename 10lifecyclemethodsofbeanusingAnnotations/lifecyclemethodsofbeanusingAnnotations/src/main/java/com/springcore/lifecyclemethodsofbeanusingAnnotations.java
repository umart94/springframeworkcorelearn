package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.constructorinjectioncustom.Addition;
import com.springcore.lifecycle.Oreo;
import com.springcore.lifecycle.Pepsi;
import com.springcore.lifecycle.Topic;

public class lifecyclemethodsofbeanusingAnnotations {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext lifecyclemethodsofbeanusingAnnotationsBeansContext =  new ClassPathXmlApplicationContext(new String[]{"lifecyclemethodsofbeanusingAnnotationsconfig.xml"});
		Topic topicBean = (Topic) lifecyclemethodsofbeanusingAnnotationsBeansContext.getBean("topicBean");
		lifecyclemethodsofbeanusingAnnotationsBeansContext.registerShutdownHook();
		
		
	}

}
