package task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
1. Создай список строк.
2. Добавь в него 5 строк с клавиатуры.
3. Выполни 13 раз: удалить последнюю строку и вставить её в начало.
4. Используя цикл выведи содержимое результирующего списка на экран, каждое значение с новой строки.


Requirements:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Программа должна считывать 5 строк с клавиатуры.
3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
4. Программа должна выводить список на экран, каждое значение с новой строки.*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int arrLength = 5;
        int replayAction = 13;
        BufferedReader reader= new BufferedReader( new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        System.out.println("введите пять строк");
        for (int i = 0; i < arrLength; i++) {
            String s= reader.readLine();
            list.add(s);
            if(i==arrLength-1){
                for (int j = 0; j < replayAction; j++) {
                    String str=list.remove(4);
                    list.add(0,str);
                }
            }
        }

        list.forEach(System.out::println);

    }
}
