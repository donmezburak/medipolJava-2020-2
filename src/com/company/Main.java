package com.company;

import categories.BaseCategory;
import categories.TemizlikCategory;
import categories.YiyecekCategory;
import products.BaseProduct;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        showMain();
    }

    public static void showMain() {

        List<BaseCategory> categories = new ArrayList<>();
        categories.add(new YiyecekCategory());
        categories.add(new TemizlikCategory());

        System.out.println("Kategori seçiniz: (çıkmak için -1 e basınız)");
        for (int i = 0;i < categories.size(); i++) {
            System.out.println(i +"." + categories.get(i).getName());
        }

        Scanner sc =  new Scanner(System.in);
        String input = sc.nextLine();
        try {
            int secim = Integer.parseInt(input);

            if (secim == -1) {
                return;
            }
            BaseCategory category = categories.get(secim);
            category.showProduct();

            int productSecim = Integer.parseInt(sc.nextLine());

            BaseProduct product = category.getProducts().get(productSecim);

            Basket.getInstance().addProduct(product);

            Basket.getInstance().show();
            Thread.sleep(3000);
            Runtime.getRuntime().exec("clear");
            showMain();

        } catch (Exception e) {
            System.out.println("Hatalı giriş");
            try {
                Thread.sleep(3000);
                showMain();

                return;
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }

    }
}
