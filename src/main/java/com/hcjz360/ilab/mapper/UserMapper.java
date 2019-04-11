package com.hcjz360.ilab.mapper;

import com.hcjz360.ilab.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by chensiming on 2019/4/11.
 */
@Mapper
public interface UserMapper {
    List<User> findAll();
}
