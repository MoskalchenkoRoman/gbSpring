package com.example.dztotal.model;

public class MyProductFactory implements iProductFactory{
    @Override
    public iProduct createProduct(int id) {
        Product.ProductBuilder builder = new Product.ProductBuilder();
        builder.color("желтый").customProp(1).id(id);

        return builder.build();
    }
}
