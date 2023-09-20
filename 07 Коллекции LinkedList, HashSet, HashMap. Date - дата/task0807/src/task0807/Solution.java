package task0807;

import java.util.ArrayList;
import java.util.LinkedList;

/* 
Нужно создать два списка - LinkedList и ArrayList.


Requirements:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Программа должна содержать только три метода.
4. Метод createArrayList() должен создавать и возвращать список ArrayList.
5. Метод createLinkedList() должен создавать и возвращать список LinkedList.*/

public class Solution {
    public static Object createArrayList() {
        ArrayList<Integer> integers = new ArrayList<>();
        return integers;
    }

    public static Object createLinkedList() {
        LinkedList<Object> objects = new LinkedList<>();
        return objects;

    }

    public static void main(String[] args) {

    }
}
