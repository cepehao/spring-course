package ru.semenov.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Music classicalMusic = context.getBean("classicalMusic", Music.class);
        Music rockMusic = context.getBean("rockMusic", Music.class);
        Music jazzMusic = context.getBean("jazzMusic", Music.class);

        MusicPlayer classicalMusicPlayer = new MusicPlayer(classicalMusic);
        MusicPlayer rockMusicPlayer = new MusicPlayer(rockMusic);
        MusicPlayer jazzMusicPlayer = new MusicPlayer(jazzMusic);

        classicalMusicPlayer.playMusic();
        rockMusicPlayer.playMusic();
        jazzMusicPlayer.playMusic();

        context.close();
    }


}