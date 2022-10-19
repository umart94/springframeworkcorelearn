package com.springcore;

import java.util.Iterator;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.collections.Emp;

public class injectlist {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		ApplicationContext studentBeansContext = new ClassPathXmlApplicationContext("studentconfig.xml");
		/*Student student1 = (Student) context.getBean("student1");
		System.out.println(student1);
		
		Student student2 = (Student) context.getBean("student2");
		System.out.println(student2);*/
		
		ApplicationContext listBeansContext = new ClassPathXmlApplicationContext(new String[]{"listconfig.xml"},studentBeansContext);//this is the method to merge two application contexts.
		
		Emp employee1 = (Emp) listBeansContext.getBean("emp1");
		Student umartariqStudent = (Student) listBeansContext.getBean("student1");
		//System.out.println(employee1);
		//System.out.println(umartariqStudent);
		System.out.println(employee1.getName());
		System.out.println(employee1.getPhones());
		
		Map<String,String> mapOfCourses = employee1.getCourses();
		
		//Iterate over a list using for loop
		for(int index=0;index<employee1.getPhones().size();index++) {
			System.out.println(employee1.getPhones().get(index));
		}
		
		//best way to iterate over set is using iterator, set doesnt have index so we can use while loop over iterator
		
		Iterator<String> AddressesIterator = employee1.getAddress().iterator();
		while(AddressesIterator.hasNext()) {
			   System.out.println(AddressesIterator.next());
			}
		
		
		//iterate over a Map using For Loop and Iterator
		for (Iterator<Map.Entry<String,String>> entries = mapOfCourses.entrySet().iterator(); entries.hasNext(); ) {
		    Map.Entry<String,String> entry = entries.next();
		    System.out.println(entry.getKey() + entry.getValue()); 
		}
		
		
		/*
		 
		 First you questions :

1) I keep seeing the book mentioned "container", what is the container refer to? One container does it mean one java process? or one container refer to one ApplicationContext object?

The ApplicationContext is the central interface, but the underlying container is a BeanFactory. More exactly, BeanFactory is a lower level interface implemented by all Application contextes from which you get the Beans. In that sense, I think that the word container stands here for the BeanFactory - one per ApplicationContext.

2) If i instantiate two ApplicationContext in one java application (one Main body), are these two interface to one central container? Or two separate different instance? See the code below, what is the difference between context1 and context2? If there is a Singleton in Beans.xml, it is invoked by context1 and context2, are they two separated instance or same instance?

ApplicationContext context1 = new ClassPathXmlApplicationContext("Beans.xml"); ApplicationContext context2 = new ClassPathXmlApplicationContext("Beans.xml");>

With that instanciations, you will get 2 totally independent application contexts. One bean declared in first will not be found in the other.

BUT

It is common to have more than one application context in a Web application, because Spring has a notion of hierachies of ApplicationContext. You could declare them as :

ApplicationContext context1 = new ClassPathXmlApplicationContext("Beans.xml");
ApplicationContext context2 = new ClassPathXmlApplicationContext("Beans.xml", context1);>
Here you can retrieve from context1 only beans declared in it, but from context2 you will retrieve beans from context2 and context1. Specifically, beans are first looked for in context2 and if not found then looked for in context1.

This is used in Spring MVC where you normally have one root context (for all beans not directly related to the MVC DispatcherServlet) and one child context dedicated to the DispatcherServlet that will contain the beans for controllers, views, interceptors, etc.
		 */
		
		
	}

}
