package com.example.demo.controller;


import com.example.demo.Repository.User;
import com.example.demo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/jpa")
public class UserJpaController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping ("/users")
    public List<User> retrieveAllUsers() {
        return userRepository.findAll(); // jpaRepo에서 상속 받는 findAll을 사용한다
    }
}
