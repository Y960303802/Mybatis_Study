package com.xizi;

import com.xizi.dao.UserMapper;
import com.xizi.pojo.User;
import com.xizi.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.List;

public class UserMapperTest {
        static  Logger logger=Logger.getLogger(UserMapperTest.class);


    @Test
    public void test2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
       logger.info("测试盎司附近可是到了防溺水");
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User userById = mapper.getUserById(1);
        System.out.println(userById);
        sqlSession.close();
    }
    @Test
    public void testLog4j(){
        logger.info("info进入");
        logger.debug("debug");
        logger.error("error");

    }


}
