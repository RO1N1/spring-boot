package com.rohan.api.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.rohan.api.entity.User;

public interface UserRepository extends Repository<User, String>{

	public List<User> findAll();
	public User findOne(String id);
	public User findByEmail(String email);
	public User save(User user);
	public void delete(User user);
}
