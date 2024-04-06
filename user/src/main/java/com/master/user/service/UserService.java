package com.master.user.service;

import com.master.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {

    List<User> users();
}
