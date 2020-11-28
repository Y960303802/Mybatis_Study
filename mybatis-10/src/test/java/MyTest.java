import com.xizi.dao.UserMapper;
import com.xizi.pojo.User;
import com.xizi.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class MyTest {
    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.queryById(1);
        System.out.println(user);
        mapper.updateUser(new User(2,"aaa","bbb"));
        System.out.println("=====================");
        User user2 = mapper.queryById(1);
        System.out.println(user2);
        //sqlSession.clearCache();清理缓存
        sqlSession.close();
    }
    @Test
    public void test2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        SqlSession sqlSession2 = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        UserMapper mapper2 = sqlSession2.getMapper(UserMapper.class);
        User user = mapper.queryById(1);
        System.out.println(user);
        sqlSession.close();
        System.out.println("============");
        User user1 = mapper2.queryById(1);
        System.out.println(user1);
        System.out.println(user==user1);
        sqlSession2.close();
    }
}
