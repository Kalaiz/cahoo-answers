package com.kalaiz.cahoo_backend;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	private String name;
	private int points;
	private @Id   @GeneratedValue(strategy=GenerationType.AUTO) Long id;
	
	public User(String name, int points) {
		this.name = name;
		this.points = points;
	}
	
	
	protected User() {}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
}
