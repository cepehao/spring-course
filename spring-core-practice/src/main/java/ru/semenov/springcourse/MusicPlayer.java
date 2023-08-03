package ru.semenov.springcourse;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {

    private List<Music> musicList = new ArrayList<>();

    private String name;
    private int volume;


    private MusicPlayer() {

    }

    public static MusicPlayer getMusicPlayer() {
        System.out.println("factory-method working");
        return new MusicPlayer();
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    void playMusic() {
        for (Music music: musicList) {
            System.out.println("Playing: " + music.getSong());
        }
    }

    private void initMethod(){
        System.out.println("Init method");
    }

    private void destroyMethod(){
        System.out.println("Destroy method");
    }
}
