import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListElementCount {
    //Рассчитать частоту появления элемента в ArrayList и положить в Map
    public static void main(String[] args) {
        List<String> list = Arrays.asList("C", "A", "B","A", "C","B","C","A","B","A","B","C","B");
        Map<String, Long> count = list.stream()
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println(count);
    }
}
