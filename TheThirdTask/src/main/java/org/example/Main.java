package org.example;


public class Main {
    public static void main(String[] args) {

        //Предполагается что требуется найти первые попавшиеся элементы в случае наличия дубликатов
        //Предполагается что Максимальное отрицательное это самое наименьшее число в массиве которое меньше 0

        //значальный масссив
        int[] array = new int[20];
        //Массив для сортировки
        int[] copyarray = new int[20];
        //Граница диапазона по модулю
        final int boundary = 10;


        int NumberMaxNegative = -1;
        int NumberMinPositive = -1;

        // Промежуточные переменные
        int gap;
        int cork;

        //Количество отрицательных элементов
        int count = 0;

        // Создание массива
        System.out.print("Массив изначальный: ");
        for (int i = 0; i < 20; i++) {
            double value = (Math.random() * (boundary * 2 + 1)) - boundary;
            array[i] = (int) value;
            copyarray[i] = (int) value;
            if (copyarray[i] < 0) {
                count = count + 1;
            }
            System.out.print(array[i] + " ");
        }

        // Сортировка копии массива
        int max = copyarray[0];
        System.out.println();
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                if (copyarray[j] > copyarray[j + 1]) {
                    gap = copyarray[j];
                    copyarray[j] = copyarray[j + 1];
                    copyarray[j + 1] = gap;
                }
            }
        }

        // Максимальное отрицательное - самое первое в отсортированном массиве если массив полностью не заполнен положительными числами
        // Минимальное положительное - находится там где меняется знак или если не меняется то либо первое либо его нет

        int maxNegative = -10000;
        int minPositive = -10000;

        // Поиск интересующих элементов
        if ((copyarray[0] < 0) & ((count >= 1) & (count != 20))) {
            maxNegative = copyarray[0];
            for (int i = 0; i < 19; i++) {

                if ((copyarray[i] <= 0) & (copyarray[i + 1] > 0)) {
                    minPositive = copyarray[i + 1];
                }

            }
            // Поиск номера Максимального отрицательного
        for (int i = 0; i < 20; i++){
            if (array[i] == maxNegative ){
                NumberMaxNegative = i;
                break;
            }
        }

            // Поиск номера Минимального положительного
            for (int i = 0; i < 20; i++){
                if (array[i] == minPositive ){
                    NumberMinPositive = i;
                    break;
                }
            }

            System.out.println("Максимальный отрицательный: " + maxNegative );
            System.out.println("Минимальный положительный: " + minPositive);

            // Меняем местами
            cork = array[NumberMaxNegative];
            array[NumberMaxNegative] = array[NumberMinPositive];
            array[NumberMinPositive] = cork;


            System.out.print("Итог:              ");
            for (int i = 0; i < 20; i++){
                System.out.print(array[i] + " ");
            }

    } else {
        System.out.println("В массиве нет одного из элементов");
   }


 }

    }
