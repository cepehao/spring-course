package ru.semenov.springcourse;

public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Песня жанра 'Рок'";
    }
}
