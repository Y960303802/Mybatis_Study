package com.xizi.dao;

import com.xizi.pojo.User;

import java.util.List;

public interface UserMapper {

    User queryById(int id);

    int updateUser(User user);
}
