package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Первое число: ");
        try {
            double a = scanner.nextDouble();
            System.out.print("Второе число: ");
            double b = scanner.nextDouble();
            System.out.print("Операция(+ - * /): ");
            String operation = scanner.next();
            Calculus calculus = new Calculus(a, b, operation);
            System.out.print("Результат: ");
            calculus.showTheResult();
            } catch(InputMismatchException | DivisionByZero e){
                System.out.println("Неверный ввод");
            }

        scanner.close();

    }
}