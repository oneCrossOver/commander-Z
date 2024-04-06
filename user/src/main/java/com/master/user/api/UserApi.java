package com.master.user.api;

import com.master.user.entity.User;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface UserApi {

    @GetMapping("/users")
    List<User> users();
}
