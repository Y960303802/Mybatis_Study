import com.xizi.dao.BlogMapper;
import com.xizi.pojo.Blog;
import com.xizi.utils.IDutils;
import com.xizi.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.*;

public class MyTest {
    @Test
    public void test1(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        mapper.addBook(new Blog(IDutils.getId(),"Mybatis是如此简单","戏子",new Date(),999));
//        mapper.addBook(new Blog("IDutils.getId()","Java是如此简单","戏子",new Date(),999));
//        mapper.addBook(new Blog("IDutils.getId()","Spring是如此简单","戏子",new Date(),999));
//        mapper.addBook(new Blog("IDutils.getId()","微服务是如此简单","戏子",new Date(),999));
        sqlSession.close();
    }
    @Test
    public void test2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Map hashMap = new HashMap();
      hashMap.put("title","Java是如此简单");
//        hashMap.put("author","戏子");
        List<Blog> blogs = mapper.queryBlogIF(hashMap);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        sqlSession.close();
    }
    @Test
    public void test3(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Map hashMap = new HashMap();
//        hashMap.put("title","Java是如此简单");
        hashMap.put("author","戏子");
        hashMap.put("views",999);
        List<Blog> blogs = mapper.queryBlogChoose(hashMap);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        sqlSession.close();
    }
    @Test
    public void test4(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Map hashMap = new HashMap();
        hashMap.put("title","Java是如此简单3");
//        hashMap.put("author","戏子");
        hashMap.put("id","3");
       mapper.updateBlog(hashMap);

        sqlSession.close();
    }
    @Test
    public void test5(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Map hashMap = new HashMap();

        ArrayList<Integer> ids = new ArrayList<Integer>();

        ids.add(1);
        ids.add(2);
        ids.add(3);
        ids.add(11);
        hashMap.put("ids",ids);


        List<Blog> blogs = mapper.queryBlogForeach(hashMap);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }

        sqlSession.close();
    }
}
