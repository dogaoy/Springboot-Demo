package com.example.demo.controller;


import com.example.demo.model.Users;
import com.example.demo.server.impl.UserServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @Autowired
    UserServer userServer;
    @ResponseBody
    @RequestMapping("/index")
    public Users index (){
        Users all = userServer.findAll(1);
        return all;
    }

}
