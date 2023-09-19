package task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран. Если таких строк несколько, выведи каждую с новой строки.


Requirements:
1. В методе main инициализируй существующее поле strings класса Solution новым ArrayList<>
2. Программа должна считывать 5 строк с клавиатуры и записывать их в поле strings класса Solution.
3. Программа должна выводить самую длинную строку на экран.
4. Если есть несколько строк с длиной равной максимальной, то нужно вывести каждую из них с новой строки.*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        int max=0;
        System.out.println(" я готова  считывать 5 строк с клавиатуры");
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.println("введи строку еще " +(5-i)+" раз");
                        list.add(i,reader.readLine());
                        if(list.get(i).length()>max){
                            max=list.get(i).length();
                        }
        }
        for (String string : list) {
            if (max == string.length()) {
                System.out.println(string);
            }
        }
    }
}
