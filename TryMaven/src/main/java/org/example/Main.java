package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        sumCalc();

    }

    /**
     * The following method provides sum of two double numbers
     * @author Klaus)
     */
    public static void sumCalc(){

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Первое число:");
            double a = scanner.nextDouble();
            System.out.print("Второе число:");
            double b = scanner.nextDouble();
            System.out.print("Результат:");
            System.out.printf("%.4f",a+b);
        }  catch (InputMismatchException e) {
            System.out.println("Неверный ввод");
        }
        scanner.close();
    }
}