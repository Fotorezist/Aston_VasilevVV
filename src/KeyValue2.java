import java.util.HashMap;
import java.util.Map;

public class KeyValue2 {
    //    Реализуй программу, который поменяет ключи и значения в HashMap местами (без стрима)
//    На вход в метод поступает HashMap<Integer, String>, надо вернуть HashMap<String, Integer>
//    HashMap<Integer, String> first = new HashMap<>();
    public static void main(String[] args) {

        Map<Integer, String> originalMap = new HashMap<>();
        originalMap.put(1, "One");
        originalMap.put(2, "Two");
        originalMap.put(3, "Three");
        originalMap.put(4, "Four");

        System.out.println("Оригинальная map: " + originalMap);

        Map<String, Integer> map2 = new HashMap<>();
        for (Map.Entry<Integer, String> s : originalMap.entrySet()) {
            Integer key = s.getKey();
            String value = s.getValue();
            map2.put(value, key);
        }
        System.out.println("Способ 1: " + map2);

        Map<String, Integer> map3 = new HashMap<>();
        for (Map.Entry<Integer, String> s : originalMap.entrySet()) {
            map3.put(s.getValue(), s.getKey());
        }
        System.out.println("Способ 2: " + map3);
    }
}
