package com.example.dztotal.controller;

import com.example.dztotal.Servise.iService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller implements iController{
    private iService facade;

    @Autowired
    public Controller(iService facade) {
        this.facade = facade;
    }

    @Override
    public ResponseEntity<Integer> orderProduct(int productId) {
        boolean status = facade.orderProduct(productId);

        return ResponseEntity.ok(1);
    }


}
