
package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springcore.stereotypeannotations.StudentDetails;



public class RemovingXMLUsingAnnotations {
	
	public static void main(String[] args) {
		
	ApplicationContext context = new AnnotationConfigApplicationContext(CustomSpringConfiguration.class);
		//StudentDetails studentDetails = context.getBean("studentDetailsBeanCustomNameComponent",StudentDetails.class);
		StudentDetails studentDetails = context.getBean("studentBeanObject",StudentDetails.class);
		StudentDetails studentDetails2 = context.getBean("studentBeanObject",StudentDetails.class);
		StudentDetails studentDetails3 = context.getBean("studentBeanObject",StudentDetails.class);
		
		
		
		
		
		
		
		
		/*
		 Exception in thread "main" org.springframework.beans.factory.NoSuchBeanDefinitionException: No bean named 'studentDetailsBeanCustomNameComponent' available


when we use customspringconfiguration and componentscan, we must annotate 
model classes using @Component or use @Bean and instantiate and return a bean instance
through Spring framework

if we dont annotate using component, then spring will give error no bean available.
so to fix this create a bean inside the customconfiguration class you created using @bean annotation



@Component Preferable for component scanning and automatic wiring.

When should you use @Bean?

Sometimes automatic configuration is not an option. When? Let's imagine that you want to wire components from 3rd-party libraries (you don't have the source code so you can't annotate its classes with @Component), so automatic configuration is not possible.

The @Bean annotation returns an object that spring should register as bean in application context. The body of the method bears the logic responsible for creating the instance.
		 */
		studentDetails.study();
		
		System.out.println(studentDetails.hashCode());
		System.out.println(studentDetails2.hashCode());
		System.out.println(studentDetails3.hashCode());
	
		/*
		 * NOTE THAT WHEREVER YOU CALL OBJECT USING NEW METHOD
		 * set the fields and members and class variables and constructor parameters there
		 * 
		 */
		studentDetails.getUniversityOfStudent().setName("Bahria University Karachi");
		studentDetails.getUniversityOfStudent().display();
		
		
		
		
	}

}
