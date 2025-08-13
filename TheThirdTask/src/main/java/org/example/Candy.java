package org.example;

public class Candy extends Sweet{


    final String TASTE = "chocolateTaste" ;

    public Candy(String name,double weight,double price ){

        super(name,weight,price );
    }

    public void showParameters() {
        System.out.println( "Наименование: " + name + " " + "Вес: " + weight + " " + "Цена: " + price + " " + "Вкус: " + TASTE);
    }

}
