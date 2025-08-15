package org.example;

public class Calculus {


    private String operation;
    private double a;
    private double b;

     public Calculus(double a, double b, String operation){
         this.a = a;
         this.b = b;
         this.operation = operation;
     }

     public void showTheResult() throws DivisionByZero {
         switch (operation) {
             case ("+"):
                 System.out.println("Результат сложения: " + Addition.calc(a,b) );
                 break;
             case ("-"):
                 System.out.println("Результат вычитания: " + Subtraction.calc(a,b) );
                 break;
             case ("*"):
                 System.out.println("Результат умножения: " + Multiplication.calc(a,b) );
                 break;
             case ("/"):
                 System.out.println("Результат деления: " + Division.
                         calc(a,b) );
                 break;
             default:
                 System.out.println("Неверный ввод операции");
                 break;
         }
     }

}
