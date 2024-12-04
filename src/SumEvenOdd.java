import java.util.stream.Stream;

public class SumEvenOdd {
    public static void main(String[] args) {
        //Найди минимальное и максимальное значение 43, 65, 1, 98, 63, используя только stream,
        // теперь посчитай среди этих чисел сумму четных и сумму нечетных, используя stream

        int sumEven = Stream.of(43, 65, 1, 98, 63)
                .filter(x -> x % 2 ==0)
                .mapToInt(x ->x)
                .sum();
        int sumOdd = Stream.of(43, 65, 1, 98, 63)
                .filter(x -> x % 2 !=0)
                .mapToInt(x -> x)
                .sum();
        System.out.println("Сумма чётных чисел равна: " + sumEven);
        System.out.println("Сумма нечётных чисел равна: " + sumOdd);
    }
}
