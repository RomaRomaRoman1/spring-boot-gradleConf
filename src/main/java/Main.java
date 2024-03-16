import model.Prototype;
import org.springframework.context.ApplicationContext;
import model.FirstBean;
import model.SecondBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericGroovyApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Создание контекста Spring на основе XML-конфигурации
        ApplicationContext context = new GenericGroovyApplicationContext("classpath:applicationContext.groovy");

        FirstBean firstBean = context.getBean(FirstBean.class);
        SecondBean secondBean = context.getBean(SecondBean.class);
        System.out.println(firstBean);
        System.out.println(secondBean);
        Prototype prototype = context.getBean(Prototype.class);
        System.out.println(prototype);
    }
}