package com.h3c.solution.controller;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*",maxAge = 3600)
@RestController
@RequestMapping("/user")
public class LoginController {

    @RequestMapping(path = "/login",method = RequestMethod.POST)
    public Map<String,String> login(){
        Map data = new HashMap<String,String>();
        data.put("code", "20000");
        data.put("token", "admin-token");
        return data;
    }

    @RequestMapping(path = "/getUserInfo",method = RequestMethod.GET)
    public Map<String,String> getUserInfo(){
        Map data = new HashMap<String,String>();
        data.put("code", "20000");
        data.put("introduction", "I am a super administrator");
        data.put("avatar", "https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif");
        data.put("name", "Super Admin");
        data.put("roles", "admin");
        return data;
    }
}
