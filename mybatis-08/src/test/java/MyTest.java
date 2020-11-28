import com.xizi.dao.TeacherMapper;
import com.xizi.pojo.Teacher;
import com.xizi.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MyTest {
    @Test
    public void test1(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        List<Teacher> teacher = mapper.getTeacher();
        for (Teacher teacher1 : teacher) {
            System.out.println(teacher1);
        }
    }
    @Test
    public void test2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher11 = mapper.getTeacher1(1);

        System.out.println(teacher11);
    }
    @Test
    public void test3(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher11 = mapper.getTeacher2(1);

        System.out.println(teacher11);
    }
}
