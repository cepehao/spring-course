package ru.semenov.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println((musicPlayer1 == musicPlayer2));
        System.out.println(musicPlayer1);
        System.out.println(musicPlayer2);

        musicPlayer1.setName("player 1");
        musicPlayer2.setName("player 2");

        System.out.println(musicPlayer1.getName());
        System.out.println(musicPlayer2.getName());
        context.close();
    }


}
