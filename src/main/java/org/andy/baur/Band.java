package org.andy.baur;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Band implements Artist{

    private String bandName;

    private List<Person> bandMembers = new ArrayList<>();

    public Band(){

    };

    public Band(String i_bandname,Person... p){
        this.bandName = i_bandname;
        Arrays.asList(p).stream().forEach(x -> bandMembers.add(x));
    };

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public List<Person> getBandMembers() {
        return bandMembers;
    }

    public void setBandMembers(List<Person> bandMembers) {
        this.bandMembers = bandMembers;
    }

    @Override
    public String toString() {
        return "Band{" +
                "bandName='" + bandName + '\'' +
                ", bandMembers=" + bandMembers +
                '}';
    }
}
