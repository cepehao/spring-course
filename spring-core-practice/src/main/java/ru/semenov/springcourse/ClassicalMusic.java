package ru.semenov.springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClassicalMusic implements Music {

    @PostConstruct
    private void initMethod(){
        System.out.println("Init method");
    }

    @PreDestroy
    private void destroyMethod() {
        System.out.println("Destroy method");
    }

    @Override
    public List<String> getSongs() {
        return new ArrayList<>(Arrays.asList("Классическая песня 1", "Классическая песня 2", "Классическая песня 3"));
    }

    @Override
    public String getSong() {
        return "Классическая песня";
    }
}