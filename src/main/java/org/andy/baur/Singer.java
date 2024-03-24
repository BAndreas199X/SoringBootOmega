package org.andy.baur;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

public class Singer extends Person implements Artist{

    private String artistnName;

    public Singer(){
    }

    public Singer(String artistnName) {
        super();
        this.artistnName = artistnName;
    }

    public Singer(String artistnName,String i_fname,String i_lname,Integer i_yob) {
        super();
        this.artistnName = artistnName;
    }

    public String getArtistnName() {
        return artistnName;
    }

    public void setArtistnName(String artistnName) {
        this.artistnName = artistnName;
    }

    @Override
    public String toString() {
        return "Singer{" +
                "artistnName='" + artistnName + '\'' +
                '}';
    }
}
