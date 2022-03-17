package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemoMain {

    public static void main(String[] args) {

        //to achieve dependency injection
       // ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        //for config file
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

        //get bean from context
        Teacher teacher = context.getBean(Teacher.class);

//        Principal principal = (Principal) context.getBean("principal");
//
//        University university = context.getBean(Teacher.class);
//
//        university.teach();
//        principal.teach();
        teacher.teach();
        teacher.setSubject("Physics");
        System.out.println(teacher);

        Teacher teacher1 = context.getBean(Teacher.class);
        System.out.println(teacher1);
    }
}
