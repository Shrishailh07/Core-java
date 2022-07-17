package com.xworkz.doggy;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="Dog")
public class dog {

	@Id
	@Column(name="dog_id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="colour")
	private String colour;
	@Column(name="gender")
	private String gender;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
public dog() {
	
}
	public dog(int id, String name, String colour, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.colour = colour;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "dog [id=" + id + ", name=" + name + ", colour=" + colour + ", gender=" + gender + "]";
	}
	
	
}
