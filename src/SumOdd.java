import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SumOdd {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        numbers.add(11);

        System.out.println("Сумма нечетных чисел = " + sumOfOdd(numbers));
        int sum2 = numbers.stream()
                .filter(e -> e % 2 != 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Сумма нечетных чисел(stream) = " + sum2);
    }

    public static int sumOfOdd(List<Integer> numbers) {
        int sum = 0;
        for (Integer e : numbers) {
            if (e % 2 != 0) {
                sum += e;
            }
        }
        return sum;
    }
}
