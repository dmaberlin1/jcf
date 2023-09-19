package task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
1. Введи с клавиатуры 10 слов в список строк.
2. Определить, является ли список упорядоченным по возрастанию длины строки.
3. В случае отрицательного ответа вывести на экран индекс первого элемента, нарушающего такую упорядоченность.


Requirements:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Считай 10 строк с клавиатуры и добавь их в список.
3. Если список упорядочен по возрастанию длины строки, то ничего выводить не нужно.
4. Если список не упорядочен по возрастанию длины строки, то нужно вывести на экран индекс первого элемента, нарушающего такую упорядоченность.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int arrLength = 10;
        for (int i = 0; i < arrLength; i++) {
            System.out.println("введите строку еще " +(arrLength-i)+" раз");
            list.add(reader.readLine());
            if(i==arrLength-1){
                System.out.println("список заполнен!)");
            }
        }
        //Если достать 10 элемент и сравнить его с 11 - получу ошибку, поэтому (длина -1)
        for (int i = 0; i < arrLength-1; i++) {
            if(list.get(i).length()>list.get(i+1).length()){
                System.out.println("** "+i+1+" **"+ " : индекс первого элемента в Листе, нарушающего упорядоченность по возрастанию");
                System.out.println();
                break;
            }

        }


    }
}

