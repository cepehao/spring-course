package ru.semenov.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {

    private Music classicalMusic;
    private Music rockMusic;

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music music1, @Qualifier("rockMusic") Music music2) {
        this.classicalMusic = music1;
        this.rockMusic = music2;
    }

    public String playMusic(MusicType musicType) {
        Random random = new Random();
        int randomNumber = random.nextInt(3);

        if (musicType == MusicType.CLASSICAL) {
            return classicalMusic.getSongs().get(randomNumber);
        }
        else {
            return rockMusic.getSongs().get(randomNumber);
        }
    }

}