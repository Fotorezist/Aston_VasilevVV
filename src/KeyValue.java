import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class KeyValue {
//    Реализуй программу, который поменяет ключи и значения в HashMap местами
//    На вход в метод поступает HashMap<Integer, String>, надо вернуть HashMap<String, Integer>
//    HashMap<Integer, String> first = new HashMap<>();
    public static void main(String[] args) {
        Map<String, Integer> originalMap = new HashMap<>();
        originalMap.put("one", 1);
        originalMap.put("two", 2);
        originalMap.put("three", 3);

        Map<Integer, String> swappedMap = originalMap.entrySet()
                .stream()
                .collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey));
        System.out.println("Исходная map: " + originalMap);
        System.out.println("Итоговая map: " + swappedMap);

    }
}
