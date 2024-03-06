import com.deluce.dao.UserDaoMysqlImpl;
import com.deluce.dao.UserDaoOracleImpl;
import com.deluce.service.UserService;
import com.deluce.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test1(){
        //用户调用业务层，dao层不接触
        //UserService userService = new UserServiceImpl();
        //userService.getUser();

        UserService userService = new UserServiceImpl();
        ((UserServiceImpl) userService).setUserDao(new UserDaoOracleImpl());
        userService.getUser();
    }

    @Test
    public void springTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("userServiceImpl");
        userServiceImpl.getUser();
    }
}
