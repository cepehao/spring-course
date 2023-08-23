package ru.semenov.springcourse;

import org.springframework.stereotype.Component;

@Component
public class JazzMusic implements Music {
    @Override
    public String getSong() {
        return "Песня жанра 'Джаз'";
    }
}