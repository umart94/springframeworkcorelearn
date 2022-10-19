
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

public class SpringStandaloneCollections {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext springStandaloneCollectionsBeansContext =  new ClassPathXmlApplicationContext(new String[]{"springstandalonecollectionsconfig.xml"});
		Person personBean = (Person) springStandaloneCollectionsBeansContext.getBean("person1");
		springStandaloneCollectionsBeansContext.registerShutdownHook();
	
		System.out.println(personBean.getFriends().getClass().getName());
	
		for(int iteratorCurrentValue=0;iteratorCurrentValue<personBean.getFriends().size();iteratorCurrentValue++)
		{
			System.out.println(personBean.getFriends().get(iteratorCurrentValue));
		}
		
		Person person2Bean = (Person) springStandaloneCollectionsBeansContext.getBean("person2");
		
		
		for(int iteratorCurrentValue=0;iteratorCurrentValue<person2Bean.getFriends().size();iteratorCurrentValue++)
		{
			System.out.println(person2Bean.getFriends().get(iteratorCurrentValue));
		}
		
		Person person3Bean = (Person) springStandaloneCollectionsBeansContext.getBean("person3");
		for(int iteratorCurrentValue=0;iteratorCurrentValue<person3Bean.getFriends().size();iteratorCurrentValue++)
		{
			System.out.println(person3Bean.getFriends().get(iteratorCurrentValue));
		}
		
		/*
		 <ref local=".."> requires that the bean being referenced is in the same config file.

<ref bean="..."> requires only it to be in the same context, or in a parent context.

The difference is primarily one of documentation. If you see <ref local="...">, then you know you need only look in the same file to find it. Other than that, there's not much difference. I would generally use <ref bean="..."> in most cases.
		 */
		
		
		
		
		
		//map is in person1 bean
		
		System.out.println(personBean.getFeeStructure().getClass().getName());
		
		HashMap<String,Integer> hashMap = new HashMap();
		hashMap.put("spring framework", 8000);
		System.out.println(hashMap);
		System.out.println(hashMap.getClass().getName());
		
		/*
		 when i use util:map, Spring creates java.util.LinkedHashMap
 instead of HashMap
		 when i use HashMap object class , Java creates java.util.HashMap object.
		 */
		
		for (Iterator<Map.Entry<String,Integer>> entries = personBean.getFeeStructure().entrySet().iterator(); entries.hasNext(); ) {
		    Map.Entry<String,Integer> entry = entries.next();
		    System.out.println(entry.getKey() + entry.getValue()); 
		}
		
		System.out.println(personBean.getProperties().get("driver"));
		System.out.println(personBean.getProperties());
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
