package ru.semenov.springcourse;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

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