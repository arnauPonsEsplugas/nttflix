package com.nttfix.users.clients.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttfix.users.clients.models.UserData;
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
	
	@GetMapping(value = "/get/{nombre}")
	
	@GetMapping("/objeto/{nombre}")
    public ResponseEntity<Objeto> getObjeto(@PathVariable("nombre") String nombre) {
        Objeto objeto = new Objeto("Cuadro", "alta");
        return new ResponseEntity<> (objeto, HttpStatus.OK);
    }
	
	public ResponseEntity<UserData> getUser(@RequestBody RequestUser user);



	@DeleteMapping(value = "/api/users")
	public ResponseEntity<UserData> deleteUser(@RequestBody RequestUser user);



	@PutMapping(value = "/api/users")
	public ResponseEntity<UserData> updateUser(@RequestBody RequestUser user);



	@PostMapping(value = "/api/users/login")
	public ResponseEntity<UserData> isValidUser(@RequestBody RequestUser user);
}
