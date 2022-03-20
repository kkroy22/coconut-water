package com.coconut.water.service;


import com.coconut.water.model.User;
import com.coconut.water.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> getUsers(){
        return repository.findAll();
    }
}
