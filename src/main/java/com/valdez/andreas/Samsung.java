package com.valdez.andreas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Samsung {

    public MobileProcessor getCpu() {
        return cpu;
    }

    public void setCpu(MobileProcessor cpu) {
        this.cpu = cpu;
    }
    @Autowired
    @Qualifier("whiteDragon")
    private MobileProcessor cpu;
    public void config(){
        System.out.println("Octa Core, 4GB RAM, 12MP Camera");
        cpu.process();
    }
}
