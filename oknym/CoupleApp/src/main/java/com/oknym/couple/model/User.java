package com.oknym.couple.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	public User() {
		
	}
	
	public User(String name) {
		super();
		this.name = name;
	}

	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
}
