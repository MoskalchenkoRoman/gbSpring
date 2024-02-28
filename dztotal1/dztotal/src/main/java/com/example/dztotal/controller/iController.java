package com.example.dztotal.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shop")
public interface iController {
    @PostMapping("/order/{productId}")
    public ResponseEntity<Integer> orderProduct(@PathVariable int productId);
}
