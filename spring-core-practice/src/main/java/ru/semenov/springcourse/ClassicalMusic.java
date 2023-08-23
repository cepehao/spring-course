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
    public String getSong() {
        return "Классическая песня";
    }
}