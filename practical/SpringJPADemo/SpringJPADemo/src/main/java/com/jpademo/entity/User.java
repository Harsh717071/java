package com.jpademo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="userdetails")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//user entity class
public class User {
	
	@Id
	private int id;
	
	@Column(length = 30, nullable = false)
	@NotBlank(message="Please enter your name")
	private String uName;
	
	@Column(length = 30, nullable = false, unique = true)
	@NotBlank(message="Please enter your email")
	@Email(message="enter proper email id ")
	private String userEmail;
	
	@Column(length = 11, nullable = false, unique = true)
	private long userPhone;

	}
