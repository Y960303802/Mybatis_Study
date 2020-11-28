package com.xizi;

import com.xizi.dao.UserMapper;
import com.xizi.pojo.User;
import com.xizi.utils.MybatisUtils;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

public class UserMapperTest {
    static Logger logger = Logger.getLogger(UserMapperTest.class);


    @Test
    public void test2() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        logger.info("测试盎司附近可是到了防溺水");
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User userById = mapper.getUserById(1);
        System.out.println(userById);

        sqlSession.close();
    }

    @Test
    public void testLog4j() {
        logger.info("info进入");
        logger.debug("debug");
        logger.error("error");

    }

    @Test
    public void getUserByLimit() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        HashMap<String, Integer> map = new HashMap();
        map.put("startIndex", 1);
        map.put("pageSize11111111", 5);

        List<User> userByLimit = mapper.getUserByLimit(map);
        for (User user : userByLimit) {
            System.out.println(user);
        }


    }


    @Test
    public void getUserByBounds() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        RowBounds rowBounds = new RowBounds(0, 2);


        List<User> userByLimit = sqlSession.selectList("com.xizi.dao.UserMapper.getUserByBounds", null, rowBounds);

        for (User user : userByLimit) {
            System.out.println(user);
        }

        sqlSession.close();
    }
}
