package org.example;

public class Division implements Operation {

    public static double calc(double a, double b) throws DivisionByZero {
       if (b == 0){
           throw new DivisionByZero(b);
       } else {
           return a / b;
       }

    }


}
