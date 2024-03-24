package org.andy.baur;

public class Disc extends Medium{
    private String artist;
    private String title;

    public Disc(String artist, String title) {
        this.artist = artist;
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void sound(){
        System.out.println("Turn turn turn.....");
    }

    @Override
    public String toString() {
        return "Disc{" +
                "artist='" + artist + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
