package com.jadid.apex;

import java.util.Scanner;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("LegendsAnnotation.xml"); 
		
		Legends legend = context.getBean("character", Legends.class);
		Character thischaracter = (Character) legend;
		System.out.println("Legends: "+thischaracter.getName());
		System.out.println(thischaracter.toString());
		
		context.close();
	}

}
