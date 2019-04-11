package com.hcjz360.ilab.service;

import java.util.List;

/**
 * Created by chensiming on 2019/4/11.
 */
public interface BaseService<T> {
    // 查询所有
    List<T> findAll();

    /*//根据ID查询
    List<T> findById(Long id);

    //添加
    void create(T t);

    //删除（批量）
    void delete(Long... ids);

    //修改
    void update(T t);*/
}
