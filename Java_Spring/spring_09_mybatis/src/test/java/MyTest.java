import com.deluce.mapper.UserMapper;
import com.deluce.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;

public class MyTest {

    //@Test
    //public void test1() throws IOException {
    //    String resource = "mybatis-config.xml";
    //    InputStream inputStream = Resources.getResourceAsStream(resource);
    //    SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    //    SqlSession sqlSession = sessionFactory.openSession(true);
    //    UserMapper mapper = sqlSession.getMapper(UserMapper.class);
    //    for (User user : mapper.selectUser()) {
    //        System.out.println(user);
    //    }
    //    sqlSession.close();
    //}

    @Test
    public void test2() throws IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserMapper mapper = context.getBean("userMapper2",UserMapper.class);
        for (User user : mapper.selectUser()) {
            System.out.println(user);
        }
    }
}
