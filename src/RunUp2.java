import java.util.HashMap;
import java.util.Map;

public class RunUp2 {
    public static void main(String[] args) {
//        Реализуй программу, который поменяет ключи и значения в HashMap местами
//        На вход в метод поступает HashMap<Integer, String>, надо вернуть HashMap<String, Integer>

        HashMap<Integer, String> original = new HashMap<>();
        original.put(1, "Один");
        original.put(2, "Два");
        original.put(3, "Три");

        HashMap<String, Integer> swapped = swapMap(original);

        System.out.println("Перевернутая map: " + swapped);
    }

    public static HashMap<String, Integer> swapMap(HashMap<Integer, String> original) {
        HashMap<String, Integer> swapped = new HashMap<>();
        for (Map.Entry<Integer, String> entry : original.entrySet()) {
            swapped.put(entry.getValue(), entry.getKey());
        }
        return swapped;
    }
}
