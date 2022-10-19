package com.springcore;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.springcore.stereotypeannotations.StudentDetails;

@Configuration
//@ComponentScan(basePackages = "com.springcore")
public class CustomSpringConfiguration {
	
	@Bean(name= {"studentBeanObject","temp","conf"})
	//@Scope("prototype")
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public StudentDetails getStudentDetailsBean() {
		StudentDetails studentDetailsObject = new StudentDetails(getUniversityBean());
		return studentDetailsObject;
	}

	
	@Bean
	//@Scope("prototype")
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public University getUniversityBean() {
		University UniversityObject = new University();
		
		return UniversityObject;
	}
}
