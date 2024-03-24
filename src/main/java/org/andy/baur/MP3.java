package org.andy.baur;

public class MP3 extends Medium{

    private String artist;
    private String title;
    public MP3(String i_artist,String i_title){
        this.artist=i_artist;
        this.title=i_title;
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
        System.out.println("Vibe vibe vibe.....");
    }

    @Override
    public String toString() {
        return "MP3{" +
                "artist='" + artist + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
