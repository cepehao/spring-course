package ru.semenov.springcourse;

public class MusicPlayer {
    private Music music;

    // IoC
    public MusicPlayer(Music music) {
        this.music = music;
    }

    void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }
}