package com.hcjz360.ilab.controller.admin;

import com.hcjz360.ilab.entity.User;
import com.hcjz360.ilab.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by chensiming on 2019/4/11.
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/findAll")
    public List<User> findAll() {
        return userService.findAll();
    }
}
