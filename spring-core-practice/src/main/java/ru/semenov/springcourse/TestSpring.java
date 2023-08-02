package ru.semenov.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Music classicalMusic = context.getBean("musicBean", Music.class);

        MusicPlayer musicPlayer = new MusicPlayer(classicalMusic);

        musicPlayer.playMusic();

        context.close();
    }


}
