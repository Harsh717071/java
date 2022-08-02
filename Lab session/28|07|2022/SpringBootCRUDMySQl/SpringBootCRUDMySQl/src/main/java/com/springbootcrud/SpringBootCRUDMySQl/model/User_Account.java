package com.springbootcrud.SpringBootCRUDMySQl.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User_Account {
	
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String user_name;
	private String password;
	private String email;
	
	public User_Account() {
		super();
	}

	public User_Account(Integer id, String username, String password, String email) {
		super();
		this.id = id;
		this.user_name = user_name;
		this.password = password;
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUsername(String user_name) {
		this.user_name = user_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}
