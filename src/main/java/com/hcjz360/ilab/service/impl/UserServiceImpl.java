package com.hcjz360.ilab.service.impl;

import com.hcjz360.ilab.entity.User;
import com.hcjz360.ilab.mapper.UserMapper;
import com.hcjz360.ilab.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by chensiming on 2019/4/11.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }
}
