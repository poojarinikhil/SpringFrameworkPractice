package demo;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "demo")
@EnableAspectJAutoProxy
public class BeanConfig {
//    public ShoppingCart cart(){
//        return new ShoppingCart();
//    }

}
