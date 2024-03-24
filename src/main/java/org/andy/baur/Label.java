package org.andy.baur;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Label {

    private String label;

    public Label() {
        System.out.println("Label, empty constructor");
        this.label = label;
    }

    public Label(String label) {
        System.out.println("Label, filled constructor");
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "Label{" +
                "label='" + label + '\'' +
                '}';
    }
}
