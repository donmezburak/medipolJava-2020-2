package com.company;

import products.BaseProduct;

import java.util.*;

public class Basket {

    static Basket instance;
    List<BaseProduct> products = new ArrayList<>();
    private Basket() {

    }

    public static Basket getInstance() {
        if (instance == null){
            instance = new Basket();
        }
        return instance;
    }

    public void addProduct(BaseProduct product) {
        products.add(product);
    }

    public void show() {
        double total = 0;
        for (int i = 0; i< products.size(); i++) {
            System.out.println(i + "." + products.get(i).getName() + " fiyat: " + products.get(i).getPrice());
            total += products.get(i).getPrice();
        }
        System.out.println("Total fiyat: " + total);
    }

}
