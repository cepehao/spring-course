package ru.semenov.springcourse;

public class JazzMusic implements Music {
    @Override
    public String getSong() {
        return "Песня жанра 'Джаз'";
    }
}
