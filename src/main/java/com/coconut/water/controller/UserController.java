package com.coconut.water.controller;


import com.coconut.water.model.User;
import com.coconut.water.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService service;


    @GetMapping("/all")
    public List<User> getUser(){
        System.out.println(service.getUsers().toString());
        return service.getUsers();
    }
}
