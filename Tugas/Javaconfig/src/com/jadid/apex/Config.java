package com.jadid.apex;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:Legends.properties")

public class Config {
	
	@Bean
	public Legends Character(@Value("${CharacterL.id}")int id,
			@Value("${CharacterL.name}")String name,
			 @Value("${CharacterL.role}")String role,
			 @Value("${CharacterL.gender}") String gender) {
		
		Character thischaracter = new Character(id, name, role, gender);
		return thischaracter;
	}

}
