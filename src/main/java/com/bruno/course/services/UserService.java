package com.bruno.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bruno.course.entities.User;
import com.bruno.course.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll(){
		return userRepository.findAll();
	}
	
	public User findById(Long id){
		Optional<User> obj  = userRepository.findById(id);
		return obj.get();
	}
	
	public User insert (User obj) {
		return userRepository.save(obj);
	}
	
}
