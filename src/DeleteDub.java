import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DeleteDub {
    public static void main(String[] args) {
//        Удалить дубликаты из сортированного списка используя коллекции int[] sortedList = {1, 2, 2, 3, 4, 4, 4, 5, 6, 7, 8, 8, 9, 9, 10}

        int[] list = {1, 2, 2, 3, 4, 4, 4, 5, 6, 7, 8, 8, 9, 9, 10};

        System.out.println("Исходный список" + Arrays.toString(list));
        System.out.println("Отсортированный список" + sorted(list));
        int[] uniqList = Arrays.stream(list)
                .distinct()
                .toArray();
        System.out.println("Отсортированный список(Stream)" + Arrays.toString(uniqList));

    }
    public static Set<Integer> sorted(int[] list){
        Set<Integer> set = new HashSet<>();
        for(Integer s: list){
            set.add(s);
        }
        return set;
    }
}
