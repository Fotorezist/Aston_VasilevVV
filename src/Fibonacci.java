import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;

public class Fibonacci {
    public static void main(String[] args) {
       int n = 11; //Количество чисел Фибоначчи
       int [] fib = new int[n];

       fib[0] = 0;
       fib[1] = 1;
       for(int i = 2; i< n; i++){
           fib[i] = fib[i - 1] + fib[i - 2];
       }
        System.out.println("Первые " + n + " чисел Фибоначчи: " + Arrays.toString(fib));
       int sum = Arrays.stream(fib).sum();
        System.out.println("Сумма первых "+ n + " чисел Фибоначчи равна " + sum);

        int result = Stream.iterate(new int[]{0, 1}, fibo -> new int[]{fibo[1], fibo[0] + fibo[1]})
                .limit(n)
                .map(x -> x[0])
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Сумма первых "+ n + " чисел Фибоначчи равна " + result);
    }
}
