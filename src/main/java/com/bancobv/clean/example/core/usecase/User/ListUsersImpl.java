package com.bancobv.clean.example.core.usecase.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bancobv.clean.example.core.entity.User;
import com.bancobv.clean.example.core.usecase.User.interfaces.ListUsers;
import com.bancobv.clean.example.dataproviders.interfaces.UserRepository;

@Service
public class ListUsersImpl implements ListUsers{

    @Autowired
    private UserRepository userRepository;

    public List<User> execute() {
        return userRepository.getAll();
    }
    
}
