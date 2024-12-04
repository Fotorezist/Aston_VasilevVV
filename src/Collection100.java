import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collection100 {
    public static void main(String[] args) {
        //Создать коллекцию целых чисел, написать программу:
//  Которая четные числа умножает на 100, а от нечетных отнимает 100 и возвращает коллекцию.
//  Количество принимаемых и возвращаемых элементов коллекций должно совпадать

        Stream <Integer> numbers = Stream.of(24, 17, 5, 69, 31, 22, 74, 19, 12);
        List <Integer> result = numbers.map(x -> x % 2 ==0 ? x * 100 : x - 100)
                .collect(Collectors.toList());
        System.out.println(result);
        List <Integer> res = result.stream().map(y ->{
            int resu = 0;
            if(y % 2 == 0){
                resu = y / 100;
            } else {
                resu = y + 100;
            }
            return resu;
        }).collect(Collectors.toList());
        System.out.println(res);
    }
}
