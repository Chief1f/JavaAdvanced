package org.example;

public class Brownie extends Sweet{


    final String COLOUR = "yellowColour" ;

    public Brownie(String name,double weight,double price){

        super(name,weight,price );
    }

    public void showParameters() {
        System.out.println( "Наименование: " + name + " " + "Вес: " + weight + " " +"Цена: " + price + " " + "Цвет: " + COLOUR);
    }

}
