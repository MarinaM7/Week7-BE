package com.marina.Giorno1.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marina.Giorno1.entities.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

}
