package com.springbootcrud.SpringBootCRUDMySQl.controller;

import java.util.List;
import java.util.NoSuchElementException;

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
import com.springbootcrud.SpringBootCRUDMySQl.model.User_Account;
import com.springbootcrud.SpringBootCRUDMySQl.services.UserService;

@RestController
public class UserController {
	 @Autowired
	    private UserService service;
	 // RESTful API methods for Retrieval operations
	    @GetMapping("/user")
	public List<User_Account> list() {
	    return service.listAll();
	}
	    //RESTful API method for creating operations
	    @PostMapping("/user")
	    public void add(@RequestBody User_Account user) {
	        service.save(user);
	    }
	    //RESTful API method for user id Retrieval
	    @GetMapping("/user/{id}")
	    public ResponseEntity<User_Account> get(@PathVariable Integer id) {
	        try {
	            User_Account user = service.get(id);
	            return new ResponseEntity<User_Account>(user, HttpStatus.OK);
	        } catch (NoSuchElementException e) {
	            return new ResponseEntity<User_Account>(HttpStatus.NOT_FOUND);
	        }      
	    }
	    //RESTful API method for update operations
	    @PutMapping("/user/{id}")
	    public ResponseEntity<?> update(@RequestBody User_Account user_account, @PathVariable Integer id) {
	        try {
	            User_Account existUser = service.get(id);
	            service.save(user_account);
	            return new ResponseEntity<>(HttpStatus.OK);
	        } catch (NoSuchElementException e) {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }      
	    }
	    //RESTful API method For Delete operations
	    @DeleteMapping("/user/{id}")
	    public void delete(@PathVariable Integer id) {
	        service.delete(id);
	    }

}
