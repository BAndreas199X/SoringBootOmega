package com.baur.andreas.andreas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Cat extends Animal {

    public Veteranian getVeteranian() {
        return veteranian;
    }

    public void setVeteranian(Veteranian veteranian) {
        this.veteranian = veteranian;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "veteranian=" + veteranian +
                ", cry='" + cry + '\'' +
                '}';
    }

    @Autowired
    private Veteranian veteranian;

    private String cry = "Miaow";

    public String getCry() {
        return cry;
    }

}
