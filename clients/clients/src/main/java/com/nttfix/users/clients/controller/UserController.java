package com.nttfix.users.clients.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttfix.users.clients.models.UserData;
import com.nttfix.users.clients.reposiory.UserRepository;
import com.nttfix.users.clients.service.UserService;

@RestController
@RequestMapping(path = "/clients")
public class UserController {	
	
	@Autowired
    UserService userService;
	
	@PostMapping(value = "/api/users")
    public ResponseEntity<UserData> addObjeto(@RequestBody UserData user) {
        UserData newUser = userService.createUser(user);
        return new ResponseEntity<>(newUser, HttpStatus.OK);
    }
	
	
	
	@GetMapping(value = "/get/{username}")
	    public ResponseEntity<UserData> getUser(@PathVariable("username") String username) {
        UserData objeto = userService.readUser(username);
        return new ResponseEntity<> (objeto, HttpStatus.OK);
    }
	
    public Optional<UserData> getUser(Long id){
        if(!userService.existsById(id))
            throw new RuntimeException("Game not found.");
        return userService.findById(id);
    }
	
	public ResponseEntity<UserData> getUser(@RequestBody RequestUser user);



	@DeleteMapping(value = "/api/users")
	public ResponseEntity<UserData> deleteUser(@RequestBody RequestUser user);



	@PutMapping(value = "/api/users")
	public ResponseEntity<UserData> updateUser(@RequestBody RequestUser user);



	@PostMapping(value = "/api/users/login")
	public ResponseEntity<UserData> isValidUser(@RequestBody RequestUser user);
}
