import java.util.Arrays;
import java.util.List;

public class SecondMin {
    //В List(1,17,54,14,14,33,45,-11) найти второй наименьший элемент
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,17,54,14,14,33,45,-11);
        int min2 = nums.stream()
                .sorted()
                .distinct()
                .skip(1)
                .findFirst()
                .orElse(0);
        System.out.println("Второй наименьший элемент = " + min2);
    }
}
