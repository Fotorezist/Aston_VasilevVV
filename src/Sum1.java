import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Sum1 {
    public static void main(String[] args) {
        //Найти сумму нечетных чисел в коллекции 1, 2, 3, 4, 5, 11

        List <Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 11);
        int sum = numbers.stream()
                .filter(n -> n % 2 != 0)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Сумма нечётных чисел = " + sum);
    }
}
