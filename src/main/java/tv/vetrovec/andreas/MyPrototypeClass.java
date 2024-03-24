package tv.vetrovec.andreas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class MyPrototypeClass  {

    @Autowired
    private APrototypeBean bean;

    public void doSomething() {
        bean.doAThing();
    }
}
