package com.xizi;

import com.xizi.dao.UserDao;
import com.xizi.pojo.User;
import com.xizi.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

public class UserDaoTest {

    @Test
    public void test(){
        //第一步：获取sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //执行SQL
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        List<User> userList = userDao.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }

        sqlSession.close();
    }

    @Test
    public void test2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        User userById = mapper.getUserById(1);
        System.out.println(userById);
        sqlSession.close();
    }
    @Test
    public void test212(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        List<User> userLike = mapper.getUserLike("戏");
        for (User user:userLike) {
            System.out.println(user);

        }
        sqlSession.close();
    }
    @Test
    public void test3(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);

        int i = mapper.addUser(new User(7, "戏子4", "123465"));
        if (i>0){
            System.out.println("插入成功");
        }
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void test4(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);

        int i = mapper.updateUser(new User(4, "王呵呵", "123465"));
        if (i>0){
            System.out.println("更新成功");
        }
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void test5(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);

        int i = mapper.deleteUser(4);
        if (i>0){
            System.out.println("删除成功");
        }
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void test6(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("userid",5);
        map.put("username","杨宇航");
        map.put("userpwd","123456");
        int i = mapper.addUser2(map);
        if (i>0){
            System.out.println("插入成功");
        }
        sqlSession.commit();
        sqlSession.close();
    }
}
