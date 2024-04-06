package com.master.user.api.controller;

import com.master.user.api.UserApi;
import com.master.user.entity.User;
import com.master.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController implements UserApi {

    @Autowired
    private UserService userService;


    @Override
    public List<User> users() {
        return userService.users();
    }

    @GetMapping("/a")
    public List<User> a(){
        List<User> users = new ArrayList<>();
        User user = new User();
        user.setName("aa");
        users.add(user);
        return users;
    }
}
