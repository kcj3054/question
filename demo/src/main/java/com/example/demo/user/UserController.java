package com.example.demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserDaoService service;


    @GetMapping("/user")
    public List<User> retrieveAllUser() {
        return service.findAll();
    }

    @GetMapping("/user/{id}")
    public User retrieveUser(@PathVariable int id) {
        return service.findOne(id);
    }

    @PostMapping("/user")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User savedUser = service.save(user);

        //response, 반횐값으로 http상태코드 보이게하는 것
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedUser.getId())
                .toUri();
        return  ResponseEntity.created(location).build();
    }
}
