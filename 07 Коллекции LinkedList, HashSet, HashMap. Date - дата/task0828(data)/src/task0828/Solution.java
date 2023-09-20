package task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: "May is the 5 month".
Используй коллекции.


Requirements:
1. Программа должна считывать одно значение с клавиатуры.
2. Программа должна выводить текст на экран.
3. Программа должна использовать коллекции.
4. Программа должна считывать с клавиатуры имя месяца и выводить его номер на экран по заданному шаблону.*/

public class Solution {
    public static void main(String[] args) throws IOException {
        var reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> month = new HashMap<>();
        month.put("January",0);
        month.put("February",1);
        month.put("March",2);
        month.put("April",3);
        month.put("May",4);
        month.put("June",5);
        month.put("July",6);
        month.put("August",7);
        month.put("September",8);
        month.put("October",9);
        month.put("November",10);
        month.put("December",11);

        System.out.println("Введи пожалуйста месяц строкой на Англ");
        String monthString = reader.readLine();
        for (Map.Entry<String, Integer> entry : month.entrySet()) {
            String key = entry.getKey();
            Integer value=entry.getValue();
            if(key.equalsIgnoreCase(monthString)){
                System.out.println(key +" is the " +value +" month");
            }
        }

    }
}
