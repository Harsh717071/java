package com.jpademo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.jpademo.entity.User;

// user repository using jpa repository
public interface UserRepository extends JpaRepository<User, Integer>{
	
	
	// fetching user details using user name
	@Query("select u from User u where u.uName=?1")
	List<User> getUserByName(String uName);
	
	//fetching user details using user phone
	@Query("select u from User u where u.userPhone=?1")
	User getUserByPhone(long userPhone);
}
