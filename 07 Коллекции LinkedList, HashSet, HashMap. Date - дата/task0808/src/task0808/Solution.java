package task0808;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 
Для arrayList и linkedList провести 10 тысяч вставок, удалений, а также вызовов get и set.


Requirements:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Класс Solution должен содержать только 5 методов.
4. Метод insert10000(List list) должен вставлять 10 тысяч элементов в список.
5. Метод get10000(List list) должен вызывать 10 тысяч раз get у списка.
6. Метод set10000(List list) должен вызывать 10 тысяч раз set у списка.
7. Метод remove10000(List list) должен удалять 10 тысяч элементов из списка.*/

public class Solution {
    static final int ITER_VALUE=10_000;
    public static void main(String[] args) {
        // ArrayList
        List<Integer> arrayList = new ArrayList<>();
        insert10000(arrayList);
        get10000(arrayList);
        set10000(arrayList);
        remove10000(arrayList);

        // LinkedList
        List<Integer> linkedList = new LinkedList<>();
        insert10000(linkedList);
        get10000(linkedList);
        set10000(linkedList);
        remove10000(linkedList);
    }

    public static void insert10000(List list) {
        for (int i = 0; i < ITER_VALUE; i++) {
           list.add(i);
        }
        System.out.println("insert complete");
    }

    public static void get10000(List list) {
        for (int i = 0; i < ITER_VALUE; i++) {
            list.get(i);
        }
        System.out.println("get complete");
    }

    public static void set10000(List list) {
        for (int i = 0; i < ITER_VALUE; i++) {
             list.set(i,i+1);
        }
        System.out.println(list.size());
        System.out.println("set complete");
    }

    public static void remove10000(List list) {
        for (int i = ITER_VALUE-1; i >= 0; i--) {
            list.remove(i);
            if (list.size()<20){
                System.out.println(list.size());
            }
        }
        System.out.println("remove complete");

    }

}
