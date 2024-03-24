package tv.vetrovec.andreas;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class APrototypeBean {
    private int stuffgoeshere;
    public void doAThing() {

    }
}
