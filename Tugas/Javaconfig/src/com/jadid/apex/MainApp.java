package com.jadid.apex;

import java.util.Scanner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		Legends legends = context.getBean("Character", Legends.class);
		Character thischaracter = (Character) legends;
		System.out.println("Legends: "+thischaracter.getName());
		System.out.println(thischaracter.toString());		
		
		context.close();
	}

}
