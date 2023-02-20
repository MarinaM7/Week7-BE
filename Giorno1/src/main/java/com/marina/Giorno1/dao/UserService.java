package com.marina.Giorno1.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marina.Giorno1.entities.User;

@Service
public class UserService {

	@Autowired
	UserRepo ur;
	
	public User saveUser(User u) {
		return ur.save(u);
	}
	
	public Optional<User> getUserById(int id) {
		return ur.findById(id);
	}
	
}
