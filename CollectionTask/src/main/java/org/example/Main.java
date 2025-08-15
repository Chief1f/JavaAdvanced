package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) {



        try {
            //Чтение строки
            BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/Strings.txt"));
            String string = reader.readLine();
            System.out.println("Строка изначальная - " + string);
            reader.close();
            //Разбиение на слова
            String[] strings = string.split(" ");

            Map<String, Integer> map = new HashMap<>();
            //Перенос данных в Map и подсчет дублей
             for(int i = 0; i < strings.length; i++){
                 map.put(strings[i],map.getOrDefault(strings[i], 0) + 1);
             }

             int max = 0;
             String maxKey = "";
             String finalString = "";
            //Поиск наиболее повторяющегося элемента & вывод строк
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                String key = entry.getKey();
                Integer value = entry.getValue();
                System.out.println("Количество слов " + key + " в файле - " + value);

                for (int i = 0; i < value; i++){
                    finalString = finalString + key + " ";
                }

                if (value > max){
                    max = value;
                    maxKey = key;
                }

            }

            System.out.println("Слово с максимальным количеством повторений: " + maxKey + " Повторений: " + max);
            System.out.println("Отсортированная без повторений: " + map);
            System.out.println("Отсортированная с повторениями: " + finalString);


        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }




    }
}