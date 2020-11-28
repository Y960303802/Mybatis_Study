package com.xizi.dao;

import com.xizi.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    User getUserById(int id);

    //分页
    List<User> getUserByLimit(Map<String,Integer> map);

    //RowBounds实现分页
    List<User> getUserByBounds();



}
