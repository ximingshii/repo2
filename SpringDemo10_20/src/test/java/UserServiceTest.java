import com.itcast.service.IUserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceTest {
@Test
  public void test(){
  ApplicationContext context =  new ClassPathXmlApplicationContext("bean1.xml");
   IUserService userService= (IUserService) context.getBean("userServiceImpl");
   userService.run();
    System.out.println(userService);
}
}
