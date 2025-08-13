package org.example;

public class JellyBean extends Sweet{


    final String SMELL = "raspberrySmell" ;

    public JellyBean(String name,double weight,double price ){

        super(name,weight,price );
    }

    public void showParameters() {
        System.out.println( "Наименование: " + name + " " + "Вес: " + weight + " " +"Цена: " + price + " " + "Запах: " + SMELL);
    }

}
