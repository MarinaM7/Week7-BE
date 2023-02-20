package com.marina.Giorno1.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marina.Giorno1.entities.Role;

@Service
public class RoleService {
	
	@Autowired
	RoleRepo rr;

	public Role saveRole(Role r) {
		return rr.save(r);
	}
	
}
