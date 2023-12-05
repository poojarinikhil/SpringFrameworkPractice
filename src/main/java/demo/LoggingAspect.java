package demo;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    @Before("execution(* demo.ShoppingCart.checkout(..))")
    public void logger(){
        System.out.println("Logging");
    }
    @After("execution(* demo.ShoppingCart.checkout(..))")
    public void afterLoging(){
        System.out.println("after Logging");
    }
}
