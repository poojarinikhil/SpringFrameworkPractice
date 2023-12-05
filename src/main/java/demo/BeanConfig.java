package demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "demo")
public class BeanConfig {
//
    @Bean
    @Scope(scopeName = "prototype")
    public doctor doctor2(){
        return new doctor();
    }
}
