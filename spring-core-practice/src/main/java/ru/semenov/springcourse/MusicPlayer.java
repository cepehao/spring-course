package ru.semenov.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.Random;

public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    private List<Music> genres;

    public List<Music> getGenres() {
        return genres;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    @Autowired
    public MusicPlayer(List<Music> genres) {
        this.genres = genres;
    }

    public void playMusic() {
        Random random = new Random();
        int randomNumber = random.nextInt(genres.size());

        System.out.println(genres.get(randomNumber).getSong());
    }

}