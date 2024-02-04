package lk.ijse.gdse.aad.configs;

import lk.ijse.gdse.aad.bean.MyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "lk.ijse.gdse.aad.components")
public class AppConfig {
    @Bean
    public MyBean bean(){
        return new MyBean();
    }
}
