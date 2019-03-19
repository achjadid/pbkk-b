package com.jadid.apex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Character implements Legends {
	
	private int id;
	private String name = "Wraith";
	private String role;
	private String gender;
	
	
	public Character() {
		super();
	}
	
	@Autowired
	public Character(@Value("${CharacterL.id}")int id,
					 @Value("${CharacterL.name}")String name,
					 @Value("${CharacterL.role}") String role,
					 @Value("${CharacterL.gender}") String gender) 
	{		
		super();
		this.id = id;
		this.name = name;
		this.role = role;
		this.gender = gender;
	}
	
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getRole() {
		return role;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Character [id=" + id + ", name=" + name + ", role=" + role + ", gender=" + gender + "]";
	}
	
	
}
