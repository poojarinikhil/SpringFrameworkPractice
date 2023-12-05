package demo;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
//@Scope(scopeName = "prototype")
public class doctor implements staff, BeanNameAware {
//    Qualification qualification;
    private String qualification;
    @Override
            public String toString(){
        return "Doctor {"+ "qualification = " + qualification + '\''+ '}';
    }
    doctor(String Quali){
        qualification = Quali;
    }

    public doctor() {

    }

    public void assist(){
        System.out.println("doctor is assisting");
    }
    public String getQualification(){
        return qualification;
    }
    public void setQualification(String qualifications){
        qualification = qualifications;
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Set Bean name method is called");
    }
    @PostConstruct
    public void postConstruct(){
        System.out.println("Post Construct Method is called");
    }
    @PreDestroy
    public void postDestroy(){
        System.out.println("Bean is bean destroyed");
    }
}
