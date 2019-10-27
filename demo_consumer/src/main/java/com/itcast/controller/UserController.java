package com.itcast.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.itcast.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

    @Reference
    private UserService userService;

    @RequestMapping("/dubbo")
    @ResponseBody
    public String sayHello(String name){
        return userService.sayToDubbo(name);
    }
}
