package com.codedecode.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.codedecode.demo.entity.User;
import com.codedecode.demo.service.UserService;

@RestController
public class UserController {
	
	@Autowired
    UserService userService;
	
	@PostMapping("/createUser")
	public User createUser(@RequestBody User user) {
		userService.createUser(user);
		return user;
	}
}
