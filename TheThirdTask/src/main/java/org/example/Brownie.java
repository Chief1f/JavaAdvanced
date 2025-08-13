package org.example;

public class Brownie extends Sweet{

    private String colour;


    public Brownie(String name,double weight,double price, String colour){

        super(name,weight,price );
        this.colour = colour;
    }

    public String showParameters() {
        return super.showParameters() +  " " + "Цвет: " + colour;
    }

}
