package com.xizi.dao;

import com.xizi.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    @Select("select * from user")
    List<User> getUser();

    //方法存在多个参数，所有得参数前面必须夹上("id")注解
    @Select("select * from user where id=#{id}")
    User getUserByID(@Param("id") int id);



    @Insert("insert into user(id,name,pwd) values (#{id},#{name},#{password})")
    int addUser(User user);


    @Update("update user set name=#{name},pwd=#{password} where id =#{id}")
    int updateUser(User user);


    @Delete("delete from user where id =#{uid}")
    int delete(@Param("uid") int id);

}
