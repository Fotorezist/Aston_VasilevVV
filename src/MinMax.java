import java.lang.reflect.Array;
import java.util.*;

public class MinMax {
    public static void main(String[] args) {
        //Найти минимальное и максимальное число из 5,8,8,9,4,6,2,5,9,1 , используя stream и функциональный интерфейс

        Integer [] numbers = {5,8,8,9,4,6,2,5,9,1};
        Optional min = Arrays.stream(numbers)
                .min(Comparator.naturalOrder());
        Optional max = Arrays.stream(numbers)
                .max(Comparator.naturalOrder());
        min.ifPresent(minValue -> System.out.println("min = " + minValue));
        max.ifPresent(maxValue -> System.out.println("max = " + maxValue));

        List <Integer> minMaxList = findMinMax (numbers);
        System.out.println("Минимальное значение = " + minMaxList.get(0));
        System.out.println("Максимальное значение = " + minMaxList.get(1));

    }
    public static List <Integer> findMinMax (Integer[] numbers ){
        List <Integer> minMaxList = new ArrayList<>();
        int min = numbers[0];
        int max = numbers[0];

        for (int i=1; i<numbers.length; i++){
            if (numbers[i]<min){
                min = numbers[i];
            } else if (numbers[i]>max) {
                max = numbers[i];
            }
        }
        minMaxList.add(min);
        minMaxList.add(max);
        return minMaxList;
    }
}
