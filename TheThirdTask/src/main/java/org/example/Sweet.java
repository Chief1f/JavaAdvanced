package org.example;

public abstract class Sweet {

   private String name;
   private double weight;
   private double price;


    public Sweet(String name,double weight,double price ){
        this.price = price;
        this.weight = weight;
        this.name = name;
    }

    public String showParameters() {

        return "Наименование: " + name + " " + "Вес: " + weight + " " +"Цена: " + price;
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
