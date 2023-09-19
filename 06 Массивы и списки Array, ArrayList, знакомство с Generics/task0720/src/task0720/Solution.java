package task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
Ввести с клавиатуры 2 числа N и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.

Примечание: запрещено создавать больше одного списка.


Requirements:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Считай c клавиатуры числа N и M, считай N строк и добавь их в список.
3. Переставить M первых строк в конец списка.
4. Выведи список на экран, каждое значение с новой строки.*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        System.out.println("введи N + Enter");
        int N = Integer.parseInt(reader.readLine());
        System.out.println("введи M + Enter");
        int M = Integer.parseInt(reader.readLine());

        for (int i = 0; i < N; i++) {
            System.out.println("Введи строку +Enter. еще "+ (N-i) +"раз");
            list.add(reader.readLine());
            if(i==(N-1)){
                for (int j = 0; j < M; j++) {
                    String str=list.remove(0);
                    list.add(str);
                }
            }
        }

        list.forEach(System.out::println);

    }
}
