package com.xizi.utils;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MybatisUtils {
  private static SqlSessionFactory sqlSessionFactory =null;
    static {
        String resource="mybatis-config.xml";
        try {
            //使用Mybatis获取sqlSessionFactory对象
            InputStream inputStream = Resources.getResourceAsStream(resource);
             sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    //获取SqlSession的实例,里面包含了执行SQL命令的所有方法
    public static SqlSession getSqlSession(){
       return sqlSessionFactory.openSession();

    }

}
