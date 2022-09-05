package com.jpademo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jpademo.entity.User;
import com.jpademo.exception.UserNotFoundException;
import com.jpademo.repository.UserRepository;
import com.jpademo.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository urepo;

	@Override
	//saving user details using jpa repository save(object)
	public User saveUser(User user) {
		
		return urepo.save(user);
	}

	@Override
	// fetching all user details using jpa repository findAll()
	public List<User> getAllUser() {	
		return urepo.findAll();
	}

	@Override
	//fetching user details using jpa repository findById()
	public User getUserById(int id) {
		//find by id, if not present then throw custom exception
	return urepo.findById(id).orElseThrow(() -> new UserNotFoundException("User not found in table"));
	}

	@Override
	public User updateUserById(User user, int id) {
		//find by id, if not present then throw custom exception
		User existuser = urepo.findById(id).orElseThrow(() -> new UserNotFoundException("User not found in table"));
		
		//set new value
		existuser.setUserEmail(user.getUserEmail());
		existuser.setUserPhone(user.getUserPhone());
		urepo.save(existuser);
		return existuser;
	}

	@Override
	// fetching user details using jpa repository findById() & remove it using deletById()
	public void deleteUserById(int id) {
		//find by id, if not present then throw custom exception
		urepo.findById(id).orElseThrow(() -> new UserNotFoundException("User not found in table"));
		urepo.deleteById(id);
	}

	@Override
	// fetching user details using jpql 
	public List<User> getUserByName(String uName) {
		
		return urepo.getUserByName(uName);
	}

	@Override
	// fetching user details using jpql
	public User getUserByPhone(long userPhone) {
		
		return urepo.getUserByPhone(userPhone);
	}

}
