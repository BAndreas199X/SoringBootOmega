package org.andy.jenner;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


public class A {

    private int number;
    private B otherBean;

    public A(int number, B otherBean) {
        this.number = number;
        this.otherBean = otherBean;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public B getOtherBean() {
        return otherBean;
    }

    public void setOtherBean(B otherBean) {
        this.otherBean = otherBean;
    }

    @Override
    public String toString() {
        return "A{" +
                "number=" + number +
                ", otherBean=" + otherBean +
                '}';
    }
}