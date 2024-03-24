package com.baur.andreas.andreas;

import org.springframework.stereotype.Component;

@Component
public class Veteranian {

    private String name;

    public Veteranian() {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Veteranian{" +
                "name='" + name + '\'' +
                '}';
    }
}
