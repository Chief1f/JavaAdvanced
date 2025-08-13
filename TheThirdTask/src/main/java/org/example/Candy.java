package org.example;

public class Candy extends Sweet{

    private String taste;


    public Candy(String name,double weight,double price, String taste ){

        super(name,weight,price );
        this.taste = taste;
    }

    public String showParameters() {
        return super.showParameters() + " " + "Вкус: " + taste;
    }

}
