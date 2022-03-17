package demo;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Scope(scopeName = "prototype") //will return new object for every bean req
@Component
public class Teacher implements University, BeanNameAware {

    //create a loose coupling with teacher and subject
    //dependency injection
    // we can add dependency injection using constructor, annotations, and xml
    //Subject subject;

    private String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "subject='" + subject + '\'' +
                '}';
    }

    public void teach() {
        System.out.println("Teacher is teaching.....");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Bean name method is called....");
    }


    @PostConstruct
    public void postConstruct() {
        System.out.println("Post Construct method is called.....");
    }
}
