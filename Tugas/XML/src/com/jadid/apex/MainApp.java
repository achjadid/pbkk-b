package com.jadid.apex;

import java.util.Scanner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("characterbean.xml");
		
		Character ch = context.getBean("c1", Character.class);
		System.out.println("Legends: "+ch.getName());
		System.out.println(ch.toString());		
		
		context.close();
	}

}
