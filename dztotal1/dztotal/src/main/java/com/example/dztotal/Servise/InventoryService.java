package com.example.dztotal.Servise;

import com.example.dztotal.model.iProduct;
import org.springframework.stereotype.Service;

@Service
public class InventoryService {
    public static boolean isAvailable(iProduct product) {
        return true;
    }
}