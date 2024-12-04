import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NegToPos {
    public static void main(String[] args) {

        //Создать коллекцию целых чисел, написать программу:
//  Который отрицательные числа делает положительными и возвращает коллекцию
//  ([1, 5, -3, 7] -> [1, 5, 3, 7])

        List<Integer> numbers = Arrays.asList(1, 5, -3, 7);

        List <Integer> result = negativeToPositive(numbers);
        System.out.println("(1)" + result);

        List <Integer> res = numbers.stream()
                .map(Math::abs)
                .collect(Collectors.toList());
        System.out.println("(2)" + res);

    }
    public static List <Integer> negativeToPositive (List <Integer> numbers){
        List<Integer> converted = new ArrayList<>();
//        for (int i = 0; i < numbers.size(); i++){
//            if (numbers.get(i)<0){
//                numbers.set(i, Math.abs(numbers.get(i)));
//            }
//        }
            for (Integer number : numbers ){
            converted.add(Math.abs(number));
        }
        return converted;
    }

}
