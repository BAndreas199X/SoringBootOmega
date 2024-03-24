package com.baur.andreas.andreas;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages={"com.baur.andreas.andreas","com.valdez.andreas"})
public class SpringComponentScanApp {

    private static ApplicationContext applicationContext;

    @Bean
    public ExampleBean exampleBean() {
        return new ExampleBean();
    }



    public static void main(String[] args){
        applicationContext =
                new AnnotationConfigApplicationContext(SpringComponentScanApp.class);

        Animal c = (Cat) applicationContext.getBean("cat");
        System.out.println(c);

        c = (Dog) applicationContext.getBean("dog");
        System.out.println(c);

        Object e = (ExampleBean) applicationContext.getBean(ExampleBean.class);
        System.out.println(e);

        for (String beanName : applicationContext.getBeanDefinitionNames()) {
            System.out.println(beanName);
        }
    }
}
