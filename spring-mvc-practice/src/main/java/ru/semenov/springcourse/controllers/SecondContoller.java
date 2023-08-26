package ru.semenov.springcourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecondContoller {
    @GetMapping("/exit")
    public String exit() {
        return "second/exit";
    }
}
