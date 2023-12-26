package ru.mail.bor.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ru.mail.bor.domain.Parrot;

@Configuration
@ComponentScan(basePackages = "ru.mail.bor.domain")
public class ProjectConfig {
//
//    @Bean
//    Parrot parrot() {
//        var p = new Parrot();
//        p.setName("Parrot Popka");
//        return p;
//    }

//    @Bean
//    String hello() {
//        return "Hello";
//    }
//
//    @Bean
//    Integer ten() {
//        return 10;
//    }
}
