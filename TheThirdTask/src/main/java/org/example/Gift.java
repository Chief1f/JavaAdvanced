package org.example;

import java.util.ArrayList;

public class Gift {

   ArrayList<Sweet> sweets = new ArrayList<>();


    public void addSweet(Sweet sweet) {
        sweets.add(sweet);
    }

    public void countweight() {
        double totalWeight = 0;
        for (int i = 0; i < sweets.size(); i++ ){
            totalWeight = sweets.get(i).getWeight() + totalWeight;
        }
        System.out.println("Общий вес подарка: "+ totalWeight);
    }

    public void countPrice() {
        double totalPrice = 0;
        for (int i = 0; i < sweets.size(); i++ ){
            totalPrice = sweets.get(i).getPrice() + totalPrice;
        }
        System.out.println("Общая цена подарка: "+ totalPrice);
    }

    public void showContent() {
        System.out.println("Состав подарка: ");
        for (int i = 0; i < sweets.size(); i++ ){
            sweets.get(i).showParameters();
        }

    }


}
