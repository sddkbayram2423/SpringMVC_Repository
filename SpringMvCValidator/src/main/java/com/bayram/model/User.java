package com.bayram.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


public class User  {
	
	@Size(min = 3,max = 5,message = "${massage.firstname}")
	private String firstname;
	
	
	@Size(min = 3,max = 5,message = "${massage.lastname}")
	private String lastname;
	
	@NotEmpty(message = "${massage.lastname}")
	private int age;
	
	public User() {
	}
	
	public User(String firstname, String lastname, int age) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}



}
