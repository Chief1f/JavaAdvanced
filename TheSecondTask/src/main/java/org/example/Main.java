package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер задания(1 - калькулятор, 2 - поиск максимального элемента в массиве): ");

        try {
        int value = scanner.nextInt();
            if( (value != 1) & (value != 2) ){
                System.out.println("Неверный ввод");
            } else {
                if (value == 1){
                    System.out.print("Введите номер операции(1 - сложение, 2 - вычитание, 3 - умножение, 4- сложение): ");
                   try{
                    int operation = scanner.nextInt();
                    if ( (operation != 1) & (operation != 2) & (operation != 3) & (operation != 4) ){
                        System.out.println("Неверный ввод");
                    } else {
                        switch (operation) {
                            case (1):
                                sumCalc();
                                break;
                            case (2):
                                difCalc();
                                break;
                            case (3):
                                productCalc();
                                break;
                            case (4):
                                quotientCalc();
                                break;
                        }
                    }
                    }  catch (InputMismatchException e) {
                           System.out.println("Неверный ввод");
                       }

                } else {
                    maxStringLengthInArray();
                }
            }
        }  catch (InputMismatchException e) {
            System.out.println("Неверный ввод");
        }


scanner.close();


    }

    /**
     * The following method provides sum of two double numbers
     * @author Klaus)
     */
    public static void sumCalc(){

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Первое число: ");
            double a = scanner.nextDouble();
            System.out.print("Второе число: ");
            double b = scanner.nextDouble();
            System.out.print("Результат сложения: ");
            System.out.printf("%.4f",a + b);
        }  catch (InputMismatchException e) {
            System.out.println("Неверный ввод");
        }
        scanner.close();
    }

    /**
     * The following method provides difference of two double numbers
     * @author Klaus)
     */
    public static void difCalc(){

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Первое число: ");
            double a = scanner.nextDouble();
            System.out.print("Второе число: ");
            double b = scanner.nextDouble();
            System.out.print("Результат вычитания: ");
            System.out.printf("%.4f",a - b);
        }  catch (InputMismatchException e) {
            System.out.println("Неверный ввод");
        }
        scanner.close();
    }

    /**
     * The following method provides multiplication of two double numbers
     * @author Klaus)
     */
    public static void productCalc(){

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Первое число: ");
            double a = scanner.nextDouble();
            System.out.print("Второе число: ");
            double b = scanner.nextDouble();
            System.out.print("Результат умножения: ");
            System.out.printf("%.4f",a * b);
        }  catch (InputMismatchException e) {
            System.out.println("Неверный ввод");
        }
        scanner.close();
    }

    /**
     * The following method provides dividing of two double numbers
     * @author Klaus)
     */
    public static void  quotientCalc(){

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Первое число: ");
            double a = scanner.nextDouble();
            System.out.print("Второе число: ");
            double b = scanner.nextDouble();

            if( b == 0){
                System.out.println("Деление на ноль");

            } else {
                System.out.print("Результат деления: ");
                System.out.printf("%.4f", a / b);
            }
        }  catch (InputMismatchException e) {
            System.out.println("Неверный ввод");
        }
        scanner.close();
    }

    /**
     * The following method provides the length of the largest String in array
     * @author Klaus)
     */
    public static void maxStringLengthInArray(){

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите длину массива: ");
            int length = scanner.nextInt();
            if (length > 0) {

          String[] pureArray = new String[length];
          int[] lenghtes = new int[length];
          int max = -1;
                System.out.println("Введите элементы");
for (int i = 0; i <= length - 1; i++){
    System.out.print( i + 1 + " элемент:");
    pureArray[i] = scanner.next();
    if (pureArray[i].length() > max) {
       max = pureArray[i].length();
    }

}
                System.out.print("Длина максимального элемента: " + max);
            } else {
                System.out.println("Неверный ввод");
            }
        }  catch (InputMismatchException e) {
            System.out.println("Неверный ввод");
        }
        scanner.close();
    }

}