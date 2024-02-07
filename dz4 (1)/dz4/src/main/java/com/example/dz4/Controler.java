package com.example.dz4;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controler {
    @GetMapping("/index")
    public String index(){
        return "index.html";
    }
}
