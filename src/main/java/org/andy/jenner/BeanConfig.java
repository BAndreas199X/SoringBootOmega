package org.andy.jenner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan
public class BeanConfig {

    public static void main(String[] args){
        ApplicationContext ac = new AnnotationConfigApplicationContext(BeanConfig.class);
        otherBean = ac.getBean(B.class,"Andy");
        A a = ac.getBean(A.class, 1);

        System.out.println(a);
    }

    private static B otherBean;

    @Bean
    @Scope("prototype")
    public A makeA(int number) {
        return new A(number, otherBean);
    }
}
