package com.bancobv.clean.example.entrypoints.rest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bancobv.clean.example.core.entity.User;
import com.bancobv.clean.example.core.usecase.User.ListUsersImpl;

@RestController
public class UserController {

    @Autowired
    private ListUsersImpl listUsers;
    
	@GetMapping("/users")
	public List<User> ListUsers(){
		return listUsers.execute();
	}

}
