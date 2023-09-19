package task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
1. Создай список строк.
2. Добавь в него 10 строчек с клавиатуры.
3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
Если таких строк несколько, то должны быть учтены самые первые из них.
4. Выведи на экран строку из п.3. Должна быть выведена одна строка.


Requirements:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Программа должна считывать 10 строк с клавиатуры и добавлять их в список.
3. Программа должна выводить на экран самую короткую строку, если она была раньше самой длинной.
4. Программа должна выводить на экран самую длинную строку, если она была раньше самой короткой.
5. Должна быть выведена только одна строка.*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<>();
        int arrLength = 10;
        int maxLength=0;
        int minLength=Integer.MAX_VALUE-8;
        System.out.println("введите десять строк с клавиатуры, Строка + enter");
        for (int i = 0; i < arrLength; i++) {
            strings.add(reader.readLine());
        }

        for (String string : strings) {
            if(string.length()>maxLength){
                maxLength=string.length();
            }
            if(string.length()<minLength){
                minLength=string.length();
            }
        }

        for (String string : strings) {
            if(string.length() ==minLength || string.length() ==maxLength){
                System.out.println(string);
                break;
            }
        }

    }
}
