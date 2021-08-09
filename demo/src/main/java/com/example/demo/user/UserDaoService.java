package com.example.demo.user;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class UserDaoService {
    private static List<User> users = new ArrayList<>();
    private static int UserCount = 2;
    static {
        users.add(new User(1, "kcj", new Date()));
        users.add(new User(2, "kkk", new Date()));

    }

    public List<User> findAll() {

        return users;
    }

    public User save(User user) {
        if(user.getId() == null) {
            user.setId(++UserCount);
        }
        users.add(user);
        return user;
    }
    public User findOne(Integer id) {
        for (User user : users) {
            if(user.getId() == id) {
                return user;
            }
        }
        return null;
    }
}
