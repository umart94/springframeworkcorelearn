package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Topic {

	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		System.out.println("setter of topic object called.");
		this.subject = subject;
	}

	public Topic() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@PostConstruct
	public void start() {
		System.out.println("Starting Method");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("ending method");
	}
	
}
