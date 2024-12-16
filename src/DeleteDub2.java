import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DeleteDub2 {
    public static void main(String[] args) {
        List<Integer> num = List.of(1,2,3,1,4,5,3,6,2,2,7,8,1,1,9,3,2,1,8);
        Set<Integer> numbers = new HashSet<>();
        numbers.addAll(num);
        System.out.println("Без дубликатов " + numbers);

        int[] num1 = {1,2,3,1,4,5,3,6,2,2,7,8,1,1,9,3,2,1,8};
        Set<Integer> res = new HashSet<>();
        for (int x : num1){
            res.add(x);
        }
        System.out.println("Без дубликатов второй вариант " + res);

    }
}
