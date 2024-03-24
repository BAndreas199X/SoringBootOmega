package com.valdez.andreas;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class SnapDragon implements MobileProcessor{
    @Override
    public void process() {
        System.out.println("Fuck you!");
    }
}
