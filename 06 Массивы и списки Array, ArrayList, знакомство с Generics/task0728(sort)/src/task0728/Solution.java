package task0728;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* 
В убывающем порядке
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.


Requirements:
1. Программа должна считывать 20 целых чисел с клавиатуры.
2. Программа должна выводить 20 чисел.
3. В классе Solution должен быть метод public static void sort(int[] array).
4. Метод main должен вызывать метод sort.
5. Метод sort должен сортировать переданный массив по убыванию.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        var reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);
        for (int x : array) {
            System.out.println(x);
        }

    }

    //алгоритм сортировки вставками
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if(array[j]>array[j-1]){
                    var swap=array[j];
                    array[j]=array[j-1];
                    array[j-1]=swap;
                }else break;

            }

        }
    }

}
