import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ChangeDup {
//    есть массив чисел, надо вместо дубликатов вставить символ _ и отсортировать массив и вывести на экран

    public static void main(String[] args) {
        Integer[] num = {2, 7, 6, 2, 9, 7, 5, 9 ,6, 8};
//        Arrays.sort(num);

        Set<Integer> uniq = new HashSet<>();
        String[] result = new String[num.length];

        for (int i = 0; i < num.length; i++){
            if (uniq.contains(num[i])){
                result[i] = "_";
            }else{
                uniq.add(num[i]);
                result[i] = num[i].toString();
            }
        }
        Arrays.sort(result);
        System.out.println("Результат с заменой" + Arrays.toString(result));
    }
}
