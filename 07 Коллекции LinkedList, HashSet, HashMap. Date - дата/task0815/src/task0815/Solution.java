package task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
Создать словарь (Map<String, String>) занести в него десять записей по принципу "Фамилия" - "Имя".
Проверить сколько людей имеют совпадающие с заданным именем или фамилией.


Requirements:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, String состоящих из 10 записей по принципу «Фамилия» - «Имя».
4. Метод getCountTheSameFirstName() должен возвращать число людей у которых совпадает имя.
5. Метод getCountTheSameLastName() должен возвращать число людей у которых совпадает фамилия.*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createMap();
        System.out.println("getCountTheSameFirstName(map,\"Leroy\") = " + getCountTheSameFirstName(map, "Leroy"));
        System.out.println("getCountTheSameLastName(map,\"Киркин\") = " + getCountTheSameLastName(map, "Киркин"));
    }


    public static Map<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Киров", "Dupont");
        map.put("Маркин", "Martin");
        map.put("Тимченко", "Lefebvre");
        map.put("Ирмов", "Dubois");
        map.put("Тимофеев", "Petit");
        map.put("Димов", "Laurent");
        map.put("Тюрцев", "Roux");
        map.put("Киркин", "Moreau");
        map.put("Филов", "Leroy");

        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int count = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getValue().equals(name)) {
                count += 1;
            }
        }
        return count;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int count = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getKey().equals(lastName)) {
                count += 1;
            }
        }
        return count;
    }

}
