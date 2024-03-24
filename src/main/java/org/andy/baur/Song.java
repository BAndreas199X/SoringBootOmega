package org.andy.baur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Song{

    private Artist artist;

    private String title;

    @Autowired
    public Song(Artist i_artist, String i_title){
        this.artist = i_artist;
        this.title = i_title;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Song{" +
                "artist=" + artist +
                ", title='" + title + '\'' +
                '}';
    }
}
