package org.example;

public class Sweet {

   protected String name;
   protected double weight;
   protected double price;


    public Sweet(String name,double weight,double price ){
        this.price = price;
        this.weight = weight;
        this.name = name;
    }

    public void showParameters() {
        System.out.println( "Наименование: " + name + " " + "Вес: " + weight + " " +"Цена: " + price);
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }




}
