package com.jpademo.service;

import java.util.List;
import com.jpademo.entity.User;

// user service interface
public interface UserService {
	
	// inserting user details in table 
	User saveUser(User user);
	
	// fetching all user details from table
	List<User> getAllUser();
	
	//fetching user details from table based on user id
	User getUserById(int id);
	
	//modifying user details from table based on user id
	User updateUserById(User user, int id);
	
	// remove user details from table based on user id
	void deleteUserById(int id);
	
	//fetching user details based on user name
	List<User> getUserByName(String uName); 
	
	//fetching user details based on user phone
	User getUserByPhone(long userPhone); 

}
