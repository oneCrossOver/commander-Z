package com.master.user.service.impl;

import com.master.user.entity.User;
import com.master.user.repository.UserRepository;
import com.master.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public List<User> users() {
        return userRepository.findAll();
    }
}
