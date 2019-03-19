package com.jadid.apex;

public class Character {
	
	private int id;
	private String name;
	private String role;
	private String gender;
	
	
	public Character() {
		
	}
	
	public Character(int id, String name, String role, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
		this.gender = gender;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getRole() {
		return role;
	}
	
	public void setRole(String role) {
		this.role = role;
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
