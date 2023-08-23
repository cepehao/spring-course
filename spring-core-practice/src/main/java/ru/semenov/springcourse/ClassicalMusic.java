package ru.semenov.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class ClassicalMusic implements Music {

    @Override
    public List<String> getSongs() {
        return new ArrayList<>(Arrays.asList("Классическая песня 1", "Классическая песня 2", "Классическая песня 3"));
    }

    @Override
    public String getSong() {
        return "Классическая песня";
    }
}