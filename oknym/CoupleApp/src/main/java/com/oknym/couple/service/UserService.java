package com.oknym.couple.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oknym.couple.model.User;
import com.oknym.couple.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public Collection<User> findAll() {
		Collection<User> list = userRepository.findAll();
		return list;
	}
	
	public Optional<User> findById(int id) {
		Optional<User> user = userRepository.findById(id);
		return user;
	}
	
	public User userSave(User user) {
		userRepository.save(user);
		return user;
	}
	
	public void userUpdate(User user) {
		userRepository.save(user);
	}
	
	public void userDelete(int id) {
		userRepository.deleteById(id);
	}

}
