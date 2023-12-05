package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        doctor staff = context.getBean(doctor.class);
        staff.assist();
        staff.setQualification("MBBS");
        System.out.println(staff);
        doctor doctor2 = context.getBean(doctor.class);
        System.out.println(doctor2);
//        System.out.println(staff.getQualification());
    }
}
