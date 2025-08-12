package org.example;

public class Sweet {

    private String name;
    private double weight;
    private double price;
    private double id;

    public void showParameters() {
        System.out.println( "Наименование: " + name + " " + "Вес: " + weight + " " +"Цена: " + price + " " +"Уникальный номер: " + id + " ");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }
}
