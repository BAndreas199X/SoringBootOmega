package com.valdez.andreas;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class WhiteDragon implements MobileProcessor{
    @Override
    public void process() {
            System.out.println("Fuck you right back!");
    }

}
