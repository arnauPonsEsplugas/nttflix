package com.nttfix.users.clients.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttfix.users.clients.models.UserData;
import com.nttfix.users.clients.reposiory.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public UserData createUser(UserData userData) {
		return userRepository.save(userData);
	}
	
	public Optional<UserData> readUser(String username){
		return userRepository.findById(username);
		
	}
	
	public UserData updateUser(UserData userData) {
		return userRepository.save(userData);
	}
	
	public void deleteUser(String username) {
		userRepository.deleteById(username);
	}
	
	public List<UserData> getAllUsers() 
	{
		return userRepository.findAll();
	}

	public boolean existsById(Long id) {
		return userRepository.findById(id);
	}

 
	
}
