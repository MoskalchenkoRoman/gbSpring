package com.example.dztotal.Servise;

import com.example.dztotal.model.MyProductFactory;
import com.example.dztotal.model.iProduct;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service implements iService{
    @Autowired
    private MyProductFactory productFactory;

    @Override
    public boolean orderProduct(int productId) {
        boolean orderFulfilled = false;

        iProduct product = productFactory.createProduct(productId);

        if (InventoryService.isAvailable(product)) {
            System.out.println("Продукт с ID: "+ product.getProductId()+ " доступен.");
            boolean paymentConfirmed= PaymentService.makePayment();

            if (paymentConfirmed){
                System.out.println("Оплачено...");
                ShippingService.shipProduct(product);
                System.out.println("Отправлен...");
                orderFulfilled = true;
            }
        }

        return orderFulfilled;
    }
}
