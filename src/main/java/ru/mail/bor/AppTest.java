package ru.mail.bor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.mail.bor.config.ProjectConfig;
import ru.mail.bor.domain.Parrot;

public class AppTest {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Parrot parrot = context.getBean(Parrot.class);
        System.out.println(parrot.getName());
    }
}
