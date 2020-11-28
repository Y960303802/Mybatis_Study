package com.xizi.dao;

import com.xizi.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserDao {
    List<User> getUserList();

    User getUserById(int id);

    List<User> getUserLike(String name);

    int addUser(User user);

    int updateUser(User user);

    int deleteUser(int id);

    int addUser2(Map<String,Object> map);

}
