package config;

import com.itcast.service.IUserService;
import com.itcast.service.impl.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages={"com.itcast"})
public class Bean2 {
    @Bean(name="userService11")
    public IUserService createuserService(){
        return new UserServiceImpl();
    }

}
