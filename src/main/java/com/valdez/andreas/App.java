package com.valdez.andreas;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args){
        ApplicationContext appliCon = new AnnotationConfigApplicationContext(AppConfig.class);
        Samsung s7 = appliCon.getBean(Samsung.class);

        s7.config();

    }
}
