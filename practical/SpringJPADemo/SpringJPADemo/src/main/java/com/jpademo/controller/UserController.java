package com.jpademo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jpademo.entity.User;
import com.jpademo.service.UserService;

@RestController
//user controller to handle rest mapping
public class UserController {
	
	@Autowired
	private UserService us;
	
	//saving user details using rest api POST Mapping
	@PostMapping("/save")
	public ResponseEntity<User> saveUser(@RequestBody User user){
		return new ResponseEntity<User>(us.saveUser(user), HttpStatus.CREATED);
	}
	
	// get user details from table using rest api GET Mapping
	@GetMapping("/getuser")
	public List<User> getAllUser(){
		return us.getAllUser();
	}
	
	// get user detail from table using rest api GET mapping with id attribute 
	@GetMapping("/getuserbyid/{id}")
	public ResponseEntity<User> getUserById(@PathVariable("id") int id){
		return new ResponseEntity<User>(us.getUserById(id), HttpStatus.OK);
	}
	
	//updating user details from table using rest api PUT mapping with id attribute
	@PutMapping("/updatebyid/{id}")
	public ResponseEntity<User> updateUserById(@PathVariable("id") int id, @RequestBody User user){
		return new ResponseEntity<User>(us.updateUserById(user, id), HttpStatus.OK);
	}
	
	//delete user details from table using rest api delete mapping with id attribute
	@DeleteMapping("/deletebyid/{id}")
	public ResponseEntity<String> deleteUserById(@PathVariable("id") int id){
		us.deleteUserById(id);
		return new ResponseEntity<String>("User delete successfully", HttpStatus.OK);
	}
	
	// fetching user details from table using rest api get mapping with uName attribute
	@GetMapping("/getByName/{uName}")
	public List<User> getUserByName(@PathVariable String uName) {
		return us.getUserByName(uName);
		
	}
	
	// fetching user details from table using rest api get mapping with userPhone attribute
		@GetMapping("/getByPhone/{userPhone}")
		public User getUserByPhone(@PathVariable long userPhone) {
			return us.getUserByPhone(userPhone);
			
		}

}
