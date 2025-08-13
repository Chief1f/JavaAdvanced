package org.example;

public class JellyBean extends Sweet{

    private String smell;


    public JellyBean(String name,double weight,double price, String smell ){

        super(name,weight,price );
        this.smell = smell;
    }

    public String showParameters() {
        return super.showParameters() + "Запах: " + smell;
    }

}
