import com.deluce.config.SpringConfig;
import com.deluce.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void Test1(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        User user = (User) context.getBean("getUser");
         System.out.println(user.getName());
    }
}
