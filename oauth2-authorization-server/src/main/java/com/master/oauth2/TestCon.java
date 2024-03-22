package com.master.oauth2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestCon {

    @RequestMapping("/oauth2/authorize")
    public String test(){
        return "123";
    }
}
