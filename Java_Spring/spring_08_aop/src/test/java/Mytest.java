import com.deluce.service.UserService;
import com.deluce.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {

    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        //动态代理代理的是接口
        UserService userService = (UserService) context.getBean("userService");
        userService.add();
    }

}
