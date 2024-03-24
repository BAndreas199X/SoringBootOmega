package org.andy.baur;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan
public class AndyConfiguration {
    @Bean
    @Primary
    public Medium getDisc(){
        System.out.println("Primary Singleton getDisc created");
        return new Disc("Andy Jenner","Take Me By The Heart");
    }
    @Bean
    @Scope("prototype")
    public Medium getDiscP(String i_artist,String i_title){
        System.out.println("Prototype getDiscP created");
        return new Disc(i_artist,i_title);
    }
    @Bean
    public Medium getMP3(){
        System.out.println("Singleton getMP3 created");
        return new MP3("Andy Jenner","Take Me By The Heart");
    }
    @Bean
    @Scope("prototype")
    public Medium getMP3P(String i_artist,String i_title){
        System.out.println("SPrototype getMP3 created");
        return new MP3(i_artist,i_title);
    }

    /*@Bean("singerDefault")
    public Singer getSingerD(){
        return new Singer("Lauv");
    }

    @Bean("singerCustom")
    @Scope("prototype")
    public Singer getSingerC(String i_artist,Integer i_yearOfBirth){
        return new Singer(i_artist);
    }*/

    @Bean
    public Artist getA(){
        System.out.println("Singleton getA created");
        return new Singer("Andy Jenner");
    }

    @Bean
    @Scope("prototype")
    public Artist getAP(String artistName,String fname, String lname, Integer yob){
        System.out.println("Prototype getAP created");
        return new Singer(artistName,fname, lname, yob);
    }
    @Bean
    @Primary
    public Artist getBP(){
            System.out.println("Primary Singleton getBP created");
            Person p1 = new Person("Asher","Angel",2002);
            Person p2 = new Person("Sebastian","Croft",2001);
            Person p3 = new Person("Joshua","Bassett",2000);
            Person p4 = new Person("Wyatt","Oleff",2003);
            Person p5 = new Person("Noah","Schnapp",2004);
            return new Band("Twink Five",p1,p2,p3,p4,p5);
    }

    @Bean
    @Scope("prototype")
    public String getTitle(String title){
        System.out.println("Prototype getTitle created");
        return new String(title);
    }

    @Bean
    @Primary
    public String getTitleS(){
        System.out.println("Primary Singleton getTitleS created");
        return "Dynamite";
    }


}
