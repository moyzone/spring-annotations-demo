package com.stackroute.config;

import com.stackroute.demo.BeanLifecycleDemoBean;
import com.stackroute.domain.Actor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.stackroute.domain")
public class SpringConfiguration {

    @Bean
    public Actor actor() {
        return new Actor("Keanu Reeves","Male",22);
    }

    @Bean
    public Actor actor2() {
        return new Actor("Leonardo Di Caprio","Male",25);
    }

    @Bean
    public BeanLifecycleDemoBean getLifecycleBean() {
        return new BeanLifecycleDemoBean();
    }

}
