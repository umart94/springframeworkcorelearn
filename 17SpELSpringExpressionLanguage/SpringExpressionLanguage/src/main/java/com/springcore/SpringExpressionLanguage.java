
package com.springcore;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import com.springcore.stereotypeannotations.StudentDetails;

public class SpringExpressionLanguage {
	
	public static void main(String[] args) {
		
	AbstractApplicationContext springexpressionlanguageconfigBeanContext =  new ClassPathXmlApplicationContext(new String[]{"springexpressionlanguageconfig.xml"});
		StudentDetails StudentDetailsBean = (StudentDetails) springexpressionlanguageconfigBeanContext.getBean("studentDetailsBeanCustomNameComponent");
		
		springexpressionlanguageconfigBeanContext.registerShutdownHook();
	
		System.out.println(StudentDetailsBean.hashCode());
		StudentDetails StudentDetailsBean2 = (StudentDetails) springexpressionlanguageconfigBeanContext.getBean("studentDetailsBeanCustomNameComponent");
		System.out.println(StudentDetailsBean2.hashCode());
	
		
		/*
		 SpEL Spring Expression Language
		 Supports Parsing and executing expressions with the help of @Value annotations
		 
		 
		 */
		
		SpelExpressionParser temp = new SpelExpressionParser();
		Expression expression = temp.parseExpression("22+44");
		System.out.println(expression.getValue());
		
		
		System.out.println(StudentDetailsBean);
		
		
		
		
		
	
	
	}

}
