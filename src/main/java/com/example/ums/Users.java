package com.example.ums;

import jakarta.persistence.*;

@Entity
@Table(name="user_list")
public class Users {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Changed to IDENTITY
	private int user_id;
	
	@Column(nullable = false)
	private String name;
	
	private int age;
	
	@Column(unique = true, nullable = false)
	private String email;
	
	private String gender;

	// Getters and Setters
	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
}
