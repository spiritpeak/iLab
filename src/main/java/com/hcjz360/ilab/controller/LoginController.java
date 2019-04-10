package com.hcjz360.ilab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chensiming on 2019/4/10.
 */
@RestController
public class LoginController {
    @Autowired
    private Environment environment;

    @RequestMapping("/login")
    public String login(@RequestParam("userName") String userName, @RequestParam("passWord") String passWord) {
        System.out.println("userName:" + userName + ",passWord:" + passWord);
        System.out.println("url:" + environment.getProperty("url"));
        return null;
    }
}
