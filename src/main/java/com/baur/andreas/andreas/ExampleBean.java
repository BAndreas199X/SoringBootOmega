package com.baur.andreas.andreas;

import org.springframework.beans.factory.annotation.Autowired;

public class ExampleBean {

    private String attributeS;

    private String attributeI;

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "ExampleBean{" +
                "attributeS='" + attributeS + '\'' +
                ", attributeI='" + attributeI + '\'' +
                ", dog=" + dog +
                '}';
    }
    @Autowired
    private Dog dog;

    public String getAttributeS() {
        return attributeS;
    }

    public void setAttributeS(String attributeS) {
        this.attributeS = attributeS;
    }

    public String getAttributeI() {
        return attributeI;
    }

    public void setAttributeI(String attributeI) {
        this.attributeI = attributeI;
    }

}
