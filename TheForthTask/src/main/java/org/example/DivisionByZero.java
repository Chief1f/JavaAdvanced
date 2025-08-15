package org.example;

public class DivisionByZero extends Exception {

    private double b;

    public DivisionByZero(double b) {
        this.b = b;
    }

    @Override
    public String getMessage() {
        return "Деление на ноль";
    }
}
