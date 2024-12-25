import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CharCount {
    public static void main(String[] args) {
        //Создать строку "Hello world!" и вывести символы и их количество в ней

        String str = "Hello world!";
        char[] chars = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (Character ch : chars){
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }else {
                map.put(ch, 1);
            }
        }
        System.out.println(map);

        Map<Character, Long> charCountMap = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(charCountMap);
    }
}
