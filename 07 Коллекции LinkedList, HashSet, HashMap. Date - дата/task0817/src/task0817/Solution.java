package task0817;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Нам повторы не нужны
Создать словарь (Map<String, String>) занести в него десять записей по принципу "фамилия" - "имя".
Удалить людей, имеющих одинаковые имена.


Requirements:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, String состоящих из 10 записей.
4. Метод removeTheFirstNameDuplicates() должен удалять из словаря всех людей, имеющие одинаковые имена.
5. Метод removeTheFirstNameDuplicates() должен вызывать метод removeItemFromMapByValue().*/

public class Solution {

    public static void main(String[] args) {
        Map<String, String> map = createMap();
        removeTheFirstNameDuplicates(map);
        map.forEach((k,v)-> System.out.println("key= " + k+" value: "+v));
    }

    public static Map<String, String> createMap() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("Киров", "Dupont");
        hashMap.put("Маркин", "Martin");
        hashMap.put("Тимченко", "Lefebvre");
        hashMap.put("Ирмовин", "Dubois");
        hashMap.put("Ирмов", "Dubois");
        hashMap.put("Тимофеев", "Petit");
        hashMap.put("Димов", "Laurent");
        hashMap.put("Тюрцев", "Roux");
        hashMap.put("Киркин", "Moreau");
        hashMap.put("Филов", "Leroy");

        return  hashMap;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        Map<String, String> copy = new HashMap<>(map);
        Iterator<Map.Entry<String, String>> iterator = copy.entrySet().iterator();
        while (iterator.hasNext()){
            String value = iterator.next().getValue();
            iterator.remove();
            for (Map.Entry<String, String> stringEntry : copy.entrySet()) {
                if(value.equals(stringEntry.getValue())){
                    removeItemFromMapByValue(map,value);
                }
            }
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }


}
