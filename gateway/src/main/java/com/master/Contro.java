package com.master;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Contro {

    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
