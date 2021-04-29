package com.oknym.couple.controller;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.oknym.couple.model.User;
import com.oknym.couple.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping(value = "/api/userList")
	public Collection<User> findAll() {
		Collection<User> list = userService.findAll();
		return list;
	}
	
	@GetMapping(value = "/api/userSelectOne")
	public Optional<User> findById(@RequestParam(name = "id") int id) {
		Optional<User> user = userService.findById(id);
		return user;
	}
	
	@PostMapping(value = "/api/userSave")
	public ResponseEntity<User> userSave(@RequestParam(name = "name") String name) {
		User user = new User(name);
		userService.userSave(user);
		return new ResponseEntity<User>(userService.userSave(user), HttpStatus.OK);
	}
	
	@PutMapping(value = "/api/userUpdate")
	public void userUpdate(@RequestParam(name = "id") int id, @RequestParam(name = "name") String name) {
		User user = new User(id, name);
		userService.userUpdate(user);
	}
	
	@DeleteMapping(value = "/api/userDelete")
	public void userDelete(@RequestParam(name = "id") int id) {
		userService.userDelete(id);
	}

}
