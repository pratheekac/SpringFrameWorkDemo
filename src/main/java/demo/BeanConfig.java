package demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "demo")
public class BeanConfig {

    //similar thing done in spring.xml - bean definition
    //remove @Component from teacher class
//    @Bean
//    public Teacher teacher(){
//        return new Teacher();
//    }

}
