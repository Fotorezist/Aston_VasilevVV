import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class MinMaxStream {
    public static void main(String[] args) {
//        Найти мин и макс значение, используя stream

        Supplier<Stream<Integer>> s = () -> Stream.of(25,11,69,85,2,37,6,25,11,2);
        Optional<Integer> min = s.get().min(Comparator.naturalOrder());
        Optional<Integer> max = s.get().max(Comparator.naturalOrder());

        System.out.println("Минимальное значение = " + min.get());
        System.out.println("Максимальное значение = " + max.get());

        //Второй способ
        int[] num = {25,11,69,85,2,37,6,25,11,2};
        OptionalInt min1 = Arrays.stream(num)
                .min();
        OptionalInt max1 = Arrays.stream(num)
                .max();

        if (min1.isPresent() && max1.isPresent()){
            System.out.println("min = " + min1.getAsInt());
            System.out.println("max = " + max1.getAsInt());
        }
    }
}
