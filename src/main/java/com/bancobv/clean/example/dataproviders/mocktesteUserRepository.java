package com.bancobv.clean.example.dataproviders;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.bancobv.clean.example.core.entity.User;
import com.bancobv.clean.example.dataproviders.interfaces.UserRepository;

@Repository
public class mocktesteUserRepository implements UserRepository{

    private List<User> ListUsers;

    public mocktesteUserRepository(){
        ListUsers = new ArrayList<User>();
        ListUsers.add(new User( 1, "Usuário AAA"));
        ListUsers.add(new User( 2, "Usuário BBB"));
        ListUsers.add(new User( 3, "Usuário CCC"));
    }

    @Override
    public List<User> getAll() {
        return ListUsers;
    }
    
}
