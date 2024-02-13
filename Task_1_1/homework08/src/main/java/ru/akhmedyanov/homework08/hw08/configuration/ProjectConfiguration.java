package ru.akhmedyanov.homework08.hw08.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import ru.akhmedyanov.homework08.hw08.aspects.LoggingAspect;

@Configuration
@ComponentScan(basePackages = "ru.akhmedyanov")
@EnableAspectJAutoProxy
public class ProjectConfiguration {

    @Bean
    public LoggingAspect aspect() {
        return new LoggingAspect();
    }
}
