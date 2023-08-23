package ru.semenov.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RockMusic implements Music {

    @Override
    public List<String> getSongs() {
        return new ArrayList<>(Arrays.asList("Песня жанра рок 1", "Песня жанра рок 2", "Песня жанра рок 3"));
    }

    @Override
    public String getSong() {
        return "Песня жанра 'Рок'";
    }
}