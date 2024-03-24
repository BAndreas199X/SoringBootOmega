package org.andy.baur;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainAndy {

    private static ApplicationContext ac;

    public static void main(String[] args){
        ac = new AnnotationConfigApplicationContext(AndyConfiguration.class);
        /*Medium m = (Medium) ac.getBean(Medium.class);
        System.out.println(m);
        m.sound();

        m = (Medium) ac.getBean("getDiscP","Andy Jenner","Black and White");
        System.out.println(m);
        m.sound();

        m = (Medium) ac.getBean("getMP3P","Andy Jenner","Complement");
        System.out.println(m);
        m.sound();

        Object s = (Singer) ac.getBean("singer");
        System.out.println(s);

        s = (Singer) ac.getBean("singer","Andy Jenner",1990);
        System.out.println(s);

        s = ac.getBean("singerCustom","Shawn Mendes",1998);
        System.out.println(s);

        s = ac.getBean("singerDefault");
        System.out.println(s);

        Disc m1 = (Disc) ac.getBean(Medium.class);
        System.out.println(m1);

        Disc m2 = (Disc) ac.getBean(Medium.class);
        m1.setTitle("Light of My Life");
        System.out.println(m2);*/


        /*String s = ac.getBean(String.class,"Barrely Even Human");
        System.out.println(s);
        Artist art = ac.getBean(Artist.class,"Andy Jenner","Andreas","Leonard",1990);
        System.out.println(art);

        Song song = ac.getBean(Song.class,art,s);
        System.out.println(song);
        Song song = ac.getBean(Song.class);
        System.out.println(song);*/

        Label lbl1 = ac.getBean(Label.class,"Universal");
        lbl1.setLabel("Universal");
        System.out.println(lbl1);
        Label lbl2 = ac.getBean(Label.class,"Big Machine Record");
        System.out.println(lbl2);
    }
}
