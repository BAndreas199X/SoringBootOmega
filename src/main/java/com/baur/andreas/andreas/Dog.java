package com.baur.andreas.andreas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dog extends Animal {

    @Override
    public String toString() {
        return "Dog{" +
                "veteranian=" + veteranian +
                ", cry='" + cry + '\'' +
                '}';
    }

    public Veteranian getVeteranian() {
        return veteranian;
    }

    public void setVeteranian(Veteranian veteranian) {
        this.veteranian = veteranian;
    }
    @Autowired
    private Veteranian veteranian;

    public String getCry() {
        return cry;
    }

    private String cry = "Woof";


}
