package com.example.dz2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Controler {
    @GetMapping("/")
    public String hello(){
        return "ДОБРО ПОЖАЛОВАТЬ НА СТРАНИЦУ КУРСА!!!";
    }
}
