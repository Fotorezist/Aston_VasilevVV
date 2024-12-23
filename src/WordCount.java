import java.util.HashMap;
import java.util.Map;

public class WordCount {
//    Подсчитать количество слов в строке "Упади семь раз и восемь раз поднимись" используя HashMap
    public static void main(String[] args) {
        String str = "Упади семь раз и восемь раз поднимись";
        String[] words = str.split(" ");
        Map<String, Integer> map = new HashMap<>();
//        for(int i = 0; i < words.length; i++){
//            if (map.containsKey(words[i])){
//                map.compute(words[i], (_,counter) -> counter + 1);
//            } else {
//                map.put(words[i], 1);
//            }
//        }
//        System.out.println(map);
        for (String m : words) {
            if (map.containsKey(m)) {
                map.put(m, map.get(m) + 1);
            }else {
                map.put(m, 1);
            }
        }
        System.out.println(map);
    }
}
